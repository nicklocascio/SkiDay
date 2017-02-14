import java.util.Comparator;

public class PriceSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getPrice() < s2.getPrice())
			return 1;
		else
			return-1;
		}
	}
