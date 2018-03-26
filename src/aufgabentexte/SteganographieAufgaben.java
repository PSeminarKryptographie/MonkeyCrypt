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
     * * Zahlen der Verschluesselungsnummer entsprechen folgenden Verschluesselungen:
     * 1: Bacon
     * 2: Pseudo-Text
     */
    
    public SteganographieAufgaben()
    {
        super(2);
        
        anweisungstext[0] = "Bacon finde den schluessel";
        aufgabentyp[0] = 3;
        schluessel[0] = "Hallo";
        verschluesselungsNummer[0] = 1;
        
        anweisungstext[1] = "Bacontext verschluesseln";
        aufgabentyp[1] = 1;
        schluessel[1] = "asdfjklö";
        verschluesselungsNummer[1] = 1;
        
        for(int i = 0; i < anweisungstext.length; i++)
        {
            if(verschluesselungsNummer[i] == 1)
            {
                verschluesselungstyp[i] = 1;
            }
            else {verschluesselungstyp[i] = 2;}
        }
        
    }
    
}
