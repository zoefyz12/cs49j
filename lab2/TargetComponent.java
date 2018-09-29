package hw2;

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
	      
	      Ellipse2D.Double cir1 = new Ellipse2D.Double(55, 55, 90, 90);
	      g2.setColor(Color.RED);
	      g2.fill(cir1);
	      
	      Ellipse2D.Double cir2 = new Ellipse2D.Double(70, 70, 60, 60);
	      g2.setColor(Color.WHITE);
	      g2.fill(cir2);
	      
	      Ellipse2D.Double cir3 = new Ellipse2D.Double(85, 85, 30, 30);
	      g2.setColor(Color.RED);
	      g2.fill(cir3);
	   }
}
