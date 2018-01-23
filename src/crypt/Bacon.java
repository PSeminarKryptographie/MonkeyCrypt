package crypt;

public class Bacon extends Chiffre
{
    String Alphabet = "abcdefghijklmnopqrstuvwxyz";
    String[] Code = { "aaaaa", "aaaab", "aaaba", "aaabb", "aabaa", "aabab", "aabba", "aabbb", "abaaa", "abaaa", "abaab", "ababa", "ababb", "abbaa", "abbab", "abbba", "abbbb", "baaaa", "baaab", "baaba", "baabb", "baabb", "babaa", "babab", "babba", "babbb"}; 
    String StandardTarntext = "Du hast keinen oder einen ungültigen Tarntext eingegeben. Du kannst entweder diesen automatisch erstellten Text weiter verwenden oder es noch einmal mit einem eigenen versuchen. Dies ist eine fast unauffällige Textpassage. Sie dient nur dazu Informationen zu verstecken, falls manuell kein Text eingegeben wurde und sie hat eine begrenzte Länge. Es sind ca. dreihundert gültige Zeichen enthalten";

    int gibStandardTarntextLaenge()
    {
        return StandardTarntext.length();
    }
    
    int gibStandardTarntextTARNLaenge()
    {
        String Tarnung = StandardTarntext.replaceAll("[^abcdefghijklmnopqrstuvwxyz]",""); 
        return Tarnung.length();
    }
    
    String AllesEntfernenAusserAlphabet(String s)
    {
        String erg;
        erg = s.replaceAll("[^abcdefghijklmnopqrstuvwxyz]","");
        return erg;
    }
    
    String AllesEntfernenAusserABs(String s)
    {
        String erg;
        erg = s.replaceAll("[^ab]","");
        return erg;
    }
    
    int gibStellevonBuchstabe(char buchstabe)
    {
        int stelle = 0;
        while (buchstabe !=(Alphabet.charAt(stelle))&& stelle+1 < Alphabet.length())
        {
            stelle++;
        }
        
        return stelle;
    }
    
    int gibStellevonCode(String code) //Neu mit String.equals funktioniert
    {
        int stelle = 0;

        while(!code.equals(Code[stelle])&&stelle+1<26)//26 = Anzahl der Elemente vom Code-Array
        {
            stelle++;
        }
        return stelle;
    }
    
 public String codieren(String text)
    {
        text = text.toLowerCase();
        text = AllesEntfernenAusserAlphabet(text);
        String Ergebnis = "";
        for(int i = 0; i<text.length(); i++)
        {
                char x = text.charAt(i);
                int c = gibStellevonBuchstabe(x);
                Ergebnis = Ergebnis + Code[c];
        }
        return Ergebnis;
    }
    
    public String decodieren(String code)
    {
        code = code.toLowerCase();
        code = AllesEntfernenAusserABs(code);
        String Ergebnis = "";
        int i = 5;
        while( i<=code.length())
        {
            if (code.length() > 5)
            {
                int b = gibStellevonCode(code.substring(0, 5)); //fr�her 0 6
                char x = Alphabet.charAt(b);
                Ergebnis = Ergebnis + x;
                code = code.substring(5);
            }
            else
            {
                int b = gibStellevonCode(code);
                char x = Alphabet.charAt(b);
                Ergebnis = Ergebnis + x;
                code = "";
            }
           
            
        }
        
        return Ergebnis;
    }
 
    
    public String verstecken(String code, String Tarntext) //Tarntext optional machen (20170704)
    {
        String Ausgabe = "";
        String TarntextL = Tarntext.replaceAll("[^abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]","");   
        code = AllesEntfernenAusserABs(code);
        
        if (code.length() > TarntextL.length())
        {
            StandardTarntext = StandardTarntext.toLowerCase();
            for (int i = 0, y = 0; i<code.length() /*|y<StandardTarntext.length()*/; i++, y++)
            
            {
            
                if (StandardTarntext.charAt(y)>= 'a' && StandardTarntext.charAt(y) <= 'z')//Leer- und Sonderzeichen �berspringen  //Problem mit maximall�nge von StdTarntext bei langer eingabe, da code gleich 5x so lang wie text ist
                      
              
                {
                    if (code.charAt(i) == 'a')
                    {
                    
                        StandardTarntext = StandardTarntext.substring(0,y) + StandardTarntext.substring(y,y+1).toLowerCase() + StandardTarntext.substring(y+1);
                        //StandardTarntext = StandardTarntext.charAt(i).toLowerCase();
                    }
                    else  if (code.charAt(i) == 'b')
                    {
                        StandardTarntext = StandardTarntext.substring(0,y) + StandardTarntext.substring(y,y+1).toUpperCase() + StandardTarntext.substring(y+1);
                        //StandardTarntext.charAt(i).toUpperCase();
                    }
                }
                else
                {
                    i = i-1;
                   
                }
            
                }
               
            
            Ausgabe = StandardTarntext;
        }
        else
        {
            // das gleiche wie bei if nur mit Tarntext (NICHT TarntextL sonst gehen dort Zeichen verloren, TarntextL ist nur zur Tarntextl�nge pr�fen da)
            Tarntext = Tarntext.toLowerCase();
            for (int i = 0, y = 0; i<code.length() ; i++, y++)
            
            {
            
                if (Tarntext.charAt(y)>= 'a' && Tarntext.charAt(y) <= 'z')//Leer- und Sonderzeichen �berspringen  //Problem mit maximall�nge von StdTarntext bei langer eingabe
                      
              
                {
                    if (code.charAt(i) == 'a')
                    {
                    
                        Tarntext = Tarntext.substring(0,y) + Tarntext.substring(y,y+1).toLowerCase() + Tarntext.substring(y+1);
                        //Tarntext = Tarntext.charAt(i).toLowerCase();
                    }
                    else  if (code.charAt(i) == 'b')
                    {
                        Tarntext = Tarntext.substring(0,y) + Tarntext.substring(y,y+1).toUpperCase() + Tarntext.substring(y+1);
                        //Tarntext.charAt(i).toUpperCase();
                    }
                }
                else
                {
                    i = i-1;
                   
                }
            
                }
               
            
            Ausgabe = Tarntext;
            
        }
        return Ausgabe;
    }
    
    public String Codefinden(String Tarntext)
    {
        String TarntextEntschluessler = Tarntext.replaceAll("[^abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]","");
        String code = "";
        String x = "";
        for (int i = 0; i<TarntextEntschluessler.length(); i++)
        {
            if(Character.isLowerCase(TarntextEntschluessler.charAt(i)))
            {
                x = "a";
            }
            else if(Character.isUpperCase(TarntextEntschluessler.charAt(i)))
            {
                x = "b";
            }
            code = code + x;
        }
        
        while ((code.length()%5)!= 0)   //entfernt letzte as(max. aaaa) damit sp�ter 5er packen ohne rest decodiert werden k�nnen
        {
            code = code.substring(0, code.length()-2);
        }
        return code;
    }
    
    
    /*public String ENCRYPT (String Eingabe, String Tarntext) //momentan 20170704 fertige encrypt methode, f�r die richtige encrypt methode muss wegen dem "Schl�ssel" Tarntext extends Spielsprache zu extends Chiffre ge�ndert werden (was ja kein Problem ist)
    {
        String Ausgabe = codieren(Eingabe);
        Ausgabe = verstecken(Ausgabe,Tarntext); //oben Tarntext optional machen wenns geht
        return Ausgabe;
    }*/
    
    public String encrypt(String Eingabe, String Tarntext) //2017_07_25 jetzt Extends Chiffre => Tarntext eingeben m�glich
                                            
    {
        String Ausgabe = codieren(Eingabe);
        Ausgabe = verstecken(Ausgabe, Tarntext); //oben Tarntext optional machen wenns geht
        return Ausgabe;
    }
    
    public String decrypt(String Verschluesseltes, String Schluessel_wegen_Chiffre_ABER_wird_nicht_benutzt)       //wenn Leerzeichen beachtet werden sollen: bei Codefinden in replaceAll ein Leer mit hinter die Buchstaben einf�gen und die while schleife weglassen
    {                                                   //Problem bei decodieren wieder das mit den 5er packen
        String Ausgabe = Codefinden(Verschluesseltes);
        Ausgabe = decodieren(Ausgabe);  
        return Ausgabe;                 
    }
    
    public String verify(String k, String in) {
        return null;
    }

	@Override
	protected String algorithmEncrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String algorithmDecrypt(String text, String key) {
		// TODO Auto-generated method stub
		return null;
	}
   
}
