package day3_22march_110697;
import java.util.*;

public class day3_22march_110697_secondLargest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//ASSUMPTION: ALL ELEMENTS ARE UNIQUE.
		int[] arr = {1, 4, 7, 2, 8, 3, 9, 10, 5, 6};
		int largest, secondLarge;

		largest = arr[0];
		secondLarge = -9999999;
		
		//this will determine the largest value
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > largest)
				largest = arr[i];
		}
		
		//now the largest value has been found we will look for the second biggest value
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] != largest)
			{
				if (arr[i] > secondLarge)
					secondLarge = arr[i];	
			}
		}
		
		System.out.println("The second largest value is: " + secondLarge);
		System.out.println(largest);
		
		scan.close();
	}
}
