import java.util.Scanner;
public class HW2_1 {

	public static void main(String[] args) {
		String str; 
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		str = stdin.nextLine();
		String str1 = str.toLowerCase();
		int j = str.length() -1; int i = 0;
		while(i != j) {
			if(i == str1.length() || j == 0) {
				break;
			}
			if(str1.charAt(i) == str1.charAt(j) || str1.charAt(i) == (char) 32 || str1.charAt(j) == (char) 32){
				i++;
				j--;
			}else {
				System.out.println(str + " is not a palindrome");
				stdin.close();
				return;
			}
		}
		System.out.println(str + " is a palindrome");
		stdin.close();

	}

}
