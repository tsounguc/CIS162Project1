 import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Drawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drawing extends JPanel{

  public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
        f.setVisible(true);
  }

  public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);
         
  // optional: paint the background color (default is white)
        setBackground(Color.CYAN);
        
        // display words
        g.setColor(Color.black);
        g.drawString("Picture Title", 130, 20);

        // draw a solid and empty rectangle
        g.setColor(Color.RED);
        g.fillRect(100, 100, 70, 50);  
        g.drawRect(100, 170, 70, 50); 
        
        // draw a solid and empty oval
        g.setColor(Color.GREEN);
        g.fillOval(50, 10, 70, 50);  
        g.drawOval(20, 50, 70, 50); 

        // draw lines
        g.setColor(Color.BLUE);
        g.drawLine(10, 50, 190, 150);  
        g.drawLine(210, 50, 210, 150);  
        g.drawLine(230, 50, 230, 150);          
}
}
