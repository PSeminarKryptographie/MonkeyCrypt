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
        super(4);
        
        //Aufgabe 1:
        anweisungstext[0] = "Hallo Welt";
        schlüssel[0] = "b";
        aufgabentyp[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "Hier ist Aufgabe 3";
        schlüssel[1] = "x";
        aufgabentyp[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Knacken macht Spaß";
        schlüssel[2] = "s";
        aufgabentyp[2] = 3;
        
        //Aufgabe 4:
        anweisungstext[3] = "Vierte Aufgabe zum Test";
        schlüssel[3] = "j";
        aufgabentyp[3] = 2;
    }
}
