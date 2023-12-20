package Questions;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//19.	Write a program to generate a Fibonacci series using a while loop.
		
		int firstTerm = 0;
		int secondTerm = 1;
		int count = 0;
		
		
		System.out.println("give me a number");
		Scanner kb = new Scanner(System.in);
		int numb = kb.nextInt();
		
		while (count<=numb) {
			System.out.println(firstTerm);
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			count ++;
		}
		
		System.out.println();
		
		
	}

}
