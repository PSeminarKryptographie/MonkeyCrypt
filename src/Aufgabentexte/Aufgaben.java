/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabentexte;

/**
 *
 * @author simon
 */
public abstract class Aufgaben {
    
    String[] anweisungstext;
    int[] aufgabentyp;
    String[] schlüssel;
    
    public Aufgaben(int anzahl)
    {
        anweisungstext = new String[anzahl];
        aufgabentyp = new int[anzahl];
        schlüssel = new String[anzahl];
    }
    
    public int aufgabenzahlGeben()
    {
        return anweisungstext.length - 1;
    }
    
    public String anweisungstextGeben(int n)
    {
        return anweisungstext[n];
    }
    
    public String schlüsselGeben(int n)
    {
        return schlüssel[n];
    }
    
    public int aufgabentypGeben(int n)
    {
        return aufgabentyp[n];
    }
}
