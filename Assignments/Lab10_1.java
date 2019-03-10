import java.util.Scanner;
public class Lab10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);		
		double[] list = new double[10];
		for(int i = 0; i<10; i++) {
			System.out.println("Please enter a value: ");
			list[i] = stdin.nextDouble();
		}
		System.out.println("The mean is " + mean(list));
		System.out.println("The standard deviation is " + stdDev(list));
		stdin.close();
	}
	public static double stdDev(double[] list) {
		double sum = 0;
		double u = mean(list);
		for(int i = 0; i<list.length; i++) {
			sum += Math.pow((list[i] - u), 2);
		}
		return Math.pow((sum/9),0.5);
	}
	public static double mean(double[] list) {
		double sum = 0;
		for(int i = 0; i<list.length; i++) {
			sum += list[i];
		}
		return sum/10;
	}

}
