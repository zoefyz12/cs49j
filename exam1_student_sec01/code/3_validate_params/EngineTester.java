
public class EngineTester
{
    public static void main(String[] args)
    {
        Engine badEngine = new Engine(-1);
        System.out.println("Negative location: " +badEngine.getLocation());
        System.out.println("Expected: 0");
        
        badEngine = new Engine(21);
        System.out.println("Location > 20: " + badEngine.getLocation());
        System.out.println("Expected: 0");
        
        Engine engine = new Engine(0);
        System.out.println("Start at 0: " + engine.getLocation());
        System.out.println("Expected: 0");
        
        engine = new Engine(20);
        System.out.println("Start at 20: " +engine.getLocation());
        System.out.println("Expected: 20");
        
        engine = new Engine(10);
        System.out.println("Start at 10: " +engine.getLocation());
        System.out.println("Expected: 10");
        
        engine.moveForward(5);
        System.out.println("move forward 5: " + engine.getLocation());
        System.out.println("Expected: 15");
        
        engine.moveForward(-5);
        System.out.println("move forward -5: " + engine.getLocation());
        System.out.println("Expected: 15");
        
        engine.moveForward(10);
        System.out.println("move past 20: " + engine.getLocation());
        System.out.println("Expected: 20");
        
        //testing backwards
        engine.moveBackward(5);
        System.out.println("move backward 5: " + engine.getLocation());
        System.out.println("Expected: 15");
        
        engine.moveBackward(-5);
        System.out.println("move backward -5: " + engine.getLocation());
        System.out.println("Expected: 0");
        
        engine.moveForward(3);
        engine.moveBackward(5);
        System.out.println("move past 0 : " + engine.getLocation());
        System.out.println("Expected: 0 ");
        
        

    }
}
