package curie;

import java.util.Scanner;

public class curie21025week2lab_assign20 {

	public static void main(String[] args) {
		// area of circle
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		double r=sc.nextDouble();
		double area=Math.PI*(r*r);
		double c=Math.PI*2*r;
		System.out.println("area of circle is "+area+";circumference is "+c);

	}

}
