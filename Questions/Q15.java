package Questions;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//15.	Create a program to check if a character is a vowel or a consonant using a switch statement.
		
		System.out.println("five me a letter and I will tell you if it is a vowel or consenent ");
		
		Scanner kb = new Scanner(System.in);
		String letter = kb.nextLine();
		
		String name;
		
		switch (letter) {
		case "a":
			name = "Vowel";
			
		break;
		
		case "o":
			name = "Vowel";
			
		break;
		case "u":
			name = "Vowel";
			
		break;
		case "i":
			name = "Vowel";
			
		break;
		case "y":
			name = "Vowel";
			
		break;
		default:
			name = "consenent";
		}
		
		System.out.println(name);
		
		kb.close();
		
	}

}
