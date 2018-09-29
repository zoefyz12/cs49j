package hw2;

import javax.swing.*;
public class TwoViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("TWO frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TwoComponent component = new TwoComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}