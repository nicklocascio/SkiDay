//Narrows Down List Based on Skiing Preference

import java.util.*;
import java.io.*;

public class SkiPreferenceSort 
	{
	static ArrayList <Mountain> newMountains = new ArrayList<Mountain>();

	public static void skiingType()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		System.out.println("What type of skiing would you like to do?");
		System.out.println("1) Park");
		System.out.println("2) Powder");
		System.out.println("3) Groomers");
		String answer = userInput.nextLine();
		String type = "";
		for(int i = 0; i < ListFiller.mountains.size(); i++)
			{
			if(answer.equals("1"))
				{
				type = "park";
				if(ListFiller.mountains.get(i).getPark().equals("y"))
					{ 
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			else if(answer.equals("2"))
				{
				type = "powder";
				if(ListFiller.mountains.get(i).getPowder().equals("y"))
					{
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			else if(answer.equals("3"))
				{
				type = "groomer";
				if(ListFiller.mountains.get(i).getGroomer().equals("y"))
					{
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			}
		System.out.println();
		System.out.println("The best " + type + " mountains in " + ListFiller.state2 + " are: ");
		for(Mountain hi : newMountains)
			{
			System.out.println(hi.getName());
			}
		}
	}
