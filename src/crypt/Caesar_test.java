package crypt;

/**
 * Ueberprueft mit gedrukter Ausgabe ob Caesar.java richtig verschluesselt
 * @author caterina
 */
import java.util.Random;

public class Caesar_test
{
	private static Options myAlphabet;
	public static Caesar c = new Caesar();
	public static Multiplikativ m = new Multiplikativ();
	public static Vigenere v = new Vigenere();
	public static String input = "";
	public static String key = "";
	public static String currentAlphabet = "";
	public static Spaltentransposition st = new Spaltentransposition();

	
	public Caesar_test(){};
	
	/**
	 * erzeugt random Zeichen fuer einen Schluessel
	 * @param alpha (Das aktuelle Alphabet)
	 * @return randString (der Laenge 1)
	 */
	public static String randomString1(String alpha)
	{
		Random rand = new Random();
		String randString = "";
		randString += alpha.charAt(rand.nextInt(alpha.length()));
		return randString;
	}
	/**
	 * erzeugt random Zeichen fuer einen Text
	 * @param alpha (Das aktuelle Alphabet)
	 * @return randString der Laenge 10
	 * "!" am Ende soll demonstrieren, dass auch Zeichen verschluesselt werden
	 */
	public static String randomString10(String alpha){
		Random rand = new Random();
		String randString = "";
		int length = rand.nextInt(20);
		for (int i=0; i<length; i++){
			randString += alpha.charAt(rand.nextInt(alpha.length()));
		}
		//randString += "!";
		return randString;
	}
	
	public static void main(String [ ] args){	
		myAlphabet = Options.getInstance();
		
		/**
		 * Caesar wird getestet
		 */
		
		String currentAlphabet = myAlphabet.getAlphabet();
		key = randomString1(currentAlphabet);
		//input = randomString10(currentAlphabet);
		input = "Matthias";
		String encrypted = c.encrypt(input, key);
		String decrypted = c.decrypt(encrypted, key);
		System.out.printf("Alphabet: %s\n", currentAlphabet);
		System.out.printf("Klartext: %s\n", input);
		System.out.printf("Schlüssel: %s\n", key);
		System.out.printf("verschlüsselt: %s\n", encrypted);
		System.out.printf("entschlüsselt: %s\n", decrypted);
		
		if (decrypted.equals(input))
		{
			System.out.printf("true \n\n");
		}
		else {System.out.printf("false \n\n");}
		
		/**
		 * Vigenere wird getestet
		 */

		key = randomString10(currentAlphabet);
		//input = randomString10(currentAlphabet);
		input = "AaaAaaaaaaaaaa!";
		encrypted = v.encrypt(input, key);
		decrypted = v.decrypt(encrypted, key);
		System.out.printf("Alphabet: %s\n", currentAlphabet);
		System.out.printf("Klartext: %s\n", input);
		System.out.printf("Schlüssel: %s\n", key);
		System.out.printf("verschlüsselt: %s\n", encrypted);
		System.out.printf("entschlüsselt: %s\n", decrypted);
		
		if (decrypted.equals(input))
		{
			System.out.printf("true \n\n");
		}
		else {System.out.printf("false \n\n");}
		
		
		/**
		 * Alphabet wird veraendert
		 
		
		myAlphabet.setAlphabet("abc");
		currentAlphabet = myAlphabet.getAlphabet();
		key = "f";
		//key = randomString1(currentAlphabet);
		input = randomString10(currentAlphabet);
		encrypted = c.encrypt(input, key);
		decrypted = c.decrypt(encrypted, key);
		System.out.printf("Alphabet: %s\n", currentAlphabet);
		System.out.printf("Klartext: %s\n", input);
		System.out.printf("Schlüssel: %s\n", key);
		System.out.printf("verschlüsselt: %s\n", encrypted);
		System.out.printf("entschlüsselt: %s\n", decrypted);

		
		if (decrypted.equals(input))
		{
			System.out.printf("true \n");
		}
		else {System.out.printf("false \n");}*/
	
	
	/**
	 * Spaltentransposition wird getestet
	 */

	key = randomString10(currentAlphabet);
	input = randomString10(currentAlphabet);
	while (input.length() < key.length()) {
		input = randomString10(currentAlphabet);
	}
	//input = "AaaAaaaaaaaaaa!";
	encrypted = st.encrypt(input, key);
	decrypted = st.decrypt(encrypted, key);
	System.out.printf("Alphabet: %s\n", currentAlphabet);
	System.out.printf("Klartext: %s\n", input);
	System.out.printf("Schlüssel: %s\n", key);
	System.out.printf("ST verschlüsselt: %s\n", encrypted);
	System.out.printf("ST entschlüsselt: %s\n", decrypted);
	
	if (decrypted.equals(input))
	{
		System.out.printf("true \n\n");
	}
	else {System.out.printf("false \n\n");}
	
	
}
}
