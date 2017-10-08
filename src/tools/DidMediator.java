/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Jonas
 */
public class DidMediator {
    
    public String rightDidPath(int z, boolean fromMain) {
        String ending = "";
        if(fromMain == true) {
            switch(z) {
                case 0: ending = "caesar"; break;
                case 1: ending = "multiplikative"; break;
                case 2: ending = "vigenere"; break;
                case 3: ending = "otp"; break;
                case 4: ending = "transpositionen"; break;
                case 5: ending = "codierungen"; break;
                case 6: ending = "spielsprachen"; break;
                case 7: ending = "hill"; break;
                case 8: ending = "steganographie"; break;
                case 9: ending = "affine"; break;
            }
        }
        else {
            switch(z) {
                case 0: ending = "mathematik"; break;
                case 1: ending = "steganographie"; break;
                case 2: ending = "spielsprachen"; break;
                case 3: ending = "kryptologie"; break;
                case 4: ending = "kryptoanalyse"; break;
                case 5: ending = "kryptographie"; break;
                case 6: ending = "asymmetrisch"; break;
                case 7: ending = "rsa"; break;
                case 8: ending = "endtoend"; break;
                case 9: ending = "symmetrisch"; break;
                case 10: ending = "transpositionen"; break;
                case 11: ending = "substitution"; break;
                case 12: ending = "codierungen"; break;
                case 13: ending = "chiffrierung"; break;
                case 14: ending = "monoalphabetisch"; break;
                case 15: ending = "caesar"; break;
                case 16: ending = "multiplikative"; break;
                case 17: ending = "polyalphabetisch"; break;
                case 18: ending = "vigenere"; break;
                case 19: ending = "enigma"; break;
                case 20: ending = "otp"; break;
                case 21: ending = "hill"; break;
                case 22: ending = "affine"; break;
            }
        }
        String out = "src/text/de/did/" + ending + "_did.html";
        return out;
    }
}
