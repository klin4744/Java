import java.util.Scanner;
public class Lab3pt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create variables
		double a; double b; double c; double r1; double r2; double mid;
		// Create scanner instance
		Scanner stdin = new Scanner(System.in);
		// Prompt user for a
		System.out.println("Please enter a value for a: ");
		a = stdin.nextDouble();
		// Prompt user for b
		System.out.println("Please enter a value for b:");
		b = stdin.nextDouble();
		// Prompt user for c
		System.out.println("Please enter a value for c: ");
		c = stdin.nextDouble();
		mid = b*b - 4*a*c;
		// Calculate r1
		r1 = (-b + Math.pow(mid,0.5))/(2*a);
		// Calculate r2
		r2 = (-b - Math.pow((Math.pow(b,2) - 4*a*c), 0.5))/(2*a);
		if(Double.isNaN(r1) && Double.isNaN(r2)) {
			System.out.println("There are no real roots for these values");
		}else if(Double.isNaN(r1)) {
			System.out.println("The equation has one root: " + r2);
		}else if(Double.isNaN(r2)) {
			System.out.println("The equation has one root: " + r1);
		}else if(r1 == r2) {
			System.out.println("The equation has one root: " + r1);
		}else {
			System.out.println("The equation has two roots: "+ r1 + " " + r2);
		}
		stdin.close();
	}

}
