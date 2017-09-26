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
public class CodierungenAufgaben extends Aufgaben{
   
    
    /**
     * Verwaltet die Daten der Aufgaben:
     * Zahlen der Verschlüsselungsnummer entsprechen folgenden Verschlüsselungen:
     * 1: Morse
     * 2: Ascii
     * 3: BinärCode
     * 4: BinHex
     * 5: AlphabetIndex
     * 6: NatoAlphabet
     */
    public CodierungenAufgaben()
    {
        super(6);
        
        anweisungstext[0] = "Morse Test";
        aufgabentyp[0] = 1;
        verschlüsselungsNummer[0] = 1;
        
        anweisungstext[1] = "Test 2";
        aufgabentyp[1] = 2;
        verschlüsselungsNummer[1] = 2;
        
        anweisungstext[2] = "abcd";
        aufgabentyp[2] = 2;
        verschlüsselungsNummer[2] = 4;
        
        anweisungstext[3] = "Hallo zusammen";
        aufgabentyp[3] = 2;
        verschlüsselungsNummer[3] = 3;
        
        anweisungstext[4] = "Hallo Nato";
        aufgabentyp[4] = 1;
        verschlüsselungsNummer[4] = 6;
        
        anweisungstext[5] = "Zum testen gibt es für euch auch einmal einen etwas längeren Text in AlphabetIndex zu verschlüsseln";
        aufgabentyp[5] = 2;
        verschlüsselungsNummer[5] = 5;
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 2;
        }
    }
    
}
