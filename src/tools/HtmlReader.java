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
       File file = new File(DidMed.rightDidPath(z, fromMainmode)); // !!EINFÜGEN!!
       Entity.setPage(file.toURI().toURL());
     }
     catch (IOException e) {
       Entity.setContentType("text/html");
       Entity.setText("<html>Could not load page");
     }    
  }

}
