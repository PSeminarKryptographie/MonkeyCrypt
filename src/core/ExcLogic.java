/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import Aufgabentexte.*;

/**
 *
 * @author simon
 */
public class ExcLogic {
    
    String anweisungstext;
    String lösung;
    int aufgabentyp;
    int aufgabenNummer;
    String schlüssel;
    Core core;
    Aufgaben[] aufgaben;
    int verschlüsselung;
    
    public ExcLogic()
    {
        aufgabenNummer = 0;
        aufgabentyp = 0;
        anweisungstext = "";
        schlüssel = "";
        core = new Core();
        lösung = "";
        aufgaben = new Aufgaben[3];
        aufgaben[0] = new CaesarAufgaben();
        aufgaben[1] = new MultiplikativAufgaben();
        aufgaben[2] = new VigenereAufgaben();
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
                lösung =  core.caesarVerschlüsseln(text, schlüssel);
                break;
            case 1:
                lösung = core.multiplikativVerschlüsseln(text, schlüssel);
                break;
            case 2:
                lösung = core.vigenereVerschlüsseln(text, schlüssel);
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
