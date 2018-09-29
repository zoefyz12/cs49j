package hw5;

/**
 * Tester for the AmazonOrderPrinter class 
 * 
 * @author Kathleen O'Brien
 */
public class AmazonOrderPrinter
{
    public static void main(String[] args)
    {
        AmazonOrder order = new AmazonOrder();
        order.add(12.59);
        order.add(18.25);
        order.remove(12.59);
        System.out.println("\nContents");
        System.out.println(order.getContents());
        order.reset();
        
        order.add(10.25);
        order.add(11.75);
        order.add(15.50);
        order.remove(15.50);
        order.add(23);
        System.out.println("Subtotal: " + order.getSubtotal());
        System.out.println("Total: " + order.getTotal());
        System.out.println("\nContents");
        System.out.println(order.getContents());
        System.out.println("\nContents");
        System.out.println(order.getContents());
    }
}
