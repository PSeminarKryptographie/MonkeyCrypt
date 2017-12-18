/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcollectors;
import java.awt.event.*;
import frame.*;
import crypt.Alphabet;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ToolTipManager;

/**
 *
 * @author Jonas
 */
public class MoCr_SettingsAL implements ActionListener {
   
    MoCr_Frame localFrame;
    MoCr_Frame_Settings localSettings;
    Alphabet localAlphabet;
    Color standard;
    
    
    public MoCr_SettingsAL(MoCr_Frame myFrame, MoCr_Frame_Settings mySettings) {
        localAlphabet = Alphabet.getInstance();
        localFrame = myFrame;
        localSettings = mySettings;
        standard = localFrame.MoCr_MainPro_cardPanel.getBackground();
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == localSettings.MoCr_SettingsFrame_Validation) {
            changeResizability(localSettings.isCheckboxSelected());
            localAlphabet.setAlphabet(localSettings.getAlphabetInput());
            localSettings.setVisible(false);
            clearFrame(localSettings.getClearBoxIndex());
            setBgColor(localSettings.MoCr_SettingsFrame_Colourbox.getSelectedIndex());
            ToolTipManager.sharedInstance().setEnabled(localSettings.MoCr_SettingsFrame_TipCheck.isSelected());
            setNewSize();
        }
        else {
            if(e.getSource() == localSettings.MoCr_SettingsFrame_ResetButton) {
                localSettings.setStandardAlphabet();
            }
        }
    }
    
    public void renew() {
        localSettings.setVisible(true);
        localSettings.renewalRoutine(localAlphabet.getAlphabet());
        
    }
    
    public void clearFrame(int i) {
        switch(i) {
            case 0: break;
            case 1: localFrame.clearAll(); break;
            case 2: localFrame.clearLocal(); break;
            case 3: localFrame.clearKeys(); break;
            case 4: localFrame.clearIO(); break;           
        }
    }
    
    public void changeResizability(boolean s) {
        localFrame.setResizable(s);
    }
    
    public void setBgColor(int i) {
        switch(i) {
            case 0: localFrame.MoCr_MainPro_cardPanel.setBackground(this.standard); break;
            case 1: localFrame.MoCr_MainPro_cardPanel.setBackground(Color.green); break;
            case 2: localFrame.MoCr_MainPro_cardPanel.setBackground(Color.yellow); break;
            case 3: localFrame.MoCr_MainPro_cardPanel.setBackground(Color.pink); break;            
        }
    }
    
    public void setNewSize() {
        int i = 13;        
        try {
            i = Integer.parseInt(localSettings.SizeField.getText());
        } catch(Exception e) {}
        localFrame.MoCr_MPstaticIO_InField.setFont(new Font("Monospaced", Font.PLAIN, i));
        localFrame.MoCr_MPstaticIO_OutField.setFont(new Font("Monospaced", Font.PLAIN, i));
    }
}
