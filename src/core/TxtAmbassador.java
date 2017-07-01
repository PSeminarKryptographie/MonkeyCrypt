/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.io.*;
/**
 *
 * @author Jonas
 */
public class TxtAmbassador {
    
    public static SupMediator med = new SupMediator();
    //liest systemabhängigen Umbruch aus und gibt diesen aus
    public String getLineSeparator() {
        String lineSeparator = System.getProperty("line.separator");
        return lineSeparator;
    }

    public void readSupTxt(javax.swing.JTextArea area, int e, int c) {
        String path = med.selectSupTxt(e, c);
        String out = readTxt(path);
        area.setText(out);
        
    }
    
    public String readTxt(String path) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            boolean notempty = true;
            String out = "";
        
            while(notempty == true) {
                String line = br.readLine();
                if(line == null) {
                    notempty = false;
                }
                else {
                    out = new StringBuffer(out).append(line).toString();
                    out += getLineSeparator();
                }
            }
            br.close();
            return out;
        } catch(Exception d) {return "error";}
    }
    
    public int getTxtLength(String n) {
        return 0;
    }
}
