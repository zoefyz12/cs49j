package hw5;

/**
 * Tester for the PaintJobConstructor class
 */
public class PaintJobTester
{
    public static void main(String[] args)
    {
        //arguments are height then radius
        PaintJobCalculator job1 = new PaintJobCalculator(15.0, 20.0);
        
        System.out.printf("Surface Area: %4.2f\n",job1.getSurfaceArea());
        System.out.println("Expected: 4398.23"); 
        System.out.printf("Paint Cost: %4.2f\n",job1.getPaintCost());
        System.out.println("Expected: 10500.77");  
        System.out.printf("Labor: %4.2f\n",job1.getLaborCharge());
        System.out.println("Expected: 48869.22");  
        System.out.printf("Total: %4.2f\n",job1.getCustomerPrice());
        System.out.println("Expected: 59369.99");
        
        job1.setRadius(10.0);
        job1.setHeight(25.0);
        System.out.printf("Total: %4.2f\n",job1.getCustomerPrice());
        System.out.println("Expected: 29685.00"); 
    }
}
