/**
 * 
 */
package crypt;

import java.util.Arrays;

/**
 * @author caterina
 *
 */
public class Tools_test {
	private static Alphabet myAlphabet;

	static String testString = "abcdefghi";
	static int [][] hillKey = {{1, 48, 2}, {3, 23, 76}, {6, 5, 8}};
	
	
	public static void main(String [ ] args){	
		myAlphabet = Alphabet.getInstance();
		String currentAlphabet = myAlphabet.getAlphabet();
		int [][] newMatrix = MatrixTools.modMatrix(hillKey, currentAlphabet);
		System.out.println(Arrays.deepToString(newMatrix));
		String textMatrix = Tools.matrix2string(hillKey, currentAlphabet);
		System.out.println(textMatrix);
		if (java.util.Arrays.deepEquals(Tools.makeMatrix(testString, 3, 4, currentAlphabet), hillKey)){
			System.out.printf("true \n\n");
		}
		else{
			System.out.printf("false \n\n");
		}
		MatrixTools.mulMatrix(hillKey, hillKey);
	}
	
}
