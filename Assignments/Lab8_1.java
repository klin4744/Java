import java.util.Scanner;
public class Lab8_1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String num = "", formatted = "(";
		System.out.println("Please enter a 10 digit phone number: ");
		num = stdin.nextLine();
		for(int i = 0; i< 10; i++) {
			if(i == 3 && formatted.length() == 4) {
				formatted += ")";
				i--;
			}else if(i == 6 && formatted.length() == 8) {
				formatted += "-";
				i--;
			}else {
			formatted += num.charAt(i);
			}
			
		}
		System.out.println(formatted);

	}

}
