// Kevin Lin   -  110277459    - HW 1 Question 1
import java.util.Scanner;
public class Homework1_1 {

	public static void main(String[] args) {
		// Create variables to store the 3 edges and one to check if valid
		double a; double b; double c; double perimeter; 
		// Create instance of Scanner
		Scanner stdin = new Scanner(System.in);
		// Prompt user for side a 
		System.out.println("Please enter the first side: ");
		a = stdin.nextDouble();
		// Prompt user for side b
		System.out.println("Please enter the next side: ");
		b = stdin.nextDouble();
		// Prompt user for the last side
		System.out.println("Please enter the last side: ");
		c = stdin.nextDouble();
		
		// Check if it is a valid triangle
		// First find out which variable is the largest 
		if(a + b > c && b+c > a && a+c >b) {
			perimeter = a + b + c;
			System.out.println("Your traingle is valid and the perimeter is " + perimeter);
		}else {
			System.out.println("Your triangle is not valid");
		}
		stdin.close();
	}

}
