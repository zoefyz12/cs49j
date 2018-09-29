package hw2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class RainbowComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Color a = new Color(75, 0, 130);
      Color b = new Color(143, 0, 255);
      
      g2.setColor(Color.RED);
      Rectangle box1 = new Rectangle(0, 0, 100, 20);
      g2.fill(box1);
      
      
      g2.setColor(Color.ORANGE);
      Rectangle box2 = new Rectangle(0, 20, 100, 20);
      g2.fill(box2);
      
      g2.setColor(Color.YELLOW);
      Rectangle box3 = new Rectangle(0, 40, 100, 20);
      g2.fill(box3);
      
      g2.setColor(Color.GREEN);
      Rectangle box4 = new Rectangle(0, 60, 100, 20);
      g2.fill(box4);
      
      g2.setColor(Color.BLUE);
      Rectangle box5 = new Rectangle(0, 80, 100, 20);
      g2.fill(box5);
      
      g2.setColor(a);
      Rectangle box6 = new Rectangle(0, 100, 100, 20);
      g2.fill(box6);
      
      g2.setColor(b);
      Rectangle box7 = new Rectangle(0, 120, 100, 20);
      g2.fill(box7);
     
   }

    
}
