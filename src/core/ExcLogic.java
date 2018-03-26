/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import aufgabentexte.*;

/**
 *
 * @author simon
 */
public class ExcLogic {
    
    /**Unverschluesselter Text der Aufgabe*/
    String anweisungstext;
    /**Verschluesselter Text der Aufgabe*/
    String loesung;
    /**
     * Typ der Aufgabe:
     * 1: Text muss verschluesselt werden
     * 2: Text muss entschluesselt werden
     * 3: Schluessel muss herausgefunden werden
     */
    int aufgabentyp;
    /**Nummer der Aufgabe*/
    int aufgabenNummer;
    /**Zu verwendender Schluessel*/
    String schluessel;
    Core core;
    /**Klassen in denen die Aufgabentexte gespeichert sind*/
    Aufgaben[] aufgaben;
    /** Nummer der Verschluesselung
     * 0: Caesar
     * 1: Multiplikativ
     * 2: Vigenere
     * 4: OneTimePad
     * 7: Spielsprache
     */
    int verschluesselung;
    /**
     * Gibt an welchem Typ die Verschluesselung angehoert
     * 1: Chiffre
     * 2: Spielsprache
     * 3: Sonstige
     */
    int verschluesselungstyp;
    
    /**Gibt bei mehreren Verschluesselungen in einem Panel deren Nummer an*/
    int verschluesselungsNummer;
    
    public ExcLogic()
    {
        aufgabenNummer = 0;
        aufgabentyp = 0;
        anweisungstext = "";
        schluessel = "";
        core = new Core();
        loesung = "";
        verschluesselungsNummer = 0;
        aufgaben = new Aufgaben[11];
        aufgaben[0] = new CaesarAufgaben();
        aufgaben[1] = new MultiplikativAufgaben();
        aufgaben[2] = new VigenereAufgaben();
        aufgaben[3] = new OneTimePadAufgaben();
        aufgaben[4] = new TranspositionenAufgaben();
        aufgaben[5] = new CodierungenAufgaben();
        aufgaben[6] = new SpielsprachenAufgaben();
        aufgaben[8] = new SteganographieAufgaben();
        aufgaben[9] = new AffineAufgaben();
        aufgaben[10] = new DefaultAufgaben();
    }
    
    public void aufgabenNummerSetzen(int nummer)
    {
        aufgabenNummer = nummer;
    }
    
    public int aufgabenNummerGeben()
    {
        return aufgabenNummer;
    }
    
    public int aufgabentypGeben()
    {
        return aufgabentyp;
    }
    
    public String anweisungstextGeben()
    {
        return anweisungstext;
    }
    
    public String schluesselGeben()
    {
        return schluessel;
    }
    
    public String LoesungGeben()
    {
        return loesung;
    }
    
    public int verschluesselungGeben()
    {
        return verschluesselung;
    }
    
    public int verschluesselungstypGeben()
    {
        return verschluesselungstyp;
    }
    
    public int verschluesselungsNummerGeben()
    {
        return verschluesselungsNummer;
    }
 
    /**
  * Schaltet in die naechtse Aufgabe weiter
  */   
    public void AufgabeWeiterschalten()
    {
        if(aufgabenNummer <= aufgaben[verschluesselung].aufgabenzahlGeben())
        {
            anweisungstext = aufgaben[verschluesselung].anweisungstextGeben(aufgabenNummer);
            schluessel = aufgaben[verschluesselung].schluesselGeben(aufgabenNummer);
            aufgabentyp = aufgaben[verschluesselung].aufgabentypGeben(aufgabenNummer);
            verschluesselungstyp = aufgaben[verschluesselung].verschluesselungstypGeben(aufgabenNummer);
            verschluesselungsNummer = aufgaben[verschluesselung].verschluesselungsNummerGeben(aufgabenNummer);
            
            aufgabenNummer = aufgabenNummer + 1;
        }
        else
        {
            anweisungstext = "";
            schluessel = "";
            aufgabentyp = 0;
            aufgabenNummer = 0;
        }
        loesung = LoesungErstellen(anweisungstext, schluessel);
                
    }
    
    public String LoesungErstellen(String text, String schluessel)
    {
        switch(verschluesselung)
        {
            case 0:
                loesung =  core.verschluesseln(0, text, schluessel);
                break;
            case 1:
                loesung = core.verschluesseln(1, text, schluessel);
                break;
            case 2:
                loesung = core.verschluesseln(2, text, schluessel);
                break;
            case 3:
                loesung = core.verschluesseln(3, text, schluessel);
                break;
            case 4:
                switch(verschluesselungsNummer)
                {
                    case 1:
                        loesung = core.verschluesseln(4, text, schluessel);
                        break;
                    case 2:
                        loesung = core.verschluesseln(5, text, schluessel);
                        break;
                }
                break;
            case 5:
                switch(verschluesselungsNummer)
                {
                    case 1:
                        loesung = core.spielsprache_verschluesseln(1, text);
                        break;
                    case 2:
                        loesung = core.spielsprache_verschluesseln(2, text);
                        break;
                    case 3:
                        loesung = core.spielsprache_verschluesseln(3, text);
                        break;
                    case 4:
                        loesung = core.spielsprache_verschluesseln(8, text);
                        break;
                    case 5:
                        loesung = core.spielsprache_verschluesseln(4, text);
                        break;
                    case 6:
                        loesung = core.spielsprache_verschluesseln(9, text);
                        break;
                
                }
                break;
            case 6:
                switch(verschluesselungsNummer)
                {
                    case 1:
                        loesung = core.spielsprache_verschluesseln(5, text);
                        break;
                    case 2:
                        loesung = core.spielsprache_verschluesseln(6, text);
                        break;
                    case 3:
                        loesung = core.spielsprache_verschluesseln(7, text);
                        break;
                }
                break;
            case 8:
                switch(verschluesselungsNummer)
                {
                    case 1:
                        loesung = core.verschluesseln(9, text, schluessel);
                        break;
                    case 2:
                        loesung = core.spielsprache_verschluesseln(10, text);
                        break;
                }
            case 9:
                loesung = core.verschluesseln(10, text, schluessel);
                break;
            default:
                loesung = null;
        }
        
        return loesung;
    }
    
    /**
     * Generiert die Loesung fuer die Aufgabe
     */
    public String LoesungGenerieren()
    {
        String ausgabe = "";
        if(aufgabentyp == 1)
        {
            ausgabe = loesung;
        }
        else if(aufgabentyp == 2)
        {
            ausgabe = anweisungstext;
        }
        else if(aufgabentyp == 3)
        {
            ausgabe = schluessel;
        }
        else
        {
            ausgabe = "Loesung leider nicht erstellbar";
        }
        return ausgabe;
    }
    
    
    public boolean EingabePruefen(String eingabe)
    {
        return eingabe.equals(LoesungGenerieren());
    }
    
    
    public void VerschluesselungSetzen(int zahl)
    {
        verschluesselung = zahl;
        aufgabenNummer = 0;
    }
    
}
