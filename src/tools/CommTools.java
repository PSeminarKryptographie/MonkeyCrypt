/**
 * 
 */
package tools;

import crypt.*;

import java.util.List;

/**
 * @author caterina
 *
 */
public class CommTools {
	public Options myAlphabet;
	private String currentAlphabet;
	
	public CommTools(){
		myAlphabet = Options.getInstance();
	}
	/**
	 * 
	 * @param laenge
	 * @return Schluessel
	 */
	public String generateNormalKey(int laenge){
		currentAlphabet = myAlphabet.getAlphabet();
		return Tools.generieren(laenge, currentAlphabet);
		}
	/**
	 * 
	 * @param laenge
	 * @return Schluessel Coprim zum Alphabet (fuer Hill Chiffre und Multiplikative Chiffre)
	 */
	public String generateCoprimeKey(int laenge){
		currentAlphabet = myAlphabet.getAlphabet();
		List<Integer> coprimes = Tools.phi(currentAlphabet.length());
		String pool = Tools.list2String(coprimes, currentAlphabet, false);
		return Tools.generieren(laenge, pool);
	}
}
