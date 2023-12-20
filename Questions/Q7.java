package Questions;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7.	Create a program to check if a number is positive, negative, or zero.
		
		
		System.out.println("5) please give me a number");
		Scanner negPos = new Scanner(System.in);
		double negpos = negPos.nextDouble();
		
		if(negpos > 0) {
			System.out.println("your number is positive");
		}
		else if (negpos == 0) {
			System.out.println("your number is zero");
		}
		else {
			System.out.println("your number is negative");
		}
		
		
		
		
		
		
		
		
		
	}

}
