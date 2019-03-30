// Kevin Lin 110277459
import java.util.Scanner;
public class Lab14_2 {

	public static void main(String[] args) {
		String row1,row2,row3,row4;
		double matrix[][] = new double[4][4];
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row, separate entries by a space");
		row1 = stdin.nextLine();
		row2 = stdin.nextLine();
		row3 = stdin.nextLine();
		row4 = stdin.nextLine();
		for(int i = 0; i< 4; i++) {
			for(int j=0; j<4; j++) {
				switch(i) {
				case 0: 
					if(row1.split(" ").length - 1 < j) {
						matrix[i][j] = 0;
					}else {
					matrix[i][j] = Double.parseDouble(row1.split(" ")[j]);
					}
					break;
				case 1:
					if(row2.split(" ").length - 1 < j) {
						matrix[i][j] = 0;
					}else {
					matrix[i][j] = Double.parseDouble(row2.split(" ")[j]);
					}
					break;
				case 2:
					if(row3.split(" ").length - 1 < j) {
						matrix[i][j] = 0;
					}else {
					matrix[i][j] = Double.parseDouble(row3.split(" ")[j]);
					}
					break;
				case 3:
					if(row4.split(" ").length - 1 < j) {
						matrix[i][j] = 0;
					}else {
					matrix[i][j] = Double.parseDouble(row4.split(" ")[j]);
					}
					break;
				}
			}
		}
		printMatrix(matrix);
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
		stdin.close();
		

	}
	public static void printMatrix(double[][] m) {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i =0; i<4; i++) {
			sum += m[i][i];
		}
		return sum;
	}

}
