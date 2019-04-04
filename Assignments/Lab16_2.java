// Kevin Lin 110277459
import java.util.Scanner;
public class Lab16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		double a,b,c,d,e,f;
		String str;
		System.out.print("Enter a,b,c,d,e,f separated by a space: ");
		str = stdin.nextLine();
		a = Double.parseDouble(str.split(" ")[0]);
		b = Double.parseDouble(str.split(" ")[1]);
		c = Double.parseDouble(str.split(" ")[2]);
		d = Double.parseDouble(str.split(" ")[3]);
		e = Double.parseDouble(str.split(" ")[4]);
		f = Double.parseDouble(str.split(" ")[5]);
		LinearEquation l = new LinearEquation(a,b,c,d,e,f);
		if(l.isSolveable()) {
			System.out.println("X is " + l.getX() + " and y is " + l.getY());
		}else {
			System.out.println("The equation has no solutions");
		}
		stdin.close();
	}
	static class LinearEquation{
		private double a,b,c,d,e,f;
		public LinearEquation(double a, double b,double c,double d,double e,double f) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.e = e;
			this.f = f;
		}
		double getA() {
			return this.a;
		}
		double getB() {
			return this.b;
		}
		double getC() {
			return this.c;
		}
		double getD() {
			return this.d;
		}
		double getE() {
			return this.e;
		}
		double getF() {
			return this.f;
		}
		boolean isSolveable() {
			return (this.a*this.d - this.b*this.c) != 0;
		}
		double getX() {
			return (this.e*this.d - this.b*this.f)/(this.a*this.d-this.b*this.c);		
		}
		double getY() {
			return (this.a*this.f - this.e*this.c)/(this.a*this.d-this.b*this.c);		
		}
	}

}
