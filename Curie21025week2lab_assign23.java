package curie;

import java.util.Scanner;

public class Curie21025week2lab_assign23 {

	public static void main(String[] args) {
		// check if a number is prime
		int temp;
		boolean isprime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if (temp==0)
					{
				isprime=false;
				break;
				
					}
		}
if(isprime)
System.out.println(num+" is a prime number");
else
	System.out.println(num+" not a prime number");
	

}
}

