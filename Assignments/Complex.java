//Kevin Lin 110277459
import java.util.Scanner;
public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		double a,b,c,d;
		System.out.print("Enter real part of the first complex number: ");
		a = stdin.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		b = stdin.nextDouble();
		Complex c1 = new Complex(a,b);
		System.out.print("Enter real part of the second complex number: ");
		c = stdin.nextDouble();
		System.out.print("Enter imaginary part of the second complex number: ");
		d = stdin.nextDouble();
		Complex c2 = new Complex(c,d);
		System.out.print("First complex number is: ");
		c1.print();
		System.out.print("Second complex number is: ");
		c2.print();
		System.out.print("Addition of the complex numbers is: ");
		c1.addComplex(c1,c2).print();
		System.out.print("Subtraction of the complex numbers is: ");
		c1.subtractComplex(c1,c2).print();
		stdin.close();
	}
	private double real = 1, imaginary = 1;
	public Complex(){
		
	}
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex addComplex(Complex a, Complex b) {
		return new Complex(a.real+b.real,a.imaginary+b.imaginary);
	}
	public Complex subtractComplex(Complex a, Complex b) {
		return new Complex(a.real-b.real,a.imaginary-b.imaginary);
	}
	public void print() {
		System.out.print("(" +this.real + ", " + this.imaginary + ")\n");
	}
}
