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
	List<Integer> length = Arrays.asList(1);
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key (lowercase, checked)
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	private String algorithm(String text, int key){
		String newtext = "";
		for (int n = 0; n<text.length(); n++){ // Character modified one by one	
			char newChar = text.charAt(n);
			char lowerChar = Character.toLowerCase(newChar);

			if (currentAlphabet.contains(Character.toString(lowerChar))){
				newChar = currentAlphabet.charAt(((currentAlphabet.indexOf(lowerChar))+key)%currentAlphabet.length());
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
	@Override
	protected String algorithmEncrypt(String text, String key) {
		System.out.println(currentAlphabet);
		int keynum = Tools.string2int(key, currentAlphabet);
		return algorithm(text, keynum);
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		int keynum = Tools.string2int(key, currentAlphabet);
		keynum = currentAlphabet.length()-keynum;
		return algorithm(text, keynum);
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

	
