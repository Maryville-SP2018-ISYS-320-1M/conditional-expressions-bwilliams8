/*
	ISYS 320
	Name(s): Brian Williams
	Date: 
*/

import java.util.Arrays;
import java.util.Scanner;

public class P3_Consecutive {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program calculates if three input values are consecutive.");
		
		String doItAgainResponse = "";
		
		do {
			System.out.print("Enter value 1: ");
			int num1 = console.nextInt();
			System.out.print("Enter value 2: ");
			int num2 = console.nextInt();
			System.out.print("Enter value 3: ");
			int num3 = console.nextInt();
		
			System.out.printf( "a: %d, b: %d, c: %d -> ", num1, num2, num3);
			
			if(areConsecutiveNumbers(num1, num2, num3)) {
				System.out.println("The numbers are consecutive.");
			} else {
				System.out.println("The numbers are not consecutive.");
			}

			
			System.out.println("Would you like to do it again (enter 'n' to quit)? ");
			doItAgainResponse = console.next();
		} while( !doItAgainResponse.equalsIgnoreCase("n"));
		
		System.out.println("Thanks!");
		console.close();
	}
	
	public static boolean areConsecutiveNumbers(int num1, int num2, int num3) {
		int[] numbers = {num1, num2, num3};
		Arrays.sort(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			if((i + 1) < numbers.length) {
				if(numbers[i] + 1 != numbers[i + 1]) { //Since the array is sorted, a simple check can be done to see if the next number is 1 greater.
					return false;
				}
			}
		}
		return true;
	}
	


}
