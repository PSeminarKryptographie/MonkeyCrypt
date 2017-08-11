/**
 * 
 */
package core;

import crypt.*;

import java.util.List;

/**
 * @author caterina
 *
 */
public class CommTools {
	public Alphabet myAlphabet;
	private String currentAlphabet;
	
	public CommTools(){
		myAlphabet = Alphabet.getInstance();
	}
	/**
	 * 
	 * @param laenge
	 * @return Schluessel
	 */
	public String generateNormalKey(int laenge){
		currentAlphabet = myAlphabet.getAlphabet();
		return Tools.generieren(laenge, currentAlphabet);
		}
	/**
	 * 
	 * @param laenge
	 * @return Schluessel Coprim zum Alphabet (fuer Hill Chiffre und Multiplikative Chiffre)
	 */
	public String generateCoprimeKey(int laenge){
		currentAlphabet = myAlphabet.getAlphabet();
		List<Integer> coprimes = Tools.phi(currentAlphabet.length());
		String pool = Tools.listtoString(coprimes, currentAlphabet);
		return Tools.generieren(laenge, pool);
	}
	/*
        *
        * @param text
        * füllt einen JTable mit einem zugewiesenen Text
        */
	public String fillTable(String text){
		currentAlphabet += "abcdefghiklmnopqrstuvwxyz";
		
		String newText = text + currentAlphabet;
		newText = Tools.removeDoubles(newText);
		try{
			return newText.substring(0, 25);
		}
		catch(Exception e){
			return text;
		}
	}
        /*
        * @param May, Min
        * zeichnet auf ein Panel mit CardLayout (May) ein Unterpanel (Min)
        */
        public void adjustCards(javax.swing.JPanel May, javax.swing.JPanel Min) {
            May.removeAll();
            May.add(Min);
            May.revalidate();
            May.repaint();
        }
        
        public String getPositionOfElement(String t) {
            String alpha = myAlphabet.getAlphabet();
            int l = alpha.length();
            boolean notfound = true;
            int counter = 0;
            while(notfound) {
                String testable = String.valueOf(alpha.charAt(counter));
                if(testable.equals(t)) {
                    notfound = false;
                }
                else {
                    if(counter < l-1) {
                        counter = counter + 1;
                    }
                    else {
                        counter = -1;
                        notfound = false;
                    }
                }
            }
            if(counter != -1) {
                counter = counter + 1;
                String index = Integer.toString(counter);
                return index;
            }
            else {
                return "error";
            }
        }
}
