// Kevin Lin 110277459
public class Lab13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5,35.9);
		Rectangle rect3 = new Rectangle();
		System.out.println("The rectangle of width " + rect1.width + " and of height " + rect1.height + " has a perimeter of " + rect1.getPerimeter() + " and an area of " + rect1.getArea());
		System.out.println("The rectangle of width " + rect2.width + " and of height " + rect2.height + " has a perimeter of " + rect2.getPerimeter() + " and an area of " + rect2.getArea());
		System.out.println("The rectangle of width " + rect3.width + " and of height " + rect3.height + " has a perimeter of " + rect3.getPerimeter() + " and an area of " + rect3.getArea());
		
	}
	static class Rectangle{
		private double width = 1, height = 1;
		public Rectangle() {};
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
		double getArea() {
			return width * height;
		}
		double getPerimeter() {
			return 2 * width + 2 * height;
		}
		
	}

}
