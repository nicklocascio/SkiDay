import java.util.ArrayList;

public class ConvertToArray
	{
	//Names = 0
	//Price = 1
	//Acreage = 2
	//Distance = 3
	//Crowd = 4
	
	//Ideal Day = 5
	
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
		
		else if(whatToConvert == 4)
			{
			for(int i = 0; i < list.size(); i++)
				{
				mountains[i] = list.get(i).getName() + ": " + list.get(i).getCrowd();
				}
			return mountains;	
			}
		else
			{
			for(int i = 0; i < 3; i++)
				{
				mountains[i] = (i+1) + ") " + SkiPreferenceSort.newMountains.get(i).getName() + ": A lift ticket is $" + SkiPreferenceSort.newMountains.get(i).getPrice() + ". The mountain is " + SkiPreferenceSort.newMountains.get(i).getAcres() + " acres large. It is " + SkiPreferenceSort.newMountains.get(i).getMiles() + " miles away from " + ListFiller.city + ", which as approximately " + SkiPreferenceSort.newMountains.get(i).getTimeR() + ". It has been rated a " + SkiPreferenceSort.newMountains.get(i).getCrowd() + " on a scale from 1-10 (1 being the best, 10 being the worst) concerning the crowds.";
				}
			return mountains;
			}
		}
	}
