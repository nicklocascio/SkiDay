import java.util.ArrayList;

public class ConvertToArray
	{
	public static String[] convert(ArrayList <Mountain> list)
		{
		String [] mountainNames = new String[list.size()];
		for(int i = 0; i < list.size(); i++)
			{
			mountainNames[i] = list.get(i).getName();
			}
		return mountainNames;	
		}
	}
