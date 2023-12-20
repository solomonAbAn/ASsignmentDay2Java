package Questions;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10.	Create a program to check if a number is a multiple of both 3 and 5.
		
		
		System.out.println("check if the number is multiple of both 3 and 5 ");
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		
		if (number%5==0 && number%3 == 0) {
			System.out.println("it is a multiple of 3 and 5 ");
		}
		else {
			System.out.println("it is not a multiple of 3 and 5 ");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
