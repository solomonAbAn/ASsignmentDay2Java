package Questions;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//11.	Write a program to determine the day of the week based on a number.
		
		
		System.out.println("give me a number of a week and I will tell you which day it is ");
		
		
		Scanner kb = new Scanner(System.in);
		
		
		 
		int day = kb.nextInt();
		
		
		
		String name;
		switch(day) {
		
		case 1:
			name = "Monday";
			break;
			
		case 2:
			name = "Tuesday";
		
			break;
			
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
			
			default:
				name ="you need to give me a number between 1 and 7";
			
		}
		
		System.out.println(name);
		
		
		
		kb.close();
		
		
		
		
	}

}
