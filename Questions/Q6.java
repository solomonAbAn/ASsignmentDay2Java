package Questions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6.	Write a Java program to check if a person is eligible to vote.
		
		
		
		System.out.println("please give me your age");
		Scanner ageVote = new Scanner(System.in);
		int vote = ageVote.nextInt();
		
		
		if(vote>=18) {
			System.out.println("your voice can make a change please go vote you are eligible");
		}
		
		else {
			System.out.println("I am sorry you are not eligible to vote you are still under 18");
		}
		
		
	}

}
