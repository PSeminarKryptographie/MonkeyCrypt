package crypt;

public class Trans_Test {

	private static Alphabet myAlphabet;
	public static Gartenzaun garten = new Gartenzaun();
	
	public static void main(String [ ] args){	
		myAlphabet = Alphabet.getInstance();
		myAlphabet.setAlphabet("abcdefghijklmnopqrstuvwxyz.,?");
		String encrypted = garten.encrypt("abcdefghijklmnop", "3");
		System.out.println(encrypted);
		String decrypted = garten.decrypt("abcdefghijklmno", "4");
		System.out.println(decrypted);
	}
	

}
