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
	public Options myAlphabet;
	String currentAlphabet;
	public Chiffre() //constructor
	{
		myAlphabet = Options.getInstance();
	}
	/**
	 * Abstrakte Funktion
	 * @param text (Klartext)
	 * @param key (Schluessel)
	 * @return Geheimtext
	 */
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
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		
		if (verified != null){
			return verified;
		}
		return algorithmEncrypt(text, key);
	}
	
	public String decrypt(String text, String key) {
		key = key.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		if (verified != null){
			return verified;
		}
		return algorithmDecrypt(text, key);
	}
}
