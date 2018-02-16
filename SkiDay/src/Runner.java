import java.io.*;
import java.util.*;
import javax.swing.*;

public class Runner
	{	
	public static void main(String[] args) throws IOException
		{
		ListFiller.fillArray();
		SkiPreferenceSort.skiingType();
		mainMenu();
		JLabel label = new JLabel("Farewell");
		label.setText("Sounds good! Have fun out there and be safe!");
		label.setVisible(true);
		delay();
		label.setVisible(false);
//		System.out.println("Sounds good! Have fun out there and be safe!");
		}
	
	public static void delay()
		{
		try
			{
			Thread.sleep(2000);
			} 
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	
	public static void mainMenu()
		{
		Object[] options = {"See individual sorted lists of mountain statistics", "Find your ideal mountain", "View mountain trail maps"};
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
		else
			{
			TrailMaps.trailMap();
			}
		}
	}
