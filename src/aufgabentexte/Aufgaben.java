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
    String[] schluessel;
    /**Gibt an ob die Verschlüsselung Chiffre, Spielsprache oder eine Sonstige ist
     * 1: Chiffre
     * 2: Spielsprache
     * 3: Sonstige
    */
    int[] verschluesselungstyp;
    
    /**
     * Gibt an in welcher Verschlüsselung der Text verschlüsselt werden soll
     * Nur relevant wenn in einem Panel mehrere Verschlüsselungen sind
     */
    int[] verschluesselungsNummer;
    
    
    public Aufgaben(int anzahl)
    {
        anweisungstext = new String[anzahl];
        aufgabentyp = new int[anzahl];
        schluessel = new String[anzahl];
        verschluesselungstyp = new int[anzahl];
        verschluesselungsNummer = new int[anzahl];
    }
    
    public int aufgabenzahlGeben()
    {
        return anweisungstext.length - 1;
    }
    
    public String anweisungstextGeben(int n)
    {
        return anweisungstext[n];
    }
    
    public String schluesselGeben(int n)
    {
        return schluessel[n];
    }
    
    public int aufgabentypGeben(int n)
    {
        return aufgabentyp[n];
    }
    
    public int verschluesselungstypGeben(int n)
    {
        return verschluesselungstyp[n];
    }
    
    public int verschluesselungsNummerGeben(int n)
    {
        return verschluesselungsNummer[n];
    }
}
