/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import javax.swing.table.*;

/**
 *
 * @author Jonas
 */
public class WindowLogic {
    
    int state;
    int chiffrestate;
    int encryptionType;
    boolean ismainmode;
    private static CommTools tools = new CommTools();
    
    
    public WindowLogic() {
        state = 0;
        chiffrestate = 0;
        encryptionType = 0;
        ismainmode = true;        
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
}
