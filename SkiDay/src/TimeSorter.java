import java.util.Comparator;

public class TimeSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		return s1.getTime().compareTo(s2.getTime());
		}
	}
