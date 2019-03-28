package day3_22march_110697;
import java.util.*;
public class day3_23march_110697_asn13
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the phone number?");
		String number = scan.nextLine();
		int x = UserMainCode.validateNumber(number);
		
		System.out.println(x);

		scan.close();
		
	}
}
