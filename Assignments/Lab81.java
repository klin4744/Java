import java.util.Scanner;
public class Lab81 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String number = "", formatted = "(";
		System.out.println("Please enter a 10 digit phone number ");
		number = stdin.nextLine();
		if(number.length() != 10) {
			System.out.println("The number must be 10 digits long");		
		}else {
			for(int i = 0; i<10; i++) {
				if(i == 3 & formatted.length() == 4) {
					formatted += ")";
					i--;
				}else if (i == 6 && formatted.length() == 8) {
					formatted += "-";
					i--;
				}else {
					formatted += number.charAt(i);
				}
			}
		}
		System.out.println(formatted);
		stdin.close();

	}

}
