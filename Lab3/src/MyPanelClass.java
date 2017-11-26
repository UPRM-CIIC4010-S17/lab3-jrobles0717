
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
      public void paintComponent(Graphics g) 
      {
      
    	  super.paintComponent(g);
 
    	  //Compute interior coordinates
    	  Insets myInsets = this.getInsets();
    	  int x1 = myInsets.left;
    	  int y1 = myInsets.top;
    	  int x2 = getWidth() - myInsets.right - 1;
    	  int y2 = getHeight() - myInsets.bottom - 1;
    	  int width = x2 - x1;
    	  int height = y2 - y1;
 
    	  //Paint the background
    	  g.setColor(Color.GREEN);
    	  g.fillRect(x1, y1, width, height);
    	  g.fillRect(x1, y1, width + 1, height + 1);
    	  
//    	  //Draw a border
//          g.setColor(Color.PINK);
//          g.drawRect(x1, y1, width, height);
//          g.setColor(Color.BLACK);
//          g.drawRect(x1+ 50, y1 + 50, width, height);
//          
//          g.setColor(Color.WHITE);
//          g.drawLine(x1, y1, x2, y2);
//          
//          //another line 
//          g.setColor(Color.BLUE);
//          g.drawLine(x2, y1, x1, y2);
    	  
    	  g.setColor(Color.BLACK);
          g.drawOval(1800, 1000, 55, 55);
          
          
      }
}