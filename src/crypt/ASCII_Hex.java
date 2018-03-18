package crypt;

public class ASCII_Hex extends Spielsprache {

	@Override
	public String encrypt(String text) {
		byte [] bytes = text.getBytes();
		StringBuilder sb = new StringBuilder();
	    for (int i=0; i<bytes.length; i++) {
	        sb.append(String.format("%x",bytes[i]) + " ");
	    }
	    String str = sb.toString();
	    return str.substring(0, str.length() - 1);
	}

	@Override
	public String decrypt(String text) {
		String str = "";
	    for(int i=0;i<text.length();i+=3)
	    {
	        String s = text.substring(i, (i + 2));
	        int decimal = Integer.parseInt(s, 16);
	        str = str + (char) decimal;
	    }       
	    return str;
	}

}
