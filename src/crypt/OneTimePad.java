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
	private String currentAlphabet;
	private List<Integer> length = Arrays.asList(0);
	private static Vigenere v= new Vigenere();
	@Override
	public String encrypt(String text, String key) {
		key = key.toLowerCase();
		length = Arrays.asList(text.length());
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
		
		return v.encrypt(text, key);
		
		
	}

	public String decrypt(String text, String key) {
		key = key.toLowerCase();
		length = Arrays.asList(text.length());
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
			
		return v.decrypt(text, key);
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
