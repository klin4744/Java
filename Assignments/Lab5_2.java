// Kevin Lin 110277459, lab 5 question 2
import java.util.Scanner;
public class Lab5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		double area,s;
		int n; 
		System.out.println("Please enter the number of sides: ");
		n = stdin.nextInt();
		System.out.println("Please enter the length: ");
		s = stdin.nextDouble();
		// Calculate area
		area = (n * Math.pow(s, 2))/(4* Math.tan(Math.PI / n) );
		System.out.println("The area of the polygon is " + area);
		stdin.close();
	}

}
