package Questions;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.	Write a program to calculate the factorial of a number.

		System.out.println("Please enter a number, and I will calculate the factorial of it:");
        Scanner kb = new Scanner(System.in);
        int d = kb.nextInt();
        int fac = d;
        int count = 1;
        int e = d;

        while (count < d) {
            fac = fac*(e-1);
            count++;
            e--;
           
        }

        System.out.println("The factorial of " + d + " is: " + fac);

        kb.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
