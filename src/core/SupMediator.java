/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Jonas
 */
public class SupMediator {
    //erstellt String für den relativen Dateipfad
    public String selectSupTxt(int e, int c) {
        String path = "src/text/de/hilfe/";
        String name = "";
        switch(e) {
            case -1: name = "kryptoanalyse"; break;
            case 0: switch(c) {
                case 0: name = "caesar"; break;
                case 1: name = "multiplikativ"; break;
                case 2: name = "vigenere"; break;
                case 3: name = "onetimepad"; break;
                case 4: name = "transposition"; break;
                case 5: name = "transposition"; break;
                case 6: name = "codierungen"; break;
                case 7: name = "hill"; break;
                case 8: name = "transposition"; break;
                case 9: name = "steganographie"; break;
                case 10: name = "affine"; break;
            } break;
            case 1: switch(c) {
                case 0: name = "transposition"; break;
                case 1: name = "codierungen"; break;
                case 2: name = "codierungen"; break;
                case 3: name = "codierungen"; break;
                case 4: name = "codierungen"; break;
                case 5: name = "spielsprachen"; break;
                case 6: name = "spielsprachen"; break;
                case 7: name = "spielsprachen"; break;
                case 8: name = "codierungen"; break;
                case 9: name = "codierungen"; break;
                case 10: name = "steganographie"; break;
            } break;
            case 2: switch(c) {
                case 0: name = "enigma"; break;
                case 1: name = "transposition"; break;
            } break;
        }
        return path + name + ".txt";
    }
    
}
