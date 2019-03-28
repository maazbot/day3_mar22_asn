package day3_22march_110697;
import java.util.*;

public class day3_22march_110697_asn11
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int arr1size, arr2size;
		
		System.out.println("What is the size of the first array?");
		arr1size = scan.nextInt();
		int[] arr1 = new int[arr1size];
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println("What is the element with index " + i + " in this array?");
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("What is the size of the second array?");
		arr2size = scan.nextInt();
		int[] arr2 = new int[arr2size];
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println("What is the element with index " + i + " in this array?");
			arr2[i] = scan.nextInt();
		}
		
		int sum = UserMainCode.getSumofIntersection(arr1, arr2, arr1size, arr2size);
		
		if (sum == -1)
			System.out.println("No Common Elements.");
		else
			System.out.println("the sum is " + sum);
		
		scan.close();
	}
}
