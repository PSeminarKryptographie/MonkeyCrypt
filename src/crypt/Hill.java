/**
 * 
 */
package crypt;
import java.lang.Math;
import java.util.Arrays;
import java.util.List;
/**
 * @author caterina
 *
 */
public class Hill extends Chiffre{
	private String currentAlphabet;
	private List<Integer> length = Arrays.asList(4, 9, 16, 25);
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	private String algorithm(int [][] text, int [][] key, String alpha){
		String newtext = "";
		int [][] newMatrix = MatrixTools.mulMatrix(key, text);
		//System.out.println(Arrays.deepToString(newMatrix));
		newMatrix = MatrixTools.modMatrix(newMatrix, alpha);
		//System.out.println(Arrays.deepToString(newMatrix));
		newtext = Tools.matrix2string(newMatrix, alpha);
		return newtext;
	}
	
	/**
	 * @param text (Klartext), key (Schluessel)
	 *
	 * @return algorithm() (Geheimtext)
	 */
	
	public String encrypt(String text, String key)
	{
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		key = key.toLowerCase();
		
		if (verified == null){
			int dimension = (int) Math.sqrt(key.length());
			int count = 0;
			while (text.length()%(dimension) != 0){
				text += currentAlphabet.charAt(0);
				count ++;
			}
			int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);
			String newText = "";
			String group = "";
			for (int i = 0; i<text.length()+1; i++  ){
				
				if (group.length() == dimension){
					int [][] groupMatrix = Tools.makeMatrix(group, dimension, (group.length()/dimension), currentAlphabet);
					System.out.println(Arrays.deepToString(groupMatrix));
					newText += algorithm(groupMatrix, keyMatrix, currentAlphabet);
					System.out.println(newText);
					group = "";
					
					try{group += text.charAt(i);}
					catch(Exception e){}
				}
				else{
					
					group += text.charAt(i);
				}

			}
						
			
			
			
			newText = newText.substring(0, newText.length()-count);
			
			
			
			String correctText = "";
			for (int i = 0; i<newText.length(); i++  ){
				if (!currentAlphabet.contains(String.valueOf(text.charAt(i)).toLowerCase())){
					correctText += text.charAt(i);
				}
				else if(Character.isUpperCase(text.charAt(i))){
					correctText += Character.toUpperCase(newText.charAt(i));
				}
				else{
					correctText += newText.charAt(i);
				}
			}
			return correctText;
			}
		else{
			return verified;
		}
		
		
	}
	
	/**
	 * @param text (Geheimtext)
	 * @param key (Schluessel)
	 * 
	 * @return algorithm() (Klartext)
	 */
	public String decrypt(String text, String key)
	{
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		key = key.toLowerCase();
		
		if (verified == null){
			int dimension = (int) Math.sqrt(key.length());
			int count = 0;
			while (text.length()%(dimension) != 0){
				text += currentAlphabet.charAt(0);
				count ++;
			}
			//System.out.println(text);
			int [][] textMatrix = Tools.makeMatrix(text, dimension, (text.length()/dimension), currentAlphabet);
			int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);
			System.out.println(Arrays.deepToString(keyMatrix));
			int [][] invKeyMatrix = MatrixTools.inverse(keyMatrix, currentAlphabet);
			System.out.println(Arrays.deepToString(invKeyMatrix));
			String newText = algorithm(textMatrix, invKeyMatrix, currentAlphabet);
			newText = newText.substring(0, newText.length()-count);
			String correctText = "";
			for (int i = 0; i<newText.length(); i++  ){
				if (!currentAlphabet.contains(String.valueOf(text.charAt(i)).toLowerCase())){
					correctText += text.charAt(i);
				}
				else if(Character.isUpperCase(text.charAt(i))){
					correctText += Character.toUpperCase(newText.charAt(i));
				}
				else{
					correctText += newText.charAt(i);
				}
			}
			return correctText;
			}
		else{
			return verified;
		}
	}
	@Override
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Fülle die Matrix vollständig mit je einem Zeichen aus!";
		}
		else if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Die Schlüsselmatrix darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			int dimension = (int) Math.sqrt(key.length());
			int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);
			if (!checkDeterminant(keyMatrix)){
				return "Vorsicht! Die Determinante deiner Matrix ist nicht Coprim zum Alphabet. Dein Text kann daher nicht eindeutig entschlüsselt werden!";
			}
			else{
				return null;
			}
		}
	}
	
	

}
