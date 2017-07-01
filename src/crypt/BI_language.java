package crypt;

public class BI_language extends Spielsprache
{
   //Autor: Matthias Graf
    
    
    public BI_language()
    {
    }
    
    public boolean IstVokal(char n)
    {
        return (n == 'a')|(n == 'e')|(n == 'i')|(n == 'o')|(n == 'u');
    }    
    
    public String encrypt(String text)
    {
       String vtext = "";
       text = text.toLowerCase();
       
              for (int i=0; i<text.length(); i++)
     {     
    if (IstVokal(text.charAt(i)) == true)
    {   
             if ((i+1)< text.length()) // Wenn der letzte Buchstabe des Worten ein Vokal war, kam es zum Fehler out of bounds
                                       //wegen text.charAt(i+1) das f�r Doppelkonsonanten ben�tigt wird
             {                         //darum die Methode f�r den letzten Buchstaben [mit *1 markiert]                        
                 if (IstVokal(text.charAt(i+1))== false)//Vermeidung von 2 BIs wegen Doppelvokal( Bsp D-ie-b, Fehler: Di-bi-e-bi-b, Jetzt Die-bi-b
                 {
                     vtext = vtext + text.charAt(i) + "bi";
                 }   
                 else
                 {
                     vtext = vtext + text.charAt(i);
                 }                  
             }
             else //*1 Methode f�r den letzten Buchstaben im Wort
             {
                  if (IstVokal(text.charAt(i))== true)// letzer Buchstabe kann kein Doppelter Vokal sein Wenn Konsonant dann Buchstabe + bi sonst nur Buchstabe
                 {                                    // Im Prinzip die gleiche Methode, nur dass nicht �berpr�ft wird ob nach dem Vokal noch ein Vokal kommt
                     vtext = vtext + text.charAt(i) + "bi";         // -> wenn der Buchstabe ein Vokal ist dann Buchstabe(=Vokal) + bi
                 }   
                 else
                 {
                     vtext = vtext + text.charAt(i);                // -> wenn der Buchstabe ein Konsonant ist dann nur Buchstabe
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
        vtext = vtext.toLowerCase();
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
     
     for (int i=etext.length()-1; i>=0; i--) //r�ckw�rts geschriebenen Text wieder richtig herum schreiben
     {
         retext = retext + etext.charAt(i);
        }
        
     return retext;
    }
    
}

