package hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
	private static final long serialVersionUID = 1L;
	   
	   public void paintComponent(Graphics g)
	   {   
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      
	      Target T1 = new Target(50, 60, 15);
	      T1.draw(g2);
	      
	      Target T2 = new Target(30, 150, 5);
	      T2.draw(g2);
	   }
}
