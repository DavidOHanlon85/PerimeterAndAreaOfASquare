/**
 * 
 */
package slideDeckTasks;

import java.util.Scanner;

/**
 * 
 */
public class Exercise3_PerimeterOfSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare variables
		
		double length, perimeter, area;
		
		// Prompt user
		
		System.out.println("What length is the square? ");
		
		// Instantiate Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		// Get length of square
		
		length = scanner.nextDouble();
		scanner.nextLine();
		
		// Find perimeter
		
		perimeter = length * 4;
		area = Math.pow(length, 2);
		
		// Print perimeter
		
		System.out.printf("The perimeter of the square is: %.2f cm", perimeter);
		System.out.println();
		System.out.printf("The area of the square is: %.2f cm2", area);
		
		scanner.close();
	}

}
