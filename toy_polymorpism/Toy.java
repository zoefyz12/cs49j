/**
 * Describes a toy
 */
public class Toy extends Product
{
    private int appropriateAge;
    
    public Toy(String description, double price, int age)
    {
        super(description, price);
        appropriateAge = age;
    }
    
    public int getAppropriateAge()
    {
        return appropriateAge;
    }
    
    @Override
    public String getDescription()
    {
        return super.getDescription() + " " + appropriateAge;
    }
}
