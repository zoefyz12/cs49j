package HW3;

public class FizzbinPlayerTester
{

   public static void main(String[] args)
   {
      FizzbinPlayer player = new FizzbinPlayer("Carlos", 21);
      System.out.println("Player: " + player.getName());
      System.out.println("Expected: Carlos" );
      
      System.out.println("has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 21" );
      
      player.setAdjustment(15);
      System.out.println("now has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 15" );
   }
}