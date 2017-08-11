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
    public String ADFGX_SpecialCheck(javax.swing.JTable internTable) {
                int r = internTable.getRowCount();
                int c = internTable.getColumnCount();
                String out = "";
                String testable = "";
        
                for(int i = 0; i < r; i++){
                    for(int w = 1; w < c; w++){
                        try{
                            testable = internTable.getValueAt(i, w).toString();
                
                            if(testable.length() == 1){    
                                out = new StringBuffer(out).append(testable).toString();
                            }
                        }
                        catch(Exception e) {}
                    }
                }     
        return out;
    }
        
    public void writeTable(javax.swing.JTable internTable, String in){
        int r = internTable.getRowCount();
        int c = internTable.getColumnCount();
        int counter = 0;
        for(int i = 0; i < r; i++){           
            for(int w = 1; w < c; w++){
                String nov = in.valueOf(in.charAt(counter));
                internTable.setValueAt(nov, i, w);
                counter = counter + 1;
            }
        }
    }
    
    public void clearTable(javax.swing.JTable internTable, int mis){
        int r = internTable.getRowCount();
        int c = internTable.getColumnCount();
        for(int i = 0; i < r; i++){           
            for(int w = mis; w < c; w++){
                internTable.setValueAt("", i, w);
            }
        }
    }
            
    public String dismantleJTable(javax.swing.JTable internTable, int mis){
        int r = internTable.getRowCount();
        int c = internTable.getColumnCount();
        String out = "";
        boolean correctInput = verifyInput(internTable, mis);
        
        if(correctInput == true) {
        for(int i = 0; i < r; i++){
            for(int w = mis; w < c; w++){
               out = new StringBuffer(out).append(internTable.getValueAt(i, w)).toString();
            }
        }
        return out;
        }
        else {
            return "F";
        }
    }
    
    public boolean verifyInput(javax.swing.JTable internTable, int mis) {
        try {
        int r = internTable.getRowCount();
        int c = internTable.getColumnCount();
        boolean correctInput = true;
        
        for(int i = 0; i < r; i++){
            for(int w = mis; w < c; w++){
               String cell = internTable.getValueAt(i, w).toString();
               if(cell.length() != 1) {
                   correctInput = false;
               }
            }
        }
        
        return correctInput;
        } catch(Exception e) {return false;}
    }
    
    
    public String createFunction(String c) {
        if(c.length() == 2) {
            String out = tools.getPositionOfElement(c.valueOf(c.charAt(0))) + "*x + " + tools.getPositionOfElement(c.valueOf(c.charAt(1)));
            return out;
        }
        else {
            return "error";
        }
    }
    
    public void alterJTable(javax.swing.JTable t, int l) {
        t.setModel(new DefaultTableModel(l, l));
    }
}
