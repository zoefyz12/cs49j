
/**
 * Tester for the WaterBottle class
 */
public class WaterBottleTester
{
    public static void main(String[] args)
    {
        WaterBottle bottle = new WaterBottle();
        System.out.println(bottle.getAmount());
        System.out.println("Expected: 16.7");
        
        bottle.drink(5.1);
        System.out.println(bottle.getAmount());
        System.out.println("Expected: 11.6");
        
        bottle.drink(2);
        System.out.println(bottle.getAmount());
        System.out.println("Expected: 9.6");
        
        bottle.fill();
        System.out.println(bottle.getAmount());
        System.out.println("Expected: 16.7");
        
        System.out.println(WaterBottle.CAPACITY_IN_FLUID_OUNCES);
        System.out.println("Expected: 16.7");
    }
}
