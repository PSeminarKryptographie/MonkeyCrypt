/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.mwin_modules;

import core.WindowLogic;
import frame.MoCr_Frame;
import tools.HtmlReader;

/**
 *
 * @author Jonas
 */
public class SwitchModule {
    
    MoCr_Frame localFrame;
    HtmlReader localDidViewer;
    
    public SwitchModule(MoCr_Frame f) {
        localFrame = f;
        localDidViewer = new HtmlReader(localFrame.MoCr_Did_HTMLView);
        localDidViewer.insertHTML(0, true);
    }
    
    public void setLearningContent() {
        localDidViewer.insertHTML(localFrame.MoCr_Gen_DidLister.getSelectedIndex(), false);
    }
    
    public void returnToMain() {
        adjustCards(localFrame.MoCr_Gen_DynamicPanel, localFrame.MoCr_MainPro_cardPanel);        
        adjustCards(localFrame.MoCr_MainPro_changeable, getValidChiffrePanel(WindowLogic.getInstance().getState()) );
        adjustCards(localFrame.MoCr_Gen_ListPanel, localFrame.MoCr_GenDyn_MainProList);       
        WindowLogic.getInstance().setMode(true);
    }
    
    public void setLearningPanel() {
        WindowLogic localLogic = WindowLogic.getInstance();
        localDidViewer.insertHTML(localLogic.getState(), true);
        setDidPanel();
    }
    
    public void setDidPanel() { //may cause lag
        adjustCards(localFrame.MoCr_Gen_DynamicPanel, localFrame.MoCr_Did_cardPanel);
        adjustCards(localFrame.MoCr_Gen_ListPanel, localFrame.MoCr_GenDyn_DidListPanel);
        WindowLogic.getInstance().setMode(false);
    }
    
    public void switchCipherContent(int t) {
        WindowLogic localLogic = WindowLogic.getInstance();
        localLogic.setSwitchState(t);
        adjustCards(localFrame.MoCr_MainPro_changeable, getValidChiffrePanel(localLogic.getState())); 
    }
    
    public void changeTranspositionKeyPanel(int i) {
        javax.swing.JPanel l = null;
            switch(i) {
                case -1: l = localFrame.MoCr_TranspositionSub_NoKey; break;
                case 0: l = localFrame.MoCr_TranspositionSub_1Key; break;
                case 1: l = localFrame.MoCr_TranspositionSub_2Key; break;
                case 2: l = localFrame.MoCr_TranspositionSub_MatrixKey; break;
            }
        adjustCards(localFrame.MoCr_TranspositionSub_KeyPanel, l);
    }
    
    private javax.swing.JPanel getValidChiffrePanel(int z) {
        javax.swing.JPanel n = null;
        WindowLogic localLogic = WindowLogic.getInstance();
        switch(z) {
            case 0: n = localFrame.MoCr_MPSub_Caesar;
                    localLogic.setIdentificationPair(0, 0);     break;
            case 1: n = localFrame.MoCr_MPSub_Multiplikativ;
                    localLogic.setIdentificationPair(1, 0);     break;
            case 2:  n = localFrame.MoCr_MPSub_Vigenere;
                    localLogic.setIdentificationPair(2, 0);     break;
            case 3: n = localFrame.MoCr_MPSub_OTP;
                    localLogic.setIdentificationPair(3, 0);     break;
            case 4: n = localFrame.MoCr_MPSub_Transposition;        
                    localFrame.MoCr_TranspositionSub_SpaltelButton.setSelected(true); 
                    changeTranspositionKeyPanel(0);
                    localLogic.setIdentificationPair(4, 0);     break;
            case 5: n = localFrame.MoCr_MPSub_Codierungen;       
                    localFrame.MoCr_CodierungenSub_MorseButton.setSelected(true);
                    localLogic.setIdentificationPair(1, 1);     break;
            case 6: n = localFrame.MoCr_MPSub_Spielsprachen;  
                    localFrame.MoCr_SpielsprachenMP_BiButton.setSelected(true);
                    localLogic.setIdentificationPair(5, 1);     break;
            case 7: n = localFrame.MoCr_MPSub_Hill;
                    localLogic.setIdentificationPair(7, 0);     break;
            case 8: n = localFrame.MoCr_MPSub_Steganographie;    
                    localFrame.MoCr_SteganoSub_BaconButton.setSelected(true); 
                    localLogic.setIdentificationPair(9, 0);     break;
            case 9: n = localFrame.MoCr_MPSub_AffineChiffre;
                    localLogic.setIdentificationPair(10, 0);     break;
            case 10: n = localFrame.MoCr_MPSub_Kryptoanalyse;
                    localLogic.setIdentificationPair(0, -1);
        }           
        return n;
    }
    
    public void adjustCards(javax.swing.JPanel May, javax.swing.JPanel Min) {
            May.removeAll();
            May.add(Min);
            May.revalidate();
            May.repaint();
        }
}
