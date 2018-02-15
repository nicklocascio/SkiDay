import java.util.Collections;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

//Time Conversion:
//hi.getTime()/60 + "h" + hi.getTime()%60 + "m"

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
			
			String [] sorted = new String[SkiPreferenceSort.newMountains.size()];
			
			if(answer == 0)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new PriceSorter());
				sorted = ConvertToArray.convert(SkiPreferenceSort.newMountains, 1);
				}
			else if(answer == 1)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new AcreSorter());
				sorted = ConvertToArray.convert(SkiPreferenceSort.newMountains, 2);
				}
			else if(answer == 2)
				{
				Collections.sort(SkiPreferenceSort.newMountains, new MileSorter());
				sorted = ConvertToArray.convert(SkiPreferenceSort.newMountains, 3);
				}
			else
				{
				Collections.sort(SkiPreferenceSort.newMountains, new CrowdSorter());
				sorted = ConvertToArray.convert(SkiPreferenceSort.newMountains, 4);
				}
			
			JFrame f = new JFrame("Hey");
			f.add(new JList(sorted));
			f.setSize(500, 300);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			Runner.delay();
			f.setVisible(false);
			
			//Convert This Next
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
