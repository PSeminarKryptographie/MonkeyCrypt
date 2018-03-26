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
public class MultiplikativAufgaben extends Aufgaben {
    
    public MultiplikativAufgaben()
    {
        super(15);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschluesselungstyp[i] = 1;
        }

        
        //Aufgabe 1:
        anweisungstext[0] = "Multiplikativ";
        schluessel[0] = "d";
        aufgabentyp[0] = 2;
        
        //Aufgabe 2:
        anweisungstext[1] = "Ist eine monoalphabetische Substitution";
        schluessel[1] = "h";
        aufgabentyp[1] = 1;
        
        //Aufgabe 3:
        anweisungstext[2] = "Sie ist somit ähnlich wie Caesar";
        schluessel[2] = "r";
        aufgabentyp[2] = 1;
        
        //Aufgabe 4:
        anweisungstext[3] = "Mit dem schluessel wird bei ihr nur anstatt adiert multipliziert";
        schluessel[3] = "z";
        aufgabentyp[3] = 3;
        
        //Aufgabe 5:
        anweisungstext[4] = "Dabei kann es passieren, dass bei zwei Buchstaben das selbe Produkt rauskommt";
        schluessel[4] = "f";
        aufgabentyp[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Das hat zur Folge, dass dieser Buchstabe nicht mehr eindeutig entschluesselt werden kann";
        schluessel[5] = "t";
        aufgabentyp[5] = 2;
        
        //Aufgabe 7:
        anweisungstext[6] = "Daher kann diese Substitution nicht als Chiffre verwendet werden";
        schluessel[6] = "j";
        aufgabentyp[6] = 1;
        
        //Aufgabe 8:
        anweisungstext[7] = "Der schluessel muss also so gewählt werden, dass es bei der Entschluesselung keine Überlappungen gibt";
        schluessel[7] = "p";
        aufgabentyp[7] = 3;
        
        //Aufgabe 9:
        anweisungstext[8] = "Dies ist der Fall wenn der schluessel co-prim zur Länge des Alphabets ist";
        schluessel[8] = "v";
        aufgabentyp[8] = 3;
        
        //Aufgabe 10:
        anweisungstext[9] = "Das bedeutet, dass nur Zahlen infrage kommen, die durch die Länge des Alphabets nicht teilbar sind";
        schluessel[9] = "l";
        aufgabentyp[9] = 1;
        
        //Aufgabe 11:
        anweisungstext[10] = "Bei Verwendung des Standardalphabets kommen also b, d, f, h, j, l, p, r, t, v, x und z als schluessel infrage";
        schluessel[10] = "v";
        aufgabentyp[10] = 2;
        
        //Aufgabe 12:
        anweisungstext[11] = "Ist die Länge des Alphabets eine Primzahl ist jeder Buchstabe des Alphabets co-prim und kann somit als schluessel verwendet werden";
        schluessel[11] = "x";
        aufgabentyp[11] = 2;
        
        //Aufgabe 13:
        anweisungstext[12] = "Sonst gib es aber weniger schluessel als bei der Caesar Verschluesselung";
        schluessel[12] = "f";
        aufgabentyp[12] = 3;
        
        //Aufgabe 14:
        anweisungstext[13] = "Dies führt zu einer noch leichteren Knackbarkeit der Verschluesselung als bei der Caesar Verschluesselung, da weniger schluessel infrage kommen die ausporbiert werden müssen";
        schluessel[13] = "r";
        aufgabentyp[13] = 1;
        
        //Aufgabe 15:
        anweisungstext[14] = "Aufgrund dieser relativ leichten Entschluesselbarkeit wird Multiplikativ heute auch kaum noch angewendet";
        schluessel[14] = "d";
        aufgabentyp[14] = 2;
    }
    
}
