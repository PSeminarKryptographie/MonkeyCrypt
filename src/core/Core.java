/**
 * Schnittstellenklasse zwischen Hauptprogramm und Fenster
 * @author Simon Schall
 */
package core;

import crypt.*;

public class Core
{
    /**Feld für die Chiffrierungen*/
    Chiffre[] chiffre = {new Caesar(), new Multiplikativ(), new Vigenere(), new OneTimePad(), new Spaltentransposition(), new Gartenzaun(), new ADFGX(), new Hill(), new Permutation(), new Bacon(), new Affine()};
    /**Feld für Spielsprachen*/
    Spielsprache[] spielsprache = {new Anagramm(), new Morse(), new ASCII_Hex(), new ASCII_Bin(), new AlphaIndex(), new BI_language(), new Bobsprache(), new Loeffelsprache(), new Alpha_Bin(), new NATO_Alphabet(), new Pseudo_Text()};
    Doppelwuerfel meinDW = new Doppelwuerfel();
    Haeufigkeitsanalyse meineHA = new Haeufigkeitsanalyse();
    
    public Core()
    { 
    }
    
    
    /**Verschlüsselt die Chiffren*/
    public String verschluesseln(int z, String in, String k)
    {
        return chiffre[z].encrypt(in, k);
    }
       
    //Entschlüsselt die Chiffren
    public String entschluesseln(int z, String in, String k)
    {
        return chiffre[z].decrypt(in, k);
    }
    
    //Verschlüsselt eine Spielsprache
    public String spielsprache_verschluesseln(int z, String in)
    {
        return spielsprache[z].encrypt(in);
    }
        
    //Entschlüsselt eine Spielsprache
    public String spielsprache_entschluesseln(int z, String in)
    {
        return spielsprache[z].decrypt(in);
    }
    
    public String verschluesseln(String in, String k1, String k2)
    {
        return meinDW.encrypt(in, k1, k2);
    }
       
    //Entschlüsselt die Chiffren
    public String entschluesseln(String in, String k1, String k2)
    {
        return meinDW.decrypt(in, k1, k2);
    }
    
    public String analysieren(String in) {
        return meineHA.analysieren(in);
    }
}
  