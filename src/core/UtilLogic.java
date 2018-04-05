package core;

import javax.swing.JFrame;
import javax.swing.JLabel;

import crypt.*;
import frame.DrawGraph;
import frame.DrawTable;

public class UtilLogic {
	
	public Options myOptions;
	String currentAlphabet;
	public UtilLogic() //constructor
	{
		myOptions = Options.getInstance();
	}
	Chiffre [] monos = {new Caesar(), new Multiplikativ(), new Affine()};
	String [] bezeichner = {"Caesar Chiffre", "Multiplikative Chiffre", "Affine Chiffre"};
	public void initTable(String key, int cipher) {
		currentAlphabet = myOptions.getAlphabet();
		String verify = monos[cipher].encrypt(String.valueOf(currentAlphabet.charAt(0)), key);
		if (verify.length() != 1) {
			fehlerMeldung(verify);
		}
		else {
			
			//DrawTable ist jetzt ein JPanel
			//new DrawTable(currentAlphabet, monos[cipher].encrypt(currentAlphabet, key), bezeichner[cipher], key);
		}
	}
	protected void fehlerMeldung(String text) {
		JFrame f = new JFrame();
		f.add(new JLabel("<html>"+text+"</html>"));
		f.setTitle("Fehler");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public void initGraph(String key, int cipher) {
		currentAlphabet = myOptions.getAlphabet();
		String verify = monos[cipher].encrypt(String.valueOf(currentAlphabet.charAt(0)), key);
		if (verify.length() != 1) {
			fehlerMeldung(verify);
		}
		else {
			int b;
			try {
				b = Tools.string2int(String.valueOf(key.charAt(1)), currentAlphabet);
			}
			catch(Exception e){
				b = 0;
			}
			int a = Tools.string2int(key, currentAlphabet);
			if (cipher == 0) { // if is caesar
				b = a;
				a = 1;
			}
			//DrawGraph jetzt im Konstruktor. Funktion wird von alleine initialisiert.
			//String function = "E(x) = " + a + "x + " + b;
			//DrawGraph.createAndShowGui(a, b, currentAlphabet.length(), bezeichner[cipher], function);
		}
	}
	
	public static void main(String[] args)
    {
		UtilLogic u = new UtilLogic();
		u.initTable("c", 0);
		u.initGraph("c", 0);
    }
}
