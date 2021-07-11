package curie;

import java.util.Scanner;

public class curie21025week2lab_assign25 {

	public static void main(String[] args) {
		// user input array sum
		Scanner sc=new Scanner(System.in);
		int[] array= new int[10];
		int sum=0;
		System.out.println("enter elements");
		for(int i=1;i<10;i++)
		{
			array[i]=sc.nextInt();
			
		}
		for(int num:array)
		{
		sum=sum+num;
		}
		System.out.println("sumof array is "+sum);
		

	}

}
