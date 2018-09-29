package hw7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RandomStarComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
    
      RandomStar star = new RandomStar(100, 100, 50, 25);
      star.draw(g2);
      RandomStar star2 = new RandomStar(100, 200, 40, 60);
      //star2.draw(g2);
      
      RandomStar star3 = new RandomStar(100, 300, 40, 30);
      //star3.draw(g2);
   }
    
}
