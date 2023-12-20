package Questions;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9.	Create a program to compare two strings for equality.
		Scanner kb = new Scanner(System.in);

       
        System.out.println("Enter the first string:");
        String str1 = kb.nextLine();

        
        System.out.println("Enter the second string:");
        String str2 = kb.nextLine();

        
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

       
        kb.close();
		
		
		
		
		
		
	}

}
