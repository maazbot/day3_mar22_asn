package day3_22march_110697;
import java.util.*;

public class day3_22march_110697_scanCount 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 32, 32, 1, 2, 32, 23};
		int count = 0; //placeholder for index.
		
		System.out.println("What value are you looking for?");
		int val = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] == val)
			{
				count++;
			}
		}
		
		if(count == 0)
			System.out.println("Value not found.");
		else
			System.out.print("The value was counted " + count + " times.");
	
		scan.close();
	}
}
