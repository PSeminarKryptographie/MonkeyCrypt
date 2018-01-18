/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.mwin_modules;

import core.Core;
import core.WindowLogic;
import frame.MoCr_Frame;
import tools.FrameTools;

/**
 *
 * @author Jonas
 */
public class CipherModule {
    
    MoCr_Frame localFrame;
    Core localCore;
    FrameTools localFraTools;
    WindowLogic localLogic = WindowLogic.getInstance();
    
    public CipherModule(MoCr_Frame f) {
        localFrame = f;
        localCore = new Core();
        localFraTools = new FrameTools();
    }
    
    public void encrypt(boolean d) {
        if(localLogic.getIsUsed() == true) {
            String in = localFrame.MoCr_MPstaticIO_InField.getText();  //Eingabe wird ausgelesen
            localFrame.MoCr_MPstaticIO_OutField.setText(""); //Ausgabe wird geleert
            String out = "";
            int e = localLogic.getencryptionType();
            int c = localLogic.getChiffrestate();
        
            switch(e) {
                case -1: break;
                case 0: String k = "";  //für Chiffren gilt: 1 Schlüssel                  
                    switch(c) {
                        case 0: k = localFrame.MoCr_Caesar_EingabefeldSchlüssel.getText(); break;
                        case 1: k = localFrame.MoCr_MultiplikativSub_KeyField.getText(); break;
                        case 2: k = localFrame.MoCr_VigenereSub_EingabefeldSchlüssel.getText(); break;
                        case 3: k = localFrame.MoCr_OTPSub_Area.getText(); break;
                        case 4: k = localFrame.MoCr_TranspositionKey_1KeyField.getText(); break;
                        case 5: k = localFrame.MoCr_TranspositionKey_1KeyField.getText(); break;
                        case 6: k = localFraTools.dismantleJTable(localFrame.MoCr_ADFGX_Matrix, 1); break;
                        case 7: k = localFraTools.dismantleJTable(localFrame.MoCr_HillSub_Matrix, 0); break;
                        case 8: k = localFraTools.dismantleJTable(localFrame.MoCr_TranspositionSub_MatrixKeyField, 0); break;                       
                        case 9: k = localFrame.MoCr_SteganoSub_BaconKey.getText(); break;
                        case 10:    String k1 = localFrame.MoCr_AffChiffSub_Key1.getText();
                                String k2 = localFrame.MoCr_AffChiffSub_Key2.getText();
                                k = new StringBuffer(k1).append(k2).toString(); 
                                localFrame.MoCr_AffChiffSub_Function.setText(localFraTools.createFunction(k));   break;
                    }
                    if(d == true) {
                out = localCore.verschlüsseln(c, in, k);} else {out = localCore.entschlüsseln(c, in, k);}    break;
                case 1: if(d == true) {out = localCore.spielsprache_verschlüsseln(c, in);} else {out = localCore.spielsprache_entschlüsseln(c, in);} break;
                case 2: if(d == true) {out = localCore.verschlüsseln(in, localFrame.MoCr_TranspositionSub_2KeyField1.getText(), localFrame.MoCr_TranspositionSub_2KeyField2.getText());} 
                else {out = localCore.entschlüsseln(in, localFrame.MoCr_TranspositionSub_2KeyField1.getText(), localFrame.MoCr_TranspositionSub_2KeyField2.getText());}break;
            }
            localFrame.MoCr_MPstaticIO_OutField.setText(out);
        }
    }

    public String analysieren(String in, int i) {
            String out = "";
            switch(i) {
                case 0: out = localCore.analysieren(in); break;
            }
            return out;
    }
}
