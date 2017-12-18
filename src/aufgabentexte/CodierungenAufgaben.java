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
public class CodierungenAufgaben extends Aufgaben{
   
    
    /**
     * Verwaltet die Daten der Aufgaben:
     * Zahlen der Verschlüsselungsnummer entsprechen folgenden Verschlüsselungen:
     * 1: Morse
     * 2: Ascii
     * 3: BinärCode
     * 4: BinHex
     * 5: AlphabetIndex
     * 6: NatoAlphabet
     */
    public CodierungenAufgaben()
    {
        super(32);
        
        //Aufgabe 1:
        anweisungstext[0] = "morse";
        aufgabentyp[0] = 2;
        verschlüsselungsNummer[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "zeichen werden hierbei ueber ein konstantes signal uebermittelt";
        aufgabentyp[1] = 1;
        verschlüsselungsNummer[1] = 1;
        
        //Aufgabe 3:
        anweisungstext[2] = "dieses signal wird dabei ein und ausgeschaltet";
        aufgabentyp[2] = 1;
        verschlüsselungsNummer[2] = 1;
        
        //Aufgabe 4:
        anweisungstext[3] = "es besteht aus drei symbolen, dem kurzen signal, dem langen signal und der pause";
        aufgabentyp[3] = 2;
        verschlüsselungsNummer[3] = 1;
        
        //Aufgabe 5:
        anweisungstext[4] = "jedem zeichen des alphabets wird dabei eine kombination aus den signalen zugeordnet";
        aufgabentyp[4] = 2;
        verschlüsselungsNummer[4] = 1;
        
        //Aufgabe 6:
        anweisungstext[5] = "nach jedem signal ist eine kurze pause, nach jedem buchstaben eine lange pause";
        aufgabentyp[5] = 1;
        verschlüsselungsNummer[5] = 1;
        
        //Aufgabe 7:
        anweisungstext[6] = "als uebertragungsmedium kann ein tonsignal, ein funksignal, ein elektrisches signal oder ein optisches signal dienen";
        aufgabentyp[6] = 1;
        verschlüsselungsNummer[6] = 1;
        
        //Aufgabe 8:
        anweisungstext[7] = "morse wird heute kaum noch verwendet. die haeufigste anwendung ist das senden des notruf sos";
        aufgabentyp[7] = 2;
        verschlüsselungsNummer[7] = 1;
        
        //Aufgabe 9:
        anweisungstext[8] = "ASCII";
        aufgabentyp[8] = 2;
        verschlüsselungsNummer[8] = 2;
        
        //Aufgabe 10:
        anweisungstext[9] = "American Standard Code for Information Interchange";
        aufgabentyp[9] = 1;
        verschlüsselungsNummer[9] = 2;
        
        //Aufgabe 11:
        anweisungstext[10] = "Auf deutsch uebersetzt Amerikanische Standard Code fuer den Informationsaustausch";
        aufgabentyp[10] = 1;
        verschlüsselungsNummer[10] = 2;
        
        //Aufgabe 12:
        anweisungstext[11] = "Er wurde erstmals 1963 von der amerikanischen Standards Association erwaehnt";
        aufgabentyp[11] = 2;
        verschlüsselungsNummer[11] = 2;
        
        //Aufgabe 13:
        anweisungstext[12] = "Die Grundlage für ASCII stellt der Binaercode dar";
        aufgabentyp[12] = 2;
        verschlüsselungsNummer[12] = 2;
        
        //Aufgabe 14:
        anweisungstext[13] = "Dieser bezeichnet eine Sequenz von zwei Verschiedenen Symbolen wie 0/1 oder wahr/falsch";
        aufgabentyp[13] = 1;
        verschlüsselungsNummer[13] = 2;
        
        //Aufgabe 15:
        anweisungstext[14] = "7 dieser Symbole werden bei der ASCII Verschluesselung in der Regel zu einem Zeichen zusammengefuegt";
        aufgabentyp[14] = 1;
        verschlüsselungsNummer[14] = 2;
        
        //Aufgabe 16:
        anweisungstext[15] = "Die Coodierung besteht somit aus 128 verschiedenen Zeichen";
        aufgabentyp[15] = 2;
        verschlüsselungsNummer[15] = 2;
        
        //Aufgabe 17:
        anweisungstext[16] = "Diese 128 Zeichen umfassen in der Regel alle Groß und Kleinbuchstaben, die zehn arabischen Ziffern, sowie einige Satzzeichen und Sonderzeichen";
        aufgabentyp[16] = 1;
        verschlüsselungsNummer[16] = 2;
        
        //Aufgabe 18:
        anweisungstext[17] = "Alphabetindex Code";
        aufgabentyp[17] = 2;
        verschlüsselungsNummer[17] = 5;
        
        //Aufgabe 19:
        anweisungstext[18] = "Der Alpabetindex Code ist eine weitere Coodierung";
        aufgabentyp[18] = 1;
        verschlüsselungsNummer[18] = 5;
        
        //Aufgabe 20:
        anweisungstext[19] = "Bei diesem wird jedes Zeichen durch seine Stelle im Alphabet ersetzt";
        aufgabentyp[19] = 2;
        verschlüsselungsNummer[19] = 5;
        
        //Aufgabe 21:
        anweisungstext[20] = "Somit ist diese Coodierung sehr leicht zu verstehen";
        aufgabentyp[20] = 1;
        verschlüsselungsNummer[20] = 5;
        
        //Aufgabe 22:
        anweisungstext[21] = "Das Alphabet des Alphabetindex Code besteht deshalb nur aus den Kleinbuchstaben des Alphabets";
        aufgabentyp[21] = 2;
        verschlüsselungsNummer[21] = 5;
        
        //Aufgabe 23:
        anweisungstext[22] = "nato alphabet";
        aufgabentyp[22] = 2;
        verschlüsselungsNummer[22] = 6;
        
        //Aufgabe 24:
        anweisungstext[23] = "haeufig wird es auch buchstabieralphabet genannt";
        aufgabentyp[23] = 2;
        verschlüsselungsNummer[23] = 6;
        
        //Aufgabe 25:
        anweisungstext[24] = "jeder buchstabe wird hierbei als wort mit dem entsprechendem anfangsbuchstaben gesprochen";
        aufgabentyp[24] = 2;
        verschlüsselungsNummer[24] = 6;
        
        //Aufgabe 26:
        anweisungstext[25] = "das zu verwendende wort ist hierbei von einer buchstabiertafel festgelegt";
        aufgabentyp[25] = 2;
        verschlüsselungsNummer[25] = 6;
        
        //Aufgabe 27:
        anweisungstext[26] = "beim nato alphabet wird a beispielsweise mit alfa l mit lima verschluesselt";
        aufgabentyp[26] = 2;
        verschlüsselungsNummer[26] = 6;
        
        //Aufgabe 28:
        anweisungstext[27] = "verwendet wird es im telefonverkehr und bei diktaten um schwer verstaendliche Woerter zu uebermitteln";
        aufgabentyp[27] = 2;
        verschlüsselungsNummer[27] = 6;
        
        //Aufgabe 29:
        anweisungstext[28] = "um missverstaendnisse vorzubeugen ist es noch wichtig dass jedes wort von jedem anderen wort moeglichst verschieden ist";
        aufgabentyp[28] = 2;
        verschlüsselungsNummer[28] = 6;
        
        //Aufgabe 30:
        anweisungstext[29] = "da es sich beim nato alphabet um eine internationale buchstabiertafel handelt muss zusaetzlich noch gesichert sein dass alle Woerter unabhaengig von der Muttersprache ausgesprochen werden koennen";
        aufgabentyp[29] = 2;
        verschlüsselungsNummer[29] = 6;
        
        //Aufgabe 31:
        anweisungstext[30] = "zum abschluss noch zwei aufgaben zum verschluesseln";
        aufgabentyp[30] = 1;
        verschlüsselungsNummer[30] = 6;
        
        //Aufgabe 32:
        anweisungstext[31] = "geschafft letzte aufgabe zu den coodierungen";
        aufgabentyp[31] = 1;
        verschlüsselungsNummer[31] = 6;
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 2;
        }
    }
    
}
