package hw4;

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
     
      Rainbow rb1 = new Rainbow(0, 0, 20);
      rb1.draw(g2);
      Rainbow rb2 = new Rainbow(100, 180, 10);
      rb2.draw(g2);
      Rainbow rb3 = new Rainbow(0, 200, 5);
      rb3.draw(g2);

      
     

   }
    
}
