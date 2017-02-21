import java.util.*;
import java.io.*;

public class ListFiller
	{
	static Scanner file;
	static ArrayList <Mountain> mountains = new ArrayList <Mountain>();
	static String city;
	static String state2;
	
	public static void fillArray() throws IOException
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What state are you looking to ski in this weekend?");
		System.out.println("1) Colorado");
		System.out.println("2) Utah");
		String state = userInput.nextLine();
		if(state.equals("1"))
			{
			city = "Denver";
			state2 = "Colorado";
			file = new Scanner(new File("ColoradoResorts.txt"));	
			}
		if(state.equals("2"))
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
