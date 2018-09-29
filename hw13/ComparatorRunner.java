package hw13;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorRunner
{

   public static void main(String[] args)
   {
      ArrayList<CollegeWrestler> wrestlers = new  ArrayList<CollegeWrestler>();
      wrestlers.add(new CollegeWrestler("Collin", 175.5));
      wrestlers.add(new CollegeWrestler("Dong", 124.5));
      wrestlers.add(new CollegeWrestler("Jose", 140.9));
      wrestlers.add(new CollegeWrestler("Enrique", 290));
      
      Collections.sort(wrestlers, new CollegeWrestlerComparatorByWeight());
      for(CollegeWrestler c1 : wrestlers)
    	  System.out.println(c1.getWeight() + " " + c1.getName());
      
      Collections.sort(wrestlers, new CollegeWrestlerComparatorByName()); 
      for(CollegeWrestler c2 : wrestlers)
    	  System.out.println(c2.getName() + " " + c2.getWeight()) ;
   }
}
