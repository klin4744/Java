import java.util.Scanner;
public class Lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double m = 0;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a value for i: ");
		i = stdin.nextInt();
		System.out.println("i              m(i)");
		for(int j = 1; j<=i; j++) {
			m += (double) j/(j + 1.0);
			if(j>= 10) {
				System.out.println(j + "             " + m);
			}else {
				System.out.println(j + "              " + m);
			}
		}
		stdin.close();
		

	}

}
