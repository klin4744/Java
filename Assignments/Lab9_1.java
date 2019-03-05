import java.util.Scanner;
public class Lab9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String str = "";
		int count = 0;
		char a;
		System.out.println("Please enter a string: ");
		str = stdin.nextLine();
		System.out.println("Please enter a character: ");
		a = stdin.next().charAt(0);
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == a) {
				count++;
			}
		}
		System.out.println(a + " appears " + count + " times in the string " + str);
		stdin.close();
		
		
		
	}

}
