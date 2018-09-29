package hw13;

import java.util.Comparator;

public class CollegeWrestlerComparatorByName implements Comparator<CollegeWrestler>{

	public int compare(CollegeWrestler c1, CollegeWrestler c2) {
		return (c1.getName().compareTo(c2.getName()));
	}
}

