import java.util.Comparator;

public class MileSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getMiles() < s2.getMiles())
			return 1;
		else
			return -1;
		}

	}
