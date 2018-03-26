package frame;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class DrawTable extends JFrame
{
    public DrawTable(String firstrow, String secondrow, String title, String key) {
    	 
    	 String [] column = new String [firstrow.length()];
    	 Object [] array1 = new Object [secondrow.length()];
    	 Object [] array2 = new Object [secondrow.length()];
    	 for (int i = 0; i<array1.length; i++) {
    		 column[i] = String.valueOf(firstrow.charAt(i));
    		 array2[i] = secondrow.charAt(i);
    		 array1[i] = firstrow.charAt(i);
    	 }
    	 Object[][] data =  new Object[][]{array1, array2};
          
         //create table with data
         JTable table = new JTable(data, array1);
         table.setTableHeader(null);
         //add the table to the frame
         
         JScrollPane j = new JScrollPane(table);
         this.setLayout(new GridLayout(2, 0));
         this.add(new JLabel(" key: " + key));
         this.add(j);
         this.setTitle(title);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
         this.setBounds(0, 0, 500, 150);
         this.setVisible(true);
         
    }   
}
