/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcollectors;
import core.mwin_modules.IndivModule;
import java.awt.event.*;
import frame.*;

/**
 *
 * @author Jonas
 */
public class MoCr_SettingsAL implements ActionListener {
   
    public IndivModule localIModule;
    MoCr_Frame_Settings localSettings;
       
    public MoCr_SettingsAL(MoCr_Frame myFrame, MoCr_Frame_Settings mySettings) {
        localIModule = new IndivModule(myFrame, mySettings);
        localSettings = mySettings;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == localSettings.MoCr_SettingsFrame_Validation) {
            localIModule.validate();
        }
        else {
            if(e.getSource() == localSettings.MoCr_SettingsFrame_ResetButton) {
                localSettings.setStandardAlphabet();
            }
        }
    }
}
