package Questions;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//17.	Create a program to calculate the sum of natural numbers from 1 to N using a while loop.
		
		System.out.println("Give me a number, and I will calculate the sum of natural numbers from 1 to N:");

        Scanner kb = new Scanner(System.in);
        int numb = kb.nextInt();
        int sum = 0;
        int count = 1;

        while (count <= numb) {
            sum += count;
            count++;
        }

        System.out.println("The sum of natural numbers from 1 to " + numb + " is: " + sum);

        kb.close();
		
	}

}
