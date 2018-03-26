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
        super(20);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschluesselungstyp[i] = 1;
        }
        
        //Aufgabe 1:
        anweisungstext[0] = "Julius Caesar";
        schluessel[0] = "c";
        aufgabentyp[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "Caesar Verschluesselung";
        schluessel[1] = "b";
        aufgabentyp[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Diese Verschluesselung erfand Caesar";
        schluessel[2] = "y";
        aufgabentyp[2] = 1;
        
        //Aufgabe 4:
        anweisungstext[3] = "Um geheime Bootschaften zu senden";
        schluessel[3] = "f";
        aufgabentyp[3] = 1;
        
        //Aufgabe 5:
        anweisungstext[4] = "Die nur seine Truppen entschluesseln konnten";
        schluessel[4] = "d";
        aufgabentyp[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Denn nur diese kannten den schluessel";
        schluessel[5] = "c";
        aufgabentyp[5] = 3;
        
        //Aufgabe 7:
        anweisungstext[6] = "Und konnten mit diesem die Bootschaft entschluesseln";
        schluessel[6] = "x";
        aufgabentyp[6] = 2;
        
        //Aufgabe 8:
        anweisungstext[7] = "Er eroberte so ganz Gallien";
        schluessel[7] = "b";
        aufgabentyp[7] = 1;
        
        //Aufgbae 9:
        anweisungstext[8] = "Ganz Gallien? Nein, nur fast ganz Gallien!";
        schluessel[8] = "m";
        aufgabentyp[8] = 1;
        
        //Aufgaben 10:
        anweisungstext[9] = "Denn einem kleinem Dorf gelang es unaufhaltsam Wiederstand zu leisten";
        schluessel[9] = "p";
        aufgabentyp[9] = 2;
        
        //Aufgabe 11:
        anweisungstext[10] = "Hat dieses Dorf etwa den schluessel seiner Verschluesselung gefunden";
        schluessel[10] = "w";
        aufgabentyp[10] = 3;
        
        //Aufgabe 12:
        anweisungstext[11] = "Oder ist es ihm gelungen die Verschluesselung zu entschluesseln";
        schluessel[11] = "q";
        aufgabentyp[11] = 2;
        
        //Aufgabe 13:
        anweisungstext[12] = "Oder hat das kleine Dorf eine andere, bessere Verschluesselung als Caesar entworfen";
        schluessel[12] = "e";
        aufgabentyp[12] = 1;
        
        //Aufgabe 14:
        anweisungstext[13] = "Nein, dieses Dorf hat keine Verschluesselung erfundne. Der schluessel dieses Dorfes ist ein magischer Trank";
        schluessel[13] = "v";
        aufgabentyp[13] = 3;
        
        //Aufgabe 15:
        anweisungstext[14] = "Dieser magische Trank verleiht ihnen übermennschliche Kräfte und ist somit Caesars Verschluesselung überlegen";
        schluessel[14] = "u";
        aufgabentyp[14] = 1;
        
        //Aufgabe 16:
        anweisungstext[15] = "Caesar und seinen Truppen ist es bisher auch noch nicht gelungen den schluessel zu diesem Trank zu finden";
        schluessel[15] = "h";
        aufgabentyp[15] = 2;
        
        //Aufgabe 17:
        anweisungstext[16] = "Diesen schluessel wird er auch in Zukunft nicht finden";
        schluessel[16] = "s";
        aufgabentyp[16] = 3;
        
        //Aufgabe 18:
        anweisungstext[17] = "Somit wird das kleine gallische Dorf bestehend aus Asterix, Obelix, Miraculix und all den anderen Galliern ihm auch in Zukunft Wiederstand leisten";
        schluessel[17] = "n";
        aufgabentyp[17] = 1;
        
        //Aufgabe 19:
        anweisungstext[18] = "Aus diesem Grunde werden auch die Schüler nachfolgender Generationen noch viel Freude an den Geschichten des Asterix haben";
        schluessel[18] = "v";
        aufgabentyp[18] = 2;
        
        //Aufgabe 20:
        anweisungstext[19] = "Und natürlich auch an Caesars Verschluesselung";
        schluessel[19] = "m";
        aufgabentyp[19] = 3;
    }
}
