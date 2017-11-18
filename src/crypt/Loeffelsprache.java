/**
 * 
 */
package crypt;

/**
 * @author caterina
 *
 */
public class Loeffelsprache extends Spielsprache{
	String vokaleohne = "eaiouäüöAEIOUÄÜÖ";
	String [] vokalemit = new String [] {"e","i","o","u","a","ä","ü","ö", "A", "E","I","O","U","Ö","Ä","Ü"};
	String [] combinations = new String [] {"eu","ie","ei","au", "Eu","Ie","Ei","Au", "EU", "IE", "EI", "AU", "eU", "iE", "eI", "aU"};
	@Override
	public String encrypt(String M) {
		String newtext = M;
		newtext = stepOne(newtext);
		for(int i = 0; i < combinations.length; i++){
			newtext = newtext.replaceAll(stepOne(combinations[i]), (combinations[i] + "lew" + combinations[i]));
		}
		return newtext;
	}

	private String stepOne(String newtext) {
		for(int i = 0; i < vokaleohne.length(); i++){
			newtext = newtext.replaceAll(String.valueOf(vokaleohne.charAt(i)), (vokaleohne.charAt(i) + "lew" + vokaleohne.charAt(i)));
		}
		return newtext;
	}

	@Override
	public String decrypt(String C) {
		String newtext = C;
		for(int i = 0; i < vokalemit.length; i++){
			newtext = newtext.replaceAll((vokalemit[i] + "lew" + vokalemit[i]), vokalemit[i]);
		}
		for(int i = 0; i < combinations.length; i++){
			newtext = newtext.replaceAll((combinations[i] + "lew" + combinations[i]), combinations[i]);
		}
		return newtext;
	}

}
