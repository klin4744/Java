// Kevin Lin 110277459
import java.util.Scanner;
public class Rational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Enter a numerator for the first rational number: ");
		a = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the first rational number: ");
		b = stdin.nextInt();
		Rational r1 = new Rational(a,b);
		System.out.print("Enter a numerator for the second rational number: ");
		c = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the second rational number: ");
		d = stdin.nextInt();
		Rational r2 = new Rational(c,d);
		System.out.print("The first rational number is: " + r1.print());
		System.out.print("The second rational numer is: " + r2.print());
		System.out.print("Addition of the rational numbers is: " + r1.add(r2).print());
		System.out.print("Subtraction of the rational numbers is: " + r1.subtract(r2).print());
		System.out.print("Multiplication of the rational numbers is: " + r1.multiply(r2).print());
		System.out.print("Division of the rational numbers is: " + r1.divide(r2).print());
	}
	private int numerator,denominator;
	public Rational(int numerator, int denominator) {
		for(int i = Math.max(numerator,denominator); i > 0; i--) {
			if(numerator % i == 0 && denominator % i ==0) {
				numerator /= i;
				denominator /= i;
				break;
			}
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Rational add( Rational b) {
		if(this.denominator == b.denominator) {
			return new Rational(this.numerator + b.numerator, this.denominator);
		}else {
			int newANumerator = this.numerator * b.denominator,
				newBNumerator = b.numerator * this.denominator,
				sumNumerator = newANumerator + newBNumerator;
			return new Rational(sumNumerator, this.denominator * b.denominator);
				
		}
	}
	public Rational subtract( Rational b) {
		if(this.denominator == b.denominator) {
			return new Rational(this.numerator - b.numerator, this.denominator);
		}else {
			int newANumerator = this.numerator * b.denominator,
				newBNumerator = b.numerator * this.denominator,
				sumNumerator = newANumerator - newBNumerator;
			return new Rational(sumNumerator, this.denominator * b.denominator);
				
		}
	}
	public Rational multiply(Rational b) {
		return new Rational (this.numerator * b.numerator, this.denominator * b.denominator);
	}
	public Rational divide(Rational b) {
		return new Rational(this.numerator * b.denominator, this.denominator * b.numerator);
	}
	public String print() {
		return this.numerator + "/" + this.denominator + "\n";
	}
	

}
