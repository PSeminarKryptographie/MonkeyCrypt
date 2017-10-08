/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import crypt.Tools;
import javax.swing.ImageIcon;

/**
 *
 * @author Jonas
 */
public class WindowLogic {
    
    private static WindowLogic myLogic = new WindowLogic();
    int state;
    int chiffrestate;
    int encryptionType;
    boolean ismainmode;
    int caesardiscmode;
    boolean isused;
       
    private WindowLogic() {
        state = 0;
        chiffrestate = 0;
        encryptionType = 0;
        ismainmode = true;
        caesardiscmode = 0;
        isused = false;
    }
    
    public static WindowLogic getInstance() {
        return myLogic;
    }
    
    public void setIsUsed(boolean d) {
        isused = d;
    }
    
    public boolean getIsUsed() {
        return isused;
    }
    
    public void setIdentificationPair(int c, int e) {
        chiffrestate = c;
        encryptionType = e;
    }
    
    public void setSwitchState(int s) {
        state = s;
    }
    
    public void setMode(boolean m) {
        ismainmode = m;
    }
    
    public int getChiffrestate() {
        return chiffrestate;
    }
    
    public int getencryptionType() {
        return encryptionType;
    }
    
    public boolean getMode() {
        return ismainmode;
    }
    
    public int getState() {
        return state;
    }
    
    public void setCaesardiscmode(int n) {
        caesardiscmode = n;
    }
    
    public int getCaesardiscmode() {
        return caesardiscmode;
    }
    
    public void alterDiscMode(boolean directedLeft) {
        if(directedLeft == true) {
            if(caesardiscmode < 25) {
                caesardiscmode++;
            } else {caesardiscmode = 0;}
        }
        else {
            if(caesardiscmode > 0) {
                caesardiscmode--;
            } else {caesardiscmode = 25;}
        }
    }
}
