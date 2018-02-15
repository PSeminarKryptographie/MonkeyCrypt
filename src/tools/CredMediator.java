/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import core.Translator;

/**
 *
 * @author Jonas
 */
public class CredMediator {
    
    public String rightCredPath() {
        return "/text/credits/" + Translator.getInstance().getcurrentLang() + ".txt";
    }
}
