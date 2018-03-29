/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 *
 * @author Jonas
 */
public class Translator {
   
    Locale[] locales = {new Locale("de", "DE"), new Locale("en", "GB"), new Locale("it", "IT"), new Locale("pl", "PL")};
    static Translator t = new Translator();
    int currentLang;
    int lastLang;
    
    private Translator() {currentLang = 0; lastLang = 0;}
    
    public static Translator getInstance() {return t;}
    
    public String getString(String k) {
        ResourceBundle rb = ResourceBundle.getBundle("text/local/Bundle", locales[currentLang]);
        return rb.getString(k);
    }
    
    public void setCurrentLang(int i) {lastLang = currentLang; currentLang = i;}
    
    public String getcurrentLang() {return locales[currentLang].getLanguage();}
    
    public int getcurrentLangIndex() {return currentLang;}
    
    public int getlastLangIndex() {return lastLang;}
}