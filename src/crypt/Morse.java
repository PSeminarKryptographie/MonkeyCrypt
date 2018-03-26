package crypt;
public class Morse extends Spielsprache
{

    public Morse()
    {
        
    }
 
    
    /*public void CharToMorse()
    {
        if (t.charAt(i) = "a")
        t.charAt(i) = ".-";
        "b" = "-...";
        "c" = "-.-.";
    }*/
    
    
    
    
    public String encrypt(String t)
    {   t = t.toLowerCase();
        String m = "";
        String x = "";
            for( int i=0; i<t.length(); i++)
            {
                if (t.charAt(i) == 'a')
                {
                    x = ". -";
                }
                else if (t.charAt(i) == 'b')
                {
                    x = "- . . .";
                }
                else if (t.charAt(i) == 'c')
                {
                    x = "- . - .";
                }
                else if (t.charAt(i) == 'd')
                {
                    x = "- . .";
                }
                else if (t.charAt(i) == 'e')
                {
                    x = ".";
                }
                else if (t.charAt(i) == 'f')
                {
                    x = ". . - .";
                }
                else if (t.charAt(i) == 'g')
                {
                    x = "- - .";
                }
                else if (t.charAt(i) == 'h')
                {
                    x = ". . . .";
                }
                else if (t.charAt(i) == 'i')
                {
                    x = ". .";
                }
                else if (t.charAt(i) == 'j')
                {
                    x = ". - - -";
                }
                else if (t.charAt(i) == 'k')
                {
                    x = "- . -";
                }
                else if (t.charAt(i) == 'l')
                {
                    x = ". - . .";
                }
                else if (t.charAt(i) == 'm')
                {
                    x = "- -";
                }
                else if (t.charAt(i) == 'n')
                {
                    x = "- .";
                }
                else if (t.charAt(i) == 'o')
                {
                    x = "- - -";
                }
                else if (t.charAt(i) == 'p')
                {
                    x = ". - - .";
                }
                else if (t.charAt(i) == 'q')
                {
                    x = "- - . -";
                }
                else if (t.charAt(i) == 'r')
                {
                    x = ". - .";
                }
                else if (t.charAt(i) == 's')
                {
                    x = ". . .";
                }
                else if (t.charAt(i) == 't')
                {
                    x = "-";
                }
                else if (t.charAt(i) == 'u')
                {
                    x = ". . -";
                }
                else if (t.charAt(i) == 'v')
                {
                    x = ". . . -";
                }
                else if (t.charAt(i) == 'w')
                {
                    x = ". - -";
                }
                else if (t.charAt(i) == 'x')
                {
                    x = "- . . -";
                }
                else if (t.charAt(i) == 'y')
                {
                    x = "- . - -";
                }
                else if (t.charAt(i) == 'z')
                {
                    x = "- - . .";
                }
                else if (t.charAt(i) == '1')
                {
                    x = ". - - - -";
                }else if (t.charAt(i) == '2')
                {
                    x = ". . - - -";
                }
                else if (t.charAt(i) == '3')
                {
                    x = ". . . - -";
                }
                else if (t.charAt(i) == '4')
                {
                    x = ". . . . -";
                }
                else if (t.charAt(i) == '5')
                {
                    x = ". . . . .";
                }
                else if (t.charAt(i) == '6')
                {
                    x = "- . . . .";
                }
                else if (t.charAt(i) == '7')
                {
                    x = "- - . . .";
                }
                else if (t.charAt(i) == '8')
                {
                    x = "- - - . .";
                }
                else if (t.charAt(i) == '9')
                {
                    x = "- - - - .";
                }
                else if (t.charAt(i) == '0')
                {
                    x = "- - - - -";
                }
                else if (t.charAt(i) == '?')
                {
                    x = ". . - - . .";
                }
                else if (t.charAt(i) == '.')
                {
                    x = ". - . - . -";
                }
                else if (t.charAt(i) == ',')
                {
                    x = "- - . . - -";
                }
                else if (t.charAt(i) == 'ß')//ss
                {
                    x = ". . . - - . .";
                }
                else if (t.charAt(i) == 'ä')//ae
                {
                    x = ". - . -";
                }
                else if (t.charAt(i) == 'ö')//oe
                {
                    x = "- - - .";
                }
                else if (t.charAt(i) == 'ü')//ue
                {
                    x = ". . - -";
                }
                else if (t.charAt(i) == ' ')
                {
                    x = " "; //1 Pausen -> 7 Pausen nach Wort
                }
                else
                {
                    x = "t.charAt(i)";
                }
                
                if (m == "")
                {
                    m = m + x;
                }
                else 
                {
                    m = m + "   " + x; //3 Pausen da am Ende eines Zeichens keine Pause steht aber zwischen mehreren Zeichen je 3 Pausen festgelegt sind
                }
                x = ""; //zur Sicherheit dass vor jeder neuen Belegung nichts in x steht
            }      
        return m;         
    }

    
    
    
    
    public String decrypt(String m)
    {
        String t = "";
        String x = "";
        for( int i=0; i<m.length(); i++)
            {
              if( i + 10 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '-' && m.charAt(i+10) == '-')
              {
                  x = ",";
                  i = i+10;
              }
              else if( i + 10 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.' && m.charAt(i+10) == '-')
              {
                  x = ".";
                  i = i+10;
              }
              else if( i + 10 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.' && m.charAt(i+10) == '.')
              {
                  x = "?";
                  i = i+10;
              }
              else if( i + 12 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-' && m.charAt(i+10) == '.' && m.charAt(i+12) == '.')
              {
                  x = "�";  //ss
                  i = i+12;
              }
              //Ziffern
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "1";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "2";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "3";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '-')
              {
                  x = "4";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '.' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "5";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '.' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "6";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '.' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "7";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '.' && m.charAt(i+8) == '.')
              {
                  x = "8";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '.')
              {
                  x = "9";
                  i = i+8;
              }
              else if( i + 8 <= m.length()&& m.charAt(i) == '-' && m.charAt(i+2) == '-' && m.charAt(i+4) == '-' && m.charAt(i+6) == '-' && m.charAt(i+8) == '-')
              {
                  x = "0";
                  i = i+8;
              }
              
              // Ende Ziffern
                
                 else if( i + 1 <= m.length())
                  {
                        if ( i + 3 <= m.length())
                        {
                            if ( i + 5 <= m.length())
                            {
                                if ( i + 7 <= m.length())
                                {
                                   
                          // mind 4 Zeichen beginnend mit -xxx          
                          if (m.charAt(i) == '-')
                          {
                                        if (m.charAt(i+2) == '-')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "ch";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "ö";       //oe
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "o";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "q";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "z";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "g";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "m";
                                                i = i+2;
                                            }
                                  
                                        }
                                        else if (m.charAt(i+2) == '.')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "y";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "c";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "k";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "x";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "b";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "d";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "n";
                                                i = i+2;
                                            }
                                        }
                                        else if (m.charAt(i+2) == ' ')
                                        {
                                            x = "t";
                                        }
                                               
                          }
                          // mind 4 Zeichen beginnend mit .xxx
                          else if (m.charAt(i ) == '.')
                          {
                              if (m.charAt(i+2) == '-')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "j";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "p";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "w";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "�";    //ae
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "l";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "r";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "a";
                                                i = i+2;
                                            }
                                  
                                        }
                                        else if (m.charAt(i+2) == '.')
                                        {
                                            if (m.charAt(i+4) == '-')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "ü";    //ue
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "f";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "u";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == '.')
                                            {
                                                if (m.charAt(i+6) == '-')
                                                {
                                                    x = "v";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == '.')
                                                {
                                                    x = "h";
                                                    i = i+6;
                                                }
                                                else if (m.charAt(i+6) == ' ')
                                                {
                                                    x = "s";
                                                    i = i+4;
                                                }
                                            }
                                            else if (m.charAt(i+4) == ' ')
                                            {
                                                x = "i";
                                                i = i+2;
                                            }
                                        }
                                        else if (m.charAt(i+2) == ' ')
                                        {
                                            x = "e";
                                        }         
                          }
                          else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                              i = i;
                          }
                          
                          
                          }
                           
                          else if (m.charAt(i) == '-') // 3 lang --x
                          {
                              if (m.charAt(i+2) == '-')
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "o";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "g";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "m";
                                      i = i+2;
                                  }
                                  
                              }
                              else if (m.charAt(i+2) == '.') // 3 lang -.x
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "k";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "d";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "n";
                                      i = i+2;
                                  }
                              }
                              else if (m.charAt(i+2) == ' ')
                              {
                                  x = "t";
                              }
                              
                         }
                         
                         else if (m.charAt(i) == '.') // 3 lang .-x
                          {
                              if (m.charAt(i+2) == '-')
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "w";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "r";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "a";
                                      i = i+2;
                                  }
                                  
                              }
                              else if (m.charAt(i+2) == '.') // 3 lang ..x
                              {
                                  if (m.charAt(i+4) == '-')
                                  {
                                      x = "u";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == '.')
                                  {
                                      x = "s";
                                      i = i+4;
                                  }
                                  else if (m.charAt(i+4) == ' ')
                                  {
                                      x = "i";
                                      i = i+2;
                                  }
                              }
                              else if (m.charAt(i+2) == ' ')
                              {
                                  x = "e";
                              }
                              
                         }
                         else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                              i = i;
                          }
                         
                         
                        
                         
                        }
                      else if (m.charAt(i) == '-') // 2 lang -x 
                      {
                          if (m.charAt(i+2) == '-')
                          {
                              x = "m";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == '.')
                          {
                              x = "n";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == ' ')
                          {
                              x = "t";
                              i = i+1;
                          }
                        }
                      else if (m.charAt(i) == '.') // 2 lang .x
                      {
                          if (m.charAt(i+2) == '-')
                          {
                              x = "a";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == '.')
                          {
                              x = "i";
                              i = i+2;
                          }
                          else if (m.charAt(i+2) == ' ')
                          {
                              x = "e";
                              i = i+1;
                          }
                      }
                      else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                              i = i;
                          }
                    
                  }
                else if (m.charAt(i) == '-') // 1 lang -
                {
                    x = "t";
                }
                else if (m.charAt(i) == '.') // 1 lang .
                {
                    x = "e";
                }
                else if ( m.charAt(i) == ' ')
                          {
                              x = " ";
                              i = i;
                          }
                         
               
            }
               t = t + x;
               x = "";
               if( i+3 <= m.length())
               {
                   i = i+3;
               }
               else 
               {
                   i = i+1;
               }
            }
               
               
        return t;
      }
    }    



