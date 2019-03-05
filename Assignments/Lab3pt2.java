import java.util.Scanner;
public class Lab3pt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w; double cost;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a weight: ");
		w = stdin.nextDouble();
		if( w <= 0) {
			System.out.println("Invalid input");
			return;
		}
		if( w > 0 && w <= 1) {
			cost = 3.5;
		}else if( w > 1 && w<=3) {
			cost = 5.5;
		}else if( w > 3 && w<=10) {
			cost = 8.5;
		}else if( w > 10 && w<=20) {
			cost = 10.5;
		}else {
			System.out.println("The package cannot be shipped");
			return;
		}
		
		System.out.println("The cost to ship this package is $" + cost);
		stdin.close();

	}

}
