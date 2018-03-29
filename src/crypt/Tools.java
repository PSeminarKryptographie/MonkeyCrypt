/**
 * 
 */
package crypt;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author caterina
 * Class with tools to get rid of redundancies
 */
public class Tools {
	
	/**
	 * 
	 * @param key
	 * @param alpha
	 * @return keynum (Schluessel als integer)
	 */
	public static int string2int(String key, String alpha)
	{
		key = key.toLowerCase();
		int keynum = alpha.indexOf(key.charAt(0));
		return keynum;
	}
	
	public static String int2string(int index, String alpha){
		
		return Character.toString(alpha.charAt(index)) ;
	}
	
	public static int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
    return k;
	}

	public static int ggT(int a, int b){
	    if (a == 0){
	    	 return b;
	    }   
	    return ggT(b%a, a);
	}
	
//	private int kgV(int a, int b){
//		return (a*b)/ggT(a,b);
//	}
	 
	public static List<Integer> phi(int n)
	{
		List<Integer> coprimes = new ArrayList<Integer>();
	    coprimes.add(1);
		for (int i=2; i < n; i++)
	        if (ggT(i, n) == 1){
	        	
	        	coprimes.add(i);
	        }
	    return coprimes;
	    
	}
	/**
	 * 
	 * @param list
	 * @param alpha
	 * @return text
	 */
	public static String list2String(List<Integer> list, String alpha, boolean addCommas){
		String text = "";
		for (int i = 0; i<list.size(); i++)
		{
			for (int n = 0; n<alpha.length(); n++)
			{
				if(n==list.get(i)){
					text += alpha.charAt(n);
					if (addCommas){
						text += ", ";
					}
				}
			}
		}
		text = text.substring(0,text.length()-2);
		return text;
	}
	
	
	/**
	 * 
	 * @param länge
	 * @param alpha
	 * @return random String
	 */
	public static String generieren(int länge, String alpha){
		Random rand = new Random();
		String randString = "";
		for (int i=0; i<länge; i++){
			randString += alpha.charAt(rand.nextInt(alpha.length()));
		}
		//randString += "!";
		return randString;
	}
	/*
	public static boolean contains(String text, String alpha){
		boolean contains = true;
		for (int n = 0; n<text.length(); n++){
			String currentchar = "";
			currentchar += text.charAt(n);
			if (alpha.contains(currentchar) == false){
				contains = false;
			}
		}
		return contains;
		
	}
	*/
	
	public static int [][] makeMatrix(String text, int rows, int columns, String alpha){
		char [] cArray = text.toCharArray();
		int counter = 0;
		int[][] newMatrix = new int[rows][columns];
		for(int r = 0; r <= rows-1; r++){
			for(int c = 0; c <= columns-1; c++){
				if (counter < text.length()){
					
					int currentNum = Tools.string2int(String.valueOf(cArray[counter]), alpha);
					//System.out.println(currentNum);
					if (currentNum != -1){
						newMatrix[r][c] = currentNum;
					}
					else{
						newMatrix[r][c] = 0;
					}
					counter++;
				}
			}
		
		}
		return newMatrix;
	}
	

	/**
	 * @param text
	 * @param rows
	 * @param columns
	 * @param alpha
	 * @return
	 */
	public static int[] string2intList(String text, String alpha) {
		text = text.toLowerCase();
		int [] whole = new int[text.length()];
		for (int n = 0; n<text.length(); n++){
			int newint = string2int(String.valueOf(text.charAt(n)), alpha);
			whole [(n)] = newint;
		}
		return whole;
	}
	 
	 
	 public static String matrix2string (int [][] matrix, String alpha){
		 
		 int rows = matrix.length;
		 int columns = matrix[0].length;
		 String newString = "";
		 for (int i = 0; i < rows; i++){
			 for (int n = 0; n < columns; n++){
				 int field = (matrix[i][n])%(alpha.length());
				 String letter = int2string(field, alpha);
				 newString += letter;
			 }
		 }
		 return newString;
	 }
	 public static String array2string (String [][] matrix, String alpha){
		 
		 int rows = matrix.length;
		 int columns = matrix[0].length;
		 String newString = "";
		 for (int i = 0; i < rows; i++){
			 for (int n = 0; n < columns; n++){
				 String field = matrix[i][n];
				 String letter = field;
				 newString += letter;
			 }
		 }
		 return newString;
	 }
	 public static String removeDoubles(String text){
		 String newString = "";
		 for (int i = 0; i < text.length(); i++){
			 if (!newString.contains(String.valueOf(text.charAt(i)))){
				 newString += text.charAt(i);
			 }
		 }
		 return newString;
	 }
	 public static int findinArray(int [] array, int value) {
		    for(int i=0; i<array.length; i++) 
		         if(array[i] == value)
		             return i;
		    return -1;
	}
	public static String [][] flipMatrix(String [][] array){
			String [][] newArray = new String [array[0].length][array.length];
			for(int c = 0; c < array[0].length; c++){
				newArray[c] = getColumn(array, c);
			}
			return newArray;
	}
	
	public static String [] getColumn(String [][] array, int i){
		String [] colArray = new String[array.length];
		for(int row = 0; row < array.length; row++)
		{
		    colArray[row] = array[row][i];
		}
			return colArray;
		}
	 
	public static boolean checkCharacter(String text, String alpha){
	 text = text.toLowerCase();
		boolean contains = true;
		for (int i = 0; i<text.length(); i++){
			if (!alpha.contains(String.valueOf(text.charAt(i)))){
				contains = false;
			}
		}
		return contains;
	}
	
        public static boolean checkString(String text, String alpha){
	 text = text.toLowerCase();
		boolean notcontains = true;
                if(text.length() > 0) {
                    for (int i = 0; i<text.length(); i++){
                            if (alpha.contains(String.valueOf(text.charAt(i)))){
                                	notcontains = false;
                            }
                    }
                }
                return notcontains;
	}
	 
	 public static int maxIndex(int[] array) {
		    int max = array[0];
		    int index = 0;
		    for (int i = 0; i < array.length; i++) {
		        if (array[i] >= max) {
		            max = array[i];
		            index = i;
		        }
		    }
		    return index;
	}
	
	 
	 
	 public static int modInverse(int key, String alpha){
		 int n = 1;
		 boolean negative = key < 0;
		 if (negative){
			 key = -key;
		 }
		 while(true){
			 if ((key*n)%alpha.length() == 1){
				 if (negative){
					 return alpha.length() - n;
				 }
				 else{
					 return n;
				 }
				 
			 }
			 else if ((key*n)%alpha.length() == 0){
				 return 0;
			 }
			 n++;
			 
		 }
	 }
	 
	 public static String onlyAlphabet(String text, String alpha){
		 String newText = "";
		 text = text.toLowerCase();
		 for (int i = 0; i < text.length(); i++){
			 if(alpha.contains(String.valueOf(text.charAt(i)))){
				 newText += text.charAt(i);
			 }
		 }
		 return newText;
	 }
	 
	 public static String removeChars(String text, String exclude){
		 String newText = "";
		 for (int i = 0; i < text.length(); i++){
			 if(!exclude.contains(String.valueOf(text.charAt(i)))){
				 newText += text.charAt(i);
			 }
		 }
		 return newText;
	 }
	 /*private String cleanup(String text, String newText, String alpha){
			String correctText = "";
			for (int i = 0; i<newText.length(); i++  ){
				if (!alpha.contains(String.valueOf(text.charAt(i)).toLowerCase())){
					correctText += text.charAt(i);
				}
				else if(Character.isUpperCase(text.charAt(i))){
					correctText += Character.toUpperCase(newText.charAt(i));
				}
				else{
					correctText += newText.charAt(i);
				}
			}
			return correctText;
		}*/
}
