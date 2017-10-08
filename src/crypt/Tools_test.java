/**
 * 
 */
package crypt;
import tools.CommTools;
import core.*;


/**
 * @author caterina
 *
 */
public class Tools_test {
	private static Alphabet myAlphabet;
	private static CommTools cTools = new CommTools();
	static String testString = "abcdefghi";
	static int [][] hillKey = {{1, 48, 2}, {3, 23, 76}, {6, 5, 8}};
	
	
	public static void main(String [ ] args){	
		myAlphabet = Alphabet.getInstance();
		String currentAlphabet = myAlphabet.getAlphabet();
		System.out.println(cTools.generateCoprimeKey(1));
	}
	
}
