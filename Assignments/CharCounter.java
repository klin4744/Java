import java.util.Scanner;
public class CharCounter{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = stdin.nextLine();
		System.out.println("Enter a character:");
		char c = stdin.next().charAt(0);
		System.out.println(c + " occurs " + check(str,c) + " times in the string" );
		stdin.close();
		
	}

	public static int check(String str, char c) {
		int count = 0;
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}