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
public class VigenereAufgaben extends Aufgaben {
    
    
    public VigenereAufgaben()
    {
        super(2);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
        anweisungstext[0] = "Hallo Welt";
        schlüssel[0] = "abc";
        aufgabentyp[0] = 1;
        
        anweisungstext[1] = "Wir entschlüsseln eine sehr kompakten, langen Text mit der Vigenere Verschlüsselung!";
        schlüssel[1] = "vigenere";
        aufgabentyp[1] = 2;
    }
}
