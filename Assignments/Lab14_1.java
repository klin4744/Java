// Kevin Lin 110277459
import java.util.Scanner;
public class Lab14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter a value for a: ");
		a = stdin.nextDouble();
		System.out.print("Please enter a value for b: ");
		b = stdin.nextDouble();
		System.out.print("Please enter a value for c: ");
		c = stdin.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a,b,c);
		if(q.getDiscriminant() <0 ) {
			System.out.println("The equation has no real roots");
		}else if(q.getRoot1() == q.getRoot2()){
			System.out.println("The equation has one root: " + q.getRoot1());
		}else {
			System.out.println("The equation has two roots " + q.getRoot1() + " and " + q.getRoot2());
		}
		stdin.close();
	}
	static class QuadraticEquation{
		private double a,b,c;
		public QuadraticEquation(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		double getA() {
			return a;
		}
		double getB() {
			return b;
		}
		double getC() {
			return c;
		}		
		double getDiscriminant() {
			return b*b - 4*a*c;
		}
		double getRoot1() {
			if(this.getDiscriminant() <0 ) {
				return 0;
			}
			return (-b + Math.pow(b*b-4*a*c,0.5 ))/(2*a);
		}
		double getRoot2() {
			if(this.getDiscriminant() <0 ) {
				return 0;
			}
			return (-b - Math.pow(b*b-4*a*c,0.5 ))/(2*a);
		}
	}

}
