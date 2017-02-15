import java.util.Comparator;

public class CrowdSorter implements Comparator<Mountain>
	{
	public int compare(Mountain s1, Mountain s2)
		{
		if(s1.getCrowd() > s2.getCrowd())
			return 1;
		else
			return -1;
		}

	}
