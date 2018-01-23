package crypt;

import java.util.Arrays;
import java.util.List;

public class Vigenere extends Chiffre{
	private String currentAlphabet;
	public List<Integer> length = Arrays.asList(0);
	private static Caesar c = new Caesar();
	
	/**
	 * Funktion soll extern nicht aufgerufen werden. Nur ueber Funktionen de und encrypt
	 * @param text
	 * @param key
	 * @param alpha
	 * @return convertedString (veraenderter Text)
	 */
	
	private String algorithm(String text, String key, String alpha, boolean encrypt){
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
			if (alpha.contains(String.valueOf(text.charAt(n)).toLowerCase())){
				k++;
			}
			
			
		}
		return newtext;
	}
	
	/**
	 * @param text (Klartext)
         * @param key (Schluessel)
	 * ruft keyinnum auf
	 * @return algorithm() (Geheimtext)
	 */
	
	public String encrypt(String text, String key)
	{
                key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		/*if (text == null){
			return "text ist null";
		}*/
		if (verified != null){
			return verified;
		}
		key = key.toLowerCase();
		return algorithm(text, key, currentAlphabet, true);	
	}
	
	/**
	 * @param text (Geheimtext)
	 * @param key (Schluessel)
	 * ruft keyinnum auf
	 * invertiert int key
	 * @return algorithm() (Klartext)
	 */
	
	public String decrypt(String text, String key)
	{
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return algorithm(text, key, currentAlphabet, false);
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}


}
