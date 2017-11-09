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
public class SteganographieAufgaben extends Aufgaben {
   /**
     * * Zahlen der Verschlüsselungsnummer entsprechen folgenden Verschlüsselungen:
     * 1: Bacon
     * 2: Pseudo-Text
     */
    
    public SteganographieAufgaben()
    {
        super(2);
        
        anweisungstext[0] = "Bacon finde den Schlüssel";
        aufgabentyp[0] = 3;
        schlüssel[0] = "Hallo";
        verschlüsselungsNummer[0] = 1;
        
        anweisungstext[1] = "Bacontext verschlüsseln";
        aufgabentyp[1] = 1;
        schlüssel[1] = "asdfjklö";
        verschlüsselungsNummer[1] = 1;
        
        for(int i = 0; i < anweisungstext.length; i++)
        {
            if(verschlüsselungsNummer[i] == 1)
            {
                verschlüsselungstyp[i] = 1;
            }
            else {verschlüsselungstyp[i] = 2;}
        }
        
    }
    
}
