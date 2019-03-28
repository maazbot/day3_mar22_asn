package day3_22march_110697;
import java.util.*;

public class day3_23march_110697_asn15 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first reading.");
		String s1 = scan.nextLine();
		System.out.println("Please enter the second reading.");
		String s2 = scan.nextLine();
		System.out.println("What is the billing rate?");
		int s3 = scan.nextInt();
		
		int b = UserMainCode.calculateElectricityBill(s1, s2, s3);
		
		System.out.println("The bill is : " + b);
		
		scan.close();
	}
}
