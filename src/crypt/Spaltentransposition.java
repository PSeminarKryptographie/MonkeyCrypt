/**
 * 
 */
package crypt;

import java.util.Arrays;
import java.util.List;

/**
 * @author caterina
 *
 */
public class Spaltentransposition extends Chiffre{
	private List<Integer> length = Arrays.asList(0);
	String currentAlphabet;
	@Override
	public String encrypt(String text, String key) {
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		key = key.toLowerCase();
		if (verified != null){
			return verified;
		}
		//make a matrix
		
		int width = key.length();
		int height = Integer.valueOf(text.length()/key.length());
		if (text.length()%key.length() != 0){
			height++;
		}
		
				
		String[][] array = new String[height][width];
		Arrays.fill(array[height-1], "");
		int counter = 0;
		for (int i = 0; i<array.length; i++){
			for (int j = 0; j<array[0].length; j++){
				if (counter >= text.length()){
					break;
				}
				array[i][j] = String.valueOf(text.charAt(counter));
				counter++;
			}
			
		}
		
		//numerate key as index from alphabet
		int [] indexKey = new int [key.length()];
		for(int i = 0; i < key.length(); i++){

			indexKey[i] = Tools.string2int(String.valueOf(key.charAt(i)), currentAlphabet);
		}
		//numerate key from smallest to largest
		int [] sortedKey = new int [indexKey.length];
		for (int i = indexKey.length; i > 0; i--) {
			int n = Tools.maxIndex(indexKey);

			sortedKey[n] = i;
			indexKey[n] = -1;
		}
		//sort array columnwise according to key
		String [][] newArray = new String [width][height];
		
		for (int i = 1; i <= width; i++) {
			
			newArray[i-1] = Tools.getColumn(array, Tools.findinArray(sortedKey, i));

		}
		return Tools.array2string(newArray, currentAlphabet);
	}
	
	
	public String decrypt(String text, String key) {
		currentAlphabet = myAlphabet.getAlphabet();
		String verified = verify(key, currentAlphabet);
		key = key.toLowerCase();
		if (verified != null){
			return verified;
		}
		//numerate key as index from alphabet
		int [] indexKey = new int [key.length()];
		for(int i = 0; i < key.length(); i++){
			indexKey[i] = Tools.string2int(String.valueOf(key.charAt(i)), currentAlphabet);
		}
		//numerate key from smallest to largest
		int [] sortedKey = new int [indexKey.length];
		for (int i = indexKey.length; i > 0; i--) {
			int n = Tools.maxIndex(indexKey);
			sortedKey[n] = i;
			indexKey[n] = -1;
		}
		
		//make a matrix
		
		int height = key.length();
		int width = Integer.valueOf(text.length()/key.length());
		int missing = text.length()%key.length();
		if (text.length()%key.length() != 0){
			width++;
		}
		
				
		String[][] array = new String[height][width];
		Arrays.fill(array[height-1], "");
		int counter = 0;
		for (int i = 0; i<array.length; i++){
			for (int j = 0; j<array[0].length; j++){
				if (counter >= text.length()){
					break;
				}
				if ((Tools.findinArray(sortedKey, i+1) > array.length - missing) && j == array[0].length-1){
					System.out.println("hier");
					array[i][j] = "";
				}
				else{
					array[i][j] = String.valueOf(text.charAt(counter));
					counter++;
				}
				System.out.println(Arrays.deepToString(array));
			}
			
		}
		
		
		//sort array rowwise according to key
		String [][] newArray = new String [height][width];
		
		for (int i = 0; i < height; i++) {
			//System.out.println("height" + height);
			//System.out.println("i" + i);
			//System.out.println(sortedKey[i]);
			//System.out.println(Arrays.deepToString(array));
			newArray[i] =array[sortedKey[i]-1];

		}
		return Tools.array2string(Tools.flipMatrix(newArray), currentAlphabet);
	}
	
		
	

	
	
	
	
	

	@Override
	protected String verify(String key, String alphabet) {
		if(!checkCharacter(key, alphabet)){
			return "Vorsicht! Das Schlüsselwort darf nur Zeichen enthalten, die auch im Alphabet enthalten sind!";
		}
		else{
			return null;
		}
		
	}

}
