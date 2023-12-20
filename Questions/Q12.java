package Questions;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12.	Write a program to convert a month number to its name
		
		
System.out.println("give me a number of a month and I will tell you which month it is ");
		
		
		Scanner kb = new Scanner(System.in);
		
		
		 
		int month = kb.nextInt();
		
		
		
		String name;
		switch(month) {
		
		case 1:
			name = "Jan";
			break;
			
		case 2:
			name = "Feb";
		
			break;
			
		case 3:
			name = "Mar";
			break;
		case 4:
			name = "Apr";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "Jun";
			break;
		case 7:
			name = "Jul";
			break;
		case 8:
			name = "Aug";
			break;
		case 9:
			name = "Sep";
			break;
		case 10:
			name = "Oct";
			break;
		case 11:
			name = "Nov";
			break;
		case 12:
			name = "Dec";
			break;
			
			default:
				name ="you need to give me a number between 1 and 12";
			
		}
		
		System.out.println(name);
		
		
		
		kb.close();
		
		
		
		
		
		
		
		
		
	}

}
