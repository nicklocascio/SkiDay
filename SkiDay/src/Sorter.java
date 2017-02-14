import java.util.*;
import java.io.*;

public class Sorter
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
		System.out.println("The best " + type + " mountains in Colorado are: ");
		for(Mountain hi : newMountains)
			{
			System.out.println(hi.getName());
			}
		}
	
	public static void sort()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		System.out.println("What is the most important factor that you consider when deciding where to ski?");
		System.out.println("1) Price");
		System.out.println("2) Acreage");
		System.out.println("3) Mileage from Denver");
		System.out.println("4) Time from Denver");
		System.out.println("5) Crowds");
		String answer = userInput.nextLine();
		System.out.println();
		if(answer.equals("1"))
			{
			Collections.sort(newMountains, new PriceSorter());
			for(Mountain hi : newMountains)
				{
				System.out.println(hi.getName() + ": $" + hi.getPrice());
				} 
			}
		if(answer.equals("2"))
			{
			Collections.sort(newMountains, new AcreSorter());
			for(Mountain hi : newMountains)
				{
				System.out.println(hi.getName() + ": " + hi.getAcres() + " acres");
				} 
			}
		if(answer.equals("3"))
			{
			Collections.sort(newMountains, new MileSorter());
			for(Mountain hi : newMountains)
				{
				System.out.println(hi.getName() + ": " + hi.getMiles() + " miles from Denver");
				} 
			}
		if(answer.equals("4"))
			{
			Collections.sort(newMountains, new TimeSorter());
			for(Mountain hi : newMountains)
				{
				System.out.println(hi.getName() + ": " + hi.getTime() + " from Denver");
				} 
			}
		if(answer.equals("5"))
			{
			Collections.sort(newMountains, new CrowdSorter());
			System.out.println("Here are the mountains in order from most crowded to least crowded:");
			for(Mountain hi : newMountains)
				{
				System.out.println(hi.getName());
				} 
			}
		}
	}
