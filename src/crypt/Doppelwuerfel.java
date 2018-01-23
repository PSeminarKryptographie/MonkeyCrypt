package crypt;

import java.util.Arrays;
import java.util.List;

public class Doppelwuerfel {
	public Options myAlphabet;
	private String currentAlphabet;
	private List<Integer> length = Arrays.asList(0);
	private Spaltentransposition t = new Spaltentransposition();
	public Doppelwuerfel() //constructor
	{
		myAlphabet = Options.getInstance();
	}
	public String encrypt(String text, String key1, String key2){
		length.set(0, text.length());
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key1, currentAlphabet);
		if (verified != null){
			return verified;
		}
		verified = verify(key2, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return t.encrypt(t.encrypt(text, key1), key2);
	}
	
	public String decrypt(String text, String key1, String key2){
		length.set(0, text.length());
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key1, currentAlphabet);
		if (verified != null){
			return verified;
		}
		verified = verify(key2, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return t.decrypt(t.decrypt(text, key2), key1);
	}
	
	protected String verify(String key, String alphabet) {
		if(!Tools.checkCharacter(key, alphabet)){
			return "Vorsicht! Das Schlüsselwort darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		if(key.length()>length.get(0)) {
			return "Vorsicht! Die Schlüsselwörter dürfen jeweils nicht länger als deine Eingabe sein!";
		}
		else{
			return null;
		}
		
	}
}
