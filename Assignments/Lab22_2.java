// Kevin Lin 110277459
import java.util.*;
public class Lab22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		for(int i =0; i<100; i++)
			arr[i] = (int) (Math.floor(Math.random() * 101) + 1);
		Scanner stdin = new Scanner(System.in);
		boolean good = false;
		int idx = 0;
		do {
			try {
				System.out.print("Please enter an index 0 to 99: ");
				idx = stdin.nextInt();
				System.out.println("The number is " + arr[idx]);
				good = true;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("The index is out of bounds");
				stdin.nextLine();
				
			}
		}while(!good);
		stdin.close();
	}

}
