// Kevin Lin 110277459 Lab 5, Question 1
import java.util.Scanner;
public class Lab5_1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int result = 1, x; 
		System.out.println("Please enter a positive integer");
		x = stdin.nextInt();
		for(int i = x; i > 0; i--) {
			result *= i;
		}
		System.out.println(x + "! is equal to " + result);
		stdin.close();

	}

}
