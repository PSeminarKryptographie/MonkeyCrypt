package crypt;

import java.util.Arrays;
import java.util.List;

public class Vigenere extends Chiffre{
	public List<Integer> length = Arrays.asList(0);
	private static Caesar c = new Caesar();
	
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	
	private String algorithm(String text, String key, boolean encrypt){
		String newtext = "";
		int k = 0;
		for (int n = 0; n<text.length(); n++)
		{	
			String newChar;
			
			if(encrypt == true){
				newChar = c.encrypt(String.valueOf(text.charAt(n)), String.valueOf(key.charAt(k%key.length())));
			}
			else{
				newChar = c.decrypt(String.valueOf(text.charAt(n)), String.valueOf(key.charAt(k%key.length())));

			}
					
                        
			newtext += newChar;
			if (currentAlphabet.contains(String.valueOf(text.charAt(n)).toLowerCase())){
				k++;
			}
			
			
		}
		return newtext;
	}

	@Override
	/**
	 * checks key characters
	 */
	protected String verify(String key, String alphabet) {
		if (checkLength(key, length)){ // kein !checklength da die length in diesem Fall 0 ist und als einziges invalid
			return "Vorsicht! Du hast keinen Schlüssel eingegeben!";
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
		return algorithm(text, key,  true);
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		return algorithm(text, key, false);
	}


}
