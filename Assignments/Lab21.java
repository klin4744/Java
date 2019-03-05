import java.util.Scanner;
public class Lab21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v0;
		double v1;
		double t;
		double a;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a value for v0, then press enter: ");
		v0 = stdin.nextDouble();
		System.out.println("Please enter a value for v1, then press enter: ");
		v1 = stdin.nextDouble();
		System.out.println("Please enter a value for t, then press enter: ");
		t = stdin.nextDouble();
		a = (v1-v0)/t;
		System.out.println("The average acceleration for is " + a);
		

	}

}
