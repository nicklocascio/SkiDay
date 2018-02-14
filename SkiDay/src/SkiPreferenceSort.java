//Narrows Down List Based on Skiing Preference

import java.util.*;
import javax.swing.*;
import java.io.*;

public class SkiPreferenceSort 
	{
	static ArrayList <Mountain> newMountains = new ArrayList<Mountain>();

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
	
	public static void skiingType()
		{
		Object[] skiingTypes = {"Park", "Powder", "Groomers"};
		int answer = JOptionPane.showOptionDialog(
				null, 
				"What type of skiing would you like to do?",
				"Ski Type",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				skiingTypes,
				skiingTypes[0]
				);
		
		String type = "";
		for(int i = 0; i < ListFiller.mountains.size(); i++)
			{
			if(answer == 0)
				{
				type = "park";
				if(ListFiller.mountains.get(i).getPark().equals("y"))
					{ 
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			else if(answer == 1)
				{
				type = "powder";
				if(ListFiller.mountains.get(i).getPowder().equals("y"))
					{
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			else if(answer == 2)
				{
				type = "groomer";
				if(ListFiller.mountains.get(i).getGroomer().equals("y"))
					{
					newMountains.add(ListFiller.mountains.get(i));
					}
				}
			}
		
		JFrame f = new JFrame("The best " + type + " mountains in " + ListFiller.state2);
		f.add(new JList(ConvertToArray.convert(newMountains)));
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		delay();
		}
	}
