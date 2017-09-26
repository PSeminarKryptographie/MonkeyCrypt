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
    
    int state;
    int chiffrestate;
    int encryptionType;
    boolean ismainmode;
    int caesardiscmode;
       
    public WindowLogic() {
        state = 0;
        chiffrestate = 0;
        encryptionType = 0;
        ismainmode = true;
        caesardiscmode = 0;
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
    
    public ImageIcon alterDisc(boolean directedLeft) {
        String nextChar = Tools.int2string(caesardiscmode, "abcdefghijklmnopqrstuvwxyz");
        String path = "/img/graphics/Drehscheibe Einzelsequenzen/DS_" + nextChar + ".png";
        return new javax.swing.ImageIcon(getClass().getResource(path));
    }
    
    public String DiscModetoString() {
        return Tools.int2string(caesardiscmode, "abcdefghijklmnopqrstuvwxyz");
    }
}
