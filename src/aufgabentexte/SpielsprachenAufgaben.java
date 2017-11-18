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
public class SpielsprachenAufgaben extends Aufgaben {
    
    /**
     * Zahlen der VerschlüsselungsNummer
     * 1:Bisprache
     * 2:Bobsprache
     * 3:Löffelsprache
     * 
     */
    
    public SpielsprachenAufgaben()
    {
        super(24);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 2;
        }
        
        //Aufgabe 1
        anweisungstext[0] = "Bobs Verschlüsselung";
        aufgabentyp[0] = 1;
        verschlüsselungsNummer[0] = 2;
        
        //Aufgabe 2
        anweisungstext[1] = "Diese ist leicht zu entschlüsseln";
        aufgabentyp[1] = 2;
        verschlüsselungsNummer[1] = 2;
        
        //Aufgabe 3
        anweisungstext[2] = "Und auch ziemlich leicht zu verstehen";
        aufgabentyp[2] = 1;
        verschlüsselungsNummer[2] = 2;
        
        //Aufgabe 4
        anweisungstext[3] = "Hinter jeden Konsonanten fügt man einfach ein o und nochmal den Konsonanten";
        aufgabentyp[3] = 1;
        verschlüsselungsNummer[3] = 2;
        
        //Aufgabe 5
        anweisungstext[4] = "Sie ist also ganz leicht zu verstehen und damit auch leicht zu entschlüsseln";
        aufgabentyp[4] = 2;
        verschlüsselungsNummer[4] = 2;
        
        //Aufgabe 6
        anweisungstext[5] = "Aus diesem Grund ist die Verschlüsselung auch nicht besonders stark und leicht zu knacken";
        aufgabentyp[5] = 1;
        verschlüsselungsNummer[5] = 2;
        
        //Aufgabe 7
        anweisungstext[6] = "Trotzdem macht es aber Spaß sich mit ihr zu beschäftigen, weshalb sie auch in diesem Program enthalten ist";
        aufgabentyp[6] = 2;
        verschlüsselungsNummer[6] = 2;
        
        //Aufgabe 8
        anweisungstext[7] = "Die Bobsprache ist aber nicht die einzigste Spielsprache. Deshalb werden in den folgenden Aufgaben noch zwei weitere Spielsprachen abgefragt";
        aufgabentyp[7] = 1;
        verschlüsselungsNummer[7] = 2;
        
        //Aufgabe 9
        anweisungstext[8] = "Bisprache ist eine Spielsprache";
        aufgabentyp[8] = 1;
        verschlüsselungsNummer[8] = 1;
        
        //Aufgabe 10
        anweisungstext[9] = "Diese ist ähnlich wie Bobsprache";
        aufgabentyp[9] = 1;
        verschlüsselungsNummer[9] = 1;
        
        //Aufgabe 11
        anweisungstext[10] = "Und somit auch leicht zu entschlüsseln";
        aufgabentyp[10] = 2;
        verschlüsselungsNummer[10] = 1;
        
        //Aufgabe 12
        anweisungstext[11] = "Es wird einfach hinter jeden Vokal ein bi angefügt, wovon der Name der Verschlüsselung auch abgeleitet wird";
        aufgabentyp[11] = 1;
        verschlüsselungsNummer[11] = 1;
        
        //Aufgabe 13
        anweisungstext[12] = "Da Ähnlichkeiten zur Bobsprache bestehen, werden beide Verschlüsselung auch unter dem Überbegriff Spielsprache bezeichnet";
        aufgabentyp[12] = 2;
        verschlüsselungsNummer[12] = 1;
        
        //Aufgabe 14
        anweisungstext[13] = "Diese Verschlüsselung wird genauso wie dei Bobsprache von Bob und Alice verwendet";
        aufgabentyp[13] = 2;
        verschlüsselungsNummer[13] = 1;
        
        //Aufgabe 15
        anweisungstext[14] = "Mit deren Hilfe tauschen die beiden ihre geheimen Nachrichten aus, die nur der andere entschlüsseln kann";
        aufgabentyp[14] = 1;
        verschlüsselungsNummer[14] = 1;
        
        //Aufgabe 16
        anweisungstext[15] = "Es ist also niemand anderem möglich die geheimen Nachrichten zwischen Bob und Alice zu entschlüsseln und somit ihre Kommunikation zu belauscehn";
        aufgabentyp[15] = 2;
        verschlüsselungsNummer[15] = 1;
        
        //Aufgabe 17
        anweisungstext[16] = "Löffelsprache";
        aufgabentyp[16] = 2;
        verschlüsselungsNummer[16] = 3;
        
        //Aufgabe 18
        anweisungstext[17] = "Diese ist ebenfalls eine Spielsprache";
        aufgabentyp[17] = 1;
        verschlüsselungsNummer[17] = 3;
        
        //Aufgabe 19 
        anweisungstext[18] = "Sie macht ebenso wie Bisprache und Bobsprache viel Spaß";
        aufgabentyp[18] = 2;
        verschlüsselungsNummer[18] = 3;
        
        //Aufgabe 20
        anweisungstext[19] = "Es wird hinter jeden Vokal ein lew und nochmal der Vokal gefügt";
        aufgabentyp[19] = 1;
        verschlüsselungsNummer[19] = 3;
        
        //Aufgabe 21
        anweisungstext[20] = "Verwendet wurde diese genau wie die anderen Spielsprachen von Bob und Alice um ihre Nachrichten zu verschlüsseln";
        aufgabentyp[20] = 2;
        verschlüsselungsNummer[20] = 3;
        
        //Aufgabe 22
        anweisungstext[21] = "Du kannst sie aber auch verwenden um dich mit deinen Freunden so verschlüsselt unterhalten";
        aufgabentyp[21] = 1;
        verschlüsselungsNummer[21] = 3;
        
        //Aufgabe 23
        anweisungstext[22] = "Es wäre niemandem möglich eure Kommunikation zu entschlüsseln. Es könnten dich also nur deine Freunde verstehen";
        aufgabentyp[22] = 2;
        verschlüsselungsNummer[22] = 3;
        
        //Aufgabe 24
        anweisungstext[23] = "Lust bekommen? Dann probiers doch einfach mal aus und unterhalte dich mit ein paar Freunden verschlüsselt. Statt Löffelsprache könnt ihr natürlich auch Bisprache oder Löffelsprache verwenden";
        aufgabentyp[23] = 1;
        verschlüsselungsNummer[23] = 3;
    }
    
}
