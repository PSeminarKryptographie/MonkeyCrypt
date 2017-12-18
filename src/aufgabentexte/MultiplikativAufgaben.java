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
            verschlüsselungstyp[i] = 1;
        }

        
        //Aufgabe 1:
        anweisungstext[0] = "Multiplikativ";
        schlüssel[0] = "d";
        aufgabentyp[0] = 2;
        
        //Aufgabe 2:
        anweisungstext[1] = "Ist eine monoalphabetische Substitution";
        schlüssel[1] = "h";
        aufgabentyp[1] = 1;
        
        //Aufgabe 3:
        anweisungstext[2] = "Sie ist somit ähnlich wie Caesar";
        schlüssel[2] = "r";
        aufgabentyp[2] = 1;
        
        //Aufgabe 4:
        anweisungstext[3] = "Mit dem Schlüssel wird bei ihr nur anstatt adiert multipliziert";
        schlüssel[3] = "z";
        aufgabentyp[3] = 3;
        
        //Aufgabe 5:
        anweisungstext[4] = "Dabei kann es passieren, dass bei zwei Buchstaben das selbe Produkt rauskommt";
        schlüssel[4] = "f";
        aufgabentyp[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Das hat zur Folge, dass dieser Buchstabe nicht mehr eindeutig entschlüsselt werden kann";
        schlüssel[5] = "t";
        aufgabentyp[5] = 2;
        
        //Aufgabe 7:
        anweisungstext[6] = "Daher kann diese Substitution nicht als Chiffre verwendet werden";
        schlüssel[6] = "j";
        aufgabentyp[6] = 1;
        
        //Aufgabe 8:
        anweisungstext[7] = "Der Schlüssel muss also so gewählt werden, dass es bei der Entschlüsselung keine Überlappungen gibt";
        schlüssel[7] = "p";
        aufgabentyp[7] = 3;
        
        //Aufgabe 9:
        anweisungstext[8] = "Dies ist der Fall wenn der Schlüssel co-prim zur Länge des Alphabets ist";
        schlüssel[8] = "v";
        aufgabentyp[8] = 3;
        
        //Aufgabe 10:
        anweisungstext[9] = "Das bedeutet, dass nur Zahlen infrage kommen, die durch die Länge des Alphabets nicht teilbar sind";
        schlüssel[9] = "l";
        aufgabentyp[9] = 1;
        
        //Aufgabe 11:
        anweisungstext[10] = "Bei Verwendung des Standardalphabets kommen also b, d, f, h, j, l, p, r, t, v, x und z als Schlüssel infrage";
        schlüssel[10] = "v";
        aufgabentyp[10] = 2;
        
        //Aufgabe 12:
        anweisungstext[11] = "Ist die Länge des Alphabets eine Primzahl ist jeder Buchstabe des Alphabets co-prim und kann somit als Schlüssel verwendet werden";
        schlüssel[11] = "x";
        aufgabentyp[11] = 2;
        
        //Aufgabe 13:
        anweisungstext[12] = "Sonst gib es aber weniger Schlüssel als bei der Caesar Verschlüsselung";
        schlüssel[12] = "f";
        aufgabentyp[12] = 3;
        
        //Aufgabe 14:
        anweisungstext[13] = "Dies führt zu einer noch leichteren Knackbarkeit der Verschlüsselung als bei der Caesar Verschlüsselung, da weniger Schlüssel infrage kommen die ausporbiert werden müssen";
        schlüssel[13] = "r";
        aufgabentyp[13] = 1;
        
        //Aufgabe 15:
        anweisungstext[14] = "Aufgrund dieser relativ leichten Entschlüsselbarkeit wird Multiplikativ heute auch kaum noch angewendet";
        schlüssel[14] = "d";
        aufgabentyp[14] = 2;
    }
    
}
