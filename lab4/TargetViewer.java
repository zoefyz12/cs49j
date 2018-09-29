package hw4;

import javax.swing.*;
public class TargetViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(200,250);
      frame.setTitle("It's a Target");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      TargetComponent component =  new TargetComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}