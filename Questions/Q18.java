package Questions;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//18.	Write a program to find the factorial of a number using a while loop.
		
		System.out.println("Give me a number, and I will calculate its factorial:");

        Scanner kb = new Scanner(System.in);
        int numb = kb.nextInt();
        int sum = 1;
        int oldsum = 1;
        int count = numb;

        while (count > 0) {
            oldsum = sum; 
            sum = sum * count;
            count--;
        }

        System.out.println("The factorial of " + numb + " is: " + oldsum);

        kb.close();
	}

}
