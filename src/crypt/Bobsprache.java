package crypt;

public class Bobsprache extends Spielsprache
{
      
    public boolean IstKonsonant(char n)
    {
        return (n == 'b')|(n == 'c')|(n == 'd')|(n == 'f')|(n == 'g')|(n == 'h')|(n == 'j')|(n == 'k')|(n == 'l')|(n == 'm')|(n == 'n')|(n == 'p')|(n == 'q')|(n == 'r')|(n == 's')|(n == 't')|(n == 'v')|(n == 'w')|(n == 'x')|(n == 'y')|(n == 'z')|(n == 'B')|(n == 'C')|(n == 'D')|(n == 'F')|(n == 'G')|(n == 'H')|(n == 'J')|(n == 'K')|(n == 'L')|(n == 'M')|(n == 'N')|(n == 'P')|(n == 'Q')|(n == 'R')|(n == 'S')|(n == 'T')|(n == 'V')|(n == 'W')|(n == 'X')|(n == 'Y')|(n == 'Z');
    }    
   
    public String encrypt(String text)
    {
        String vtext = "";
        for (int i=0; i<text.length(); i++)
        {
            if (IstKonsonant(text.charAt(i)) == true)
            {
                String add_again = ""+text.charAt(i);   // damit der wiederholte Konsonant klein geschreiben wird
                add_again = add_again.toLowerCase();    //
                
                vtext = vtext + text.charAt(i) + "o" + add_again;
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
        for (int i=vtext.length()-1; i>=0; i--)
        {
            if (IstKonsonant(vtext.charAt(i)) == true)
            {
                etext = etext + vtext.charAt(i-2);
                i = i-2;
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
