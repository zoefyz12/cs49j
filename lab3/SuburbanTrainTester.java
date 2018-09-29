package HW3;

public class SuburbanTrainTester
{

   public static void main(String[] args)
   {
      SuburbanTrain train = new SuburbanTrain();
      train.move(3);
      train.move(5);
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 40");
      System.out.println("Distance to end: " + train.distanceToEnd());
      System.out.println("Expected: 10");
      
      train.turn();
      train.move(4);
      train.turn();
      train.move(2);
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 30");
      System.out.println("Distance to end: " + train.distanceToEnd());
      System.out.println("Expected: 20");
   }

}