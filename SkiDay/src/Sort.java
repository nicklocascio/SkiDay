import java.util.*;
import java.io.*;

public class Sort
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
		boolean more = true;
		while(more)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println();
			System.out.println("What would you like to sort by?");
			System.out.println("1) Price");
			System.out.println("2) Acreage");
			System.out.println("3) Mileage from Denver");
			System.out.println("4) Time from Denver");
			System.out.println("5) Crowds");
			int answer = userInput.nextInt();
			System.out.println();
			if(answer == 1)
				{
				Collections.sort(newMountains, new PriceSorter());
				for(Mountain hi : newMountains)
					{
					System.out.println(hi.getName() + ": $" + hi.getPrice());
					} 
				}
			if(answer == 2)
				{
				Collections.sort(newMountains, new AcreSorter());
				for(Mountain hi : newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getAcres() + " acres");
					} 
				}
			if(answer == 3)
				{
				Collections.sort(newMountains, new MileSorter());
				for(Mountain hi : newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getMiles() + " miles from Denver");
					} 
				}
			if(answer == 4)
				{
				Collections.sort(newMountains, new TimeSorter());
				for(Mountain hi : newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getTime()/60 + "h" + hi.getTime()%60 + "m from Denver");
					} 
				}
			if(answer == 5)
				{
				Collections.sort(newMountains, new CrowdSorter());
				System.out.println("Here are the mountains in order from least crowded to most crowded (1 being the best, 10 being the worst):");
				for(Mountain hi : newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getCrowd());
					} 
				}
			Scanner userInput2 = new Scanner(System.in);
			System.out.println();
			System.out.println("Would you like to see another sort? (y or n)");
			String answer2 = userInput2.nextLine();
			if(answer2.equals("y"))
				{
				more = true;
				}
			else if(answer2.equals("n"))
				{
				more = false;
				System.out.println();
				Scanner userInput3 = new Scanner(System.in);
				System.out.println("Ok! What would you like to do then?");
				System.out.println("1) Return to the main menu");
				System.out.println("2) Exit");
				int answer3 = userInput3.nextInt();
				if(answer3 == 1)
					{
					Runner.mainMenu();
					}
				else
					System.out.println();
				}
			}
		}
	
	public static void idealDay()
		{
		//Price
		Collections.sort(newMountains, new PriceSorter());
		for(int i = 0; i < newMountains.size(); i++)
			{
			newMountains.get(i).setPriceRank(i+1);	
			}
		//Acre
		Collections.sort(newMountains, new AcreSorter());
		for(int i = 0; i < newMountains.size(); i++)
			{
			newMountains.get(i).setAcreRank(i+1);	
			}
		//Mile
		Collections.sort(newMountains, new MileSorter());
		for(int i = 0; i < newMountains.size(); i++)
			{
			newMountains.get(i).setMileRank(i+1);	
			}
		//Time
		Collections.sort(newMountains, new TimeSorter());
		for(int i = 0; i < newMountains.size(); i++)
			{
			newMountains.get(i).setTimeRank(i+1);	
			}
		//Crowd
		Collections.sort(newMountains, new CrowdSorter());
		for(int i = 0; i < newMountains.size(); i++)
			{
			newMountains.get(i).setCrowdRank(i+1);	
			}
		//RN IT PRINTS IN CROWD ORDER BC THAT WAS THE LAST SORT
		System.out.println("You will be asked to rank a number of different criteria in their importance to you on a scale of 1-10");
		System.out.println();
		//Price
		Scanner user = new Scanner(System.in);
		System.out.println("1) Affordability");
		double priceI = user.nextInt();
		//Acre
		Scanner user2 = new Scanner(System.in);
		System.out.println("2) Acreage of the resort");
		double acreI = user2.nextInt();
		//Mile
		Scanner user3 = new Scanner(System.in);
		System.out.println("3) Mileage from Denver");
		double mileI = user3.nextInt();
		//Time
		Scanner user4 = new Scanner(System.in);
		System.out.println("4) Time from Denver");
		double timeI = user4.nextInt();
		//Crowd
		Scanner user5 = new Scanner(System.in);
		System.out.println("5) Crowds");
		double crowdI = user5.nextInt();
		//Average
		for(int i = 0; i < newMountains.size(); i++)
			{
			double tot = newMountains.get(i).getPriceRank()*priceI;
			double tot2 = newMountains.get(i).getAcreRank()*acreI;
			double tot3 = newMountains.get(i).getMileRank()*mileI;
			double tot4 = newMountains.get(i).getTimeRank()*timeI;
			double tot5 = newMountains.get(i).getCrowdRank()*crowdI;
			double average = (tot+tot2+tot3+tot4+tot5)/5;
			newMountains.get(i).setAverage(average);
			}
		Collections.sort(newMountains, new AverageSorter());
		System.out.println("Here are the top three mountains for you: ");
		for(int i = 0; i < 3; i++)
			{
			System.out.println((i+1) + ") " + newMountains.get(i).getName() + ": A lift ticket is $" + newMountains.get(i).getPrice() + ". The mountain is " + newMountains.get(i).getAcres() + " acres large. It is " + newMountains.get(i).getMiles() + " miles away from Denver, which as approximately " + newMountains.get(i).getTimeR() + ". It has been rated a " + newMountains.get(i).getCrowd() + " on a scale from 1-10 (1 being the best, 10 being the worst) concerning the crowds.");
			}
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		System.out.println("What would you like to do next?");
		System.out.println("1) Return to the main menu");
		System.out.println("2) Try the ideal mountain function again");
		System.out.println("3) Exit");
		int answer = userInput.nextInt();
		if(answer == 1)
			{
			Runner.mainMenu();
			}
		else if(answer == 2)
			{
			idealDay();
			}
		else
			System.out.println();
		}
	}
