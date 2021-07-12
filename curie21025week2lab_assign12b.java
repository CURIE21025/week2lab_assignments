package curie;

import java.util.Scanner;

public class curie21025week2lab_assign12b {

	public static void main(String[] args) {
		// floyds triangle
		int row,number=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		 row =input.nextInt();
		System.out.println("floyds triangle");
		System.out.println("******************");
		for(counter=1;counter<=row;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
				
			}
			System.out.println();
		}
	}
}
		
		
		