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
public class Affine extends Chiffre{
	private String currentAlphabet;
	private static Multiplikativ m = new Multiplikativ();
	private static Caesar c = new Caesar();
	private List<Integer> length = Arrays.asList(2);

	private String algorithmEncrypt(String text, String key){
		String a = String.valueOf(key.charAt(0));
		String b = String.valueOf(key.charAt(1));
		String mulText = m.encrypt(text, a);
		return c.encrypt(mulText, b);
	}
	private String algorithmDecrypt(String text, String key){
		String a = String.valueOf(key.charAt(0));
		String b = String.valueOf(key.charAt(1));
		String addText = c.decrypt(text, b);
		return m.decrypt(addText, a);
	}
	
	public String encrypt(String text, String key){
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		
		if (verified == null){
			return algorithmEncrypt(text, key);
		}
		else{
			return verified;
		}
	}

	@Override
	public String decrypt(String text, String key) {
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		
		if (verified == null){	
			return algorithmDecrypt(text, key);
		}
		else{
			return verified;
		}
	}

	@Override
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Die Affine-Chiffre braucht zwei Schlüssel aus einem Zeichen!";
		}
		else if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Die Schlüssel dürfen nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else if(!checkCoprimes(String.valueOf(key.charAt(0)), alphabet)){
			List<Integer> coprimes = Tools.phi(currentAlphabet.length());
			String cp = Tools.listtoString(coprimes, currentAlphabet);
			return "Der angegebene Schlüssel a ist nicht co-prim zur Länge des Alphabets. Eine Entschlüsselung wird daher nicht möglich sein. Verwendbare Schlüssel für a sind: " + cp;
		}
		else{
			return null;
		}
	}
	
}
