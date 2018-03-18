package crypt;

public class Bobsprache extends Spielsprache
{
	private String consonants = "qwrtzpsdfghjklyxcvbnmQWRTZPSDFGHJKLYXCVBNM";
	@Override
	public String encrypt(String text) {
		for(int i = 0; i < consonants.length(); i++) {
			String c = String.valueOf(consonants.charAt(i));
			String o = "o";
			if (Character.isUpperCase(c.charAt(0))) {
				o.toUpperCase();
			}
			text = text.replaceAll(c, c + "o" + c);
		}
		return text;
	}

	@Override
	public String decrypt(String text) {
		for(int i = 0; i < consonants.length(); i++) {
			String c = String.valueOf(consonants.charAt(i));
			text = text.replaceAll(c + "(?i)o" + c, c);
			
		}
		return text;
	}
      
    
}
