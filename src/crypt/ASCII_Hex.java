package crypt;

public class ASCII_Hex extends Spielsprache
{


    public ASCII_Hex()
    {
    }
    
    public String encrypt(String t)
    {
        String h = "";
        String x = "";
        for( int i=0; i<t.length(); i++)
        {
            if (t.charAt(i) == ' ')
            {
                x = "20";
            }
            else if (t.charAt(i) == '!')
            {
                x = "21";
            }
            else if (t.charAt(i) == '"')
            {
                x = "22";
            }
            else if (t.charAt(i) == '#')
            {
                x = "23";
            }
            else if (t.charAt(i) == '$')
            {
                x = "24";
            }
            else if (t.charAt(i) == '%')
            {
                x = "25";
            }
            else if (t.charAt(i) == '&')
            {
                x = "26";
            }
            // Apostroph ' (= 27h) nicht m�glich, da es hier als Markierung f�r char-Zeichen benutzt wird.
            else if (t.charAt(i) == '(')
            {
                x = "28";
            }
            else if (t.charAt(i) == ')')
            {
                x = "29";
            }
            else if (t.charAt(i) == '*')
            {
                x = "2A";
            }
            else if (t.charAt(i) == '+')
            {
                x = "2B";
            }
            else if (t.charAt(i) == ',')
            {
                x = "2C";
            }
            else if (t.charAt(i) == '-')
            {
                x = "2D";
            }
            else if (t.charAt(i) == '.')
            {
                x = "2E";
            }
            else if (t.charAt(i) == '/')
            {
                x = "2F";
            }
            else if (t.charAt(i) == '0')
            {
                x = "30";
            }
            else if (t.charAt(i) == '1')
            {
                x = "31";
            }
            else if (t.charAt(i) == '2')
            {
                x = "32";
            }
            else if (t.charAt(i) == '3')
            {
                x = "33";
            }
            else if (t.charAt(i) == '4')
            {
                x = "34";
            }else if (t.charAt(i) == '5')
            {
                x = "35";
            }
            else if (t.charAt(i) == '6')
            {
                x = "36";
            }
            else if (t.charAt(i) == '7')
            {
                x = "37";
            }
            else if (t.charAt(i) == '8')
            {
                x = "38";
            }
            else if (t.charAt(i) == '9')
            {
                x = "39";
            }
            else if (t.charAt(i) == ':')
            {
                x = "3A";
            }
            else if (t.charAt(i) == ';')
            {
                x = "3B";
            }
            else if (t.charAt(i) == '<')
            {
                x = "3C";
            }
            else if (t.charAt(i) == '=')
            {
                x = "3D";
            }
            else if (t.charAt(i) == '>')
            {
                x = "3E";
            }else if (t.charAt(i) == '?')
            {
                x = "3F";
            }
            else if (t.charAt(i) == '@')
            {
                x = "40";
            }
            else if (t.charAt(i) == 'A')
            {
                x = "41";
            }
            else if (t.charAt(i) == 'B')
            {
                x = "42";
            }
            else if (t.charAt(i) == 'C')
            {
                x = "43";
            }
            else if (t.charAt(i) == 'D')
            {
                x = "44";
            }
            else if (t.charAt(i) == 'E')
            {
                x = "45";
            }
            else if (t.charAt(i) == 'F')
            {
                x = "46";
            }
            else if (t.charAt(i) == 'G')
            {
                x = "47";
            }
            else if (t.charAt(i) == 'H')
            {
                x = "48";
            }else if (t.charAt(i) == 'I')
            {
                x = "49";
            }
            else if (t.charAt(i) == 'J')
            {
                x = "4A";
            }
            else if (t.charAt(i) == 'K')
            {
                x = "4B";
            }
            else if (t.charAt(i) == 'L')
            {
                x = "4C";
            }
            else if (t.charAt(i) == 'M')
            {
                x = "4D";
            }
            else if (t.charAt(i) == 'N')
            {
                x = "4E";
            }
            else if (t.charAt(i) == 'O')
            {
                x = "4F";
            }
            else if (t.charAt(i) == 'P')
            {
                x = "50";
            }
            else if (t.charAt(i) == 'Q')
            {
                x = "51";
            }
            else if (t.charAt(i) == 'R')
            {
                x = "52";
            }else if (t.charAt(i) == 'S')
            {
                x = "53";
            }
            else if (t.charAt(i) == 'T')
            {
                x = "54";
            }
            else if (t.charAt(i) == 'U')
            {
                x = "55";
            }
            else if (t.charAt(i) == 'V')
            {
                x = "56";
            }
            else if (t.charAt(i) == 'W')
            {
                x = "57";
            }
            else if (t.charAt(i) == 'X')
            {
                x = "58";
            }
            else if (t.charAt(i) == 'Y')
            {
                x = "59";
            }
            else if (t.charAt(i) == 'Z')
            {
                x = "5A";
            }
            else if (t.charAt(i) == '[')
            {
                x = "5B";
            }
            //Umgekehrter Schr�gstrich \ (= 5Ch) nicht m�glich, da er im Programm eine andere Funktion hat.
            else if (t.charAt(i) == ']')
            {
                x = "5D";
            }
            else if (t.charAt(i) == '^')
            {
                x = "5E";
            }
            else if (t.charAt(i) == '_')
            {
                x = "5F";
            }
            else if (t.charAt(i) == '`')
            {
                x = "60";
            }
            else if (t.charAt(i) == 'a')
            {
                x = "61";
            }
            else if (t.charAt(i) == 'b')
            {
                x = "62";
            }
            else if (t.charAt(i) == 'c')
            {
                x = "63";
            }
            else if (t.charAt(i) == 'd')
            {
                x = "64";
            }
            else if (t.charAt(i) == 'e')
            {
                x = "65";
            }
            else if (t.charAt(i) == 'f')
            {
                x = "66";
            }else if (t.charAt(i) == 'g')
            {
                x = "67";
            }
            else if (t.charAt(i) == 'h')
            {
                x = "68";
            }
            else if (t.charAt(i) == 'i')
            {
                x = "69";
            }
            else if (t.charAt(i) == 'j')
            {
                x = "6A";
            }
            else if (t.charAt(i) == 'k')
            {
                x = "6B";
            }
            else if (t.charAt(i) == 'l')
            {
                x = "6C";
            }
            else if (t.charAt(i) == 'm')
            {
                x = "6D";
            }
            else if (t.charAt(i) == 'n')
            {
                x = "6E";
            }
            else if (t.charAt(i) == 'o')
            {
                x = "6F";
            }
            else if (t.charAt(i) == 'p')
            {
                x = "70";
            }else if (t.charAt(i) == 'q')
            {
                x = "71";
            }
            else if (t.charAt(i) == 'r')
            {
                x = "72";
            }
            else if (t.charAt(i) == 's')
            {
                x = "73";
            }
            else if (t.charAt(i) == 't')
            {
                x = "74";
            }
            else if (t.charAt(i) == 'u')
            {
                x = "75";
            }
            else if (t.charAt(i) == 'v')
            {
                x = "76";
            }
            else if (t.charAt(i) == 'w')
            {
                x = "77";
            }
            else if (t.charAt(i) == 'x')
            {
                x = "78";
            }
            else if (t.charAt(i) == 'y')
            {
                x = "79";
            }
            else if (t.charAt(i) == 'z')
            {
                x = "7A";
            }else if (t.charAt(i) == '{')
            {
                x = "7B";
            }
            else if (t.charAt(i) == '|')
            {
                x = "7C";
            }
            else if (t.charAt(i) == '}')
            {
                x = "7D";
            }
            else if (t.charAt(i) == '~')
            {
                x = "7E";
            }
            else if (t.charAt(i) == '�') //Umlaute geh�ren nicht zur urspr�nglichen ASCII-Codierung
            {                            //Die Hex-Zeichen 10 - 15 sind normalerweise mit nicht-druckbaren Zeichen belegt
                x = "10";                //diese werden im Verschl�sselungsprogamm nicht ben�tigt und werden hier durch Umlaute ersetzt
            }
            else if (t.charAt(i) == '�')
            {
                x = "11";
            }
            else if (t.charAt(i) == '�')
            {
                x = "12";
            }
            else if (t.charAt(i) == '�')
            {
                x = "13";
            }
            else if (t.charAt(i) == '�')
            {
                x = "14";
            }
            else if (t.charAt(i) == '�')
            {
                x = "15";
            }
            
            else
            {
                x = "-1";
            }
            
            if (i==0)
            {
                h = h+x;    //unn�tiges Leerzeichen vor dem Hex-Code wird vermieden
            }
            else
            {
                h = h+" "+x;    //alternativ kann das Pr�fix 0x vor jeden Hex-Wert geschrieben werden
                                //h+" "+"0x"+x; k�nnte hier benutzt werden. In der Entschl�sselung m�sste das Pr�fix dann wieder entfernt werden.
                                //Ein Leerzeichen w�re dann hexadezimal "0x20" statt "20" und ein gro�es A w�re hexadezimal "0x31" statt "31".
                                //Da das Pr�fix immer gleich ist und �bersetzungstechnisch keine Auswirkungen wird es hier nicht verwendet.                
            }
            x = "";
        }
        
        
        
        return h;
    }


    public String decrypt(String h)
    {
        String t = "";
        String x = "";
        for( int i=0; i<h.length(); i++)
        {
            if (h.charAt(i) == ' ')
            {
                i = i-1;    //wirkt dem unten stehenden i+1 entgegen(welches dort steht, da Hex-Codes immer 2 Stellen lang sind), damit nur eine Stelle �bersprungen wird    
                x = "";     //Leerzeichen wird �bersprungen (wenn ein Leerzeichen �bersetzt werden sollte w�rde dort 20h stehen)   
            }               //Text bleibt unver�ndert
            else if (h.charAt(i) == '1')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "�";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "�";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "�";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "�";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "�";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "�";
                }
            }
            else if(h.charAt(i) == '2')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = " ";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "!";
                }
                //Anf�hrungszeichen " ( = 22h) nicht m�glich, da es hier als Markierung f�r String-Zeichen benutzt wird
                else if(h.charAt(i+1) == '3')
                {
                    x = "#";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "$";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "%";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "&";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "'";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "(";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = ")";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = "*";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = "+";
                }
                else if(h.charAt(i+1) == 'C')
                {
                    x = ",";
                }
                else if(h.charAt(i+1) == 'D')
                {
                    x = "-";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = ".";
                }
                else if(h.charAt(i+1) == 'F')
                {
                    x = "/";
                }
            }
            else if(h.charAt(i) == '3')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "0";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "1";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "2";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "3";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "4";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "5";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "6";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "7";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "8";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = "9";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = ":";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = ";";
                }
                else if(h.charAt(i+1) == 'C')
                {
                    x = "<";
                }
                else if(h.charAt(i+1) == 'D')
                {
                    x = "=";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = ">";
                }
                else if(h.charAt(i+1) == 'F')
                {
                    x = "?";
                }
            }
            else if(h.charAt(i) == '4')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "@";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "A";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "B";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "C";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "D";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "E";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "F";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "G";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "H";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = "I";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = "J";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = "K";
                }
                else if(h.charAt(i+1) == 'C')
                {
                    x = "L";
                }
                else if(h.charAt(i+1) == 'D')
                {
                    x = "M";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = "N";
                }
                else if(h.charAt(i+1) == 'F')
                {
                    x = "O";
                }
            }
            else if(h.charAt(i) == '5')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "P";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "Q";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "R";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "S";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "T";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "U";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "V";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "W";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "X";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = "Y";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = "Z";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = "[";
                }
                //Umgekehrter Schr�gstrich \ (= 5Ch) nicht m�glich, da er im Programm eine andere Funktion hat.
                else if(h.charAt(i+1) == 'D')
                {
                    x = "]";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = "^";
                }
                else if(h.charAt(i+1) == 'F')
                {
                    x = "_";
                }
            }
            else if(h.charAt(i) == '6')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "`";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "a";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "b";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "c";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "d";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "e";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "f";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "g";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "h";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = "i";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = "j";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = "k";
                }
                else if(h.charAt(i+1) == 'C')
                {
                    x = "l";
                }
                else if(h.charAt(i+1) == 'D')
                {
                    x = "m";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = "n";
                }
                else if(h.charAt(i+1) == 'F')
                {
                    x = "o";
                }
            }
            else if(h.charAt(i) == '7')
            {
                if(h.charAt(i+1) == '0')
                {
                    x = "p";
                }
                else if(h.charAt(i+1) == '1')
                {
                    x = "q";
                }
                else if(h.charAt(i+1) == '2')
                {
                    x = "r";
                }
                else if(h.charAt(i+1) == '3')
                {
                    x = "s";
                }
                else if(h.charAt(i+1) == '4')
                {
                    x = "t";
                }
                else if(h.charAt(i+1) == '5')
                {
                    x = "u";
                }
                else if(h.charAt(i+1) == '6')
                {
                    x = "v";
                }
                else if(h.charAt(i+1) == '7')
                {
                    x = "w";
                }
                else if(h.charAt(i+1) == '8')
                {
                    x = "x";
                }
                else if(h.charAt(i+1) == '9')
                {
                    x = "y";
                }
                else if(h.charAt(i+1) == 'A')
                {
                    x = "z";
                }
                else if(h.charAt(i+1) == 'B')
                {
                    x = "{";
                }
                else if(h.charAt(i+1) == 'C')
                {
                    x = "|";
                }
                else if(h.charAt(i+1) == 'D')
                {
                    x = "}";
                }
                else if(h.charAt(i+1) == 'E')
                {
                    x = "~";
                }
            }
            t = t+x;
            i = i+1;    
        }
        
        
        return t;
    }
    

}
