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
    
    /**Unverschlüsselter Text der Aufgabe*/
    String anweisungstext;
    /**Verschlüsselter Text der Aufgabe*/
    String lösung;
    /**
     * Typ der Aufgabe:
     * 1: Text muss verschlüsselt werden
     * 2: Text muss entschlüsselt werden
     * 3: Schlüssel muss herausgefunden werden
     */
    int aufgabentyp;
    /**Nummer der Aufgabe*/
    int aufgabenNummer;
    /**Zu verwendender Schlüssel*/
    String schlüssel;
    Core core;
    /**Klassen in denen die Aufgabentexte gespeichert sind*/
    Aufgaben[] aufgaben;
    /** Nummer der Verschlüsselung
     * 0: Caesar
     * 1: Multiplikativ
     * 2: Vigenere
     * 4: OneTimePad
     * 7: Spielsprache
     */
    int verschlüsselung;
    /**
     * Gibt an welchem Typ die Verschlüsselung angehört
     * 1: Chiffre
     * 2: Spielsprache
     * 3: Sonstige
     */
    int verschlüsselungstyp;
    
    /**Gibt bei mehreren Verschlüsselungen in einem Panel deren Nummer an*/
    int verschlüsselungsNummer;
    
    public ExcLogic()
    {
        aufgabenNummer = 0;
        aufgabentyp = 0;
        anweisungstext = "";
        schlüssel = "";
        core = new Core();
        lösung = "";
        verschlüsselungsNummer = 0;
        aufgaben = new Aufgaben[7];
        aufgaben[0] = new CaesarAufgaben();
        aufgaben[1] = new MultiplikativAufgaben();
        aufgaben[2] = new VigenereAufgaben();
        aufgaben[3] = new OneTimePadAufgaben();
        aufgaben[4] = new TranspositionenAufgaben();
        aufgaben[5] = new CodierungenAufgaben();
        aufgaben[6] = new SpielsprachenAufgaben();
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
    
    public String schlüsselGeben()
    {
        return schlüssel;
    }
    
    public String LösungGeben()
    {
        return lösung;
    }
    
    public int verschlüsselungGeben()
    {
        return verschlüsselung;
    }
    
    public int verschlüsselungstypGeben()
    {
        return verschlüsselungstyp;
    }
    
    public int verschlüsselungsNummerGeben()
    {
        return verschlüsselungsNummer;
    }
 
    /**
  * Schaltet in die nächtse Aufgabe weiter
  */   
    public void AufgabeWeiterschalten()
    {
        if(aufgabenNummer <= aufgaben[verschlüsselung].aufgabenzahlGeben())
        {
            anweisungstext = aufgaben[verschlüsselung].anweisungstextGeben(aufgabenNummer);
            schlüssel = aufgaben[verschlüsselung].schlüsselGeben(aufgabenNummer);
            aufgabentyp = aufgaben[verschlüsselung].aufgabentypGeben(aufgabenNummer);
            verschlüsselungstyp = aufgaben[verschlüsselung].verschlüsselungstypGeben(aufgabenNummer);
            verschlüsselungsNummer = aufgaben[verschlüsselung].verschlüsselungsNummerGeben(aufgabenNummer);
            
            aufgabenNummer = aufgabenNummer + 1;
        }
        else
        {
            anweisungstext = "";
            schlüssel = "";
            aufgabentyp = 0;
            aufgabenNummer = 0;
        }
        lösung = LösungErstellen(anweisungstext, schlüssel);
                
    }
    
    public String LösungErstellen(String text, String schlüssel)
    {
        switch(verschlüsselung)
        {
            case 0:
                lösung =  core.verschlüsseln(0, text, schlüssel);
                break;
            case 1:
                lösung = core.verschlüsseln(1, text, schlüssel);
                break;
            case 2:
                lösung = core.verschlüsseln(2, text, schlüssel);
                break;
            case 3:
                lösung = core.verschlüsseln(3, text, schlüssel);
                break;
            case 4:
                switch(verschlüsselungsNummer)
                {
                    case 1:
                        lösung = core.verschlüsseln(4, text, schlüssel);
                        break;
                    case 2:
                        lösung = core.verschlüsseln(5, text, schlüssel);
                        break;
                }
                break;
            case 5:
                switch(verschlüsselungsNummer)
                {
                    case 1:
                        lösung = core.spielsprache_verschlüsseln(1, text);
                        break;
                    case 2:
                        lösung = core.spielsprache_verschlüsseln(2, text);
                        break;
                    case 3:
                        lösung = core.spielsprache_verschlüsseln(3, text);
                        break;
                    case 4:
                        lösung = core.spielsprache_verschlüsseln(8, text);
                        break;
                    case 5:
                        lösung = core.spielsprache_verschlüsseln(4, text);
                        break;
                    case 6:
                        lösung = core.spielsprache_verschlüsseln(9, text);
                        break;
                
                }
                break;
            case 6:
                switch(verschlüsselungsNummer)
                {
                    case 1:
                        lösung = core.spielsprache_verschlüsseln(5, text);
                        break;
                    case 2:
                        lösung = core.spielsprache_verschlüsseln(6, text);
                        break;
                    case 3:
                        lösung = core.spielsprache_verschlüsseln(7, text);
                        break;
                }
                break;
        }
        
        return lösung;
    }
    
    /**
     * Generiert die Lösung für die Aufgabe
     */
    public String LösungGenerieren()
    {
        String ausgabe = "";
        if(aufgabentyp == 1)
        {
            ausgabe = lösung;
        }
        else if(aufgabentyp == 2)
        {
            ausgabe = anweisungstext;
        }
        else if(aufgabentyp == 3)
        {
            ausgabe = schlüssel;
        }
        else
        {
            ausgabe = "Lösung leider nicht erstellbar";
        }
        return ausgabe;
    }
    
    
    public boolean EingabePrüfen(String eingabe)
    {
        return eingabe.equals(LösungGenerieren());
    }
    
    
    public void VerschlüsselungSetzen(int zahl)
    {
        verschlüsselung = zahl;
        aufgabenNummer = 0;
    }
    
}
