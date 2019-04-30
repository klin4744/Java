// Kevin Lin 110277459
import java.util.*;
public class Lab22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		boolean valid = false;
		int a = 0, b = 0;
		do {
		try {
		System.out.print("Please enter two integers: ");
		a = stdin.nextInt();
		b = stdin.nextInt();
		valid = true;
		} catch (InputMismatchException e) {
			System.out.println("One of the inputs is not an integer: ");
			stdin.nextLine();
		}
		}while(!valid);
		stdin.close();
		int sum = a+b;
		System.out.println("The sum is " + sum );
		
	}

}
