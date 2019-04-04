import java.util.Random;
public class Lab16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int matrix[][] = new int[4][4];
		for(int i = 0; i< matrix.length; i++) {
			for(int j = 0; j< matrix[0].length; j++) {
				matrix[i][j] = rand.nextInt(2);				
			}
		}
		printM(matrix);
		System.out.println("The largest row index: " + maxRow(matrix));
		System.out.println("The largest column index: " + maxColumn(matrix));
	}
	public static void printM( int[][] m) {
		for(int i = 0; i< m.length; i++) {
			for(int j = 0; j<m[0].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	public static int maxRow(int[][] m) {
		int currentMax = -1;
		int currentMaxIdx = 0;
		int currentCount = 0;
		for(int i = 0; i< m.length; i++) {
			for(int j = 0; j<m[0].length; j++) {
				if(m[i][j] == 1) {
					currentCount++;
				}
			}
			if(currentCount > currentMax) {
				currentMax = currentCount;
				currentMaxIdx = i;
			}
			currentCount = 0;
			
		}
		return currentMaxIdx;
	}
	public static int maxColumn(int[][] m ) {
		int currentMax = -1;
		int currentMaxIdx = 0;
		int currentCount = 0;
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[0].length; j++) {
				if(m[j][i] == 1) {
					currentCount++;
				}
			}
			if(currentCount > currentMax) {
				currentMax = currentCount;
				currentMaxIdx = i;
			}
			currentCount = 0;
		}
		return currentMaxIdx;
	}

}
