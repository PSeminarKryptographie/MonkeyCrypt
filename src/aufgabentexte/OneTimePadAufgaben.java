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
public class OneTimePadAufgaben extends Aufgaben {
    
    public OneTimePadAufgaben()
    {
        super(17);
        
        for(int i = 0; i < anweisungstext.length; i = i+1)
        {
            verschlüsselungstyp[i] = 1;
        }
        
        //Aufgabe 1:
        anweisungstext[0] = "One Time Pad";
        schlüssel[0] = "onettimeppad";
        aufgabentyp[0] = 1;
        
        //Aufgabe 2:
        anweisungstext[1] = "Entschlüsseln";
        schlüssel[1] = "ieeqkwapwhygh";
        aufgabentyp[1] = 2;
        
        //Aufgabe 3:
        anweisungstext[2] = "Schluessel";
        schlüssel[2] = "schluessel";
        aufgabentyp[2] = 3;
        
        //Aufgabe 4:
        anweisungstext[3] = "Sie wurde 1882 entwickelt";
        schlüssel[3] = "dqhyloyxypitbqxphknahoaae";
        aufgabentyp[3] = 1;
        
        //Aufgabe 5:
        anweisungstext[4] = "Frank Miller entwickelte die Verschlüsselung";
        schlüssel[4] = "yavgimpbjmcpbjmxrkzwstjfkbhqgmsotnpyapwajiyj";
        aufgabentyp[4] = 2;
        
        //Aufgabe 6:
        anweisungstext[5] = "Sie wurde aber erst 35 Jahre später von Vernam auf den Markt gebracht";
        schlüssel[5] = "espsiyyaybnpkenkxsusobssxnhpwpbaoxvhpuajfesnoivtyuewxkxhqhiusgkequdmy";
        aufgabentyp[5] = 2;
        
        //Aufgabe 7:
        anweisungstext[6] = "Sie funktioniert ähnlich wie Vigenere";
        schlüssel[6] = "drddynymzesegnbjvkfjykafkdkzxulkljgkg";
        aufgabentyp[6] = 1;
        
        //Aufgabe 8:
        anweisungstext[7] = "Sie ist nur viel schwerer zu knacken";
        schlüssel[7] = "pptkkctelifqfgbickrykpeytenogaqcjkoe";
        aufgabentyp[7] = 3;
        
        //Aufgabe 9:
        anweisungstext[8] = "Dies liegt am langen Schlüssel";
        schlüssel[8] = "xpffoeblprodbuxqnybeodlehnvyra";
        aufgabentyp[8] = 2;
        
        //Aufgabe 10:
        anweisungstext[9] = "Dieser muss nämlich mindestens genauso lang wie der Eingabetext sein";
        schlüssel[9] = "zsnkpirnpdyuoskwkctgunahpquasuibwhnxstcgdujvgvnwedzrlotvxseawslrftyj";
        aufgabentyp[9] = 1;
        
        //Aufgabe 11:
        anweisungstext[10] = "Um absolute Sicherheit zu gewährleisten muss der Schlüssel aus willkürlich zusammengesetzten Zeichen bestehen";
        schlüssel[10] = "yyhuvheynkeebchnahqrxtaeclpblpzoklkuxiqzbjqtgghzfdfngtmrygltsefzomzwnwupfnakkssobivahdqicfceadpkcbuvdickoloyh";
        aufgabentyp[10] = 1;
        
        //Aufgabe 12:
        anweisungstext[11] = "Namen wie Max oder Moritz sind also ebenfalls ungeeignet als Schlüssel";
        schlüssel[11] = "jxvwvvktunuixoyhfzdnlahextjzbzajcbdukonyhgnribirhscibdxhoyirpthuawqlsf";
        aufgabentyp[11] = 2;
        
        //Aufgabe 13:
        anweisungstext[12] = "Denn so ist der Schluessel leicht erratbar";
        schlüssel[12] = "ntlpnriguinnhziujxrarddveobipyjdxpmrbejksh";
        aufgabentyp[12] = 3;
        
        //Aufgabe 14:
        anweisungstext[13] = "Verwendet man allerdings einen sicheren Schlüssel ist die Verschlüsselung auch heute mit modernen Methoden nicht zu brechen";
        schlüssel[13] = "afzqqopgjjgjcoazqremawpmptewkzhdhhhinpdxvinaphorvwgxdpapjvaqxjnzphjuiqwrfmtsivymjrrlqwmkvnjkdnhwnwkoacshaymjvyuakfaauchwsas";
        aufgabentyp[13] = 1;
        
        //Aufgabe 15:
        anweisungstext[14] = "Die Nachricht kann also nur mit Kenntnis des Schluessels entschluesselt werden";
        schlüssel[14] = "nrjqpyxpfmlwjftaaixibfqkvxpgbongbqtbwemadxilfkprycrrtfcqrymjjbrtimiltzcktfelpv";
        aufgabentyp[14] = 3;
        
        //Aufgabe 16:
        anweisungstext[15] = "Das einzige worauf also noch geachtet werden muss wenn man einen sicheren Schlüssel verwendet ist, dass diesen nieman anderes erfährt";
        schlüssel[15] = "czpzihzjozfghggnbqdvzknjgombptxmlncprbntxmhddkitdczcyjcbucfvjzxowqwzyttlgoiveiafjagsnkrylmvsxdejedwpokncrcejawpnxoakexdzpnqoyoxfdyuea";
        aufgabentyp[15] = 2;
        
        //Aufgabe 17:
        anweisungstext[16] = "Sie erfüllt damit die Ansprüche einer sicheren Verschlüsselung, die nur über einen unsicheren Schlüssel geknackt werden kann";
        schlüssel[16] = "tiymfhfiggzaldznertddgfydshamgkuauegjnlsgnyhoyvzkqqmvzeesyjusmblrfizqstukhfssyfpwbskjuoqlygwbdgzjxgpavwgdudkbgrzqjinonhpgeco";
        aufgabentyp[16] = 1;
    }
    
}
