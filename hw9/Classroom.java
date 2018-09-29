package hw9;


import java.util.ArrayList;
/**
 * This is a class named Classroom which manages Student objects.
 * @author Fangyi Zhao
 *
 */
public class Classroom {
	
	private ArrayList<Student> mystudent = new ArrayList<Student>();
	/**
	 * Classroom is a no-argument constructor.
	 */
	public Classroom()
	{
		
	}
	/**
	 * Add method adds the student to this Classroom which add to an ArrayList.
	 * @param s Add each student class in to the classroom array list.
	 */
	public void add(Student s)
	{
		mystudent.add(s);	
	}
	/**
	 * This method gets the name of the first student in the Classroom who has an average 
	 * greater than the target or the empty string. 
	 * @param target The target which need to compare with the student average.
	 * @return The student name needed to be return.
	 */
	public String hasAverageGreaterThan(double target)
	{
		int i = 0;
		String name = "";
		boolean compare = false;
		if (mystudent.size() == 0)
		{
			name = "";
		}
		else
		{
			while (!compare)
			{
				if (mystudent.get(i).getAverage() <= target)
				{
					i++;
				}
			    else
			    {
			    	compare = true;
				    name = mystudent.get(i).getName();
				}	
			     if (i == mystudent.size())
			    {
			    	 compare = true;
				     name = "";
				 }
		     }
		}
			
		return name;
	}
	/**
	 * This method want to contain the names of all the Students in this Classroom.
	 * @return The new arraylist studentname needed to be returned.
	 */
	public ArrayList<String> getStudents()
	{
		ArrayList<String> studentname = new ArrayList<String>();
		for (int i = 0; i < mystudent.size(); i++)
		{
			studentname.add(mystudent.get(i).getName());
		}
		return studentname;
	}
	/**
	 * The method gets the Student with the highest average in this classroom or null there are no students.
	 * @return The student in the classroom needed to be returned.
	 */
	public Student bestStudent()
	{
		if (mystudent.size() == 0)
		{
			return null;
		}
        int j = 0;
		double largest = 0.0;
		for (int i = 0; i < mystudent.size(); i++)
		{
			if (largest < mystudent.get(i).getAverage())
			{
				largest = mystudent.get(i).getAverage();
				j = i;
			}
		}
			return mystudent.get(j);
			
		}
	/**
	 * This method is chance the element of the array to string to help output.
	 * @return Returns a string representation of the array. 
	 */
	public String toString()
    {
        String s = "";
        s = s + mystudent.toString();
        return s;
    }
}
