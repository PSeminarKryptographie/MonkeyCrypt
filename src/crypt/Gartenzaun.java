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
public class Gartenzaun extends Chiffre{
	private List<Integer> length = Arrays.asList(0);
	@Override
	public String encrypt(String text, String key) {
		String verified = verify(key, "");
		
		if (verified == null){
			int depth = Integer.valueOf(key);
			if (depth > text.length()){
				depth = text.length();
			}
			System.out.println(depth);
			int counter = 0;
			String[] newTextArray = new String[depth];
			for (int i = 0; i<text.length(); i++){
				if (i<depth){
					newTextArray[counter] = "";
				}
				newTextArray[counter] += text.charAt(i);
				if (counter == depth-1){
					counter = 0;
				}	
				else{
					counter++;
				}	
			}
			StringBuilder builder = new StringBuilder();
			for(String s : newTextArray) {
				builder.append(s);
			}	
			return builder.toString();
		}
		else{
			return verified;
		}
	}

	@Override
	public String decrypt(String text, String key) {
		// TODO Auto-generated method stub
		return "Noch zu implementieren";
	}

	@Override
	protected String verify(String key, String alphabet) {
		int k;
		try{
			k = Integer.valueOf(key);
		}
		catch(Exception e){
			k = -1;
		}
		if (k>=0){
			return null;
		}
		else{
			return "Vorsicht! Bei der Gartenzaun-Transposition muss der Schlüssel eine Natürliche Zahl sein!";
		}
		
	}

}
