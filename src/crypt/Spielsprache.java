package crypt;

public abstract class Spielsprache
{
	public Alphabet myAlphabet;
	public Spielsprache() //constructor
	{
		myAlphabet = Alphabet.getInstance();
	}
	public abstract String encrypt(String text);
	public abstract String decrypt(String text);
	
}
