
/**
 * A class to test Circle.
 * 
 * @author KOBrien 
 * @version 7/30/2016
 */
public class CircleTester
{
   public static void main(String[] args)
   {
      Circle myCircle = new Circle(10);
      double instanceArea = myCircle.area();
      System.out.printf("The area is: %.4f\n", instanceArea);
      
   }
}

