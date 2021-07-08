package curie;

import java.util.Scanner;

public class curie21025week2lab_assign10 {

	public static void main(String[] args) {
		// odd or even if else
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scan.nextInt();
		if (num%2 ==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
		
		
		
		//ternary
		System.out.println((num%2==0)?"ternary even":"ternary odd");
		
		//switch
		switch(num%2)
		{
		 case 0:{ System.out.println("switch even");
		  break;
		 }
		
		 case 1:{System.out.println("switch odd");
		  break;
		 }
		}

	}
		

	}

}
