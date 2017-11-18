package crypt;

public class BI_language extends Spielsprache
{
    
    public BI_language()
    {
    }
    
    public boolean IstVokal(char n)                                  //20171112
    {
        return (n == 'a')|(n == 'e')|(n == 'i')|(n == 'o')|(n == 'u')|(n == 'A')|(n == 'E')|(n == 'I')|(n == 'O')|(n == 'U');
    }    
    
    public String encrypt(String text)
    {
     String vtext = ""; 
              for (int i=0; i<text.length(); i++)
     {    
         if (IstVokal(text.charAt(i)) == true)
        {   
             if ((i+1)< text.length()) // Wenn der letzte Buchstabe des Worten ein Vokal war, kam es zum Fehler out of bounds 
             {                         //darum Methode in zugehoeriger else Klammer (mit *1 markiert)              
                 if (IstVokal(text.charAt(i+1))== false)//Vermeidung von 2 BIs wegen Doppelvokal( Bsp D-ie-b, Fehler: Di-bi-e-bi-b, Jetzt Die-bi-b
                 {
                     vtext = vtext + text.charAt(i) + "bi";
                 }   
                 else
                 {
                     vtext = vtext + text.charAt(i);
                 }   
             }
             else //*1 Methode f�r letzten Buchstaben im Wort
             {
                  if (IstVokal(text.charAt(i))== true)// letzer Buchstabe kann kein Doppelter Vokal sein -> Wenn Konsonant dann Buchstabe + bi sonst nur Buchstabe
                 {
                     vtext = vtext + text.charAt(i) + "bi";
                 }   
                 else
                 {
                     vtext = vtext + text.charAt(i);
                 }   
                }
        }
        else
        {
            vtext = vtext + text.charAt(i);
        }
        }
     return vtext; 
    }
   
    public String decrypt(String vtext)
    {
        String etext = "";
        //vtext = vtext.toLowerCase(); 20171112 entfernt
               for (int i=vtext.length()-1; i>=0; i--)
     {
         if ((vtext.charAt(i))=='i')
         {
             if ((vtext.charAt(i-1))=='b')
                if (IstVokal(vtext.charAt(i-2))== true)/// //Bi wird nur gel�scht wenn ein Vokal davor steht, diese Methode (mit /// markiert) ist nicht dringend erforderlich
                {///
                    {
                        etext = etext + vtext.charAt(i-2);
                        i = i-2;
                    }
                }///
                else
                {
                    etext = etext + vtext.charAt(i);
                }   
        } 
        else
        {
            etext = etext + vtext.charAt(i);
        }
     }
        
     String retext = "";
     for (int i=etext.length()-1; i>=0; i--)
     {
         retext = retext + etext.charAt(i);
     }  
     return retext;
    }
    
}

