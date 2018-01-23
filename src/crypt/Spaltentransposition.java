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


	protected String algorithmEncrypt(String text, String key) {
		int width = key.length();
		if (width == 0) {
			return text;
		}
		int height = Integer.valueOf(text.length()/key.length());
		if (text.length()%key.length() != 0){
			height++;
		}
		
				
		String[][] array = new String[height][width];
		for (int a = 0; a<height; a++){
			Arrays.fill(array[a], "");
		}
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


	protected void setLength(String text) {
		length.set(0, text.length());
	}


	protected String algorithmDecrypt(String text, String key) {
		if (key.length() == 0) {
			return text;
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
		
		if (text.length()%key.length() != 0){
			width++;
		}
		int missing =(height*width) - text.length();
		
		
				
		String[][] array = new String[height][width];
		for (int a = 0; a<height; a++){
			Arrays.fill(array[a], "");
		}
		boolean leave_me = false;
		int counter = 0;
		for (int i = 0; i<array.length; i++){
			for (int j = 0; j<array[0].length; j++){
				if (counter >= text.length()){
					break;
				}
				
				//System.out.println(sortedKey[i] - missing);
				//System.out.println("j: " + j);
				//System.out.println("expected: " + array[0].length);
				int index = i +1;
				
				int position = Tools.getArrayIndex(sortedKey, index)+1;
				
				if (leave_me) {
					array[i][j] = "";
					leave_me = false;
					break;
				}
				
				if ((position > key.length() - missing) && j == array[0].length -2){
					
					leave_me = true;
				}

				array[i][j] = String.valueOf(text.charAt(counter));
				counter++;
				

				
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
		if(key.length()>length.get(0)) {
			return "Vorsicht! Das Schlüsselwort darf nicht länger als deine Eingabe sein!";
		}
		else{
			return null;
		}
		
	}



}
