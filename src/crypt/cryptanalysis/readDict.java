package crypt.cryptanalysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class readDict {
	
	public static void searchWord() throws Exception {

		    URL oracle = new URL("https://raw.githubusercontent.com/Haspaker/anagram.tips/master/words/de/dict/german.wordlist.txt");
		    BufferedReader in = new BufferedReader(
		    new InputStreamReader(oracle.openStream()));
		    String inputLine;
		    while ((inputLine = in.readLine()) != null)
		        if(inputLine.equals("Zebra")) {
		        	System.out.println(inputLine);
		        	break;
		        }
		    in.close();
	}
	
	public static void main(String[] args) throws Exception
    {
		readDict.searchWord();
    }
}
