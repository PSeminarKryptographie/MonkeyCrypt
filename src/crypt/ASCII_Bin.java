package crypt;

public class ASCII_Bin extends Spielsprache
{

	@Override
	public String encrypt(String text) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i<text.length(); i++){
            sb.append(Integer.toBinaryString(text.charAt(i)) + " ");
        }
        String str = sb.toString();
        return str.substring(0, str.length() - 1);
	}

	@Override
	public String decrypt(String text) {
		String str = "";
		String currentstring = "";
	    for(int i=0;i<text.length();i++)
	    {
	        if (text.charAt(i) == ' ') {
	        	int decimal = Integer.parseInt(currentstring, 2);
	        	str = str + (char) decimal;
	        	currentstring = "";
	        }
	        else {
	        	currentstring += text.charAt(i);
	        }
	    }       
	    return str;
	}
    
}