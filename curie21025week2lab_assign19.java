package curie;

import java.util.Scanner;

public class curie21025week2lab_assign19 {

	public static void main(String[] args) {
		// area of triangle
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width of the triangle: ");
		double w=sc.nextDouble();
		System.out.println("Enter the height of the triangle: ");
		double h=sc.nextDouble();
		double area=(w*h)/2;
		System.out.println("area of the triangle is "+area);

	}

}
