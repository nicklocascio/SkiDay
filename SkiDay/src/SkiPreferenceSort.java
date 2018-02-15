//Narrows Down List Based on Skiing Preference

import java.util.*;
import javax.swing.*;
import java.io.*;

public class SkiPreferenceSort 
	{
	static ArrayList <Mountain> newMountains = new ArrayList<Mountain>();
	
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
		
		//Option 1
//		JOptionPane.showMessageDialog(
//				null, 
//				"Here are the best park mountains in Colorado:",
//				
//				
//				);
		
		//Option 2
		JFrame f = new JFrame("The best " + type + " mountains in " + ListFiller.state2);
		f.add(new JList(ConvertToArray.convert(newMountains, 0)));
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		Runner.delay();
		f.setVisible(false);
		
		//Option 3
//		JTextArea tf = new JTextArea();
//		tf.setText(ConvertToArray.convert(newMountains, 0)));
		
		//Option 4
//		String[] data = {newMountains.get(1).getName() + ": " + newMountains.get(1).getPrice(), newMountains.get(2).getName() + ": " + newMountains.get(2).getPrice(),}
//		JList<String> myList = new JList<String>(data);
//		for(int i = 0; i < myList.get; i++)
			
		
		
		}
	}
