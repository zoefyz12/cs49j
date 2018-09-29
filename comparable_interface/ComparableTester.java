import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ComparableTester
{
    public static void main(String[] args)
    {
        // sort bank accounts
        BankAccount[] accounts = 
            {

                new BankAccount(2000.0, "xyz789"),
                new BankAccount(1000.0, "def333"),
                new BankAccount(1000.0, "abc123"),
                new BankAccount(1500.0, "pqr456"),
            };

        Arrays.sort(accounts);

        for(BankAccount b : accounts)
        {
            System.out.println(b.getAccountId());
        }

        //sort students
//         ArrayList<Comparable> students = new ArrayList<Comparable>();
// 
//         students.add(new Student("Amy", 3.4));
//         students.add(new Student("Thong", 2.9));
//         students.add(new Student("Perdeep", 3.6));
//         students.add(new Student("Carlos", 3.6));
//         students.add(new Student("Mica", 3.56));
// 
//         Collections.sort(students);
// 
//         for (Comparable s: students)
//         {
//             System.out.println(s.getName()); //***error. Why
//         }

    }
}
