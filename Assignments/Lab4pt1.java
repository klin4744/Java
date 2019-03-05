import java.util.Scanner;
public class Lab4pt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer; 
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a 3 digit positive integer: ");
		integer = stdin.nextInt();
		// The last number in the integer is integer%100%10
		// 929% 100 = 29, 29%10 = 9
		// The first number in the integer is (integer - integer%100)/100
		// 929 - 929%100 = 900, 900/100 = 9
		if(integer%100%10 == (integer - integer%100)/100) {
			System.out.println(integer + " is a palindrome");
		}else {
			System.out.println(integer + " is not a palindrome");
		}
		stdin.close();
	}

}
