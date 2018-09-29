package hw2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class TwoComponent extends JComponent
{
	private static final long serialVersionUID = 1L;
	   
	   public void paintComponent(Graphics g)
	   {  
		   Color cir = new Color(200, 255, 10);
		   
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      
	      Line2D.Double T1 = new Line2D.Double(20, 50, 60, 50);
	      Line2D.Double T2 = new Line2D.Double(40, 50, 40, 100);
	      g2.setColor(Color.RED);
	      g2.draw(T1);
	      g2.draw(T2);
	      
	      Line2D.Double W1 = new Line2D.Double(70, 50, 80, 100);
	      Line2D.Double W2 = new Line2D.Double(80, 100, 90, 50);
	      Line2D.Double W3 = new Line2D.Double(90, 50, 100, 100);
	      Line2D.Double W4 = new Line2D.Double(100, 100, 110, 50);
	      g2.setColor(Color.BLUE);
	      g2.draw(W1);
	      g2.draw(W2);
	      g2.draw(W3);
	      g2.draw(W4);
	      
	      Ellipse2D.Double O = new Ellipse2D.Double(120, 50, 40, 50);
	      g2.setColor(cir);
	      g2.fill(O);
	   }
}
