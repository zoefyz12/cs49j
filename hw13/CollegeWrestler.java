package hw13;

public class CollegeWrestler
{
   private String name;
   private double weight;
   
   public CollegeWrestler( String name, double weight)
   {
      this.name = name;
      this.weight = weight;
   }
   
   public double getWeight()
   {
      return weight;     
   }
   
   public String getName()
   {
      return name;
   }
}