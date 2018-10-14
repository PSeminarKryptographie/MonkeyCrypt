package core;

import javax.swing.JFrame;
import javax.swing.JLabel;

import crypt.*;
import frame.DrawGraph;
import frame.DrawTable;
import javax.swing.JPanel;

public class UtilLogic {
	
	public Options myOptions;
	String currentAlphabet;
	public UtilLogic() //constructor
	{
		myOptions = Options.getInstance();
	}
	Chiffre [] monos = {new Caesar(), new Multiplikativ(), new Affine()};
	String [] bezeichner = {"Caesar Chiffre", "Multiplikative Chiffre", "Affine Chiffre"};
	public JPanel initTable(String key, int cipher) {
		if(cipher > -1) {
                currentAlphabet = myOptions.getAlphabet();
		String verify = monos[cipher].encrypt(String.valueOf(currentAlphabet.charAt(0)), key);
		if (verify.length() != 1) {
			fehlerMeldung(verify);
                        return fehlerMeldung(verify);
		}
		else {
			
			//DrawTable ist jetzt ein JPanel
			 return new DrawTable(currentAlphabet, monos[cipher].encrypt(currentAlphabet, key),  key);
		}
                } else {return fehlerMeldung("Kein Werkzeug verfügbar!");}
	}
	
        protected JPanel fehlerMeldung(String text) {
		JPanel p = new JPanel();
		p.add(new JLabel(text));     
                return p;
	}
	
	public JPanel initGraph(String key, int cipher) {
		int m = 1;
                int t = 0;
                if(cipher > -1) {
                currentAlphabet = myOptions.getAlphabet();
		String verify = monos[cipher].encrypt(String.valueOf(currentAlphabet.charAt(0)), key);
		if (verify.length() != 1) {
                        return fehlerMeldung(verify);
		}
		else {
			switch(cipher) {
                                case 0:     t = Tools.string2int(key, currentAlphabet); System.out.println(t); break;
                                case 1:     m = Tools.string2int(key, currentAlphabet); break;
                                case 2:     m = Tools.string2int(String.valueOf(key.charAt(0)), currentAlphabet); 
                                            t = Tools.string2int(String.valueOf(key.charAt(1)), currentAlphabet); break;
                        }
                        return new DrawGraph(m, t);
			//DrawGraph jetzt im Konstruktor. Funktion wird von alleine initialisiert.
			//String function = "E(x) = " + a + "x + " + b;
			//DrawGraph.createAndShowGui(a, b, currentAlphabet.length(), bezeichner[cipher], function);
                    }
                } else {return fehlerMeldung("Kein Werkzeug verfügbar!");}
	}
        
	
	public static void main(String[] args)
    {
		UtilLogic u = new UtilLogic();
		u.initTable("c", 0);
		u.initGraph("c", 0);
    }
}
