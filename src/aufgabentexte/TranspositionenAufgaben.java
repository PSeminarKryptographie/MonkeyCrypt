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
        super(14);
        
        //Aufgabe 1:
        anweisungstext[0] = "Gartenzaun";
        aufgabentyp[0] = 2;
        schlüssel[0] = "2";
        verschlüsselungsNummer[0] = 2;
        
        //Aufgabe 2:
        anweisungstext[1] = "Transposition";
        aufgabentyp[1] = 1;
        schlüssel[1] = "3";
        verschlüsselungsNummer[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Gartenzaun ist eine Transposition";
        aufgabentyp[2] = 3;
        schlüssel[2] = "3";
        verschlüsselungsNummer[2] = 2;
        
        //Aufgabe 4:
        anweisungstext[3] = "Die Transposition ist neben der Chiffrierung die zweite grundlegende Verschlüsselungsmethode";
        aufgabentyp[3] = 2;
        schlüssel[3] = "4";
        verschlüsselungsNummer[3] = 2;
        
        //Aufgabe 5:
        anweisungstext[4] = "Bei Transpositionen wird die Reihenfolge der Zeichen geändert";
        aufgabentyp[4] = 1;
        schlüssel[4] = "6";
        verschlüsselungsNummer[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Wohingegen bei der Chiffrierung die Reihenfolge der Buchstaben gleich bleibt und der Buchstabe ausgetauscht wird";
        aufgabentyp[5] = 2;
        schlüssel[5] = "9";
        verschlüsselungsNummer[5] = 2;
        
        //Aufgabe 7:
        anweisungstext[6] = "Ein Beispiel für eine Transposition ist die Gartenzaun Transposition";
        aufgabentyp[6] = 1;
        schlüssel[6] = "5";
        verschlüsselungsNummer[6] = 2;
        
        //Aufgabe 8:
        anweisungstext[7] = "Bei diese wird der Text abhängig vom Schlüssel in Zeilen geschrieben";
        aufgabentyp[7] = 2;
        schlüssel[7] = "8";
        verschlüsselungsNummer[7] = 2;
        
        //Aufgabe 9:
        anweisungstext[8] = "Spaltentransposition";
        aufgabentyp[8] = 2;
        schlüssel[8] = "ab";
        verschlüsselungsNummer[8] = 1;
        
        //Aufgabe 10:
        anweisungstext[9] = "Spaltentransposition ist auch eine Transposition";
        aufgabentyp[9] = 1;
        schlüssel[9] = "abc";
        verschlüsselungsNummer[9] = 1;
        
        //Aufgabe 11:
        anweisungstext[10] = "Bei dieser werden die Buchstaben wieder abhängig vom Schlüssel umsortiert";
        aufgabentyp[10] = 1;
        schlüssel[10] = "abcde";
        verschlüsselungsNummer[10] = 1;
        
        //Aufgabe 12:
        anweisungstext[11] = "Da die Spaltentransposition mit einem Schlüssel leicht zu knacken ist, gibt es eine ähnliche Transposition mit 2 Schlüsseln";
        aufgabentyp[11] = 2;
        schlüssel[11] = "abcdefghikj";
        verschlüsselungsNummer[11] = 1;
        
        //Aufgabe 13:
        anweisungstext[12] = "Die Spaltentransposition mit zwei Schlüsseln wird auch Doppelwürfel genannt und ist ebenfalls in unserem Programm zu finden";
        aufgabentyp[12] = 1;
        schlüssel[12] = "abcd";
        verschlüsselungsNummer[12] = 1;
        
        //Aufgabe 14:
        anweisungstext[13] = "Neben der Spaltentransposition gibt es noch weitere Transpositionen wie Seriation oder Skytale";
        aufgabentyp[13] = 2;
        schlüssel[13] = "abcdefg";
        verschlüsselungsNummer[13] = 1;
        
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
    }
    
}
