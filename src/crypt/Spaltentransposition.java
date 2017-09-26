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
	@Override
	public String encrypt(String text, String key) {
		//make a matrix

		String[][] array = new String[Integer.valueOf(text.length()/key.length() + 1)][key.length()];
		Arrays.fill(array[Integer.valueOf(text.length()/key.length() + 1)], "");
		int counter = 0;
		for (int i = 0; i<array.length; i++){
			for (int j = 0; j<array[0].length; j++){
				System.out.println(counter);
				if (counter >= text.length()){
					break;
				}
				array[i][j] = String.valueOf(text.charAt(counter));
				counter++;
				System.out.println("here");
			}
			
		}
		System.out.println(Arrays.deepToString(array));
		return "Noch zu implementieren";
	}

	@Override
	public String decrypt(String text, String key) {
		// TODO Auto-generated method stub
		return "Noch zu implementieren";
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
