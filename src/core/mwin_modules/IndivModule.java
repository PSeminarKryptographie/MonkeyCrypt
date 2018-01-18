/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.mwin_modules;

import core.Translator;
import core.WindowLogic;
import crypt.Alphabet;
import frame.MoCr_Frame;
import frame.MoCr_Frame_Settings;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ToolTipManager;
import tools.FrameTools;

/**
 *
 * @author Jonas
 */
public class IndivModule {
    
    MoCr_Frame localFrame;
    MoCr_Frame_Settings localSettings;
    FrameTools localFraTools;
    Alphabet localAlphabet;
    Color standard;
    
    public IndivModule(MoCr_Frame f, MoCr_Frame_Settings s) {
        localFrame = f;
        localSettings = s;
        localAlphabet = Alphabet.getInstance();
        localFraTools = new FrameTools();
        standard = localFrame.MoCr_MainPro_cardPanel.getBackground();
    }
    
    public void validate() {
        changeResizability(localSettings.isCheckboxSelected());
        localAlphabet.setAlphabet(localSettings.getAlphabetInput());
        localSettings.setVisible(false);
        clearFrame(localSettings.getClearBoxIndex());
        setBgColor(localSettings.MoCr_SettingsFrame_Colourbox.getSelectedIndex());
        ToolTipManager.sharedInstance().setEnabled(localSettings.MoCr_SettingsFrame_TipCheck.isSelected());
        Translator.getInstance().setCurrentLang(localSettings.MoCr_Settings_Lang.getSelectedIndex());
        setNewSize();
    }
    
    public void renew() {
        localSettings.setVisible(true);
        localSettings.renewalRoutine(localAlphabet.getAlphabet());
        
    }
    
    public void clearFrame(int i) {
        switch(i) {
            case 0: break;
            case 1: clearAll(); break;
            case 2: clearLocal(); break;
            case 3: clearKeys(); break;
            case 4: clearIO(); break;           
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
    
    public void clearAll() {
        clearIO();
        clearKeys();
    }
    
    public void clearLocal() {
        clearKeys(WindowLogic.getInstance().getState());
    }
    
    public void clearKeys() {
        for(int i = 0; i <= 10; i++) {
            clearKeys(i);
        }
    }
    public void clearKeys(int p) {
        switch(p) {
            case 0: localFrame.MoCr_Caesar_EingabefeldSchlüssel.setText(""); break;
            case 1: localFrame.MoCr_MultiplikativSub_KeyField.setText(""); break;
            case 2: localFrame.MoCr_VigenereSub_EingabefeldSchlüssel.setText(""); break;
            case 3: localFrame.MoCr_OTPSub_Area.setText("");
            case 4: localFrame.MoCr_TranspositionKey_1KeyField.setText("");
                    localFrame.MoCr_TranspositionSub_2KeyField1.setText("");
                    localFrame.MoCr_TranspositionSub_2KeyField2.setText("");
                    localFraTools.clearTable(localFrame.MoCr_TranspositionSub_MatrixKeyField, 0); break;
            case 5: localFraTools.clearTable(localFrame.MoCr_ADFGX_Matrix, 1); break;
            case 6: break;
            case 7: localFraTools.clearTable(localFrame.MoCr_HillSub_Matrix, 0); break;
            case 8: localFrame.MoCr_SteganoSub_BaconKey.setText(""); break;
            case 9: localFrame.MoCr_AffChiffSub_Key1.setText("");
                    localFrame.MoCr_AffChiffSub_Key2.setText(""); break;
        }
    }

    public void clearIO() {
        localFrame.MoCr_MPstaticIO_InField.setText("");
        localFrame.MoCr_MPstaticIO_OutField.setText("");
    }
}
