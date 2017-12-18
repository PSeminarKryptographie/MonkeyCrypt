/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import core.*;

/**
 *
 * @author simon
 */
public class MoCr_Frame_exc extends javax.swing.JFrame {
    
    private ExcLogic excLogic;
    private MoCr_Frame_Support localSupport;
    /**
     * Creates new form MoCr_Frame_exc
     */
    public MoCr_Frame_exc() {
        initComponents();
        excLogic = new ExcLogic();
        localSupport = new MoCr_Frame_Support();
        this.setVisible(false);
        NaechsteAufgabe();
        VerschlüsselungSetzen(2);
    }
    
    public void refresh(int n) {
        this.VerschlüsselungSetzen(n);
        this.setVisible(true);        
    }
    
    
    //Setzt das Fenster in die richtige Verschlüsselung
    void VerschlüsselungSetzen(int n)
    {
        excLogic.VerschlüsselungSetzen(n);
        MoCr_exc_Caesar_eingabefeld.setText("");
        MoCr_exc_Caesar_Lösungsanzeige.setText("");
        MoCr_exc_Caesar_RichtigFalschAusgabe.setText("");
        
        MoCr_exc_überschrift.removeAll();
        switch(n)
        {
            case 0:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Caesar);
                break;
            case 1:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Multiplikativ);
                break;
            case 2:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Vigenere);
                break;
            case 3:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_OneTimePad);
                break;
            case 4:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Transpositionen);
                break;
            case 5:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Codierungen);
                break;
            case 6:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Spielsprachen);
                break;
            case 8:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Steganographie);
                break;
            case 9:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Affine);
                break;
            default:
                MoCr_exc_überschrift.add(MoCr_exc_überschrift_Default);
                excLogic.VerschlüsselungSetzen(10);
                MoCr_exc_Caesar_aufgabentext.setText("Für diese Verschlüsselung existiert leider kein Übungsfenster");
                break;
        }
        MoCr_exc_überschrift.repaint();
        MoCr_exc_überschrift.revalidate();
        NaechsteAufgabe();
    }
    
    
    
    void NaechsteAufgabe()
    {
        excLogic.AufgabeWeiterschalten();
        if(excLogic.aufgabentypGeben() == 1) 
        {
            MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text:");
            if(excLogic.verschlüsselungsNummerGeben() != 0)
            {
                switch(excLogic.verschlüsselungGeben())
                {
                    case 4:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                    case 5:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Morse");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Ascii");
                               break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Binärcode");
                                break;
                            case 4:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Hexadezimalcode");
                                break;
                            case 5:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Alphabetindex-Code");
                                break;
                            case 6:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text im Bustabieralphabet");
                                break;
                        }
                        break; 
                    case 6:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Bisprache");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Bobsprache");
                                break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Verschlüssele folgenden Text in Löffelsprache");
                                break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText(excLogic.anweisungstextGeben());
            if(excLogic.verschlüsselungstypGeben() == 1)
            {
                MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Schlüssel: " + excLogic.schlüsselGeben());
            }
        }
        else if(excLogic.aufgabentypGeben() == 2)
        {
            MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text:");
            
            if(excLogic.verschlüsselungsNummerGeben() != 0)
            {
                switch(excLogic.verschlüsselungGeben())
                {
                    case 4:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                    case 5:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden MorseCode");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Ascii");
                               break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüsselde folgenden Text in Binärcode");
                                break;
                            case 4:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Hexadezimalcode");
                                break;
                            case 5:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Alphabetindex-Code");
                                break;
                            case 6:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text im Bustabieralphabet");
                                break;
                        }
                        break;
                    case 6:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Bisprache");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Bobsprache");
                                break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Entschlüssele folgenden Text in Löffelsprache");
                                break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText(excLogic.LösungGeben());
            if(excLogic.verschlüsselungstypGeben() == 1)
            {
                MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Schlüssel: " + excLogic.schlüsselGeben());
            }
        }
        else if(excLogic.aufgabentypGeben() == 3)
        {
            MoCr_exc_Caesar_anweisung.setText("Finde den Schlüssel");
            if(excLogic.verschlüsselungsNummerGeben() != 0)
            {
                switch(excLogic.verschlüsselungGeben())
                {
                    case 4:
                        switch(excLogic.verschlüsselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Finde den Schlüssel der Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Finde den Schlüssel der Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText("Text: " + excLogic.anweisungstextGeben());
            MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Verschlüsselter Text:  " + excLogic.LösungGeben());
        }
        else
        {
            MoCr_exc_Caesar_anweisung.setText("");
            MoCr_exc_Caesar_aufgabentext.setText("");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoCr_exc_Caesar = new javax.swing.JPanel();
        MoCr_exc_Caesar_Aufgabe = new javax.swing.JPanel();
        MoCr_Caesar_AufgabeLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        MoCr_exc_Caesar_aufgabentext = new javax.swing.JTextArea();
        MoCr_exc_Caesar_anweisung = new javax.swing.JTextField();
        MoCr_exc_Caesar_Eingabe = new javax.swing.JPanel();
        MoCr_exc_Caesar_EingabeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MoCr_exc_Caesar_eingabefeld = new javax.swing.JTextArea();
        MoCr_exc_Caesar_Prüfenknopf = new javax.swing.JButton();
        MoCr_exc_Caesar_RichtigFalschAusgabe = new javax.swing.JTextField();
        MoCr_exc_Caesar_Loesung = new javax.swing.JPanel();
        MoCr_exc_Caesar_LösungButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MoCr_exc_Caesar_Lösungsanzeige = new javax.swing.JTextArea();
        MoCr_exc_Caesar_Weiterschaltknopf = new javax.swing.JButton();
        MoCr_exc_überschrift = new javax.swing.JPanel();
        MoCr_exc_überschrift_Caesar = new javax.swing.JPanel();
        MoCr_exc_Caesar_überschriftfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Multiplikativ = new javax.swing.JPanel();
        MoCr_exc_Multiplikativ_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Vigenere = new javax.swing.JPanel();
        MoCr_exc_Vigenere_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_OneTimePad = new javax.swing.JPanel();
        MoCr_exc_OneTimePad_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Spielsprachen = new javax.swing.JPanel();
        MoCr_exc_Spielsprachen_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Codierungen = new javax.swing.JPanel();
        MoCr_exc_Codierungen_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Transpositionen = new javax.swing.JPanel();
        MoCr_exc_Transpositionen_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Steganographie = new javax.swing.JPanel();
        MoCr_exc_Steganographie_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Affine = new javax.swing.JPanel();
        MoCr_exc_Affine_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_überschrift_Default = new javax.swing.JPanel();
        MoCr_exc_Default_überschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_Hilfe = new javax.swing.JButton();


        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        MoCr_Caesar_AufgabeLabel.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        MoCr_Caesar_AufgabeLabel.setText("Aufgabe:");

        MoCr_exc_Caesar_aufgabentext.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        MoCr_exc_Caesar_aufgabentext.setColumns(20);
        MoCr_exc_Caesar_aufgabentext.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        MoCr_exc_Caesar_aufgabentext.setLineWrap(true);
        MoCr_exc_Caesar_aufgabentext.setRows(5);
        MoCr_exc_Caesar_aufgabentext.setWrapStyleWord(true);
        MoCr_exc_Caesar_aufgabentext.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        MoCr_exc_Caesar_aufgabentext.setEnabled(false);
        jScrollPane4.setViewportView(MoCr_exc_Caesar_aufgabentext);

        MoCr_exc_Caesar_anweisung.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        MoCr_exc_Caesar_anweisung.setFont(new java.awt.Font("Constantia", 0, 17)); // NOI18N
        MoCr_exc_Caesar_anweisung.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        MoCr_exc_Caesar_anweisung.setEnabled(false);
        MoCr_exc_Caesar_anweisung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_anweisungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoCr_exc_Caesar_AufgabeLayout = new javax.swing.GroupLayout(MoCr_exc_Caesar_Aufgabe);
        MoCr_exc_Caesar_Aufgabe.setLayout(MoCr_exc_Caesar_AufgabeLayout);
        MoCr_exc_Caesar_AufgabeLayout.setHorizontalGroup(
            MoCr_exc_Caesar_AufgabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_AufgabeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_Caesar_AufgabeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MoCr_exc_Caesar_AufgabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(MoCr_exc_Caesar_anweisung)))
        );
        MoCr_exc_Caesar_AufgabeLayout.setVerticalGroup(
            MoCr_exc_Caesar_AufgabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_AufgabeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MoCr_exc_Caesar_AufgabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MoCr_exc_Caesar_AufgabeLayout.createSequentialGroup()
                        .addComponent(MoCr_Caesar_AufgabeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MoCr_exc_Caesar_AufgabeLayout.createSequentialGroup()
                        .addComponent(MoCr_exc_Caesar_anweisung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))))
        );

        MoCr_exc_Caesar_EingabeLabel.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        MoCr_exc_Caesar_EingabeLabel.setText("Eingabe:");

        MoCr_exc_Caesar_eingabefeld.setColumns(20);
        MoCr_exc_Caesar_eingabefeld.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        MoCr_exc_Caesar_eingabefeld.setLineWrap(true);
        MoCr_exc_Caesar_eingabefeld.setRows(5);
        MoCr_exc_Caesar_eingabefeld.setWrapStyleWord(true);
        jScrollPane2.setViewportView(MoCr_exc_Caesar_eingabefeld);

        MoCr_exc_Caesar_Prüfenknopf.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_Prüfenknopf.setText("Eingabe prüfen");
        MoCr_exc_Caesar_Prüfenknopf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_PrüfenknopfActionPerformed(evt);
            }
        });

        MoCr_exc_Caesar_RichtigFalschAusgabe.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_RichtigFalschAusgabe.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        MoCr_exc_Caesar_RichtigFalschAusgabe.setEnabled(false);
        MoCr_exc_Caesar_RichtigFalschAusgabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoCr_exc_Caesar_EingabeLayout = new javax.swing.GroupLayout(MoCr_exc_Caesar_Eingabe);
        MoCr_exc_Caesar_Eingabe.setLayout(MoCr_exc_Caesar_EingabeLayout);
        MoCr_exc_Caesar_EingabeLayout.setHorizontalGroup(
            MoCr_exc_Caesar_EingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_Caesar_EingabeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Caesar_EingabeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MoCr_exc_Caesar_EingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MoCr_exc_Caesar_EingabeLayout.createSequentialGroup()
                        .addComponent(MoCr_exc_Caesar_Prüfenknopf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoCr_exc_Caesar_RichtigFalschAusgabe, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        MoCr_exc_Caesar_EingabeLayout.setVerticalGroup(
            MoCr_exc_Caesar_EingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_EingabeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(MoCr_exc_Caesar_EingabeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MoCr_exc_Caesar_EingabeLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MoCr_exc_Caesar_EingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MoCr_exc_Caesar_Prüfenknopf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoCr_exc_Caesar_RichtigFalschAusgabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MoCr_exc_Caesar_LösungButton.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_LösungButton.setText("Lösung anzeigen");
        MoCr_exc_Caesar_LösungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_LösungButtonActionPerformed(evt);
            }
        });

        MoCr_exc_Caesar_Lösungsanzeige.setEditable(false);
        MoCr_exc_Caesar_Lösungsanzeige.setColumns(20);
        MoCr_exc_Caesar_Lösungsanzeige.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        MoCr_exc_Caesar_Lösungsanzeige.setLineWrap(true);
        MoCr_exc_Caesar_Lösungsanzeige.setRows(5);
        MoCr_exc_Caesar_Lösungsanzeige.setWrapStyleWord(true);
        jScrollPane1.setViewportView(MoCr_exc_Caesar_Lösungsanzeige);

        javax.swing.GroupLayout MoCr_exc_Caesar_LoesungLayout = new javax.swing.GroupLayout(MoCr_exc_Caesar_Loesung);
        MoCr_exc_Caesar_Loesung.setLayout(MoCr_exc_Caesar_LoesungLayout);
        MoCr_exc_Caesar_LoesungLayout.setHorizontalGroup(
            MoCr_exc_Caesar_LoesungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_LoesungLayout.createSequentialGroup()
                .addComponent(MoCr_exc_Caesar_LösungButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
        );
        MoCr_exc_Caesar_LoesungLayout.setVerticalGroup(
            MoCr_exc_Caesar_LoesungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_LoesungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoCr_exc_Caesar_LoesungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addGroup(MoCr_exc_Caesar_LoesungLayout.createSequentialGroup()
                        .addComponent(MoCr_exc_Caesar_LösungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        MoCr_exc_Caesar_Weiterschaltknopf.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_Weiterschaltknopf.setText("Nächste Aufgabe");
        MoCr_exc_Caesar_Weiterschaltknopf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_WeiterschaltknopfActionPerformed(evt);
            }
        });

        MoCr_exc_überschrift.setLayout(new java.awt.CardLayout());

        MoCr_exc_Caesar_überschriftfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Caesar_überschriftfenster.setText("Übungsaufgaben zu Caesar");

        javax.swing.GroupLayout MoCr_exc_überschrift_CaesarLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Caesar);
        MoCr_exc_überschrift_Caesar.setLayout(MoCr_exc_überschrift_CaesarLayout);
        MoCr_exc_überschrift_CaesarLayout.setHorizontalGroup(
            MoCr_exc_überschrift_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_CaesarLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(MoCr_exc_Caesar_überschriftfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MoCr_exc_überschrift_CaesarLayout.setVerticalGroup(
            MoCr_exc_überschrift_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_CaesarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Caesar_überschriftfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Caesar, "card2");

        MoCr_exc_Multiplikativ_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Multiplikativ_überschriftenfenster.setText("Übungsaufgaben zu Multiplikativ");

        javax.swing.GroupLayout MoCr_exc_überschrift_MultiplikativLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Multiplikativ);
        MoCr_exc_überschrift_Multiplikativ.setLayout(MoCr_exc_überschrift_MultiplikativLayout);
        MoCr_exc_überschrift_MultiplikativLayout.setHorizontalGroup(
            MoCr_exc_überschrift_MultiplikativLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_MultiplikativLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Multiplikativ_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        MoCr_exc_überschrift_MultiplikativLayout.setVerticalGroup(
            MoCr_exc_überschrift_MultiplikativLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MoCr_exc_Multiplikativ_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Multiplikativ, "card3");

        MoCr_exc_Vigenere_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Vigenere_überschriftenfenster.setText("Übungsaufgaben zu Vigenere");

        javax.swing.GroupLayout MoCr_exc_überschrift_VigenereLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Vigenere);
        MoCr_exc_überschrift_Vigenere.setLayout(MoCr_exc_überschrift_VigenereLayout);
        MoCr_exc_überschrift_VigenereLayout.setHorizontalGroup(
            MoCr_exc_überschrift_VigenereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_VigenereLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Vigenere_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        MoCr_exc_überschrift_VigenereLayout.setVerticalGroup(
            MoCr_exc_überschrift_VigenereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_VigenereLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Vigenere_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Vigenere, "card4");

        MoCr_exc_OneTimePad_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_OneTimePad_überschriftenfenster.setText("Übungsaufgaben zu One Time Pad");

        javax.swing.GroupLayout MoCr_exc_überschrift_OneTimePadLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_OneTimePad);
        MoCr_exc_überschrift_OneTimePad.setLayout(MoCr_exc_überschrift_OneTimePadLayout);
        MoCr_exc_überschrift_OneTimePadLayout.setHorizontalGroup(
            MoCr_exc_überschrift_OneTimePadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_OneTimePadLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(MoCr_exc_OneTimePad_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        MoCr_exc_überschrift_OneTimePadLayout.setVerticalGroup(
            MoCr_exc_überschrift_OneTimePadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_OneTimePadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_OneTimePad_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_OneTimePad, "card5");

        MoCr_exc_Spielsprachen_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Spielsprachen_überschriftenfenster.setText("Übungsaufgaben zu Spielsprachen");

        javax.swing.GroupLayout MoCr_exc_überschrift_SpielsprachenLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Spielsprachen);
        MoCr_exc_überschrift_Spielsprachen.setLayout(MoCr_exc_überschrift_SpielsprachenLayout);
        MoCr_exc_überschrift_SpielsprachenLayout.setHorizontalGroup(
            MoCr_exc_überschrift_SpielsprachenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_SpielsprachenLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Spielsprachen_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        MoCr_exc_überschrift_SpielsprachenLayout.setVerticalGroup(
            MoCr_exc_überschrift_SpielsprachenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_SpielsprachenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Spielsprachen_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Spielsprachen, "card6");

        MoCr_exc_Codierungen_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Codierungen_überschriftenfenster.setText("Übungsafugaben zu Codierungen");

        javax.swing.GroupLayout MoCr_exc_überschrift_CodierungenLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Codierungen);
        MoCr_exc_überschrift_Codierungen.setLayout(MoCr_exc_überschrift_CodierungenLayout);
        MoCr_exc_überschrift_CodierungenLayout.setHorizontalGroup(
            MoCr_exc_überschrift_CodierungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_CodierungenLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Codierungen_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        MoCr_exc_überschrift_CodierungenLayout.setVerticalGroup(
            MoCr_exc_überschrift_CodierungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_CodierungenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Codierungen_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Codierungen, "card7");

        MoCr_exc_Transpositionen_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Transpositionen_überschriftenfenster.setText("Übungsaufgaben zu Transpositionen");

        javax.swing.GroupLayout MoCr_exc_überschrift_TranspositionenLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Transpositionen);
        MoCr_exc_überschrift_Transpositionen.setLayout(MoCr_exc_überschrift_TranspositionenLayout);
        MoCr_exc_überschrift_TranspositionenLayout.setHorizontalGroup(
            MoCr_exc_überschrift_TranspositionenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_TranspositionenLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(MoCr_exc_Transpositionen_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        MoCr_exc_überschrift_TranspositionenLayout.setVerticalGroup(
            MoCr_exc_überschrift_TranspositionenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_TranspositionenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Transpositionen_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Transpositionen, "card8");

        MoCr_exc_Steganographie_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Steganographie_überschriftenfenster.setText("Übungsaufgaben zu Bacon");

        javax.swing.GroupLayout MoCr_exc_überschrift_SteganographieLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Steganographie);
        MoCr_exc_überschrift_Steganographie.setLayout(MoCr_exc_überschrift_SteganographieLayout);
        MoCr_exc_überschrift_SteganographieLayout.setHorizontalGroup(
            MoCr_exc_überschrift_SteganographieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_SteganographieLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Steganographie_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        MoCr_exc_überschrift_SteganographieLayout.setVerticalGroup(
            MoCr_exc_überschrift_SteganographieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_SteganographieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Steganographie_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Steganographie, "card9");

        MoCr_exc_Affine_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Affine_überschriftenfenster.setText("Übungsaufgaben zu Affine");

        javax.swing.GroupLayout MoCr_exc_überschrift_AffineLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Affine);
        MoCr_exc_überschrift_Affine.setLayout(MoCr_exc_überschrift_AffineLayout);
        MoCr_exc_überschrift_AffineLayout.setHorizontalGroup(
            MoCr_exc_überschrift_AffineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_überschrift_AffineLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Affine_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        MoCr_exc_überschrift_AffineLayout.setVerticalGroup(
            MoCr_exc_überschrift_AffineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_AffineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Affine_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Affine, "card10");
        MoCr_exc_Default_überschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Default_überschriftenfenster.setText("Für diese Verschlüsselung existiert kein Übungsfenster");

        javax.swing.GroupLayout MoCr_exc_überschrift_DefaultLayout = new javax.swing.GroupLayout(MoCr_exc_überschrift_Default);
        MoCr_exc_überschrift_Default.setLayout(MoCr_exc_überschrift_DefaultLayout);
        MoCr_exc_überschrift_DefaultLayout.setHorizontalGroup(
            MoCr_exc_überschrift_DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_DefaultLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MoCr_exc_Default_überschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        MoCr_exc_überschrift_DefaultLayout.setVerticalGroup(
            MoCr_exc_überschrift_DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_überschrift_DefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Default_überschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_überschrift.add(MoCr_exc_überschrift_Default, "card11");

        MoCr_exc_Hilfe.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Hilfe.setText("Hilfe");
        MoCr_exc_Hilfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_HilfeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoCr_exc_CaesarLayout = new javax.swing.GroupLayout(MoCr_exc_Caesar);
        MoCr_exc_Caesar.setLayout(MoCr_exc_CaesarLayout);
        MoCr_exc_CaesarLayout.setHorizontalGroup(
            MoCr_exc_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_CaesarLayout.createSequentialGroup()
                .addComponent(MoCr_exc_Caesar_Aufgabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoCr_exc_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MoCr_exc_Caesar_Weiterschaltknopf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_exc_Hilfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(MoCr_exc_Caesar_Eingabe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoCr_exc_Caesar_Loesung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoCr_exc_überschrift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MoCr_exc_CaesarLayout.setVerticalGroup(
            MoCr_exc_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_CaesarLayout.createSequentialGroup()
                .addComponent(MoCr_exc_überschrift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MoCr_exc_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(MoCr_exc_CaesarLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(MoCr_exc_Caesar_Aufgabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MoCr_exc_CaesarLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(MoCr_exc_Caesar_Weiterschaltknopf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MoCr_exc_Hilfe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(MoCr_exc_Caesar_Eingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_exc_Caesar_Loesung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Caesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Caesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoCr_exc_Caesar_WeiterschaltknopfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_WeiterschaltknopfActionPerformed
        // TODO add your handling code here:
        NaechsteAufgabe();
        MoCr_exc_Caesar_Lösungsanzeige.setText("");
        MoCr_exc_Caesar_eingabefeld.setText("");
        MoCr_exc_Caesar_RichtigFalschAusgabe.setText("");
    }//GEN-LAST:event_MoCr_exc_Caesar_WeiterschaltknopfActionPerformed

    private void MoCr_exc_Caesar_LösungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_LösungButtonActionPerformed
        // TODO add your handling code here:
        MoCr_exc_Caesar_Lösungsanzeige.setText(excLogic.LösungGenerieren());
    }//GEN-LAST:event_MoCr_exc_Caesar_LösungButtonActionPerformed

    private void MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed

    private void MoCr_exc_Caesar_PrüfenknopfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_PrüfenknopfActionPerformed
        // TODO add your handling code here:
        if(excLogic.EingabePrüfen(MoCr_exc_Caesar_eingabefeld.getText()))
        {
            MoCr_exc_Caesar_RichtigFalschAusgabe.setText("richtig");
            MoCr_exc_Caesar_Lösungsanzeige.setText(excLogic.LösungGenerieren());
        }
        else
        {
            MoCr_exc_Caesar_RichtigFalschAusgabe.setText("falsch");
        }
    }//GEN-LAST:event_MoCr_exc_Caesar_PrüfenknopfActionPerformed

    private void MoCr_exc_Caesar_anweisungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_anweisungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoCr_exc_Caesar_anweisungActionPerformed

    private void MoCr_exc_HilfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_HilfeActionPerformed
        localSupport.refreshSupport();
    }//GEN-LAST:event_MoCr_exc_HilfeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_exc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_exc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_exc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_exc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoCr_Frame_exc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MoCr_Caesar_AufgabeLabel;
    private javax.swing.JLabel MoCr_exc_Affine_überschriftenfenster;
    private javax.swing.JPanel MoCr_exc_Caesar;
    private javax.swing.JPanel MoCr_exc_Caesar_Aufgabe;
    private javax.swing.JPanel MoCr_exc_Caesar_Eingabe;
    private javax.swing.JLabel MoCr_exc_Caesar_EingabeLabel;
    private javax.swing.JPanel MoCr_exc_Caesar_Loesung;
    private javax.swing.JButton MoCr_exc_Caesar_LösungButton;
    private javax.swing.JTextArea MoCr_exc_Caesar_Lösungsanzeige;
    private javax.swing.JButton MoCr_exc_Caesar_Prüfenknopf;
    private javax.swing.JTextField MoCr_exc_Caesar_RichtigFalschAusgabe;
    private javax.swing.JButton MoCr_exc_Caesar_Weiterschaltknopf;
    private javax.swing.JTextField MoCr_exc_Caesar_anweisung;
    private javax.swing.JTextArea MoCr_exc_Caesar_aufgabentext;
    private javax.swing.JTextArea MoCr_exc_Caesar_eingabefeld;
    private javax.swing.JLabel MoCr_exc_Caesar_überschriftfenster;
    private javax.swing.JLabel MoCr_exc_Codierungen_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Default_überschriftenfenster;
    private javax.swing.JButton MoCr_exc_Hilfe;
    private javax.swing.JLabel MoCr_exc_Multiplikativ_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_OneTimePad_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Spielsprachen_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Steganographie_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Transpositionen_überschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Vigenere_überschriftenfenster;
    private javax.swing.JPanel MoCr_exc_überschrift;
    private javax.swing.JPanel MoCr_exc_überschrift_Affine;
    private javax.swing.JPanel MoCr_exc_überschrift_Caesar;
    private javax.swing.JPanel MoCr_exc_überschrift_Codierungen;
    private javax.swing.JPanel MoCr_exc_überschrift_Default;
    private javax.swing.JPanel MoCr_exc_überschrift_Multiplikativ;
    private javax.swing.JPanel MoCr_exc_überschrift_OneTimePad;
    private javax.swing.JPanel MoCr_exc_überschrift_Spielsprachen;
    private javax.swing.JPanel MoCr_exc_überschrift_Steganographie;
    private javax.swing.JPanel MoCr_exc_überschrift_Transpositionen;
    private javax.swing.JPanel MoCr_exc_überschrift_Vigenere;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
