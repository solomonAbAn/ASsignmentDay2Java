package Questions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. Create a program to find the absolute value of a number without using the
		// Math class.

		System.out.println("Please enter a number, and I will give you the absolute value it:  ");
		Scanner kb = new Scanner(System.in);
		
		int d = kb.nextInt();
		
		int v = (d*d);
		double b = Math.sqrt(v);

		System.out.println("theabsolute value of d is " + b);
		
		kb.close();

	}

}
