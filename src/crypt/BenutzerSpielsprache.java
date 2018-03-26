package crypt;

public class BenutzerSpielsprache {
	public String encrypt(String text, String [] keywords, String [] replacement) {
		for(int i = 0; i < keywords.length; i++) {
			text = text.replaceAll("(?i)" + keywords[i], replacement[i]);
		}
		return text;
	}
	
	public String decrypt(String text, String [] keywords, String [] replacement) {
		for(int i = 0; i < keywords.length; i++) {
			text = text.replaceAll("(?i)" + replacement[i], keywords[i]);
		}
		return text;
	}
}
