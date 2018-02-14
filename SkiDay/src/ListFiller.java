import java.util.*;
import javax.swing.*;
import java.io.*;

public class ListFiller 
	{
	static Scanner file;
	static ArrayList <Mountain> mountains = new ArrayList <Mountain>();
	static String city;
	static String state2;
	static JFrame frame = new JFrame();
	
	public static void fillArray() throws IOException
		{
		ImageIcon image = new ImageIcon("mountains.jpg");
		JOptionPane.showMessageDialog(
				null, 
				"Welcome to the Ski App!",
				"Welcome",
				JOptionPane.CLOSED_OPTION,
				image
				);
		
		Object[] states = {"Colorado", "Utah"};
		int state = JOptionPane.showOptionDialog(
				null, 
				"What state are you looking to ski in this weekend?",
				"State Selection",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				states,
				states[0]
				);
		
		if(state == 0)
			{
			city = "Denver";
			state2 = "Colorado";
			file = new Scanner(new File("ColoradoResorts.txt"));	
			}
		if(state == 1)
			{
			city = "Salt Lake City";
			state2 = "Utah";
			file = new Scanner(new File("UtahResorts.txt"));	
			}
		while(file.hasNext())
			{
			String line = file.nextLine();
			String[] breakdown = line.split(", ");
			String name = breakdown[0];
			String park = breakdown[1];
			String powder = breakdown[2];
			String groomer = breakdown[3];
			int price = Integer.parseInt(breakdown[4]);
			int acres = Integer.parseInt(breakdown[5]);
			int miles = Integer.parseInt(breakdown[6]);
			int time = Integer.parseInt(breakdown[7].substring(0, 1))*60 + Integer.parseInt(breakdown[7].substring(2, breakdown[7].indexOf("m")));
			String timeR = breakdown[7];
			int crowd = Integer.parseInt(breakdown[8]);
			mountains.add(new Mountain(name, park, powder, groomer, price, acres, miles, time, timeR, crowd, 0, 0, 0, 0, 0, 0));
			}
		}
	}
