import java.util.Scanner;
public class lab51 {
	public static void main(String[] args) {
		int solution = 1,
			x;
		Scanner stdin = new Scanner(System.in);
		// Prompt for an input
		System.out.println("Please enter a positive integer: ");
		x = stdin.nextInt();
		for(int i = x; i>0; i--) {
			solution *= i;
		}
		System.out.println(x +"! is equal to " + solution);
		
	}
}
