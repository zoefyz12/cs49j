
import java.util.ArrayList;

public class Gradebook {

	private ArrayList<Student> gradebook;
	public Gradebook()
	{
		gradebook = new ArrayList<Student>();
	}
	public void add(Student s) 
	{
		gradebook.add(s);
	}
	public double getClassAverage()
	{
		if (gradebook.size() == 0)
		{
			return  0;
		}
		double average = 0.0;
		double sum = 0.0;
		for (Student s : gradebook)
		{
			sum = sum + s.getAverage();
		}
		average = sum / gradebook.size();
		return average;
	}
}
