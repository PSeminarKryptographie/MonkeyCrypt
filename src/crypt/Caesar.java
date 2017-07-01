package crypt;

import java.util.Arrays;
import java.util.List;

/**
 * Caesar-Chiffre: Symmetrische Buchstabenverschiebung um den Schluessel k.
 * @author caterina
 *
 */

public class Caesar extends Chiffre
{
	private String currentAlphabet;
	List<Integer> length = Arrays.asList(1);
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key (lowercase, checked)
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	private String algorithm(String text, int key, String alpha){
		String newtext = "";
		for (int n = 0; n<text.length(); n++){ // Character modified one by one	
			char newChar = text.charAt(n);
			char lowerChar = Character.toLowerCase(newChar);

			if (alpha.contains(Character.toString(lowerChar))){
				newChar = alpha.charAt(((alpha.indexOf(lowerChar))+key)%alpha.length());
			}
			else{
				newChar = lowerChar;
			}
			
			if (Character.isUpperCase(text.charAt(n))){	
				newChar = Character.toUpperCase(newChar); // Make upper-case if necessary
			}
			
			newtext += newChar; // Character added to result
		}
		return newtext;
	}
	
	/**
	 * @param text (Klartext), key (Schluessel)
	 * kontrolliert Schluessel
	 * wandelt key in int um
	 * @return algorithm() (Geheimtext)
	 */
	public String encrypt(String text, String key){
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		
		if (verified == null){
			int keynum = Tools.string2int(key, currentAlphabet);
			return algorithm(text, keynum, currentAlphabet);
		}
		else{
			return verified;
		}
	}
	
	/**
	 * @param text (Geheimtext)
	 * @param key (Schluessel)
	 * kontrolliert Schluessel
	 * ruft keyinnum auf
	 * invertiert int key
	 * @return algorithm() (Klartext)
	 */
	public String decrypt(String text, String key){
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();	
		String verified = verify(key, currentAlphabet);
		
		if (verified == null){
			int keynum = Tools.string2int(key, currentAlphabet);
			keynum = currentAlphabet.length()-keynum;
			return algorithm(text, keynum, currentAlphabet);
		}
		else{
			return verified;
		}	
	}
	
	@Override
	/**
	 * checks key length and key chars
	 */
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Bei der Caesar-Chiffre muss der Schlüssel genau ein Zeichen lang sein!";
		}
		else if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Der Schlüssel darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			return null;
		}
	}
	
	
	
}

	
