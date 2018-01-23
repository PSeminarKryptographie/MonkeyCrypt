package crypt;

public abstract class Spielsprache
{
	public Options myAlphabet;
	public Spielsprache() //constructor
	{
		myAlphabet = Options.getInstance();
	}
	public abstract String encrypt(String text);
	public abstract String decrypt(String text);
	
}
