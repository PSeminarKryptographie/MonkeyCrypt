package crypt;

public class Trans_Test {

	private static Options myAlphabet;
	public static Spaltentransposition st = new Spaltentransposition();
	
	public static void main(String [ ] args){
		myAlphabet = Options.getInstance();
		myAlphabet.setAlphabet("abcdefghijklmnopqrstuvwxyz.,?");
		String encrypted = st.encrypt("abcdefghijklmnopqrstuvwxyz", "hallo");
		System.out.println(encrypted);
		//String decrypted = st.decrypt(encrypted, "5");
		//System.out.println(decrypted)
	}
	

}
