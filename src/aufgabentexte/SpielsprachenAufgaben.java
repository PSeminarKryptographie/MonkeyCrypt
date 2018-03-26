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
     * Zahlen der VerschluesselungsNummer
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
            verschluesselungstyp[i] = 2;
        }
        
        //Aufgabe 1
        anweisungstext[0] = "Bobs Verschluesselung";
        aufgabentyp[0] = 1;
        verschluesselungsNummer[0] = 2;
        
        //Aufgabe 2
        anweisungstext[1] = "Diese ist leicht zu entschluesseln";
        aufgabentyp[1] = 2;
        verschluesselungsNummer[1] = 2;
        
        //Aufgabe 3
        anweisungstext[2] = "Und auch ziemlich leicht zu verstehen";
        aufgabentyp[2] = 1;
        verschluesselungsNummer[2] = 2;
        
        //Aufgabe 4
        anweisungstext[3] = "Hinter jeden Konsonanten fügt man einfach ein o und nochmal den Konsonanten";
        aufgabentyp[3] = 1;
        verschluesselungsNummer[3] = 2;
        
        //Aufgabe 5
        anweisungstext[4] = "Sie ist also ganz leicht zu verstehen und damit auch leicht zu entschluesseln";
        aufgabentyp[4] = 2;
        verschluesselungsNummer[4] = 2;
        
        //Aufgabe 6
        anweisungstext[5] = "Aus diesem Grund ist die Verschluesselung auch nicht besonders stark und leicht zu knacken";
        aufgabentyp[5] = 1;
        verschluesselungsNummer[5] = 2;
        
        //Aufgabe 7
        anweisungstext[6] = "Trotzdem macht es aber Spaß sich mit ihr zu beschäftigen, weshalb sie auch in diesem Program enthalten ist";
        aufgabentyp[6] = 2;
        verschluesselungsNummer[6] = 2;
        
        //Aufgabe 8
        anweisungstext[7] = "Die Bobsprache ist aber nicht die einzigste Spielsprache. Deshalb werden in den folgenden Aufgaben noch zwei weitere Spielsprachen abgefragt";
        aufgabentyp[7] = 1;
        verschluesselungsNummer[7] = 2;
        
        //Aufgabe 9
        anweisungstext[8] = "Bisprache ist eine Spielsprache";
        aufgabentyp[8] = 1;
        verschluesselungsNummer[8] = 1;
        
        //Aufgabe 10
        anweisungstext[9] = "Diese ist ähnlich wie Bobsprache";
        aufgabentyp[9] = 1;
        verschluesselungsNummer[9] = 1;
        
        //Aufgabe 11
        anweisungstext[10] = "Und somit auch leicht zu entschluesseln";
        aufgabentyp[10] = 2;
        verschluesselungsNummer[10] = 1;
        
        //Aufgabe 12
        anweisungstext[11] = "Es wird einfach hinter jeden Vokal ein bi angefügt, wovon der Name der Verschluesselung auch abgeleitet wird";
        aufgabentyp[11] = 1;
        verschluesselungsNummer[11] = 1;
        
        //Aufgabe 13
        anweisungstext[12] = "Da Ähnlichkeiten zur Bobsprache bestehen, werden beide Verschluesselung auch unter dem Überbegriff Spielsprache bezeichnet";
        aufgabentyp[12] = 2;
        verschluesselungsNummer[12] = 1;
        
        //Aufgabe 14
        anweisungstext[13] = "Diese Verschluesselung wird genauso wie dei Bobsprache von Bob und Alice verwendet";
        aufgabentyp[13] = 2;
        verschluesselungsNummer[13] = 1;
        
        //Aufgabe 15
        anweisungstext[14] = "Mit deren Hilfe tauschen die beiden ihre geheimen Nachrichten aus, die nur der andere entschluesseln kann";
        aufgabentyp[14] = 1;
        verschluesselungsNummer[14] = 1;
        
        //Aufgabe 16
        anweisungstext[15] = "Es ist also niemand anderem möglich die geheimen Nachrichten zwischen Bob und Alice zu entschluesseln und somit ihre Kommunikation zu belauscehn";
        aufgabentyp[15] = 2;
        verschluesselungsNummer[15] = 1;
        
        //Aufgabe 17
        anweisungstext[16] = "Löffelsprache";
        aufgabentyp[16] = 2;
        verschluesselungsNummer[16] = 3;
        
        //Aufgabe 18
        anweisungstext[17] = "Diese ist ebenfalls eine Spielsprache";
        aufgabentyp[17] = 1;
        verschluesselungsNummer[17] = 3;
        
        //Aufgabe 19 
        anweisungstext[18] = "Sie macht ebenso wie Bisprache und Bobsprache viel Spaß";
        aufgabentyp[18] = 2;
        verschluesselungsNummer[18] = 3;
        
        //Aufgabe 20
        anweisungstext[19] = "Es wird hinter jeden Vokal ein lew und nochmal der Vokal gefügt";
        aufgabentyp[19] = 1;
        verschluesselungsNummer[19] = 3;
        
        //Aufgabe 21
        anweisungstext[20] = "Verwendet wurde diese genau wie die anderen Spielsprachen von Bob und Alice um ihre Nachrichten zu verschluesseln";
        aufgabentyp[20] = 2;
        verschluesselungsNummer[20] = 3;
        
        //Aufgabe 22
        anweisungstext[21] = "Du kannst sie aber auch verwenden um dich mit deinen Freunden so verschluesselt unterhalten";
        aufgabentyp[21] = 1;
        verschluesselungsNummer[21] = 3;
        
        //Aufgabe 23
        anweisungstext[22] = "Es wäre niemandem möglich eure Kommunikation zu entschluesseln. Es könnten dich also nur deine Freunde verstehen";
        aufgabentyp[22] = 2;
        verschluesselungsNummer[22] = 3;
        
        //Aufgabe 24
        anweisungstext[23] = "Lust bekommen? Dann probiers doch einfach mal aus und unterhalte dich mit ein paar Freunden verschluesselt. Statt Löffelsprache könnt ihr natürlich auch Bisprache oder Löffelsprache verwenden";
        aufgabentyp[23] = 1;
        verschluesselungsNummer[23] = 3;
    }
    
}
