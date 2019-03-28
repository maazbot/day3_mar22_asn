package day3_22march_110697;

import java.util.regex.Pattern;

public class UserMainCode 
{
	public static int getSumofIntersection(int[] arr1, int[] arr2, int s1, int s2)
	{
		int sum = 0;
		int[] sharedvals = new int[Math.min(s1, s2)];
		int nextAvailSlot = 0;
		
		//we will outer loop through arr1 and inner loop through arr2.
		//if we spot a value common to both, we will 1. add it to sharedvals
		//and 2. remove it from both arrays (by setting it to a negative number)
		
		for (int i = 0; i < s1; i++)
		{
			if (arr1[i] >= 0)
			{
				for (int j = 0; j < s2; j++)
				{
					if (arr2[j] >= 0)
					{
						if(arr1[i] == arr2[j])
						{
							//first we add it to sharedvals
							sharedvals[nextAvailSlot] = arr2[j];
							
							//next we 'remove' it from both arrays
							arr1[i] = Integer.MIN_VALUE;
							arr2[j] = Integer.MIN_VALUE;
							
							//now we increment nextAvailSlot for the next potential match
							nextAvailSlot++;
						}
					}
				}
			}
				
		}
		
		for (int x: sharedvals)
		{
			sum += x;
		}
		
		return sum;
	}

	public static int getBigDiff(int[] arr)
	{
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		//this will loop for largest AND smallest.
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
			
			if(arr[i] < smallest)
			{
				smallest = arr[i];
			}
		}
		
		int diff = largest - smallest;
		return diff;
	}

	public static int validateNumber(String str)
	{
		boolean flag = false;
		
		if( Pattern.matches("^[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}$", str) )
			flag = true;
		
		if (flag == true)
			return 1;
		else
			return -1;
	}

	public static int validatePassword(String pass)
	{
		int flag = 1;
		int len = pass.length();
		
		if(6 <= len && len <= 20)
		{
			if(!Pattern.matches("^(?=.*[@#$])(?=.*[0-9]).{6,20}$", pass))
				flag = -1;
		}
		else
			flag = -1;
			
		return flag;
		
		
		//[a-zA-z0-9]*[@#$]+[a-zA-z0-9]*[@#$]*[a-zA-z0-9]*
	}

	public static int calculateElectricityBill(String r1, String r2, int i)
	{
		String num1 = r1.substring(5);
		String num2 = r2.substring(5);
		
		int bill = -1;
		
		if(!Pattern.matches("^[0-9]+$", num1) || !Pattern.matches("^[0-9]+$", num2))
		{
			return bill;
		}
		else
		{
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			bill = (n2-n1) * i;
		}
		
		return bill;
	}
}
