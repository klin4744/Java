//Kevin Lin 110277459
public class Lab20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10,30.5);
		System.out.println("The distance between point1 and point2 is: " + point1.distance(point2));
		
	}
	static class MyPoint{
		private double x = 0, y = 0;
		public MyPoint() {};
		public MyPoint(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public double distance(MyPoint point) {
			return Math.pow(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2) , 0.5);
		}
		public double distance(double x, double y) {
			return Math.pow(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) , 0.5);
		}
		static double distance(MyPoint point1, MyPoint point2) {
			return Math.pow(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2) , 0.5);
		}
	}
}
