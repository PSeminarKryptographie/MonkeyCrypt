package crypt;

public class Doppelwuerfel {
	public Alphabet myAlphabet;
	private String currentAlphabet;
	private Spaltentransposition t = new Spaltentransposition();
	
	String encrypt(String text, String key1, String key2){
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
	
	String decrypt(String text, String key1, String key2){
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key1, currentAlphabet);
		if (verified != null){
			return verified;
		}
		verified = verify(key2, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return t.decrypt(t.decrypt(text, key1), key2);
	}
	
	protected String verify(String key, String alphabet) {
		if(!Tools.checkCharacter(key, alphabet)){
			return "Vorsicht! Das Schlüsselwort darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			return null;
		}
		
	}
}
