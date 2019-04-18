import java.util.*;
public class SumMajorDiagonal{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter dimension n of nxn matrix:");
		int n = Integer.parseInt(stdin.nextLine());
		double m[][] = new double[n][n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter row " + i + ": ");
			String str = stdin.nextLine();
			for(int j = 0; j<n; j++){
				m[i][j] = Double.parseDouble(str.split(" ")[j]);
			}
		}
		System.out.println(sumMajorDiagonal(m));
		stdin.close();
		
	}
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
		for(int i = 0; i< m.length; i++){
			sum += m[i][i];
		}
		return sum;
	}
	
}