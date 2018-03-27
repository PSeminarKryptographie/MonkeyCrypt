/**
 * 
 */
package crypt;

import java.util.Arrays;

/**
 * @author caterina
 *
 */
public class Gartenzaun extends Chiffre{
	
	private String makeString(String [][] array){
		String newString = ""; 
		for (int i = 0; i<array[0].length; i++){
			for (int j = 0; j<array.length; j++){
				String letter = array[j][i];
				if (letter != null){
					newString += letter;
				}
			}
		}
		return newString;
	}
	
	private int getPosition(boolean even, int depth, int rail){
		if ((rail == 0) || (rail == depth - 1)){
	        return (depth - 1) * 2;
		}

	    if (even){
	        return 2 * rail;
	    }
	    else{
	    	return 2*(depth - 1 - rail);
	    }
	}


	protected String algorithmEncrypt(String text, String key) {
		int depth = Integer.valueOf(key);
		
		if (depth == 1 || depth > text.length()/2){
			return text;
		}
		if (depth > text.length()){
			depth = text.length();
		}
		
		//int groupsize = 2*depth -2;
		//System.out.println(groupsize);
		//int groupamount = ((text.length()/groupsize)+1);
		//System.out.println(groupamount);
		int counter = -1;
		boolean upwards = true;
		String[] newTextArray = new String[depth];
		Arrays.fill(newTextArray, "");
		for (int i = 0; i<text.length(); i++){
			if (upwards){
				counter++;
				upwards = (counter < depth - 1);
			}
			else{
				counter--;
				upwards = (counter == 0);
			}
			newTextArray[counter] += text.charAt(i);
			
		}
		StringBuilder builder = new StringBuilder();
		for(String s : newTextArray) {
			builder.append(s);
		}	
		return builder.toString();
	}


	protected String algorithmDecrypt(String text, String key) {
		int depth = Integer.valueOf(key);
		
		if (depth == 1 || depth > text.length()/2){
			return text;
		}
		if (depth > text.length()){
			depth = text.length();
		}
		
		String[][] array = new String[depth][text.length()];
		//Arrays.fill(newTextArray, "");
			int read = 0;
		    for (int rail = 0; rail<text.length(); rail++){
		        int pos = getPosition(true, depth, rail);
		        boolean even = false;
		        
		        if (rail == 0){
		            pos = 0;
		        }
		        else{
		            pos = (int) pos / 2;
		        }
		        
		        while (pos < text.length()){
		            if (read == text.length()){
		                break;
		            }

		            array[rail][pos] = String.valueOf(text.charAt(read));
		            read = read + 1;

		            pos = pos + getPosition(even, depth, rail);
		            even =  ! even;
		            }
		    }
		//System.out.println(Arrays.deepToString(array));
		return makeString(array);
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
