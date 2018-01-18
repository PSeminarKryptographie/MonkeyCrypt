/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.mwin_modules;

import crypt.Tools;
import frame.MoCr_Frame;
import javax.swing.ImageIcon;

/**
 *
 * @author Jonas
 */
public class GraphicModule {
    int caesardiscmode;
    MoCr_Frame localFrame;
    
    public GraphicModule(MoCr_Frame f) {
        caesardiscmode = 0;
        localFrame = f;
    }
    
    public void switchCounterclockwise() {
        alterDiscMode(false);
        localFrame.MoCr_CaesarSub_DiscBack.setIcon(alterDisc(false));
        localFrame.MoCr_Caesar_EingabefeldSchlüssel.setText(DiscModetoString());
    }
    
    public void switchClockwise() {
        alterDiscMode(true);
        localFrame.MoCr_CaesarSub_DiscBack.setIcon(alterDisc(true));
        localFrame.MoCr_Caesar_EingabefeldSchlüssel.setText(DiscModetoString());
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
    
    public String DiscModetoString() {
        return Tools.int2string(caesardiscmode, "abcdefghijklmnopqrstuvwxyz");
    }
    
    public ImageIcon alterDisc(boolean directedLeft) {
        String nextChar = Tools.int2string(caesardiscmode, "abcdefghijklmnopqrstuvwxyz");
        String path = "/img/graphics/Drehscheibe Einzelsequenzen/DS_" + nextChar + ".png";
        return new javax.swing.ImageIcon(getClass().getResource(path));
    }
}
