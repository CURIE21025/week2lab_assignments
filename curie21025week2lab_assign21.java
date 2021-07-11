package curie;

import java.util.Scanner;

public class curie21025week2lab_assign21 {

	public static void main(String[] args) {
		// reverse number
		int num=0, reversenum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		num=in.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
					num=num/10;
		}
System.out.println("reverse of the number is "+reversenum);
	}

}
