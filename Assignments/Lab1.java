import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		double radius; // declare a radius variable as a double 
		double area; // declare a area variable as a double
		System.out.print("Please enter a radius:-->"); // Prompt user for input
		Scanner stdin = new Scanner(System.in); // Create a new instance of scanner called stdin which inherits the System.in properties and methods.
		radius = stdin.nextDouble(); // Next double lets the user input a double value and sets it equal to radius
		// Compute area
		area = radius * radius * 3.14159;
		// Display the results
		System.out.println("The area for the circle of radius " + radius + " is " + area );
		stdin.close(); 
	}

}
