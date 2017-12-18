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
        super(15);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
        //Aufgabe 1:
        anweisungstext[0] = "Vigenere";
        schlüssel[0] = "ab";
        aufgabentyp[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "entschlüsselt";
        schlüssel[1] = "ex";
        aufgabentyp[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Sie wurde im 16. Jahrhundert entwickelt";
        schlüssel[2] = "muwd";
        aufgabentyp[2] = 2;
        
        //Aufgabe 4:
        anweisungstext[3] = "Und nach ihrem Erfinder Blaise de Vigenere benannt";
        schlüssel[3] = "blaise";
        aufgabentyp[3] = 1;
        
        //Aufgabe 5:
        anweisungstext[4] = "Sie galt lange Zeit als nicht knackbar";
        schlüssel[4] = "ebs";
        aufgabentyp[4] = 3;
        
        //Aufgabe 6:
        anweisungstext[5] = "Deshalb wurde sie auch le chiffre indechiffrable genannt";
        schlüssel[5] = "wfgdhx";
        aufgabentyp[5] = 1;
        
        //Aufgabe 7:
        anweisungstext[6] = "Das heißt auf Deutsch übersetzt die unentzifferbare Verschlüsselung";
        schlüssel[6] = "deutsch";
        aufgabentyp[6] = 2;
        
        //Aufgabe 8:
        anweisungstext[7] = "1854 gelang aber das erste mal die Entzifferung";
        schlüssel[7] = "abcefh";
        aufgabentyp[7] = 3;
        
        //Aufgabe 9:
        anweisungstext[8] = "Diese Entzifferung ist aber nur bei schlechten Schlüsseln möglich";
        schlüssel[8] = "Schlüssel";
        aufgabentyp[8] = 1;
        
        //Aufgabe 10:
        anweisungstext[9] = "Verwendet man hingegen einen Schlüssel der aus vielen zufällig zusammengesetzten Zeichen besteht, ist die Verschlüsselung immer noch unknakcbar";
        schlüssel[9] = "nsuaabxnk";
        aufgabentyp[9] = 2;
        
        //Aufgabe 11:
        anweisungstext[10] = "Eine gute Schlüssellänge ist die Länge des Eingabetextes. Die wird auch bei der One Time Pad Verschlüsselung verwirklicht";
        schlüssel[10] = "onetimepad";
        aufgabentyp[10] = 2;
        
        //Aufgabe 12:
        anweisungstext[11] = "Mehr Informationen zur One Time Pad Verschlüsselung findest du in unserem Programm unter One Time Pad";
        schlüssel[11] = "yxdcba";
        aufgabentyp[11] = 3;
        
        //Aufgabe 13:
        anweisungstext[12] = "Ein schlechter Schüssel ist ein zu kurzer Schlüssel oder ein leicht erratbarer Schlüssel";
        schlüssel[12] = "nfnsbxdk";
        aufgabentyp[12] = 1;
        
        //Aufgabe 14:
        anweisungstext[13] = "Vigenere ist beispielsweise ein schlechter Schlüssel";
        schlüssel[13] = "vigenere";
        aufgabentyp[13] = 3;
        
        //Aufgabe 15:
        anweisungstext[14] = "Jetzt solltet ihr ja wissen, worauf es beim Schlüssel der Vigenere Verschlüsselung ankommt um diese schwer knackbar zu machen";
        schlüssel[14] = "hnfxlgutvbrnm";
        aufgabentyp[14] = 2;
    }
}
