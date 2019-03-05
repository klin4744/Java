import java.util.Scanner;
public class Lab4pt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; boolean check1; boolean check2;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		num = stdin.nextInt();
		if(num % 5 == 0 && num % 6 == 0) {
			System.out.println("is " + num + " divisible by 5 and 6? true");
			check1 = true;
		}else {
			System.out.println("is " + num + " divisible by 5 and 6? false");
			check1 = false;
		}
		if(num % 5 == 0 || num % 6 == 0) {
			System.out.println("is " + num + " divisible by 5 or 6? true");
			check2 = true;
		}else {
			System.out.println("is " + num + " divisible by 5 or 6? false");
			check2 = false;
		}
		if(check2 && !check1) {
			System.out.println("is " + num + " divisible by 5 or 6, but not both? true");
		}else {
			System.out.println("is " + num + " divisible by 5 or 6, but not both? false");
		}
		stdin.close();
		
	}

}
