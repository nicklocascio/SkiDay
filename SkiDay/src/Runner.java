import java.io.*;
import java.util.*;

public class Runner
	{
	public static void mainMenu()
		{
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) See individual sorted lists of mountain statistics");
		System.out.println("2) Find your ideal mountain");
		int answer = userInput.nextInt();
		if(answer == 1)
			{
			Sort.sort();
			}
		else if(answer == 2)
			{
			Sort.idealDay();
			}	
		}
		
	public static void main(String[] args) throws IOException
		{
		ListFiller.fillArray();
		Sort.skiingType();
		mainMenu();
		System.out.println("Sounds good! Have fun out there and be safe!");
		}
	}
