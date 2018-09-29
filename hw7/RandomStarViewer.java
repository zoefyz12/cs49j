package hw7;

import javax.swing.*;
public class RandomStarViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("RandomStar");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RandomStarComponent component = new RandomStarComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
