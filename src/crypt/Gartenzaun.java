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
		// TODO Auto-generated method stub
		return "Noch zu implementieren";
	}

	@Override
	public String decrypt(String text, String key) {
		// TODO Auto-generated method stub
		return "Noch zu implementieren";
	}

	@Override
	protected String verify(String key, String alphabet) {
		// TODO Auto-generated method stub
		return null;
	}

}
