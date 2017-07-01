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
	private Map <String, String> dict = new HashMap<String, String>();
	private String alphabet = "abcdefghijklmnopqrstuvwxyzäöü ";
	private String [] nato = {"Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel","India","Juliett","Kilo","Lima","Mike","November","Oscar","Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor",  "Whiskey","X-Ray","Yankee","Zulu","Alfa Echo","Oscar Echo","Uniform Echo", ""};
	
	private void setup(){
		for(int i = 0; i < alphabet.length(); i++) {
			 dict.put(String.valueOf(alphabet.charAt(i)), nato[i]);
			 dict.put(nato[i], String.valueOf(alphabet.charAt(i)));
		}
	}
	@Override
    public String encrypt(String text) {
		setup();
		System.out.println(dict.toString());
		text = text.toLowerCase();
        String out = "";
        for(int i = 0; i < text.length(); i++) {
        	if (alphabet.contains(String.valueOf(text.charAt(i)))){
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
        setup();
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
