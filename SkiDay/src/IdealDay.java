import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		
		JOptionPane.showMessageDialog(
				null, 
				"You will be asked to rank a number of different criteria in their importance to you on a scale of 1-10",
				"Ideal Day",
				JOptionPane.CLOSED_OPTION,
				null
				);
		
		String [] sorts = {"Affordability", "Acreage of the resort", "Mileage from " + ListFiller.city, "Time from " + ListFiller.city, "Crowds"};
		Object [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		
		double priceI = 0;
		double acreI = 0;
		double mileI = 0;
		double timeI = 0;
		double crowdI = 0;
		
		for(int i = 0; i < 5; i++)
			{
			int answer = JOptionPane.showOptionDialog(
					null, 
					sorts[i],
					"Ideal Day",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					numbers,
					numbers[0]
					);
			if(i == 0)
				{
				priceI = answer;
				}
			else if(i == 1)
				{
				acreI = answer;
				}
			else if(i == 2)
				{
				mileI = answer;
				}
			else if(i == 3)
				{
				timeI = answer;
				}
			else
				{
				crowdI = answer;
				}
			}
		
		//Price
//		Scanner user = new Scanner(System.in);
//		System.out.println("1) Affordability");
//		double priceI = user.nextInt();
		//Acre
//		Scanner user2 = new Scanner(System.in);
//		System.out.println("2) Acreage of the resort");
//		double acreI = user2.nextInt();
		//Mile
//		Scanner user3 = new Scanner(System.in);
//		System.out.println("3) Mileage from " + ListFiller.city);
//		double mileI = user3.nextInt();
		//Time
//		Scanner user4 = new Scanner(System.in);
//		System.out.println("4) Time from " + ListFiller.city);
//		double timeI = user4.nextInt();
		//Crowd
//		Scanner user5 = new Scanner(System.in);
//		System.out.println("5) Crowds");
//		double crowdI = user5.nextInt();
		
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
//		System.out.println("Here are the top mountains for you: ");
//		for(int i = 0; i < 3; i++)
//			{
//			System.out.println((i+1) + ") " + SkiPreferenceSort.newMountains.get(i).getName() + ": A lift ticket is $" + SkiPreferenceSort.newMountains.get(i).getPrice() + ". The mountain is " + SkiPreferenceSort.newMountains.get(i).getAcres() + " acres large. It is " + SkiPreferenceSort.newMountains.get(i).getMiles() + " miles away from " + ListFiller.city + ", which as approximately " + SkiPreferenceSort.newMountains.get(i).getTimeR() + ". It has been rated a " + SkiPreferenceSort.newMountains.get(i).getCrowd() + " on a scale from 1-10 (1 being the best, 10 being the worst) concerning the crowds.");
//			}
		
		JFrame f = new JFrame("Hey");
		f.add(new JList(ConvertToArray.convert(SkiPreferenceSort.newMountains, 5)));
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1500, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		Runner.delay();
		f.setVisible(false);
		
		
//		JScrollPane scrPane = new JScrollPane(f);
//
//		scrPane.setVisible(true);
//		Runner.delay();
//		scrPane.setVisible(false);
		
//		JPanel container = new JPanel();
//		container.add(f);
//		JScrollPane jsp = new JScrollPane(container);
//		f.add(jsp);
		
//		System.out.println();
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("What would you like to do next?");
//		System.out.println("1) Return to the main menu");
//		System.out.println("2) Try the ideal mountain function again");
//		System.out.println("3) Exit");
//		int answer = userInput.nextInt();
		Object[] options = {"Return to the Main Menu", "Try the Ideal Mountain function again", "Exit"};
		int answer = JOptionPane.showOptionDialog(
				null, 
				"Would you like to see another sort?",
				"Menu",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]
				);
		if(answer == 0)
			{
			Runner.mainMenu();
			}
		else if(answer == 1)
			{
			idealDay();
			}
		else
			Runner.farewell();
		}
	}
