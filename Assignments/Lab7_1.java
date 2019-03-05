import java.util.Scanner;
public class Lab7_1 {

	public static void main(String[] args) {
		String city1 = "", city2 = "", city3 = "";
		String first = "", second = "", third = "";
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter the first city: ");
		city1 = stdin.nextLine();
		System.out.println("Please enter the second city: ");
		city2 = stdin.nextLine();
		System.out.println("Please enter the third city: ");
		city3 = stdin.nextLine();
		if((int) (city1.charAt(0)) >= (int) (city2.charAt(0)) && city1.charAt(0) >= (int) (city3.charAt(0))) {
			first = city1;
			if((int) (city2.charAt(0)) > (int) (city3.charAt(0))){
				second = city2;
				third = city3;
			}else {
				second = city3;
				third = city2;
			}
		}
		if((int) (city2.charAt(0)) >= (int) (city1.charAt(0)) && city2.charAt(0) >= (int) (city3.charAt(0))) {
			first = city2;
			if((int) (city1.charAt(0)) > (int) (city3.charAt(0))){
				second = city1;
				third = city3;
			}else {
				second = city3;
				third = city1;
			}
		}

		if((int) (city3.charAt(0)) >= (int) (city2.charAt(0)) && city3.charAt(0) >= (int) (city1.charAt(0))) {
			first = city3;
			if((int) (city2.charAt(0)) > (int) (city1.charAt(0))){
				second = city2;
				third = city1;
			}else {
				second = city1;
				third = city2;
			}
		}
		System.out.println("The three cities in alphabetical order are: " + third + " " + second + " " + first);
		stdin.close();


	}

}
