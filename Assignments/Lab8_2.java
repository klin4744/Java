import java.util.Scanner;
public class Lab8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String ans = "", input = "";
		System.out.println("Please enter an encrypted message");
		input = stdin.nextLine();
		for(int i = 0; i< input.length(); i+=2) {
			ans += input.charAt(i);
		}
		System.out.println(ans);
		stdin.close();
	}

}
