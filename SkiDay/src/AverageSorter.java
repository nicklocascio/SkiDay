import java.util.Comparator;

public class AverageSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getAverage() > s2.getAverage())
			return 1;
		else
			return -1;
		}

}
