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
	private String algorithm(String text, int [][] key, String alpha, int dimension){
		String newText = "";
		String group = "";
		for (int i = 0; i<text.length()+1; i++  ){
			if (group.length() == dimension){
				int [][] groupMatrix = Tools.makeMatrix(group, dimension, (group.length()/dimension), currentAlphabet);
				int [][] newMatrix = MatrixTools.mulMatrix(key, groupMatrix);
				newMatrix = MatrixTools.modMatrix(newMatrix, alpha);
				newText += Tools.matrix2string(newMatrix, alpha);
				group = "";
				
				try{group += text.charAt(i);}
				catch(Exception e){}
			}
			else{
				
				try{group += text.charAt(i);}
				catch(Exception e){}
			}

		}
		
		return newText;
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
		String shortText = Tools.onlyAlphabet(text, currentAlphabet);
		if (verified != null){
			return verified;
		}
		int dimension = (int) Math.sqrt(key.length());
		while (shortText.length()%(dimension) != 0){
			shortText += currentAlphabet.charAt(0);
		}
		
		int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);			
		String newText = algorithm(shortText, keyMatrix, currentAlphabet, dimension);
		return newText;
	
		
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
		
		if (verified != null){
			return verified;
		}
		int dimension = (int) Math.sqrt(key.length());
		int count = 0;
		while (text.length()%(dimension) != 0){
			text += currentAlphabet.charAt(0);
			count ++;
		}
		int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);
		int [][] invKeyMatrix = MatrixTools.inverse(keyMatrix, currentAlphabet);
		System.out.println(Arrays.deepToString(keyMatrix));
		System.out.println(Arrays.deepToString(invKeyMatrix));
		
		String newText = algorithm(text, invKeyMatrix, currentAlphabet, dimension);
		System.out.println(newText);
		newText = newText.substring(0, newText.length()-count);
		return newText;
	}
	
	
	
	@Override
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Fülle die Schlüsselmatrix vollständig mit je einem Zeichen aus!";
		}
		else if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Die Schlüsselmatrix darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			int dimension = (int) Math.sqrt(key.length());
			int [][] keyMatrix = Tools.makeMatrix(key, dimension, dimension, currentAlphabet);
			if (!checkDeterminant(keyMatrix)){
				return "Vorsicht! Die Determinante der Schlüsselmatrix ist 0. Dein Text kann daher nicht eindeutig entschlüsselt werden!";
			}
			else{
				int determinant = Tools.modInverse(MatrixTools.determinant(keyMatrix), currentAlphabet);
				if (determinant == 0) {
					return "Vorsicht! Die Schlüsselmatrix hat keine Inverse. Dein Text kann daher nicht eindeutig verschlüsselt werden!";
				}
				return null;
			}
		}
	}

	@Override
	protected String algorithmEncrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
