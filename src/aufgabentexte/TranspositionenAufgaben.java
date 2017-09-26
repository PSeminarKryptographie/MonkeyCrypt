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
public class TranspositionenAufgaben extends Aufgaben {
   
    
    /**
     * * Zahlen der Verschlüsselungsnummer entsprechen folgenden Verschlüsselungen:
     * 1: Spaltentransposition
     * 2: Gartenzaun-Transposition
     */
    public TranspositionenAufgaben()
    {
        super(3);
        
        anweisungstext[0] = "Hallo Codierungen";
        aufgabentyp[0] = 1;
        schlüssel[0] = "5";
        verschlüsselungsNummer[0] = 2;
        
        anweisungstext[1] = "Spaltentransposition";
        aufgabentyp[1] = 2;
        schlüssel[1] = "o";
        verschlüsselungsNummer[1] = 1;
        
        anweisungstext[2] = "Was ist der Schlüssel";
        aufgabentyp[2] = 3;
        schlüssel[2] = "2";
        verschlüsselungsNummer[2] = 2;
        
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
    }
    
}
