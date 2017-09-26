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
public class SpielsprachenAufgaben extends Aufgaben {
    
    public SpielsprachenAufgaben()
    {
        super(3);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 2;
        }
        
        anweisungstext[0] = "Hallo Welt";
        aufgabentyp[0] = 1;
        verschlüsselungsNummer[0] = 2;
        
        anweisungstext[1] = "Verschlüssele bitte diesen Text in Bisprache";
        aufgabentyp[1] = 2;
        verschlüsselungsNummer[1] = 1;
        
        anweisungstext[2] = "Aufgabe drei";
        aufgabentyp[2] = 2;
        verschlüsselungsNummer[2] = 3;
    }
    
}
