//Kevin Lin 110277459
import java.util.*;
public class Lab211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = stdin.nextInt();
		stdin.close();
		System.out.println("The binary is " + reverse(toBinary(num)));
		
		
	}
	public static String toBinary(int num) {
		String str = "";
		int current = num;
		while(current/2 > 0) {
			str += current % 2;
			current /= 2;
		}
		str += current % 2;
		return str;
	}
	public static String reverse(String str) {
		String str1 = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			str1 += str.charAt(i);
		}
		return str1;
	}

}
