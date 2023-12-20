package Questions;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//14.	Write a program to determine the number of days in a month using a switch statement.
		
System.out.println("give me a number of a month and I will tell you how many days in that month ");
		
		
		Scanner kb = new Scanner(System.in);
		
		
		 
		int month = kb.nextInt();
		
		
		
		String name;
		switch(month) {
		
		case 1:
			name = "Jan 31 days";
			break;
			
		case 2:
			name = "Feb 28 or 29 days";
		
			break;
			
		case 3:
			name = "Mar 31 days";
			break;
		case 4:
			name = "Apr 30 days";
			break;
		case 5:
			name = "May 31 days";
			break;
		case 6:
			name = "Jun 30 days";
			break;
		case 7:
			name = "Jul 31 days";
			break;
		case 8:
			name = "Aug 31 days";
			break;
		case 9:
			name = "Sep 30 days";
			break;
		case 10:
			name = "Oct 31 days";
			break;
		case 11:
			name = "Nov 30 days";
			break;
		case 12:
			name = "Dec 31 days";
			break;
			
			default:
				name ="you need to give me a number between 1 and 12";
			
		}
		
		System.out.println(name);
		
		
		
		kb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
