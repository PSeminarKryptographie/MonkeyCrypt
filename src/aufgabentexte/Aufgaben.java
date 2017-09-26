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
    /**Gibt an ob die Verschlüsselung Chiffre, Spielsprache oder eine Sonstige ist
     * 1: Chiffre
     * 2: Spielsprache
     * 3: Sonstige
    */
    int[] verschlüsselungstyp;
    
    /**
     * Gibt an in welcher Verschlüsselung der Text verschlüsselt werden soll
     * Nur relevant wenn in einem Panel mehrere Verschlüsselungen sind
     */
    int[] verschlüsselungsNummer;
    
    
    public Aufgaben(int anzahl)
    {
        anweisungstext = new String[anzahl];
        aufgabentyp = new int[anzahl];
        schlüssel = new String[anzahl];
        verschlüsselungstyp = new int[anzahl];
        verschlüsselungsNummer = new int[anzahl];
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
    
    public int verschlüsselungstypGeben(int n)
    {
        return verschlüsselungstyp[n];
    }
    
    public int verschlüsselungsNummerGeben(int n)
    {
        return verschlüsselungsNummer[n];
    }
}
