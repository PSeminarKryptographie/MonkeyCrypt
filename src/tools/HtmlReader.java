package tools;
import java.io.*;

public class HtmlReader {
    
    javax.swing.JEditorPane Entity;
    static DidMediator DidMed = new DidMediator();
    
    public HtmlReader(javax.swing.JEditorPane l) {
        Entity = l;
    }
    

  public void insertHTML(int z, boolean fromMainmode) {                
     try {
       Entity.setPage(getClass().getResource(DidMed.rightDidPath(z, fromMainmode)));
     }
     catch (IOException e) {
       Entity.setContentType("text/html");
       Entity.setText("<html>Could not load page");
     }    
  }

}
