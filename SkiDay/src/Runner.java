import java.io.*;
import java.util.*;

public class Runner
	{
	public static void main(String[] args) throws IOException
		{
		ListFiller.fillArray();
		Sort.skiingType();
		System.out.println();
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("What would you like to do?");
//		System.out.println("1) See individual sorted lists of mountain statistics");
//		System.out.println("2) Find your ideal mountain");
//		String answer = userInput.nextLine();
//		if(answer.equals("1"));
//			{
//			Sort.sort();
//			}
		Sort.idealDay();
		}
	}
