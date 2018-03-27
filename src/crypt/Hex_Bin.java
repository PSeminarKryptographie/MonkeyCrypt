//25.07.2017 3 Klassen funktionieren nur wenn von bin/hex zuerst verschlüsselt, dann mit Hex_bin umgerechnet und mit der anderen entschlüsselt wird fehlt der letzte Buchstabe => wahrscheinlich Fehler in dieser Klasse, ABER wenn man nur umrechnet und zurückrechnet geht hier nichts verloren

package crypt;

public class Hex_Bin extends Spielsprache
{
    //String BinAlphabet = "01";
    //String HexAlphabet = "0123456789ABCDEF";
    public Hex_Bin()
    {
      
    }
    
    
    String DecInttoHexStr(int dec)
    {
        String hexStr = Integer.toString(dec,16);
        return hexStr;
    }
    
    int HexStrtoDecInt(String hex)
    {
        int dec = Integer.parseInt(hex, 16 );
        return dec;
    }
    
    String DecInttoBinStr(int dec)
    {
        String BinStr = Integer.toString(dec,2);
        return BinStr;
    }
    
    int BinStrtoDecInt(String binaryStr)
    {
        int dec = Integer.parseInt(binaryStr,2);
        return dec;     
    }
    

    public String HextoBin(String HexEingabe)
    {
        String BinAusgabe = DecInttoBinStr(HexStrtoDecInt(HexEingabe));
        return BinAusgabe;
    }
    
    public String BintoHex(String BinEingabe)
    {
       String HexAusgabe = DecInttoHexStr(BinStrtoDecInt(BinEingabe));
       return HexAusgabe;
    }
    
    String StringzuAchterpacks(String BinEingabe)
    {
        BinEingabe = BinEingabe + " ";//
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
    
    
    public String encrypt(String HexEingabe)
    {
        String BinAusgabe = "";
        String x = "";
        HexEingabe = HexEingabe.toUpperCase();
        for (int i = 0; i<HexEingabe.length(); i++)
        {
            
            if (HexEingabe.charAt(i) == ' ')
            {
            }
            else if (HexEingabe.length()-i >= 2)
            {
               x = HexEingabe.substring(i, i+2);
               x = HextoBin(x);
               i = i+2;
            }
            
            if (BinAusgabe.length() == 0)   //zur Vermeidung von einem Leerzeichen am Anfang
            {
                BinAusgabe = x;
            }
            else
            {
                BinAusgabe = BinAusgabe + " " + x;
            }
        }
        return BinAusgabe;
    }
    
    public String decrypt (String Eingabe)
    {
          
        Eingabe = StringzuAchterpacks(Eingabe);
        String HexAusgabe = "";
        String x = "";
        int laenge = 0;
        for (int i=0; i<=Eingabe.length(); i++)
        {
            for (int l = 0; l<8; l++)
            {
                if (Eingabe.charAt(l) != ' ' && l < Eingabe.length())
                {
                   laenge = l;
                   
                }
                else if(l < Eingabe.length())
                {
                    laenge = l;
                    l = 7;//m�sste bei 8 aufh�ren
                }
            }
                
                if ( i+laenge < Eingabe.length())  //
                {
                x = Eingabe.substring(i, i+laenge+1);
                x = BintoHex(x);
            }
            
            if (HexAusgabe.length() == 0)
            {
                HexAusgabe = x;
            }
            else
            {
                HexAusgabe = HexAusgabe + " " + x;
            }
                i = i+laenge+1;
                laenge = 0;
        }
        HexAusgabe = HexAusgabe.toUpperCase();
        return HexAusgabe;
       
    }
    
    
    
    
    
    
    
    
    
    
    

    
    /*public String decryptAlternative(String BinEingabe)
    {
        String Ausgabe = "";
        BinEingabe = StringzuAchterpacks(BinEingabe);
        BinEingabe = BinEingabe.replaceAll("\\s+","");
        int position = 0;

        for (int i = 0; position+i+7<BinEingabe.length(); i++)
        {
            String pack = "";
            pack = BinEingabe.substring(position+i, position+i+7);
            pack = BintoHex(pack);
            
            
            Ausgabe = Ausgabe + pack;
            position = position+8;
        }
        
 
        return Ausgabe;
    }*/
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
   
    
    
  
}
