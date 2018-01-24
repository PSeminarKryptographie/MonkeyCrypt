package crypt;

import java.util.List;

//import crypt.Tools;

/**
 * Abstrakte Klasse als Muster fuer alle Chiffren
 * 
 * @author caterina
 *
 */
public abstract class Chiffre {
	public Options myOptions;
	String currentAlphabet;
	public Chiffre() //constructor
	{
		myOptions = Options.getInstance();
	}
	
	final boolean checkLength(String text, List<Integer> length){
		return (length.contains(text.length()));
	}
	
	final boolean checkCharacter(String text, String alpha){
		return Tools.checkCharacter(text, alpha);
	}
	final boolean checkDeterminant(int [][] Matrix){
		if (MatrixTools.determinant(Matrix) == 0){
			return false;	
		}
		else{
			return true;
		}		
	}	
	
	final String filterExclusions(String text) {
		String e = myOptions.getExclusion();
		if (e.equals("none")) {
			return text;
		}
		if (e.equals("all")) {
			return Tools.onlyAlphabet(text, currentAlphabet);
		}
		if (e.equals("spaces")) {
			return Tools.removeChars(text, " ");
		}
		return Tools.removeChars(text, e);
	}
	
	final String filterCase(String text) {
		String c = myOptions.getCase();
		if (c.equals("uppercase")) {
			return text.toUpperCase();
		}
		if (c.equals("lowercase")) {
			return text.toLowerCase();
		}
		if (c.equals("random")) {
			String newtext = "";
			for (int n = 0; n < text.length(); n++) {
				double r = Math.round(Math.random());
				if (r > 0.5) {
					newtext += String.valueOf(text.charAt(n)).toUpperCase();
				}
				else {
					newtext += String.valueOf(text.charAt(n)).toLowerCase();
				}
			}
			return newtext;
		}
		return text;
	}
	
	final String filter(String text) {
		text = filterCase(text);
		text = filterExclusions(text);
		return text;
	}
	
	final boolean checkCoprimes(String text, String alpha){
		List<Integer> coprimes = Tools.phi(alpha.length());
		int keynum = Tools.string2int(text, alpha);
		return (coprimes.contains(keynum));
	}
	protected abstract String algorithmEncrypt(String text, String key);
	
	protected abstract String algorithmDecrypt(String text, String key);
	
	protected abstract String verify(String key, String alphabet);
	
	public String encrypt(String text, String key) {
		key = key.toLowerCase();
		setLength(text);
		currentAlphabet = myOptions.getAlphabet();
		text = filter(text);
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return algorithmEncrypt(text, key);
	}
	
	private void setLength(String text) {}
	
	public String decrypt(String text, String key) {
		key = key.toLowerCase();
		setLength(text);
		currentAlphabet = myOptions.getAlphabet();
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return algorithmDecrypt(text, key);
	}
}
