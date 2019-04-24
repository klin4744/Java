//Kevin Lin 110277459
import java.util.*;
public class Lab222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = stdin.nextInt();
		stdin.close();
		System.out.println("The octal is " + reverse(toOctal(num)));
		
		
	}
	public static String toOctal(int num) {
		String str = "";
		int current = num;
		while(current/8 > 0) {
			str += current % 8;
			current /= 8;
		}
		str += current % 8;
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
