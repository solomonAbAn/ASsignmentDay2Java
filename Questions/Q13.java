package Questions;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//13.	Write a program to find the discount based on the total purchase amount.
		
		System.out.println("what is the dicount percentage? ");
		Scanner kb = new Scanner(System.in);
		double disc = kb.nextDouble();
		
		System.out.println("what is the original price? ");
		double orig = kb.nextDouble();
		
		double n = ((100 - disc)/100) * orig;
		
		System.out.println("the price after the dicount would be " + n );
		
		
		
		kb.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
