import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IdealDay
	{
	
	public static void idealDay()
		{
		//Price sorting
		Collections.sort(SkiPreferenceSort.newMountains, new PriceSorter());
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			SkiPreferenceSort.newMountains.get(i).setPriceRank(i+1);	
			}
		//Acre sorting
		Collections.sort(SkiPreferenceSort.newMountains, new AcreSorter());
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			SkiPreferenceSort.newMountains.get(i).setAcreRank(i+1);	
			}
		//Mile sorting
		Collections.sort(SkiPreferenceSort.newMountains, new MileSorter());
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			SkiPreferenceSort.newMountains.get(i).setMileRank(i+1);	
			}
		//Time sorting
		Collections.sort(SkiPreferenceSort.newMountains, new TimeSorter());
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			SkiPreferenceSort.newMountains.get(i).setTimeRank(i+1);	
			}
		//Crowd sorting
		Collections.sort(SkiPreferenceSort.newMountains, new CrowdSorter());
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			SkiPreferenceSort.newMountains.get(i).setCrowdRank(i+1);	
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
		System.out.println("3) Mileage from " + ListFiller.city);
		double mileI = user3.nextInt();
		//Time
		Scanner user4 = new Scanner(System.in);
		System.out.println("4) Time from " + ListFiller.city);
		double timeI = user4.nextInt();
		//Crowd
		Scanner user5 = new Scanner(System.in);
		System.out.println("5) Crowds");
		double crowdI = user5.nextInt();
		//Average
		for(int i = 0; i < SkiPreferenceSort.newMountains.size(); i++)
			{
			double tot = SkiPreferenceSort.newMountains.get(i).getPriceRank()*priceI;
			double tot2 = SkiPreferenceSort.newMountains.get(i).getAcreRank()*acreI;
			double tot3 = SkiPreferenceSort.newMountains.get(i).getMileRank()*mileI;
			double tot4 = SkiPreferenceSort.newMountains.get(i).getTimeRank()*timeI;
			double tot5 = SkiPreferenceSort.newMountains.get(i).getCrowdRank()*crowdI;
			double average = (tot+tot2+tot3+tot4+tot5)/5;
			SkiPreferenceSort.newMountains.get(i).setAverage(average);
			}
		Collections.sort(SkiPreferenceSort.newMountains, new AverageSorter());
		System.out.println("Here are the top mountains for you: ");
		for(int i = 0; i < 3; i++)
			{
			System.out.println((i+1) + ") " + SkiPreferenceSort.newMountains.get(i).getName() + ": A lift ticket is $" + SkiPreferenceSort.newMountains.get(i).getPrice() + ". The mountain is " + SkiPreferenceSort.newMountains.get(i).getAcres() + " acres large. It is " + SkiPreferenceSort.newMountains.get(i).getMiles() + " miles away from " + ListFiller.city + ", which as approximately " + SkiPreferenceSort.newMountains.get(i).getTimeR() + ". It has been rated a " + SkiPreferenceSort.newMountains.get(i).getCrowd() + " on a scale from 1-10 (1 being the best, 10 being the worst) concerning the crowds.");
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
