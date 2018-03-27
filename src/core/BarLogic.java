package core;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import crypt.cryptanalysis.Haeufigkeitsanalyse;
import frame.BarChart;

public class BarLogic {
	public BarChart haefigkeitsgraph() {
		double [] probs = {5.58,
				1.96,
				3.16,
				4.98,
				16.93,
				1.49,
				3.02,
				4.98,
				8.02,
				0.24,
				1.32,
				3.60,
				2.55,
				10.53,
				2.24,
				0.67,
				0.02,
				6.89,
				6.42,
				5.79,
				3.83,
				0.84,
				1.78,
				0.05,
				0.05,
				1.21,
				0.54,
				0.30,
				0.65,
				0.37};
		String [] letters = "abcdefghijklmnopqrstuvwxyzäöüß".split("");
		return new BarChart(probs, letters, "");
	}
	public BarChart haefigkeitsgraph(String text) {
		Haeufigkeitsanalyse h = new Haeufigkeitsanalyse();
		LinkedHashMap <String, Integer> map = h.makeMap(text);
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
		System.out.println(Arrays.toString(probs));
		
		return new BarChart(probs, letters, "mein Graph");
	}
	
	
	public static void main(String[] args) {
		BarLogic b = new BarLogic();
		BarChart newPanel = b.haefigkeitsgraph("Hallo zusammen. Das ist ein durchschnittlicher Deutscher text");
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
