// Student ID: 5157004
// Name: Kopika Pakeerathan
// Assignment: 2
// Course: COSC-1046-F04 (Fall 2026)

package assignment_2;

public class Question4 {
	 public static void main(String[] args) {
		 //store the no of times each die side of the die appear
	        int count1 = 0;
	        int count2 = 0;
	        int count3 = 0;
	        int count4 = 0;
	        int count5 = 0;
	        int count6 = 0;
	        

	        // Roll the die 100,000 times.

	        for (int roll = 1; roll <= 100000; roll++) {
	        	// Generate a random integer from 1 to 6.
	            int number = (int) (Math.random() * 6) + 1;

	            switch (number) {
	                case 1:
	                    count1++;
	                    break;
	                case 2:
	                    count2++;
	                    break;
	                case 3:
	                    count3++;
	                    break;
	                case 4:
	                    count4++;
	                    break;
	                case 5:
	                    count5++;
	                    break;
	                case 6:
	                    count6++;
	                    break;
	            }
	        }

	        System.out.println("Results of rolling a six-sided die 100,000 times:");
	        System.out.println("Number 1 appeared: " + count1 + " times.");
	        System.out.println("Number 2 appeared: " + count2 + " times.");
	        System.out.println("Number 3 appeared: " + count3 + " times.");
	        System.out.println("Number 4 appeared: " + count4 + " times.");
	        System.out.println("Number 5 appeared: " + count5 + " times.");
	        System.out.println("Number 6 appeared: " + count6 + " times.");
	    }
	}


