/**
 * 
 */
package crypt;

/**
 * @author caterina
 *
 */
public class Test {
	private static Alphabet myAlphabet;
	public static Affine a = new Affine();
	
	public static void main(String [ ] args){	
		myAlphabet = Alphabet.getInstance();
		
		String text = "something";
		
		System.out.printf(a.encrypt(text, "JB"));
		//System.out.printf(a.decrypt(a.encrypt(text, "aa"), "aa"));
	}	
}
