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
	@Override
	public String encrypt(String text, String key) {
		String verified = verify(key, "");
		
		if (verified != null){
			return verified;
		}
		
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

	@Override
	public String decrypt(String text, String key) {
		
String verified = verify(key, "");
		
		if (verified != null){
			return verified;
		}
		
		int depth = Integer.valueOf(key);
		
		if (depth == 1 || depth > text.length()/2){
			return text;
		}
		if (depth > text.length()){
			depth = text.length();
		}
		
		int groupsize = 2*depth -2;
		//System.out.println(groupsize);
		int groupamount = ((text.length()/groupsize));
		while(groupamount*groupsize < text.length()){
			text += "a";
			System.out.println(text);
			groupamount = ((text.length()/groupsize));
		}
		
		
		String[] newTextArray = new String[depth];
		Arrays.fill(newTextArray, "");
		for (int i = 0; i<groupamount; i++){
			newTextArray[0] += String.valueOf(text.charAt(i));
			System.out.println(String.valueOf(text.charAt(i)));
		}
		System.out.println("__");
		int cellsize = groupamount * 2;
		int cellamount = depth - 2;
		for (int i = 0; i<cellamount; i++){
			for (int j = 0; j<cellsize; j++){
				newTextArray[0] += String.valueOf(text.charAt(cellsize*i+j+groupamount));
				System.out.println(String.valueOf(text.charAt(cellsize*i+j+groupamount)));
				//System.out.println(cellsize*i+j+groupamount);
			}
			System.out.println("__");
		}
		for (int i = text.length()-groupamount; i<text.length(); i++){
			newTextArray[0] += String.valueOf(text.charAt(i));
			System.out.println(String.valueOf(text.charAt(i)));
		}
		
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
