
public class Lab17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static class GeometricObject{
		
	}
	static class Triangle extends GeometricObject{
		double side1 = 1, side2 = 1, side3 = 1;
		public Triangle(){};
		public Triangle(double a, double b, double c) {
			this.side1 = a;
			this.side2 = b;
			this.side3 = c;
		};
		double getSide1() {
			return this.side1;
		}
		double getSide2() {
			return this.side2;
		}
		double getSide3() {
			return this.side3;
		}
		double getArea() {
			double s = (this.side1 + this.side2 + this.side3)/2;
			return Math.pow(s*(s-this.side1)*(s-this.side2)*(s-this.side3), 0.5);
			
		}
		
	}

}
