package crypt;

import java.util.Arrays;
import java.util.List;

public class Multiplikativ extends Chiffre{
	

	/**
	 * Multiplikative Chiffre: Symmetrische Buchstabenverschiebung um den Faktor/Schluessel k.
	 * @author caterina
	 *
	 */
	private boolean decrypt;
	private List<Integer> length = Arrays.asList(1);
	
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	private String algorithm(String text, int key, String alpha){
		String newtext = "";
		for (int n = 0; n<text.length(); n++){	
			char newChar = text.charAt(n);
			char lowerChar = Character.toLowerCase(newChar);
			for (int i = 0; i<alpha.length(); i++){
				if (alpha.charAt(i) == lowerChar){
					if (decrypt == false){
						newChar = alpha.charAt((i*key)%alpha.length());
					}
					else{
						int tmpi = i;
						while (tmpi%key != 0){
							
							tmpi = alpha.length()+tmpi;
							
						}
						
						newChar = alpha.charAt((tmpi/key)%alpha.length());
						
					}
					if (Character.isUpperCase(text.charAt(n))){	
						newChar = Character.toUpperCase(newChar);
					}
				}
			}
			newtext += newChar;
			
			
		}
		return newtext;
	}

	protected String algorithmEncrypt(String text, String key) {
		int keynum = Tools.string2int(key, currentAlphabet);
		decrypt = false;
		return algorithm(text, keynum, currentAlphabet);
	}
	


	protected String algorithmDecrypt(String text, String key) {
		int keynum = Tools.string2int(key, currentAlphabet);
		decrypt = true;
		return algorithm(text, keynum, currentAlphabet);
	}

	@Override
	/**
	 * checks key length, characters and coprime
	 */
	protected String verify(String key, String alphabet) {
		if (!checkLength(key, length)){
			return "Vorsicht! Bei der Multiplikativen Chiffre muss der Schlüssel genau ein Zeichen lang sein!";
		}
		else if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Der Schlüssel darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else if(!checkCoprimes(key, alphabet)){
			List<Integer> coprimes = Tools.phi(currentAlphabet.length());
			String cp = Tools.list2String(coprimes, currentAlphabet, true);
			return "Der angegebene Schlüssel ist nicht co-prim zur Länge des Alphabets. Eine Entschlüsselung wird daher nicht möglich sein. Verwendbare Schlüssel sind: " + cp;
		}
		else{
			return null;
		}
	}

}
	

