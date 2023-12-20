package Questions;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4.	Write a program to determine if a number is prime.
		
		
		System.out.println("please give me a number and i will see if it is a prime or no");
		Scanner kb = new Scanner(System.in);
		
		int a = kb.nextInt();
		int b = 1;
		int f = 0;
		int count = 1;
		
		while (count==a) {
			f = a / b;
			b++;
			count++;
		}
		
		
		System.out.println("your number is a prime number");
		
		kb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
