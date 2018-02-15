import java.util.ArrayList;

public class ConvertToArray
	{
	//Names = 0
	//Price = 1
	//Acreage = 2
	//Distance = 3
	//Crowd = 4
	public static String[] convert(ArrayList <Mountain> list, int whatToConvert)
		{
		String [] mountains = new String[list.size()];
		
		if(whatToConvert == 0)
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName();
				}
			return mountains;	
			}
		
		else if(whatToConvert == 1)
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName() + ": $" + list.get(i).getPrice();
				}
			return mountains;	
			}
		
		else if(whatToConvert == 2)
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName() + ": " + list.get(i).getAcres() + " acres";
				}
			return mountains;	
			}
		
		else if(whatToConvert == 3)
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName() + ": " + list.get(i).getMiles() + " miles";
				}
			return mountains;	
			}
		
		else
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName() + ": " + list.get(i).getCrowd();
				}
			return mountains;	
			}
		}
	}
