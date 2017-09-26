/**
 * Schnittstellenklasse zwischen Hauptprogramm und Fenster
 * @author Simon Schall
 */
package core;

import crypt.*;

public class Core
{
    /**Feld für die Chiffrierungen*/
    Chiffre[] chiffre = {new Caesar(), new Multiplikativ(), new Vigenere(), new OneTimePad(), new Spaltentransposition(), new Gartenzaun(), new ADFGX(), new Hill(), new Permutation(), new Affine()};
    /**Feld für Spielsprachen*/
    Spielsprache[] spielsprache = {new Anagramm(), new Morse(), new ASCII_Hex(), new ASCII_Bin(), new AlphaIndex(), new BI_language(), new Bobsprache(), new Loeffelsprache(), new BinHex(), new NATO_Alphabet(), new Pseudo_Text()};

    public Core()
    { 
    }
    
    
    /**Verschlüsselt die Chiffren*/
    public String verschlüsseln(int z, String in, String k)
    {
        return chiffre[z].encrypt(in, k);
    }
    
    
    //Entschlüsselt die Chiffren
    public String entschlüsseln(int z, String in, String k)
    {
        return chiffre[z].decrypt(in, k);
    }
    
    //Verschlüsselt eine Spielsprache
    public String spielsprache_verschlüsseln(int z, String in)
    {
        return spielsprache[z].encrypt(in);
    }
    
    
    //Entschlüsselt eine Spielsprache
    public String spielsprache_entschlüsseln(int z, String in)
    {
        return spielsprache[z].decrypt(in);
    }
}
  