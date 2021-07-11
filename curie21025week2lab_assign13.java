package curie;

import java.util.Scanner;

public class curie21025week2lab_assign13 {

	public static void main(String[] args) {
		// while loop
		int number, sum=0;
		System.out.println("enter an integer below 10:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		while(number<=10) {
			sum=sum+number;
			number++;
		}
System.out.format ("the while loop sum "+sum);
		
	}

}
