package crypt;
/** 
 * Diese Klasse SingleTon ist zum Festlegen von den Einstellungen
 * @author caterina
 * 
 *
 */

public class Options{
	private static Options instance = new Options();
	private int letters; //1: uppercase, 2: lowercase, 0: normal, 3: random
	private String alphabet; 
	private String exclusion; //none, all, spaces, [user-defined]
	/**
	 * make the constructor private so that this class cannot be instantiated
	 * -> Nur ein Objekt moeglich
	 */

	private Options(){
		setAlphabet("abcdefghijklmnopqrstuvwxyz");
		setExclusion("none");
		setCase(0);
	}

	/**
	 * Get the only object available
	 * @return instance
	 */
	public static Options getInstance(){
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
	
	public void setCase(int c) {
		letters = c; 
	}
	
	public int getCase() {
		return letters;
	}
	
	public void setExclusion(String e) {
		exclusion = e;
	}
	
	public String getExclusion() {
		return exclusion;
	}

}
