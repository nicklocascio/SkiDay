import java.util.Comparator;

public class TimeSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getTime() > s2.getTime())
			return 1;
		else
			return -1;
		}
	}
