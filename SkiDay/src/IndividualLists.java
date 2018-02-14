import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class IndividualLists
	{
	public static void individualLists()
		{
		boolean more = true;
		while(more)
			{
			Object [] sortChoices = {"Price", "Acreage", "Distance from " + ListFiller.city, "Crowds"};
			int answer = JOptionPane.showOptionDialog(
					null, 
					"What would you like to sort by?",
					"Sort Choice",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					sortChoices,
					sortChoices[0]
					);
			
			if(answer == 0)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new PriceSorter());
				for(Mountain hi : SkiPreferenceSort.newMountains)
					{
					System.out.println(hi.getName() + ": $" + hi.getPrice());
					} 
				}
			if(answer == 1)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new AcreSorter());
				for(Mountain hi : SkiPreferenceSort.newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getAcres() + " acres");
					} 
				}
			if(answer == 2)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new MileSorter());
				for(Mountain hi : SkiPreferenceSort.newMountains)
					{
					System.out.println(hi.getName() + ": " + hi.getMiles() + " miles");
					} 
				}
//			if(answer == 4)
//				{
//				Collections.sort(SkiPreferenceSort.newMountains, new TimeSorter());
//				for(Mountain hi : SkiPreferenceSort.newMountains)
//					{
//					System.out.println(hi.getName() + ": " + hi.getTime()/60 + "h" + hi.getTime()%60 + "m");
//					} 
//				}
			if(answer == 3)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new CrowdSorter());
				System.out.println("Here are the mountains in order from least crowded to most crowded (1 being the best, 10 being the worst):");
				for(Mountain hi : SkiPreferenceSort.newMountains)
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
	}
