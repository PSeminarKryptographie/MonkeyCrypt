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
     * * Zahlen der Verschluesselungsnummer entsprechen folgenden Verschluesselungen:
     * 1: Spaltentransposition
     * 2: Gartenzaun-Transposition
     */
    public TranspositionenAufgaben()
    {
        super(14);
        
        //Aufgabe 1:
        anweisungstext[0] = "Gartenzaun";
        aufgabentyp[0] = 2;
        schluessel[0] = "2";
        verschluesselungsNummer[0] = 2;
        
        //Aufgabe 2:
        anweisungstext[1] = "Transposition";
        aufgabentyp[1] = 1;
        schluessel[1] = "3";
        verschluesselungsNummer[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Gartenzaun ist eine Transposition";
        aufgabentyp[2] = 3;
        schluessel[2] = "3";
        verschluesselungsNummer[2] = 2;
        
        //Aufgabe 4:
        anweisungstext[3] = "Die Transposition ist neben der Chiffrierung die zweite grundlegende Verschluesselungsmethode";
        aufgabentyp[3] = 2;
        schluessel[3] = "4";
        verschluesselungsNummer[3] = 2;
        
        //Aufgabe 5:
        anweisungstext[4] = "Bei Transpositionen wird die Reihenfolge der Zeichen geändert";
        aufgabentyp[4] = 1;
        schluessel[4] = "6";
        verschluesselungsNummer[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Wohingegen bei der Chiffrierung die Reihenfolge der Buchstaben gleich bleibt und der Buchstabe ausgetauscht wird";
        aufgabentyp[5] = 2;
        schluessel[5] = "9";
        verschluesselungsNummer[5] = 2;
        
        //Aufgabe 7:
        anweisungstext[6] = "Ein Beispiel für eine Transposition ist die Gartenzaun Transposition";
        aufgabentyp[6] = 1;
        schluessel[6] = "5";
        verschluesselungsNummer[6] = 2;
        
        //Aufgabe 8:
        anweisungstext[7] = "Bei diese wird der Text abhängig vom schluessel in Zeilen geschrieben";
        aufgabentyp[7] = 2;
        schluessel[7] = "8";
        verschluesselungsNummer[7] = 2;
        
        //Aufgabe 9:
        anweisungstext[8] = "Spaltentransposition";
        aufgabentyp[8] = 2;
        schluessel[8] = "ab";
        verschluesselungsNummer[8] = 1;
        
        //Aufgabe 10:
        anweisungstext[9] = "Spaltentransposition ist auch eine Transposition";
        aufgabentyp[9] = 1;
        schluessel[9] = "abc";
        verschluesselungsNummer[9] = 1;
        
        //Aufgabe 11:
        anweisungstext[10] = "Bei dieser werden die Buchstaben wieder abhängig vom schluessel umsortiert";
        aufgabentyp[10] = 1;
        schluessel[10] = "abcde";
        verschluesselungsNummer[10] = 1;
        
        //Aufgabe 12:
        anweisungstext[11] = "Da die Spaltentransposition mit einem schluessel leicht zu knacken ist, gibt es eine ähnliche Transposition mit 2 schluesseln";
        aufgabentyp[11] = 2;
        schluessel[11] = "abcdefghikj";
        verschluesselungsNummer[11] = 1;
        
        //Aufgabe 13:
        anweisungstext[12] = "Die Spaltentransposition mit zwei schluesseln wird auch Doppelwürfel genannt und ist ebenfalls in unserem Programm zu finden";
        aufgabentyp[12] = 1;
        schluessel[12] = "abcd";
        verschluesselungsNummer[12] = 1;
        
        //Aufgabe 14:
        anweisungstext[13] = "Neben der Spaltentransposition gibt es noch weitere Transpositionen wie Seriation oder Skytale";
        aufgabentyp[13] = 2;
        schluessel[13] = "abcdefg";
        verschluesselungsNummer[13] = 1;
        
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschluesselungstyp[i] = 1;
        }
        
    }
    
}
