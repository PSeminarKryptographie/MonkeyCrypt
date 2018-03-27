/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.mwin_modules;
import frame.*;
import core.Translator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
/**
 *
 * @author Jonas
 */
public class TranslationModule {
    public MoCr_Frame localFrame;
    
    public TranslationModule(MoCr_Frame f) {
        localFrame = f;
    }
    
    public void renew() {
            renewFrame();
            renewListM();
            renewListD();
            renewSettings();
            localFrame.localCredits.refreshCredits();
            localFrame.localSupport.refreshSupport();
            renewTooltips();
    }
    
    public void renewFrame() {
        localFrame.MoCr_Gen_Choicemenu1.setText(Translator.getInstance().getString("settings"));
        localFrame.MoCr_Gen_Choicemenu2.setText(Translator.getInstance().getString("credits"));
        localFrame.MoCr_MPstaticIO_InField.setText(Translator.getInstance().getString("input"));
        localFrame.MoCr_MPstaticIO_OutField.setText(Translator.getInstance().getString("output"));
        localFrame.MoCr_CaesarSub_LabelSchluessel.setText(Translator.getInstance().getString("key"));
        localFrame.MoCr_MPButtonpanel_LearnButton.setText(Translator.getInstance().getString("learn"));
        localFrame.MoCr_MPButtonpanel_ExerciseButton.setText(Translator.getInstance().getString("exercise"));
        localFrame.MoCr_MPButtonpanel_IOChange.setText(Translator.getInstance().getString("invert"));
        localFrame.MoCr_MPButtonpanel_Help.setText(Translator.getInstance().getString("help"));
        localFrame.MoCr_MultiplikaitvSub_KeyPointer.setText(Translator.getInstance().getString("key"));
        localFrame.MoCr_MultiplikaitvSub_KeyGenButton.setText(Translator.getInstance().getString("generateKey"));
        localFrame.MoCr_VigenereSub_LabelSchluessel.setText(Translator.getInstance().getString("key"));
        localFrame.MoCr_OTPSub_LabelSchluessel.setText(Translator.getInstance().getString("key"));
        localFrame.MoCr_OTPSub_Generator.setText(Translator.getInstance().getString("generateKey"));
        localFrame.MoCr_TranspositionSub_SpaltelButton.setText(Translator.getInstance().getString("trans1"));
        localFrame.MoCr_TranspositionSub_GartenzaunButton.setText(Translator.getInstance().getString("trans2"));
        localFrame.MoCr_TranspositionSub_AnagrammButton.setText(Translator.getInstance().getString("trans3"));
        localFrame.MoCr_TranspositionSub_DoppelwuerfelButton.setText(Translator.getInstance().getString("trans4"));
        localFrame.MoCr_TranspositionSub_PermutaButton.setText(Translator.getInstance().getString("trans5"));
        localFrame.MoCr_TranspositionKey_1KeyLabel.setText(Translator.getInstance().getString("key"));
        localFrame.MoCr_TranspositionSub_2KeyLabel.setText(Translator.getInstance().getString("keys"));
        localFrame.MoCr_TranspositionSub_MatrixKeyLabel.setText(Translator.getInstance().getString("keymatrix"));
        localFrame.MoCr_PermSub_Label.setText(Translator.getInstance().getString("matrixsize"));
        localFrame.MoCr_CodierungenSub_MorseButton.setText(Translator.getInstance().getString("code1"));
        localFrame.MoCr_CodierungenSub_ASCIIButton.setText(Translator.getInstance().getString("code2"));
        localFrame.MoCr_CodierungenSub_BinaerButton.setText(Translator.getInstance().getString("code3"));
        localFrame.MoCr_CodierungenSub_BinToHexButton.setText(Translator.getInstance().getString("code4"));
        localFrame.MoCr_CodierungenSub_AlphaButton.setText(Translator.getInstance().getString("code5"));
        localFrame.MoCr_CodierungenSub_NATOButton.setText(Translator.getInstance().getString("code6"));
        localFrame.MoCr_CodierungenSub_ADFGXButton.setText(Translator.getInstance().getString("code7"));
        localFrame.MoCr_CodierungenSub_ADFGXFiller.setText(Translator.getInstance().getString("fill"));
        localFrame.MoCr_SpielsprachenMP_BiButton.setText(Translator.getInstance().getString("fun1"));
        localFrame.MoCr_SpielsprachenMP_BobButton.setText(Translator.getInstance().getString("fun2"));
        localFrame.MoCr_SpielsprachenMP_LoeffelButton.setText(Translator.getInstance().getString("fun3"));
        localFrame.MoCr_HillSub_SizeLab.setText(Translator.getInstance().getString("matrixsize"));
        localFrame.MoCr_SteganoSub_BaconButton.setText(Translator.getInstance().getString("stegano1"));
        localFrame.MoCr_SteganoSub_PseudoButton.setText(Translator.getInstance().getString("stegano2"));
        localFrame.MoCr_SteganoSub_BaconKeyHeading.setText(Translator.getInstance().getString("baconhead"));
        localFrame.MoCr_AffChiffSub_KeyLabel.setText(Translator.getInstance().getString("keychar"));
        localFrame.MoCr_AffChiffSub_Functionpointer.setText(Translator.getInstance().getString("function"));
        localFrame.jButton1.setText(Translator.getInstance().getString("distribution"));
        localFrame.MoCr_Did_Returnerbutton.setText(Translator.getInstance().getString("back"));
    }
    
    public void renewListM() {
        DefaultListModel<String> lm = new DefaultListModel<String>();
        lm.add(0, Translator.getInstance().getString("caesar"));
        lm.add(1, Translator.getInstance().getString("multi"));
        lm.add(2, Translator.getInstance().getString("vigenere"));
        lm.add(3, Translator.getInstance().getString("otp"));
        lm.add(4, Translator.getInstance().getString("transpositions"));
        lm.add(5, Translator.getInstance().getString("code"));
        lm.add(6, Translator.getInstance().getString("fun"));
        lm.add(7, Translator.getInstance().getString("hill"));
        lm.add(8, Translator.getInstance().getString("steganography"));
        lm.add(9, Translator.getInstance().getString("affine"));
        lm.add(10, Translator.getInstance().getString("cryptoanalysis"));
        localFrame.MoCr_Gen_Sidelister.setModel(lm);        
    }
    
    public void renewListD() {
        DefaultListModel<String> lm = new DefaultListModel<String>();
        lm.add(0, Translator.getInstance().getString("maths"));
        lm.add(1, Translator.getInstance().getString("steganography"));
        lm.add(2, Translator.getInstance().getString("fun"));
        lm.add(3, Translator.getInstance().getString("cryptology"));
        lm.add(4, Translator.getInstance().getString("cryptoanalysis"));
        lm.add(5, Translator.getInstance().getString("cryptography"));
        lm.add(6, Translator.getInstance().getString("assym"));
        lm.add(7, Translator.getInstance().getString("RSA"));
        lm.add(8, Translator.getInstance().getString("ete"));
        lm.add(9, Translator.getInstance().getString("sym"));
        lm.add(10, Translator.getInstance().getString("transpositions"));
        lm.add(11, Translator.getInstance().getString("sub"));
        lm.add(12, Translator.getInstance().getString("code"));
        lm.add(13, Translator.getInstance().getString("cipher"));
        lm.add(14, Translator.getInstance().getString("mono"));
        lm.add(15, Translator.getInstance().getString("caesar"));
        lm.add(16, Translator.getInstance().getString("multi"));
        lm.add(17, Translator.getInstance().getString("poly"));
        lm.add(18, Translator.getInstance().getString("vigenere"));
        lm.add(19, Translator.getInstance().getString("enigma"));
        lm.add(20, Translator.getInstance().getString("otp"));
        lm.add(21, Translator.getInstance().getString("hill"));
        lm.add(22, Translator.getInstance().getString("affine"));
        localFrame.MoCr_Gen_DidLister.setModel(lm);
    }
    
    public void renewSettings() {
        MoCr_Frame_Settings ls = localFrame.localSettings;
        ls.MoCr_SettingsFrame_Heading1.setText(Translator.getInstance().getString("changeAlph"));
        ls.MoCr_SettingsFrame_ResetButton.setText(Translator.getInstance().getString("baseAlph"));
        ls.MoCr_SettingsFrame_Validation.setText(Translator.getInstance().getString("savechanges"));
        ls.MoCr_SettingsFrame_TabbedPane.setTitleAt(0, Translator.getInstance().getString("encryption"));
        ls.MoCr_SettingsFrame_TabbedPane.setTitleAt(1, Translator.getInstance().getString("show"));
        ls.MoCr_SettingsFrame_TabbedPane.setTitleAt(2, Translator.getInstance().getString("exclusion"));
        ls.Heading1.setText(Translator.getInstance().getString("framecol"));
        ls.Heading2.setText(Translator.getInstance().getString("scriptsize"));
        ls.MoCr_Settings_LangLabel.setText(Translator.getInstance().getString("lang"));
        ls.MoCr_SettingsFrame_TipCheck.setText(Translator.getInstance().getString("tip"));
        ls.MoCr_SettingsFrame_Checkbox.setText(Translator.getInstance().getString("resize"));
        DefaultComboBoxModel<String> bm1 = new DefaultComboBoxModel<String>();
        bm1.addElement(Translator.getInstance().getString("blue"));
        bm1.addElement(Translator.getInstance().getString("green"));
        bm1.addElement(Translator.getInstance().getString("yellow"));
        bm1.addElement(Translator.getInstance().getString("pink"));
        int index = ls.MoCr_SettingsFrame_Colourbox.getSelectedIndex();
        ls.MoCr_SettingsFrame_Colourbox.setModel(bm1);
        ls.MoCr_SettingsFrame_Colourbox.setSelectedIndex(index);
        DefaultComboBoxModel<String> bm2 = new DefaultComboBoxModel<String>();
        bm2.addElement(Translator.getInstance().getString("empty1"));
        bm2.addElement(Translator.getInstance().getString("empty2"));
        bm2.addElement(Translator.getInstance().getString("empty3"));
        bm2.addElement(Translator.getInstance().getString("empty4"));
        bm2.addElement(Translator.getInstance().getString("empty5"));
        ls.MoCr_SettingsFrame_ClearBox.setModel(bm2);
        ls.AlphOnlyCheckbox.setText(Translator.getInstance().getString("alphonly"));
        DefaultComboBoxModel<String> bm3 = new DefaultComboBoxModel<String>();
        bm3.addElement(Translator.getInstance().getString("script1"));
        bm3.addElement(Translator.getInstance().getString("script2"));
        bm3.addElement(Translator.getInstance().getString("script3"));
        bm3.addElement(Translator.getInstance().getString("script4"));
        ls.ScriptCombobox.setModel(bm3);
        ls.ExclusionLabel.setText(Translator.getInstance().getString("exclude"));
    }
    
    public void renewTooltips() {
        localFrame.MoCr_MPstaticIO_InField.setToolTipText(Translator.getInstance().getString("tt1"));
        localFrame.MoCr_MPstaticIO_OutField.setToolTipText(Translator.getInstance().getString("tt2"));
        localFrame.MoCr_EncryptButton.setToolTipText(Translator.getInstance().getString("tt3"));
        localFrame.MoCr_DecryptButton.setToolTipText(Translator.getInstance().getString("tt4"));
        localFrame.MoCr_MPButtonpanel_LearnButton.setToolTipText(Translator.getInstance().getString("tt5"));
        localFrame.MoCr_MPButtonpanel_ExerciseButton.setToolTipText(Translator.getInstance().getString("tt6"));
        localFrame.MoCr_MPButtonpanel_IOChange.setToolTipText(Translator.getInstance().getString("tt7"));
        localFrame.MoCr_MPButtonpanel_Help.setToolTipText(Translator.getInstance().getString("tt8"));
    }
    
    public void renewDid() {
        localFrame.localSModule.setLearningContent();
    }
}
