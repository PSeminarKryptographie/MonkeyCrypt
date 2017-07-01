package crypt;
/** 
 * Diese Klasse SingleTon ist zum Festlegen vom Alphabet
 * @author caterina
 * 
 *
 */


public class Alphabet{
	private static Alphabet instance = new Alphabet();
	
	private String alphabet;
	/**
	 * make the constructor private so that this class cannot be instantiated
	 * -> Nur ein Objekt moeglich
	 */

	private Alphabet(){
		setAlphabet("abcdefghijklmnopqrstuvwxyz"); 
	}

	/**
	 * Get the only object available
	 * @return instance
	 */
	public static Alphabet getInstance(){
		return instance;
	}
	/**
	 * Zum Zugreifen auf Alphabet
	 * @return alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}
	/**
	 * Zum Aendern des Alphabets
	 * @param myAlphabet (neues Alphabet)
	 */
	public void setAlphabet(String myAlphabet) {
		this.alphabet = myAlphabet;
	}

}
