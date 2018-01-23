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
public class OneTimePad extends Chiffre {
	private List<Integer> length = Arrays.asList(0);
	private static Vigenere v= new Vigenere();

	protected void setLength(String text) {
		length = Arrays.asList(text.length());
	}
	

	@Override
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Beim One-Time-Pad muss der Schlüssel genau so lang sein wie dein Eingabetext";
		}
		if (!checkCharacter(key, alphabet)){
			return "Vorsicht! Der Schlüssel darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			return null;
		}
	}

	@Override
	protected String algorithmEncrypt(String text, String key) {
		return v.encrypt(text, key);
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		return v.decrypt(text, key);
	}

}
