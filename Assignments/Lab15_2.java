// Kevin Lin 110277459
public class Lab15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon poly1 = new RegularPolygon();
		System.out.println(poly1 + " - Area: " + poly1.getArea() + " Perimeter:" + poly1.getPerimeter() );
		RegularPolygon poly2 = new RegularPolygon(6,4);
		System.out.println(poly2 + " - Area: " + poly2.getArea() + " Perimeter:" + poly2.getPerimeter() );
		RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println(poly3 + " - Area: " + poly3.getArea() + " Perimeter:" + poly3.getPerimeter() );
	
	}
	static class RegularPolygon{
		private int n = 3;
		private double side = 1, x = 0, y = 0;
		public RegularPolygon() {
		}
		public RegularPolygon(int n, double side) {
			this.n = n;
			this.side = side;
		}
		public RegularPolygon(int n, double side,double x, double y) {
			this.n = n;
			this.side = side;
			this.x = x;
			this.y = y;
		}
		int getNumOfSides() { return this.n;};
		double getSideLength() {return this.side;};
		double getX() { return this.x; };
		double getY() { return this.y; };
		double getPerimeter() {
			return this.side*this.n;
		}
		double getArea() {
			return (this.n * this.side * this.side)/(4 * Math.tan(Math.PI/this.n));
		}
		
		
		
	}

}
