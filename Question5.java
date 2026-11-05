// Student ID: 5157004
// Name: Kopika Pakeerathan
// Assignment: 2
// Course: COSC-1046-F04 (Fall 2026)

package assignment_2;
import java.util.Scanner;

public class Question5 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a hexadecimal digit: ");
	        String text = input.nextLine();

	        // A hexadecimal digit must contain exactly one character
	        if (text.length() != 1) {
	            System.out.println(text + " is an invalid input");
	        } 
	        else {
	            char digit = Character.toUpperCase(text.charAt(0));
	            int value = -1;

	            if (digit >= '0' && digit <= '9') {
	                value = digit - '0';
	            } 
	            else if (digit >= 'A' && digit <= 'F') {
	                value = digit - 'A' + 10;
	            }

	            if (value == -1) {
	                System.out.println(text + " is an invalid input");
	            } 
	            else {
	                // Extract and print each of the four binary digits.
	                int bit1 = value / 8;
	                int bit2 = value / 4 % 2;
	                int bit3 = value / 2 % 2;
	                int bit4 = value % 2;

	                System.out.println("The binary value is " + bit1 + bit2 + bit3 + bit4);
	            }
	        }

	        input.close();
	    }


}
