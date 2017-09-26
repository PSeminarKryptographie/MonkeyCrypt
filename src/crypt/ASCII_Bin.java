package crypt;

public class ASCII_Bin extends Spielsprache
{
    String Alphabet = " ! #$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKKMNOPQRSTUVWXYZ[ ]^_`abcdefghijklmnopqrstuvwxyz{|}~������";//3Stelle " 5C Stelle \
    String[] Bin = { "00100000", "00100001", "00100010", "00100011", "00100100", "00100101", "00100110", "00100111", "00101000", "00101001", "00101010", "00101011", "00101100", "00101101", "00101110", "00101111", "00110000", "00110001", "00110010", "00110011", "00110100", "00110101", "00110110", "00110111", "00111000", "00111001", "00111010", "00111011", "00111100", "00111101", "00111110", "00111111", "01000000", "01000001", "01000010", "01000011", "01000100", "01000101", "01000110", "01000111", "01001000", "01001001", "01001010", "01001011", "01001100", "01001101", "01001110", "01001111", "01010000", "01010001", "01010010", "01010011", "01010100", "01010101", "01010110", "01010111", "01011000", "01011001", "01011010", "01011011", "01011100", "01011101", "01011110", "01011111", "01100000", "01100001", "01100010", "01100011", "01100100", "01100101", "01100110", "01100111", "01101000", "01101001", "01101010", "01101011", "01101100", "01101101", "01101110", "01101111", "01110000", "01110001", "01110010", "01110011", "01110100", "01110101", "01110110", "01110111", "01111000", "01111001", "01111010","01111011", "01111100", "01111101", "01111110", /*6 Umlaute-> Hex: 10 bis 15*/ "00010000", "00010001", "00010010", "00010011", "00010100", "00010101"}; 
    public ASCII_Bin()
    {
       
    }   
    
    String gibSubstringVonXbisY(String s, int x, int y)
    {
        String subS;
        subS = s.substring(x,y);
        return subS;
    }
    
    String LeerLoeschen(String text)
    {
        text = text.replaceAll("\\s+","");
        return text;
    }
    
    char gibBuchstabevonAlphabetStelleY(int stelle)
    {
        char buchstabe = Alphabet.charAt(stelle);
        return buchstabe;
    }
    
    int gibStellevonBuchstabe(char buchstabe) //Problem bei Eingabe von '   keine Ausgabe da kein ' zwischen '' erkannt wird
    {
        int stelle = 0;
       
        while (buchstabe !=(Alphabet.charAt(stelle)))
        {
            stelle++;
        }
        
        return stelle;
    }
    
    String gibCodevonBinStelle(int stelle)
    {
        String Code= Bin[stelle];
        return Code;
    }
    
    int gibStellevonCode(String code)  //bei Ende (Stelle 100) Buchstabe = � (ue);
    {
        int stelle = 0;

        while(!code.equals(Bin[stelle])&&stelle<100)
        {
            stelle++;
        }
        return stelle;
    }
    
    
    
    
    public String encrypt(String t)
    {
        String Ergebnis = AtoB(t);
        return Ergebnis;
    }
   
    
    public String decrypt(String t)
    {
        return BtoA_funktionNEU(t);
        
    }
    
    
    char gibAvonB(String tc) //entspricht sp�ter BtoA also dann Text in BtoA reinschreiben und die Methode hier l�schen
        {
        String Substring = gibSubstringVonXbisY(tc, 0, 8);
        char Buchstabe;
        int nummer = 0;
        int stelle = 0;
        
        stelle = gibStellevonCode(Substring);
        Buchstabe = gibBuchstabevonAlphabetStelleY(stelle);
        return Buchstabe;
      
    }
    
    
    
    
    
    /*char gibBuchstabevonCodeTestSubst(String tc) //entspricht sp�ter BtoA also dann Text in BtoA reinschreiben und die Methode hier l�schen
        {
        String Substring = gibSubstringVonXbisY(tc, 0, 7);
        char Buchstabe;
        int nummer = 0;
        
        String code = Substring;
        
        int stelle = 0;
        
        for (int i = 0; i<100; i++)
        {
            if (code == (Bin[stelle]))
            {
                nummer = stelle;
            }
    
        
            /*    //entspricht:
             * while (code != (Bin[stelle])&&(stelle < 100))
           {
               stelle = stelle+1;
            }*/
        
       // }
     //       //nummer = stelle;
     //       Buchstabe = gibBuchstabevonAlphabetStelleY(nummer);
     //       return /*String.valueOf(*/Buchstabe/*)*/;
    
   // }
    /*
    int gibBuchstabevonCodeTestSubst2(String tc) //entspricht sp�ter BtoA also dann Text in BtoA reinschreiben und die Methode hier l�schen
        {
        String Substring = gibSubstringVonXbisY(tc, 0, 7); //in BtoA muss 0, 7 auf i, i+t ge�ndert werden
        char Buchstabe;
        int nummer = 0;
        int stelle = 0;
        //String code = Substring;
        
        
        
        stelle = gibStellevonCode(Substring);
        
        
            //nummer = stelle;
        Buchstabe = gibBuchstabevonAlphabetStelleY(stelle);
    //    //return /*String.valueOf(*///Buchstabe/*)*/;
        //return Substring;
    //    return stelle;
        
    //}*/
    
    
    /*String BtoAneu (String eingabe) //
    {
        String ausgabe = "";
        char w;
        String x = "";
        for (int i = 0; i<eingabe.length(); i++)
        {
            if (eingabe.length()-i>=8)
            {
                int stelle = gibStellevonCode(gibSubstringVonXbisY(eingabe, i, i+7));
                w = gibBuchstabevonAlphabetStelleY(stelle);
                x = String.valueOf(w);
                ausgabe = ausgabe + x;
                i = i+7;
             }
        }
        
        return ausgabe;
    }*/
    
   
    
    String BtoA_funktionNEU(String eingabe) //bei einem Buchstabe funktionierts
    {
        String ausgabe = "";
        
        for (int i = 0; i<eingabe.length(); i++)
        {
            if (eingabe.length() -i>=8)
            {
                String Achterpack = gibSubstringVonXbisY(eingabe, i, i+8);
                char x;
                int stelle = 0;
                
                stelle = gibStellevonCode(Achterpack);
                x = gibBuchstabevonAlphabetStelleY(stelle);
                
                ausgabe = ausgabe + x;
                i = i+8;                //WIE VIEL ? dass es um 8 weitergeht
           }
        }
        
        
        
        return ausgabe;
      
    }
  
    
    
    
    
    
    
    
    String AtoBmitLeer (String eingabe)
    {
        String ausgabe = "";
        String x = "";
        for (int i = 0; i<eingabe.length(); i++)
        {
            x = gibCodevonBinStelle(gibStellevonBuchstabe(eingabe.charAt(i)));
            ausgabe = ausgabe + " " + x;
        }
        return ausgabe;
    }
    
    String AtoB (String eingabe)
    {
        String ausgabe = "";
        String x = "";
        for (int i = 0; i<eingabe.length(); i++)
        {
            x = gibCodevonBinStelle(gibStellevonBuchstabe(eingabe.charAt(i)));
            if (ausgabe.length() == 0)
            {
                ausgabe = x;
            }
            else
            {
                ausgabe = ausgabe + " " + x;
            }
        }
        return ausgabe;
    }
    
    String BtoA (String eingabe) //
    {
        String ausgabe = "";
        char w;
        String x = "";
        for (int i = 0; i<eingabe.length(); i++)
        {
            if (eingabe.length()-i>=8)
            {
            int stelle = gibStellevonCode(gibSubstringVonXbisY(eingabe, i, i+7));
            w = gibBuchstabevonAlphabetStelleY(stelle);
            x = String.valueOf(w);
            ausgabe = ausgabe + x;
            i = i+7;
        }
        }
        
        return ausgabe;
    }


    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String BtoA_AM9tn6tn(String eingabe) //bei einem Buchstabe funktionierts
    {
        String ausgabe = "";
        //for(int e = 0; e<eingabe.length(); e++)
        //{
            for (int i = 0; i<eingabe.length(); i++)
            {
                if (eingabe.length() < 8)//(eingabe.length() -i>=8)
                {
                    String Achterpack = gibSubstringVonXbisY(eingabe, 0, 8);
                    char x;
                    int st = 0;
                    
                    st = gibStellevonCode(Achterpack);
                    x = gibBuchstabevonAlphabetStelleY(st);
                    eingabe = eingabe.substring(9);
                    ausgabe = ausgabe + x;
                    //i = i+8;   bringt nix i wird immer auf 0 zur�ckgesetzt             //WIE VIEL ? dass es um 8 weitergeht
               }
               else if (eingabe.length() == 8)
               {
                   String Achterpack = eingabe;
                   char x;
                   int st = 0;
                    
                   st = gibStellevonCode(Achterpack);
                   x = gibBuchstabevonAlphabetStelleY(st);
                   ausgabe = ausgabe + x;
               }
               else
               {
                   String Achterpack = StringzuAchterpacks(eingabe);
                   eingabe = "";
                   char x;
                   int st = 0;
                   
                   st = gibStellevonCode(Achterpack);
                   x = gibBuchstabevonAlphabetStelleY(st);
                   
                   ausgabe = ausgabe + x;
               }
            }
        //}
        
        
        
        return ausgabe;
      
    }

    
    
    
    
    String BtoA_AM9tn6Tester(String eingabe) //bei einem Buchstabe funktionierts
    {
        String ausgabe = "";
       
            eingabe = StringzuAchterpacks(eingabe);
            String Achterpack = "";
            int st = 0;
            for (int i = 0; i<eingabe.length(); i++)
            {
                if (eingabe.length() > 8)//(eingabe.length() -i>=8)
                {
                    Achterpack = gibSubstringVonXbisY(eingabe, 0, 8);
                    
                    char x;
                    st = 0;
                    
                    st = gibStellevonCode(Achterpack);
                    x = gibBuchstabevonAlphabetStelleY(st);
                    
                    ausgabe = ausgabe + x;
                    eingabe = eingabe.substring(9);
               }
               else if (eingabe.length() == 8)
               {
                   Achterpack = eingabe;
                   char x;
                   st = 0;
                   
                   st = gibStellevonCode(Achterpack);
                   x = gibBuchstabevonAlphabetStelleY(st);
                   
                   ausgabe = ausgabe + x;
                   eingabe = "";
               }
               /*else   //darf nicht vorkommen da nur achterpacks evtl kommt es vor wenn ein leer da steht
               {
                   Achterpack = eingabe.substring(0, 8);
                   
                   
                   char x;
                   st = 0;
                   
                   st = gibStellevonCode(Achterpack);
                   x = gibBuchstabevonAlphabetStelleY(st);
                   
                   ausgabe = ausgabe + x;
                   eingabe = "";
               }*/
              
            }
       
        
        
        
        return ausgabe;
        //return Achterpack;
        //return eingabe;
    }
    
    int gibStellevonCodeBinTester(String code)  //PROBLEM: ENDLOSSCHLEIFE, noch muss man schreiben (code != (Bin[stelle])&& stelle <100)   nicht <=100 sonst OutOfBounds und es ommt bis jetzt dann immer � raus (da stelle = 100)
    {
        int stelle = 0;

        while(code != Bin[stelle]&&stelle<100)
        {
            stelle++;
        }
        return stelle;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String StringzuAchterpacks(String BinEingabe)
    {
        BinEingabe = BinEingabe + " ";//
        int zaehler = 0;
        String Ergebnis = "";
        String nullen = "";
        String x = "";
        String pack = "";
        int xlaenge = 0; 
        for (int e = 0; e<=BinEingabe.length();e++)
        {
            if(BinEingabe.length()>=9 && BinEingabe.charAt(0) != ' ' && BinEingabe.charAt(1) != ' ' && BinEingabe.charAt(2) != ' ' && BinEingabe.charAt(3) != ' ' && BinEingabe.charAt(4) != ' ' && BinEingabe.charAt(5) != ' ' && BinEingabe.charAt(6) != ' ' && BinEingabe.charAt(7) != ' ')
            {
                pack = BinEingabe.substring(0, 8);
                BinEingabe = BinEingabe.substring(pack.length()+1);
            }
             else
             {
                for (int i = 0; i<8; i++)
                {
                      if ( i >= BinEingabe.length()) //bei Zahlen wie "101" wird hinten ein Leer erg�nzt "101 " damit die Funktion -else if mit whileSchleife- daraus "00000101" macht
                      {
                          BinEingabe = BinEingabe + " ";
                      }
                        if (BinEingabe.charAt(i) == '0')
                        {
                            x = x + BinEingabe.charAt(i);   
                        }
                        else if (BinEingabe.charAt(i) == '1')
                        {
                            x = x + BinEingabe.charAt(i);  
                        }
                        else if (BinEingabe.charAt(i) == ' ')
                        {
                            int counter = 8-x.length();
                            xlaenge = x.length();
                            while(counter >0)
                            {
                                nullen = nullen + "0";
                                counter = counter-1;
                            }
                            pack = nullen + x;
                            nullen = "";
                            i = 8;
                            x = "";
                            BinEingabe = BinEingabe.substring(xlaenge+1);
                        }
                }
            }
             
                 if (Ergebnis.length() == 0)
                {
                    Ergebnis = pack;
                }
                else
                {
                    Ergebnis = Ergebnis + " " +pack;
                } 
            
        }
        
        return Ergebnis;
        
    }
}