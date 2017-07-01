/**
 * Schnittstellenklasse zwischen Hauptprogramm und Fenster
 * @author Simon Schall
 */
package core;

import crypt.*;

public class Core
{
    /**Feld f�r die Chiffrierungen*/
    Chiffre[] chiffre;
    /**Feld f�r Spielsprachen*/
    Spielsprache[] spielsprache;
    
    public Tools tool;
    
    public Core()
    {
        chiffre = new Chiffre[11];
        chiffre[0] = new Caesar();
        chiffre[1] = new Multiplikativ();
        chiffre[2] = new Vigenere();
        chiffre[3] = new OneTimePad();
        chiffre[4] = new Spaltentransposition();
        chiffre[5] = new Gartenzaun();
        chiffre[6] = new ADFGX();
        chiffre[7] = new Hill();
        chiffre[8] = new Permutation();
        chiffre[9] = new Bacon();
        chiffre[10] = new Affine();
        
        //Spielsprachen erzeugen
        spielsprache = new Spielsprache[11];
        spielsprache[0] = new Anagramm();
        spielsprache[1] = new Morse();
        //spielsprache[2] = new Ascii();
        spielsprache[3] = new BinaerCode();
        spielsprache[4] = new AlphaIndex();
        spielsprache[5] = new BI_language();
        spielsprache[6] = new Bobsprache();
        spielsprache[7] = new Loeffelsprache();
        //spielsprache[8] = new BinHex();
        spielsprache[9] = new NATO_Alphabet();
        //spielsprache[10] = new Pseudo_Text();
        
        tool = new Tools();
        
        
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
    
    //Verschlüsselt Caesar
    public String caesarVerschlüsseln(String in, String k)
    {
        return chiffre[0].encrypt(in, k);
    }
    
    //Verschlüsselt Multiplikativ
    public String multiplikativVerschlüsseln(String in, String k)
    {
        return chiffre[1].encrypt(in, k);
    }
    
    //Verschlüsselt Vigenere
    public String vigenereVerschlüsseln(String in, String k)
    {
        return chiffre[2].encrypt(in, k);
    }
    
    
    //Verschlüsselt OneTimePad
    public String onetimepadVerschlüsseln(String in, String k)
    {
        return chiffre[3].encrypt(in, k);
    }
    
    
    //Verschlüsselt Spaltentransposition
    public String spaltentranspositionVerschlüsseln(String in, String k)
    {
        return chiffre[4].encrypt(in, k);
    }
    
    
    //Verschlüsselt Gartenzaun
    public String gartenzaunVerschlüsseln(String in, String k)
    {
        return chiffre[5].encrypt(in, k);
    }
    
    
    //Verschlüsselt ADFGX
    public String adfgxVerschlüsseln(String in, String k)
    {
        return chiffre[6].encrypt(in, k);
    }
    
    
    //Verschlüsselt Hill
    public String hillVerschlüsseln(String in, String k)
    {
        return chiffre[7].encrypt(in, k);
    }
    
    
    //Verschlüsselt Permutation
    public String permutationVerschlüsseln(String in, String k)
    {
        return chiffre[8].encrypt(in, k);
    }
    
    
    //Verschlüsselt Bacon
    public String baconVerschlüsseln(String in, String k)
    {
        return chiffre[9].encrypt(in, k);
    }
    
    
    //Verschlüsselt Affine
    public String affineVerschlüsseln(String in, String k)
    {
        return chiffre[10].encrypt(in, k);
    }
    
    
    //Entschlüsselt Caesar
    public String caesarEntschlüsseln(String in, String k)
    {
        return chiffre[0].decrypt(in, k);
    }
    
    //Entschlüsselt Multiplikativ
    public String multiplikativEntschlüsseln(String in, String k)
    {
        return chiffre[1].decrypt(in, k);
    }
    
    //Entschlüsselt Vigenere
    public String vigenereEntschlüsseln(String in, String k)
    {
        return chiffre[2].decrypt(in, k);
    }
    
    
    //Entschlüsselt OneTimePad
    public String onetimepadEntschlüsseln(String in, String k)
    {
        return chiffre[3].decrypt(in, k);
    }
    
    
    //Entschlüsselt Spaltentransposition
    public String spaltentranspositionEntschlüsseln(String in, String k)
    {
        return chiffre[4].decrypt(in, k);
    }
    
    
    //Entschlüsselt Gartenzaun
    public String gartenzaunEntschlüsseln(String in, String k)
    {
        return chiffre[5].decrypt(in, k);
    }
    
    
    //Entschlüsselt ADFGX
    public String adfgxEntschlüsseln(String in, String k)
    {
        return chiffre[6].decrypt(in, k);
    }
    
    
    //Entschlüsselt Hill
    public String hillEntschlüsseln(String in, String k)
    {
        return chiffre[7].decrypt(in, k);
    }
    
    
    //Entschlüsselt Permutation
    public String permutationEntschlüsseln(String in, String k)
    {
        return chiffre[8].decrypt(in, k);
    }
    
    
    //Entschlüsselt Bacon
    public String baconEntschlüsseln(String in, String k)
    {
        return chiffre[9].decrypt(in, k);
    }
    
    
    //Entschlüsselt Affine
    public String affineEntschlüsseln(String in, String k)
    {
        return chiffre[10].decrypt(in, k);
    }
    
    
    
    //Entschlüsselt Anagramm
    public String anagrammEntschlüsseln(String n)
    {
        return spielsprache[0].encrypt(n);
    }
    
    //Entschlüsselt Morse
    public String morseEntschlüsseln(String n)
    {
        return spielsprache[1].encrypt(n);
    }
    
    //Entschlüsselt Ascii
    /*public String asciiEntschlüsseln(String n)
    {
        return spielsprache[2].encrypt(n);
    }*/
    
    //Entschlüsselt BinärCode
    public String binaerCodeEntschlüsseln(String n)
    {
        return spielsprache[3].encrypt(n);
    }
    
    //Entschlüsselt AlphaIndex
    public String alphaIndexEntschlüsseln(String n)
    {
        return spielsprache[4].encrypt(n);
    }
    
    //Entschlüsselt Bi_language
    public String bi_languageEntschlüsseln(String n)
    {
        return spielsprache[5].encrypt(n);
    }
    
    //Entschlüsselt Bobsprache
    public String bobspracheEntschlüsseln(String n)
    {
        return spielsprache[6].encrypt(n);
    }
    
    //Entschlüsselt Löffelsprache
    public String loeffelspracheEntschlüsseln(String n)
    {
        return spielsprache[7].encrypt(n);
    }
    
    
    
    //Verschlüsselt Anagramm
    public String anagrammVerschlüsseln(String n)
    {
        return spielsprache[0].decrypt(n);
    }
    
    //Verschlüsselt Morse
    public String morseVerschlüsseln(String n)
    {
        return spielsprache[1].decrypt(n);
    }
    
    //Verschlüsselt Ascii
    /*public String asciiVerschlüsseln(String n)
    {
        return spielsprache[2].decrypt(n);
    }*/
    
    //Verschlüsselt BinärCode
    public String binaerCodeVerschlüsseln(String n)
    {
        return spielsprache[3].decrypt(n);
    }
    
    //Verschlüsselt AlphaIndex
    public String alphaIndexVerschlüsseln(String n)
    {
        return spielsprache[4].decrypt(n);
    }
    
    //Verschlüsselt Bi_language
    public String bi_languageVerschlüsseln(String n)
    {
        return spielsprache[5].decrypt(n);
    }
    
    //Verschlüsselt Bobsprache
    public String bobspracheVerschlüsseln(String n)
    {
        return spielsprache[6].decrypt(n);
    }
    
    //Verschlüsselt Löffelsprache
    public String loeffelspracheVerschlüsseln(String n)
    {
        return spielsprache[7].decrypt(n);
    }
}
  