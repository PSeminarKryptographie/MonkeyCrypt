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
public class CaesarAufgaben extends Aufgaben{
    
    public CaesarAufgaben()
    {
        super(9);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
        //Aufgabe 1:
        anweisungstext[0] = "Julius Caesar";
        schlüssel[0] = "c";
        aufgabentyp[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "Caesar Verschlüsselung";
        schlüssel[1] = "b";
        aufgabentyp[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Diese Verschlüsselung erfand Caesar";
        schlüssel[2] = "y";
        aufgabentyp[2] = 1;
        
        //Aufgabe 4:
        anweisungstext[3] = "Um geheime Bootschaften zu senden";
        schlüssel[3] = "f";
        aufgabentyp[3] = 1;
        
        //Aufgabe 5:
        anweisungstext[4] = "Die nur seine Truppen entschlüsseln konnten";
        schlüssel[4] = "d";
        aufgabentyp[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Denn nur diese kannten den Schlüssel";
        schlüssel[5] = "c";
        aufgabentyp[5] = 3;
        
        //Aufgabe 7:
        anweisungstext[6] = "Und konnten mit diesem die Bootschaft entschlüsseln";
        schlüssel[6] = "x";
        aufgabentyp[6] = 2;
        
        //Aufgabe 8:
        anweisungstext[7] = "Er eroberte so ganz Gallien";
        schlüssel[7] = "b";
        aufgabentyp[7] = 1;
        
        //Aufgbae 9:
        anweisungstext[8] = "Ganz Gallien? Nein, nur fast ganz Gallien!";
        schlüssel[8] = "m";
        aufgabentyp[8] = 1;
    }
}
