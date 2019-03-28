package day3_22march_110697;
import java.util.*;

public class day3_23march_110697_asn14
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your password.");
		String str = scan.nextLine();
		
		int check = UserMainCode.validatePassword(str);
		
		if (check == 1)
			System.out.println("Valid Password.");
		else
			System.out.println("Invalid Password.");
		
		scan.close();
	}
}
