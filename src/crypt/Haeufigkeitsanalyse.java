package crypt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Haeufigkeitsanalyse {
	
	public Map makeMap(String text) {
		Map <String, Integer> dict = new HashMap<String, Integer>();
		for (int i = 0; i<text.length(); i++) {
			Integer num = 1;
			String a = String.valueOf(text.charAt(i)).toLowerCase();
			if (dict.containsKey(a)) {
				num = dict.get(a) + 1;
				dict.put(a, num);
			}

			dict.put(a, num);

		}
		
		return dict;
	}
	
	
	public String analysieren(String text) {
		Map dict = makeMap(text);
		Set set_keys = dict.keySet();
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
