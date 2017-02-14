import java.util.*;
import java.io.*;

public class ListFiller
	{
	static Scanner file;
	static ArrayList <Mountain> mountains = new ArrayList <Mountain>();
	
	public static void fillArray() throws IOException
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What state are you looking to ski in this weekend?");
		System.out.println("1) Colorado");
		String state = userInput.nextLine();
		if(state.equals("1"))
			{
			file = new Scanner(new File("ColoradoResorts.txt"));	
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
			String time = breakdown[7];
			int crowd = Integer.parseInt(breakdown[8]);
			mountains.add(new Mountain(name, park, powder, groomer, price, acres, miles, time, crowd));
			}
		}
	}
