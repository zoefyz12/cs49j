package hw13;

import java.util.Comparator;

public class CollegeWrestlerComparatorByWeight implements Comparator<CollegeWrestler>{

	public int compare(CollegeWrestler c1, CollegeWrestler c2) {
		return Double.compare(c1.getWeight(), c2.getWeight());
	}
}
