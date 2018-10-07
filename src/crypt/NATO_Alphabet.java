/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonas
 */
public class NATO_Alphabet extends Spielsprache {

	private Map <String, String> dict = new HashMap<>();
	private String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "ä", "ö", "ü", " "};
	private String [] nato = {"Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel","India","Juliett","Kilo","Lima","Mike","November","Oscar","Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor",  "Whiskey","X-Ray","Yankee","Zulu","Alfa Echo","Oscar Echo","Uniform Echo", ""};

    public NATO_Alphabet() {
        Map <String, String> charToCode = Tools.mapDict(alphabet, nato);
        Map <String, String> codeToChar = Tools.mapDict(nato, alphabet);
        dict.putAll(charToCode);
        dict.putAll(codeToChar);
    }
        
	@Override
    public String encrypt(String text) {
		text = text.toLowerCase();
        String out = "";
        for(int i = 0; i < text.length(); i++) {
        	if (dict.containsKey(String.valueOf(text.charAt(i)))){
        		out += dict.get(String.valueOf(text.charAt(i))) + " ";
        	}
        	else{
        		out += " ? ";
        	}
        }
        return out;
	}
    
    @Override
    public String decrypt(String text) {
         
        String out = "";
        String word = "";
        for(int i = 0; i < text.length(); i++) {
        	if ((text.charAt(i) == ' ') || (i ==  text.length()-1)){
        		if (text.charAt(i) != ' '){
        			word += text.charAt(i);
        		}
        		if (Arrays.asList(nato).contains(word)){
        			out += dict.get(word);
        		}
        		else{
        			out += " ? ";
        		}
        		word = "";
        		
        	
        	}
        	else{
        		word += text.charAt(i);
        	}
        }
        return out;
    } 
}
