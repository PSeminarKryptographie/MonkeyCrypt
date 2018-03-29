package core;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.LinkedHashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;

import crypt.Options;
import crypt.cryptanalysis.Haeufigkeitsanalyse;
import frame.BarChart;
import tools.TxtAmbassador;

public class BarLogic {
	public Options myOptions;
	String currentAlphabet;
	public BarLogic() //constructor
	{
		myOptions = Options.getInstance();
	}
	
	public BarChart haefigkeitsgraph() {
		currentAlphabet = myOptions.getAlphabet();
		TxtAmbassador a = new TxtAmbassador();
		String [] values = a.readTxt("/text/freq/de/frequency.txt").split(",");
		double[] probs = new double[currentAlphabet.length()];
		String [] letters = "abcdefghijklmnopqrstuvwxyzàâáåäãąæœçĉćčďðèéêëęěĝğĥîìíïıĵłñńňòöôóõøřŝşśšßťþùúûŭüůýźżž".split("");
		for (int i = 0; i<values.length; i++) {
			try {
				int index = currentAlphabet.indexOf(letters[i]);
				probs[index] = Double.valueOf(values[i]);
			}
			catch(Exception e){	
			}
		}
				return new BarChart(probs, currentAlphabet.split(""), "");
	}
	public BarChart haefigkeitsgraph(String text) {
		Haeufigkeitsanalyse h = new Haeufigkeitsanalyse();
		LinkedHashMap <String, Integer> map = h.rawAnalyse(text);
		Integer [] values = map.values().toArray(new Integer[map.size()]);
		String [] letters = map.keySet().toArray(new String[map.size()]);
		double [] probs = new double[values.length];
		
		for (int i = 0; i<text.length(); i++) {
			try {
				probs[i] = (double) values[i]/text.length();
			}
			catch(Exception e){
				
			}
		}
		
		return new BarChart(probs, letters, "mein Graph");
	}
	
	
	
	
	public static void main(String[] args) {
		final Options myOptions;
		myOptions = Options.getInstance();
		BarLogic b = new BarLogic();
		myOptions.setAlphabet("aäbcdefghijklmnoöpqrsßtuüvwxyz");
		BarChart newPanel = b.haefigkeitsgraph("Hallo zusammen. Das ist ein ganz langer durchschnittlicher Deutscher text. Ich mache ihn mal ein bisschen länger, nur um den Graph etwas interesanter zu gestalten. So, das sollte genug sein.");
		BarChart secondPanel = b.haefigkeitsgraph();
		newPanel.setPreferredSize(new Dimension(600, 300));
		secondPanel.setPreferredSize(new Dimension(800, 300));
		JFrame frame = new JFrame("Häufigkeitsanalyse");
		frame.setLayout(new GridLayout(3,1));  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(newPanel);
      
        frame.add(secondPanel);
        frame.add(new JLabel("test"));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
