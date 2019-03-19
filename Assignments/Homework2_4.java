// Kevin Lin 110277459
import java.util.Scanner;
import java.text.DecimalFormat;
public class Homework2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		double a[][] = new double[3][3],
			   b[][] = new double[3][3];
		System.out.println("Please fill the first matrix by entering an element and pressing enter for all 9 elements. Placement is row is first filled then column!: ");
		fillMatrix(stdin,a);
		System.out.println("Please fill the second matrix by entering an element and pressing enter for all 9 elements. Placement is row is first filled then column!: ");
		fillMatrix(stdin,b);
		System.out.println("Matrix 1 is: ");
		printMatrix(a);
		System.out.println();
		System.out.println("Matrix 2 is: ");
		printMatrix(b);
		System.out.println();
		System.out.println("The multiplied matrix is: ");
		printMatrix(multiplyMatrix(a,b));
		

	}
	public static double[][] multiplyMatrix(double a[][], double b[][]){
		double c[][] = {{0,0,0},{0,0,0},{0,0,0}};
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				for(int k = 0; k<3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
			
		}
		
		return c;
	}
	public static void fillMatrix(Scanner stdin , double matrix[][]) {
		for(int i = 0 ; i<3 ; i++ ) {
			for(int j = 0; j<3; j++) {
				matrix[i][j] = stdin.nextDouble();
			}
		}
	}
	public static void printMatrix(double a[][]) {
		DecimalFormat numForm = new DecimalFormat("#.#");
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j<3 ; j++) {
				System.out.print(numForm.format(a[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
