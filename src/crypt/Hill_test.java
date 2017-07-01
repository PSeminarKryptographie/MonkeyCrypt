package crypt;

public class Hill_test {
	private static Alphabet myAlphabet;
	public static Hill h = new Hill();
	
	public static void main(String [ ] args){	
		myAlphabet = Alphabet.getInstance();
		
		String key = "cdejcbdrh";
		String text = "att";
		String encrypted = h.encrypt(text, key);
		System.out.println(encrypted);
		String decrypted = h.decrypt(encrypted, key);
		System.out.println(decrypted);
		/*if (true){
			System.out.printf("true \n\n");
		}
		else{
			System.out.printf("false \n\n");
		}
		*/
	}
}
