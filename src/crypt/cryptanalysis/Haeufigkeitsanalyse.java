package crypt.cryptanalysis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import crypt.Options;
import crypt.Tools;

public class Haeufigkeitsanalyse {
	public Options myOptions;
	String currentAlphabet;
	public Haeufigkeitsanalyse() //constructor
	{
		myOptions = Options.getInstance();
	}
	public LinkedHashMap<String, Integer> makeMap(String text) {
		text = Tools.removeChars(text, " ");
		text = text.toLowerCase();
		currentAlphabet = myOptions.getAlphabet();
		LinkedHashMap <String, Integer> dict = new LinkedHashMap<String, Integer>();
		for (int i = 0; i<currentAlphabet.length(); i++) {
			dict.put(String.valueOf(currentAlphabet.charAt(i)), 0);
		}
		
		for (int i = 0; i<text.length(); i++) {
			Integer num = 1;
			String a = String.valueOf(text.charAt(i)).toLowerCase();
			try{
				num = dict.get(a) + 1;
				dict.put(a, num);
			}
			catch(Exception e){
				dict.put(a, num);
			}

		}
		
		return dict;
	}
	
	public String analysieren(String text) {
		Map<String, Integer> dict = makeMap(text);
		Set<String> set_keys = dict.keySet();
		String [] keys = (String[]) set_keys.toArray(new String[0]);
		String newString = "";
		for (int i = 0; i < dict.size(); i ++) {
                        newString += "\"" + keys[i] + "\"" + "\t" + dict.get(keys[i]).toString();
			if(i != dict.size() - 1) {
                            newString += "\n";
                        }
		}
		return newString;
	}

}
