/**
 * 
 */
package crypt;

import java.util.Arrays;
import java.util.List;

/**
 * @author caterina
 *
 */
public class Permutation extends Chiffre{
	private List<Integer> length = Arrays.asList(4, 9, 16, 25);
	private Hill h = new Hill();
	
	private String binary2String(String text){
		currentAlphabet = myAlphabet.getAlphabet();
		String newText = "";
		for (int i = 0; i < text.length(); i++){
			if (text.charAt(i)== '0'){	
				newText += currentAlphabet.charAt(0);
			}
			else{
				newText += currentAlphabet.charAt(1);
			}
		}
		return newText;
	}

	@Override
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Fülle die Permutationsmatrix vollständig mit je einer 1 oder einer 0 aus!";
		}
		else if(!checkCharacter(key, "01")){
			return "Vorsicht! Die Permutationsmatrix darf nur die Zeichen 1 oder 0 enthalten!";
		}
		else if((key.length() - ((key.replaceAll("1","")).length())) != Math.sqrt(key.length())){
			return "Vorsicht! In jeder Zeile und Spalte der Permutationsmatrix muss genau eine 1 stehen";
		}
		else{
			int dimension = (int) Math.sqrt(key.length());
			int [][] keyMatrix = Tools.makeMatrix(binary2String(key), dimension, dimension, currentAlphabet);
			if (!checkDeterminant(keyMatrix)){
				return "Vorsicht! In jeder Zeile und Spalte der Permutationsmatrix muss genau eine 1 stehen";
			}
			else{
				return null;
			}
		}
	}

	@Override
	protected String algorithmEncrypt(String text, String key) {
		String stringKey = binary2String(key);
		return h.decrypt(text, stringKey);

	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		String stringKey = binary2String(key);
		return h.encrypt(text, stringKey);
	}

}
