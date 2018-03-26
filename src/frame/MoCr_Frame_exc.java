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
        VerschluesselungSetzen(2);
    }
    
    public void refresh(int n) {
        this.VerschluesselungSetzen(n);
        this.setVisible(true);        
    }
    
    
    //Setzt das Fenster in die richtige Verschluesselung
    void VerschluesselungSetzen(int n)
    {
        excLogic.VerschluesselungSetzen(n);
        MoCr_exc_Caesar_eingabefeld.setText("");
        MoCr_exc_Caesar_Loesungsanzeige.setText("");
        MoCr_exc_Caesar_RichtigFalschAusgabe.setText("");
        
        MoCr_exc_ueberschrift.removeAll();
        switch(n)
        {
            case 0:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Caesar);
                break;
            case 1:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Multiplikativ);
                break;
            case 2:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Vigenere);
                break;
            case 3:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_OneTimePad);
                break;
            case 4:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Transpositionen);
                break;
            case 5:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Codierungen);
                break;
            case 6:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Spielsprachen);
                break;
            case 8:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Steganographie);
                break;
            case 9:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Affine);
                break;
            default:
                MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Default);
                excLogic.VerschluesselungSetzen(10);
                MoCr_exc_Caesar_aufgabentext.setText("Fuer diese Verschluesselung existiert leider kein uebungsfenster");
                break;
        }
        MoCr_exc_ueberschrift.repaint();
        MoCr_exc_ueberschrift.revalidate();
        NaechsteAufgabe();
    }
    
    
    
    void NaechsteAufgabe()
    {
        excLogic.AufgabeWeiterschalten();
        if(excLogic.aufgabentypGeben() == 1) 
        {
            MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text:");
            if(excLogic.verschluesselungsNummerGeben() != 0)
            {
                switch(excLogic.verschluesselungGeben())
                {
                    case 4:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                    case 5:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Morse");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Ascii");
                               break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Binaercode");
                                break;
                            case 4:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Hexadezimalcode");
                                break;
                            case 5:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Alphabetindex-Code");
                                break;
                            case 6:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text im Bustabieralphabet");
                                break;
                        }
                        break; 
                    case 6:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Bisprache");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Bobsprache");
                                break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Verschluessele folgenden Text in Loeffelsprache");
                                break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText(excLogic.anweisungstextGeben());
            if(excLogic.verschluesselungstypGeben() == 1)
            {
                MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Schluessel: " + excLogic.schluesselGeben());
            }
        }
        else if(excLogic.aufgabentypGeben() == 2)
        {
            MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text:");
            
            if(excLogic.verschluesselungsNummerGeben() != 0)
            {
                switch(excLogic.verschluesselungGeben())
                {
                    case 4:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                    case 5:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden MorseCode");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Ascii");
                               break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Entschluesselde folgenden Text in Binaercode");
                                break;
                            case 4:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Hexadezimalcode");
                                break;
                            case 5:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Alphabetindex-Code");
                                break;
                            case 6:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text im Bustabieralphabet");
                                break;
                        }
                        break;
                    case 6:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Bisprache");
                                break;
                            case 2:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Bobsprache");
                                break;
                            case 3:
                                MoCr_exc_Caesar_anweisung.setText("Entschluessele folgenden Text in Loeffelsprache");
                                break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText(excLogic.LoesungGeben());
            if(excLogic.verschluesselungstypGeben() == 1)
            {
                MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Schluessel: " + excLogic.schluesselGeben());
            }
        }
        else if(excLogic.aufgabentypGeben() == 3)
        {
            MoCr_exc_Caesar_anweisung.setText("Finde den Schluessel");
            if(excLogic.verschluesselungsNummerGeben() != 0)
            {
                switch(excLogic.verschluesselungGeben())
                {
                    case 4:
                        switch(excLogic.verschluesselungsNummerGeben())
                        {
                            case 1:
                                 MoCr_exc_Caesar_anweisung.setText("Finde den Schluessel der Spaltentransposition");
                                 break;
                            case 2:
                                 MoCr_exc_Caesar_anweisung.setText("Finde den Schluessel der Gartenzaun-Transposition");
                                 break;
                        }
                        break;
                }
            }
            MoCr_exc_Caesar_aufgabentext.setText("Text: " + excLogic.anweisungstextGeben());
            MoCr_exc_Caesar_aufgabentext.append("\n" + "\n" + "Verschluesselter Text:  " + excLogic.LoesungGeben());
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
        MoCr_exc_Caesar_Pruefenknopf = new javax.swing.JButton();
        MoCr_exc_Caesar_RichtigFalschAusgabe = new javax.swing.JTextField();
        MoCr_exc_Caesar_Loesung = new javax.swing.JPanel();
        MoCr_exc_Caesar_LoesungButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MoCr_exc_Caesar_Loesungsanzeige = new javax.swing.JTextArea();
        MoCr_exc_Caesar_Weiterschaltknopf = new javax.swing.JButton();
        MoCr_exc_ueberschrift = new javax.swing.JPanel();
        MoCr_exc_ueberschrift_Caesar = new javax.swing.JPanel();
        MoCr_exc_Caesar_ueberschriftfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Multiplikativ = new javax.swing.JPanel();
        MoCr_exc_Multiplikativ_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Vigenere = new javax.swing.JPanel();
        MoCr_exc_Vigenere_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_OneTimePad = new javax.swing.JPanel();
        MoCr_exc_OneTimePad_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Spielsprachen = new javax.swing.JPanel();
        MoCr_exc_Spielsprachen_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Codierungen = new javax.swing.JPanel();
        MoCr_exc_Codierungen_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Transpositionen = new javax.swing.JPanel();
        MoCr_exc_Transpositionen_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Steganographie = new javax.swing.JPanel();
        MoCr_exc_Steganographie_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Affine = new javax.swing.JPanel();
        MoCr_exc_Affine_ueberschriftenfenster = new javax.swing.JLabel();
        MoCr_exc_ueberschrift_Default = new javax.swing.JPanel();
        MoCr_exc_Default_ueberschriftenfenster = new javax.swing.JLabel();
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

        MoCr_exc_Caesar_Pruefenknopf.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_Pruefenknopf.setText("Eingabe pruefen");
        MoCr_exc_Caesar_Pruefenknopf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_PruefenknopfActionPerformed(evt);
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
                        .addComponent(MoCr_exc_Caesar_Pruefenknopf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(MoCr_exc_Caesar_Pruefenknopf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoCr_exc_Caesar_RichtigFalschAusgabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MoCr_exc_Caesar_LoesungButton.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_LoesungButton.setText("Loesung anzeigen");
        MoCr_exc_Caesar_LoesungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_LoesungButtonActionPerformed(evt);
            }
        });

        MoCr_exc_Caesar_Loesungsanzeige.setEditable(false);
        MoCr_exc_Caesar_Loesungsanzeige.setColumns(20);
        MoCr_exc_Caesar_Loesungsanzeige.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        MoCr_exc_Caesar_Loesungsanzeige.setLineWrap(true);
        MoCr_exc_Caesar_Loesungsanzeige.setRows(5);
        MoCr_exc_Caesar_Loesungsanzeige.setWrapStyleWord(true);
        jScrollPane1.setViewportView(MoCr_exc_Caesar_Loesungsanzeige);

        javax.swing.GroupLayout MoCr_exc_Caesar_LoesungLayout = new javax.swing.GroupLayout(MoCr_exc_Caesar_Loesung);
        MoCr_exc_Caesar_Loesung.setLayout(MoCr_exc_Caesar_LoesungLayout);
        MoCr_exc_Caesar_LoesungLayout.setHorizontalGroup(
            MoCr_exc_Caesar_LoesungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_Caesar_LoesungLayout.createSequentialGroup()
                .addComponent(MoCr_exc_Caesar_LoesungButton)
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
                        .addComponent(MoCr_exc_Caesar_LoesungButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        MoCr_exc_Caesar_Weiterschaltknopf.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_exc_Caesar_Weiterschaltknopf.setText("Naechste Aufgabe");
        MoCr_exc_Caesar_Weiterschaltknopf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoCr_exc_Caesar_WeiterschaltknopfActionPerformed(evt);
            }
        });

        MoCr_exc_ueberschrift.setLayout(new java.awt.CardLayout());

        MoCr_exc_Caesar_ueberschriftfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Caesar_ueberschriftfenster.setText("uebungsaufgaben zu Caesar");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_CaesarLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Caesar);
        MoCr_exc_ueberschrift_Caesar.setLayout(MoCr_exc_ueberschrift_CaesarLayout);
        MoCr_exc_ueberschrift_CaesarLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_CaesarLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(MoCr_exc_Caesar_ueberschriftfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MoCr_exc_ueberschrift_CaesarLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_CaesarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Caesar_ueberschriftfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Caesar, "card2");

        MoCr_exc_Multiplikativ_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Multiplikativ_ueberschriftenfenster.setText("uebungsaufgaben zu Multiplikativ");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_MultiplikativLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Multiplikativ);
        MoCr_exc_ueberschrift_Multiplikativ.setLayout(MoCr_exc_ueberschrift_MultiplikativLayout);
        MoCr_exc_ueberschrift_MultiplikativLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_MultiplikativLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_MultiplikativLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Multiplikativ_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        MoCr_exc_ueberschrift_MultiplikativLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_MultiplikativLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MoCr_exc_Multiplikativ_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Multiplikativ, "card3");

        MoCr_exc_Vigenere_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Vigenere_ueberschriftenfenster.setText("uebungsaufgaben zu Vigenere");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_VigenereLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Vigenere);
        MoCr_exc_ueberschrift_Vigenere.setLayout(MoCr_exc_ueberschrift_VigenereLayout);
        MoCr_exc_ueberschrift_VigenereLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_VigenereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_VigenereLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Vigenere_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        MoCr_exc_ueberschrift_VigenereLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_VigenereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_VigenereLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Vigenere_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Vigenere, "card4");

        MoCr_exc_OneTimePad_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_OneTimePad_ueberschriftenfenster.setText("uebungsaufgaben zu One Time Pad");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_OneTimePadLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_OneTimePad);
        MoCr_exc_ueberschrift_OneTimePad.setLayout(MoCr_exc_ueberschrift_OneTimePadLayout);
        MoCr_exc_ueberschrift_OneTimePadLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_OneTimePadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_OneTimePadLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(MoCr_exc_OneTimePad_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        MoCr_exc_ueberschrift_OneTimePadLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_OneTimePadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_OneTimePadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_OneTimePad_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_OneTimePad, "card5");

        MoCr_exc_Spielsprachen_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Spielsprachen_ueberschriftenfenster.setText("uebungsaufgaben zu Spielsprachen");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_SpielsprachenLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Spielsprachen);
        MoCr_exc_ueberschrift_Spielsprachen.setLayout(MoCr_exc_ueberschrift_SpielsprachenLayout);
        MoCr_exc_ueberschrift_SpielsprachenLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_SpielsprachenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_SpielsprachenLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Spielsprachen_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        MoCr_exc_ueberschrift_SpielsprachenLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_SpielsprachenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_SpielsprachenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Spielsprachen_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Spielsprachen, "card6");

        MoCr_exc_Codierungen_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Codierungen_ueberschriftenfenster.setText("uebungsafugaben zu Codierungen");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_CodierungenLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Codierungen);
        MoCr_exc_ueberschrift_Codierungen.setLayout(MoCr_exc_ueberschrift_CodierungenLayout);
        MoCr_exc_ueberschrift_CodierungenLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_CodierungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_CodierungenLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Codierungen_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        MoCr_exc_ueberschrift_CodierungenLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_CodierungenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_CodierungenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Codierungen_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Codierungen, "card7");

        MoCr_exc_Transpositionen_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Transpositionen_ueberschriftenfenster.setText("uebungsaufgaben zu Transpositionen");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_TranspositionenLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Transpositionen);
        MoCr_exc_ueberschrift_Transpositionen.setLayout(MoCr_exc_ueberschrift_TranspositionenLayout);
        MoCr_exc_ueberschrift_TranspositionenLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_TranspositionenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_TranspositionenLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(MoCr_exc_Transpositionen_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        MoCr_exc_ueberschrift_TranspositionenLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_TranspositionenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_TranspositionenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Transpositionen_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Transpositionen, "card8");

        MoCr_exc_Steganographie_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Steganographie_ueberschriftenfenster.setText("uebungsaufgaben zu Bacon");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_SteganographieLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Steganographie);
        MoCr_exc_ueberschrift_Steganographie.setLayout(MoCr_exc_ueberschrift_SteganographieLayout);
        MoCr_exc_ueberschrift_SteganographieLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_SteganographieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_SteganographieLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Steganographie_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        MoCr_exc_ueberschrift_SteganographieLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_SteganographieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_SteganographieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Steganographie_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Steganographie, "card9");

        MoCr_exc_Affine_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Affine_ueberschriftenfenster.setText("uebungsaufgaben zu Affine");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_AffineLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Affine);
        MoCr_exc_ueberschrift_Affine.setLayout(MoCr_exc_ueberschrift_AffineLayout);
        MoCr_exc_ueberschrift_AffineLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_AffineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoCr_exc_ueberschrift_AffineLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(MoCr_exc_Affine_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        MoCr_exc_ueberschrift_AffineLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_AffineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_AffineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Affine_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Affine, "card10");

        MoCr_exc_Default_ueberschriftenfenster.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        MoCr_exc_Default_ueberschriftenfenster.setText("Fuer diese Verschluesselung existiert kein uebungsfenster");

        javax.swing.GroupLayout MoCr_exc_ueberschrift_DefaultLayout = new javax.swing.GroupLayout(MoCr_exc_ueberschrift_Default);
        MoCr_exc_ueberschrift_Default.setLayout(MoCr_exc_ueberschrift_DefaultLayout);
        MoCr_exc_ueberschrift_DefaultLayout.setHorizontalGroup(
            MoCr_exc_ueberschrift_DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_DefaultLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(MoCr_exc_Default_ueberschriftenfenster, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        MoCr_exc_ueberschrift_DefaultLayout.setVerticalGroup(
            MoCr_exc_ueberschrift_DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_ueberschrift_DefaultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_exc_Default_ueberschriftenfenster, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        MoCr_exc_ueberschrift.add(MoCr_exc_ueberschrift_Default, "card11");

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
            .addComponent(MoCr_exc_ueberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MoCr_exc_CaesarLayout.setVerticalGroup(
            MoCr_exc_CaesarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoCr_exc_CaesarLayout.createSequentialGroup()
                .addComponent(MoCr_exc_ueberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        MoCr_exc_Caesar_Loesungsanzeige.setText("");
        MoCr_exc_Caesar_eingabefeld.setText("");
        MoCr_exc_Caesar_RichtigFalschAusgabe.setText("");
    }//GEN-LAST:event_MoCr_exc_Caesar_WeiterschaltknopfActionPerformed

    private void MoCr_exc_Caesar_LoesungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_LoesungButtonActionPerformed
        // TODO add your handling code here:
        MoCr_exc_Caesar_Loesungsanzeige.setText(excLogic.LoesungGenerieren());
    }//GEN-LAST:event_MoCr_exc_Caesar_LoesungButtonActionPerformed

    private void MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoCr_exc_Caesar_RichtigFalschAusgabeActionPerformed

    private void MoCr_exc_Caesar_PruefenknopfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoCr_exc_Caesar_PruefenknopfActionPerformed
        // TODO add your handling code here:
        if(excLogic.EingabePruefen(MoCr_exc_Caesar_eingabefeld.getText()))
        {
            MoCr_exc_Caesar_RichtigFalschAusgabe.setText("richtig");
            MoCr_exc_Caesar_Loesungsanzeige.setText(excLogic.LoesungGenerieren());
        }
        else
        {
            MoCr_exc_Caesar_RichtigFalschAusgabe.setText("falsch");
        }
    }//GEN-LAST:event_MoCr_exc_Caesar_PruefenknopfActionPerformed

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
    private javax.swing.JLabel MoCr_exc_Affine_ueberschriftenfenster;
    private javax.swing.JPanel MoCr_exc_Caesar;
    private javax.swing.JPanel MoCr_exc_Caesar_Aufgabe;
    private javax.swing.JPanel MoCr_exc_Caesar_Eingabe;
    private javax.swing.JLabel MoCr_exc_Caesar_EingabeLabel;
    private javax.swing.JPanel MoCr_exc_Caesar_Loesung;
    private javax.swing.JButton MoCr_exc_Caesar_LoesungButton;
    private javax.swing.JTextArea MoCr_exc_Caesar_Loesungsanzeige;
    private javax.swing.JButton MoCr_exc_Caesar_Pruefenknopf;
    private javax.swing.JTextField MoCr_exc_Caesar_RichtigFalschAusgabe;
    private javax.swing.JButton MoCr_exc_Caesar_Weiterschaltknopf;
    private javax.swing.JTextField MoCr_exc_Caesar_anweisung;
    private javax.swing.JTextArea MoCr_exc_Caesar_aufgabentext;
    private javax.swing.JTextArea MoCr_exc_Caesar_eingabefeld;
    private javax.swing.JLabel MoCr_exc_Caesar_ueberschriftfenster;
    private javax.swing.JLabel MoCr_exc_Codierungen_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Default_ueberschriftenfenster;
    private javax.swing.JButton MoCr_exc_Hilfe;
    private javax.swing.JLabel MoCr_exc_Multiplikativ_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_OneTimePad_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Spielsprachen_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Steganographie_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Transpositionen_ueberschriftenfenster;
    private javax.swing.JLabel MoCr_exc_Vigenere_ueberschriftenfenster;
    private javax.swing.JPanel MoCr_exc_ueberschrift;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Affine;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Caesar;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Codierungen;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Default;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Multiplikativ;
    private javax.swing.JPanel MoCr_exc_ueberschrift_OneTimePad;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Spielsprachen;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Steganographie;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Transpositionen;
    private javax.swing.JPanel MoCr_exc_ueberschrift_Vigenere;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
