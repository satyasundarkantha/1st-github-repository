package aswini;

import java.util.*;

public class armstrong 
{
	public static void main(String[] args)
	{
		int n, original, sum=0, remainder;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		n = s.nextInt();
		original=n;
		while(n>0)
		{
			remainder = n%10;
			sum=sum+(remainder*remainder*remainder);
			n=n/10;
		}
		if(original==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not an armstrong number");
		}
	}
}
