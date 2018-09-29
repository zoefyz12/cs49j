import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresidentAverageHeight
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File inputFile = new File("presidents_by_height.txt");
      Scanner in = new Scanner(inputFile, "UTF-8");
      double total = 0; 
      int count = 0;
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         //Use split

      }
      
      //compute the average
      in.close();
   }
}
