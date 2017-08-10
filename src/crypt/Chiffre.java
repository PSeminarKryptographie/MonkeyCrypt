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
	public Alphabet myAlphabet;

	public Chiffre() //constructor
	{
		myAlphabet = Alphabet.getInstance();
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
		text = text.toLowerCase();
		boolean contains = true;
		for (int i = 0; i<text.length(); i++){
			if (!alpha.contains(String.valueOf(text.charAt(i)))){
				contains = false;
			}
		}
		return contains;
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
	
	
	protected abstract String verify(String key, String alphabet);
	
	public abstract String encrypt(String text, String key);
	/**
	 * Abstrakte Funktion
	 * @param text (Geheimtext)
	 * @param key (Schluessel)
	 * @return Klartext
	 */
	public abstract String decrypt(String text, String key);
}
