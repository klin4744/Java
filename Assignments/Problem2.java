//Kevin Lin 110277459
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = new Shape[6];
		arr[0] = new Circle(5);
		arr[1] = new Square(3);
		arr[2] = new Triangle(3,5);
		arr[3] = new Sphere(5);
		arr[4] = new Cube(3);
		arr[5] = new Tetrahedron(6);
		for(int i = 0; i< arr.length; i++) {
			System.out.print("Shape " + i + " is a " + arr[i].getClass().getSimpleName());
			if(arr[i] instanceof ThreeDimensionalShape) {
				System.out.print(", Volume: " + arr[i].getVolume());
			}
			System.out.print(", Area: " + arr[i].getArea());
			System.out.println();
		}
	}
	static class Shape{
		public Shape() {
			
		}
		public double getArea() {
			return 0;
		}
		public double getVolume() {
			return 0;
		}
	}
	static class TwoDimensionalShape extends Shape{
		public TwoDimensionalShape() {
			
		}
	}
	static class ThreeDimensionalShape extends Shape{
		public ThreeDimensionalShape() {
			
		}
		public double getVolume() {
			return 0;
		}
	}
	static class Circle extends TwoDimensionalShape{
		private double radius = 0;
		public Circle(double radius) {
			this.radius = radius;
		}
		public double getArea() {
			return this.radius * this.radius * Math.PI;
		}
		
	}
	static class Square extends TwoDimensionalShape{
		private double side = 0;
		public Square(double side) {
			this.side = side;
		}
		public double getArea() {
			return this.side * this.side;
		}
	}
	static class Triangle extends TwoDimensionalShape{
		private double base = 0, height = 0;
		public Triangle(double base, double height) {
			this.base = base;
			this.height = height;
		}
		public double getArea() {
			return this.base * this.height /2;
		}
	}
	static class Sphere extends ThreeDimensionalShape{
		private double radius;
		public Sphere(double radius) {
			this.radius = radius;
		}
		public double getArea() {
			return 4 * Math.PI * this.radius * this.radius;
		}
		public double getVolume() {
			return 4/3 * Math.PI * Math.pow(this.radius, 3);
		}
	}
	static class Cube extends ThreeDimensionalShape{
		private double side = 0;
		public Cube(double side) {
			this.side = side;
		}
		public double getArea() {
			return this.side * this.side * 6;
		}
		public double getVolume() {
			return Math.pow(this.side, 3);
		}
	}
	static class Tetrahedron extends ThreeDimensionalShape{
		public double edge = 0;
		public Tetrahedron(double edge) {
			this.edge = edge;
		}
		public double getArea() {
			return this.edge * this.edge * Math.pow(3, 0.5);
		}
		public double getVolume() {
			return Math.pow(this.edge, 3)/(6 * Math.pow(2, 0.5));
		}
	}
	

}
