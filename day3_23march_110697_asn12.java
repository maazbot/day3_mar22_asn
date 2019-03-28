package day3_22march_110697;
import java.util.*;

public class day3_23march_110697_asn12 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How big is your array?");
		int len = scan.nextInt();
		
		int[] bigBoy = new int[len];
		
		for (int i = 0; i < bigBoy.length; i++)
		{
			System.out.println("What is the element in position " + i);
			bigBoy[i] = scan.nextInt();
		}
		
		int diff = UserMainCode.getBigDiff(bigBoy);
		System.out.println(diff);
		
		scan.close();
	}
}
