import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// Declare our variables
		double v0;
		double v1;
		double t;
		double acceleration;
		// Prompt user to input values for v0,v1, and t
		System.out.println("Please enter values for v0,v1, and t in the given order: ");
		// Create an instance of Scanner
		Scanner stdin = new Scanner(System.in);
		// Get the values as doubles:
		// First v0:
		System.out.println("Please enter v0, then hit enter: ");
		v0 = stdin.nextDouble();
		// Then v1:
		System.out.println("Please enter v1, then hit enter: ");
		v1 = stdin.nextDouble();
		// Then t
		System.out.println("Please enter t, then hit enter: ");
		t = stdin.nextDouble();
		// Calculate acceleration
		acceleration = (v1 - v0)/t;
		// Print acceleration
		System.out.println("The average acceleration for time=" + t +" v0=" + v0 + " and v1=" + v1 + " is: " + acceleration + "m/s^2");
		stdin.close();
	}

}
