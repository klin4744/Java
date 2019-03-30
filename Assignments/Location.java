//Kevin Lin 110277459
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter the number or rows and columns in the array separated by a space");
		s = stdin.nextLine();
		int r = Integer.parseInt(s.split(" ")[0]),
			c = Integer.parseInt(s.split(" ")[1]);
		double array[][] = new double[r][c];
		System.out.println("Enter the array, please enter number individually and press enter for each one: ");
		for(int i = 0; i< r; i++) {
			for(int j = 0; j< c; j++) {
				array[i][j] = stdin.nextDouble();
			}
			if( i < r-1) {
			System.out.println("Enter the data for the next row: ");
			}
		}
		System.out.println("Your array is: ");
		printMatrix(array);
		System.out.print("The location of the largest element " + locateLargest(array).maxValue + " is at (" + locateLargest(array).row + ", " + locateLargest(array).column + ")" );
		stdin.close();
	}
	private int row, column;
	private double maxValue;
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	public static Location locateLargest(double[][] a) {
		int row = 0, column = 0;
		double max = -Double.MAX_VALUE;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new Location(row,column,max);
	}
	public static void printMatrix(double[][] m) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
