package hw4;

import javax.swing.*;
public class RainbowViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("My Rainbow");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RainbowComponent component = new RainbowComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}