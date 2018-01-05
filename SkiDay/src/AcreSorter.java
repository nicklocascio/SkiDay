//Sorts by Acres

import java.util.Comparator;

public class AcreSorter implements Comparator<Mountain>
	{

	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getAcres() < s2.getAcres())
			return 1;
		else
			return -1;
		}

	}
