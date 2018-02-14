import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Runner
	{	
	public static void main(String[] args) throws IOException
		{
		ListFiller.fillArray();
		SkiPreferenceSort.skiingType();
		mainMenu();
		System.out.println("Sounds good! Have fun out there and be safe!");
		}
	
	public static void mainMenu()
		{
		Object[] options = {"See individual sorted lists of mountain statistics", "Find your ideal mountain"};
		int answer = JOptionPane.showOptionDialog(
				null, 
				"What would you like to do?",
				"Main Menu",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]
				);
		
		if(answer == 0)
			{
			IndividualLists.individualLists();
			}
		else if(answer == 1)
			{
			IdealDay.idealDay();
			}	
		}
	}
