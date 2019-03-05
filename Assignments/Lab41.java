import java.util.Scanner;
public class Lab41 {

	public static void main(String[] args) {
		// Create a variable to store the 3 digit integer
		int num;
		// Create an instance of Scanner
		Scanner stdin = new Scanner(System.in);
		// Prompt the user for the integer
		System.out.println("Please enter a 3 digit integer: ");
		num = stdin.nextInt();
		// Compare first and last numbers
		if(num%100%10 == (num-num%100)/100) {
		System.out.println(num + " is a palindrome.");
		}else {
			System.out.println(num + " is not a palindrome.");
		}
		stdin.close();
		
	}

}
