/**
 * 
 */
package crypt;


/**
 * @author Matthias
 *
 */
public class AlphaIndex extends Spielsprache{

	private String currentAlphabet;
	
	public String encrypt(String text) {
		text = text.toLowerCase();
		currentAlphabet = myAlphabet.getAlphabet();
		String stringList = "";
		for (int n = 0; n<text.length(); n++){
			if (currentAlphabet.contains(String.valueOf(text.charAt(n)))){
				stringList += Tools.string2int(String.valueOf(text.charAt(n)), currentAlphabet);
				stringList += " ";
			}
		}
		return stringList;
	}

	@Override
	public String decrypt(String text) {
		currentAlphabet = myAlphabet.getAlphabet();
		text = text.toLowerCase();
		String stringList = "";
		boolean number = false; // to check if it's a number with 2 digits
		for (int n = 0; n<text.length(); n++){
			try{
				int newint = Integer.parseInt(String.valueOf(text.charAt(n)));
				if ((0 <= newint) && (newint <= currentAlphabet.length())){
					if (number == true){
						String doubleint = String.valueOf(text.charAt(n-1));
						doubleint += String.valueOf(text.charAt(n));
						newint = Integer.parseInt(String.valueOf(doubleint));
						stringList = stringList.substring(0,stringList.length()-1);
					}
					stringList += Tools.int2string(newint, currentAlphabet);
					number = true;
				}
				else{
					number = false;
				}
				
			}
			catch(Exception e){
				number = false;
			}

			
		}
		return stringList;
	}

}
