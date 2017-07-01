/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author simon
 */
public class ExcLogic {
    
    String anweisungstext;
    int aufgabentyp;
    int aufgabenNummer;
    String schlüssel;
    Core core;
    
    public ExcLogic()
    {
        aufgabenNummer = 0;
        aufgabentyp = 0;
        anweisungstext = "";
        schlüssel = "";
        core = new Core();
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
 
    /**
  * Schaltet in die nächtse Aufgabe weiter
  */   
    public void AufgabeWeiterschalten()
    {
        switch(aufgabenNummer)
        {
            case 0:
                aufgabenNummer = 1;
                aufgabentyp = 1;
                anweisungstext = "Hallo Welt";
                schlüssel = "c";
                break;
            case 1:
                aufgabenNummer = 2;
                aufgabentyp = 1;
                anweisungstext = "Ave Caesar";
                schlüssel ="f";
                break;
            case 2:
                aufgabenNummer = 3;
                aufgabentyp = 2;
                anweisungstext = "Efbo fpq Xrcdxyb aobf";
                schlüssel = "x";
                break;
            case 3:
                aufgabenNummer = 4;
                aufgabentyp = 3;
                anweisungstext = "Knacken macht Spaß";
                schlüssel = "s";
                break;
            default:
                aufgabenNummer = 0;
                aufgabentyp = 0;
                anweisungstext = "";
                schlüssel = "";
        }
                
    }
    
    public String caesarEncrypt(String text, String schlüssel)
    {
        return core.caesarEntschlüsseln(text, schlüssel);
    }
    
    /**
     * Generiert die Lösung für die Aufgabe
     */
    public String LösungGenerieren()
    {
        String ausgabe = "";
        if(aufgabentyp == 1)
        {
            ausgabe = core.caesarVerschlüsseln(anweisungstext, schlüssel);
        }
        else if(aufgabentyp == 2)
        {
            ausgabe = core.caesarEntschlüsseln(anweisungstext, schlüssel);
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
}
