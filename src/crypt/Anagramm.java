/**
 * 
 */
package crypt;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 * @author caterina
 *
 */
public class Anagramm extends Spielsprache{

	@Override
	public String encrypt(String M) {
		List<Character> charList = new ArrayList<Character>();
		for (char c : M.toCharArray()) {
		  charList.add(c);
		}
		Collections.shuffle(charList);
		StringBuilder result = new StringBuilder(charList.size());
		for (Character c : charList) {
		  result.append(c);
		}
		return result.toString();
		 
	}

	@Override
	public String decrypt(String C) {
		// TODO Auto-generated method stub
		return "Ein Anagramm kann man nicht entschlüsseln!";
	}

}
