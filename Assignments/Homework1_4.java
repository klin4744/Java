// Kevin Lin   -  110277459    - HW 1 Question 4
import java.util.Scanner;
public class Homework1_4 {
	public static void main(String[] args) {
		String str; 
		int numOfUppercase = 0;
		Scanner stdin = new Scanner(System.in);
		// Prompt user for a string
		System.out.println("Please enter a string: ");
		str = stdin.nextLine();
		for(int i = 0; i<str.length();i++) {
			if(str.substring(i,i+1).matches("[A-Z]")) {
				// If the letter is upper case, increment
				numOfUppercase++;
			}
		}
		System.out.println("The number of uppercase letters is " + numOfUppercase);
		stdin.close();
	}
}
