// Kevin Lin 110277459
import java.util.Arrays;
import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int numbers[] = new int[10];
		for(int i = 0; i<numbers.length; i++) {
			System.out.println("Please enter a number: ");
			numbers[i] = stdin.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		eliminateDuplicate(numbers);
		stdin.close();
		
	}
	public static void eliminateDuplicate(int[] list) {
		int length = 0;
		// Check the number of unique values
		for(int i = 0; i< list.length; i++) {
			if(!repeated(list, list[i])) {
				length++;
			}
		}
		int uniqueNums[] = new int[length];
		int index = 0;
		for(int i = 0; i< list.length; i++) {
			if(!repeated(list,list[i])) {
				uniqueNums[index] = list[i];
				index ++;
			}
		}
		System.out.println(Arrays.toString(uniqueNums));
	}
	public static boolean repeated(int[] list, int num) {
		int leftPointer = 0;
		int rightPointer = list.length - 1;
		while(rightPointer != leftPointer) {
			if(list[leftPointer] == list[rightPointer]) {
				return true;
			}
			if(list[leftPointer] == num) {
				rightPointer --;
			}else {
				leftPointer++;
			}
		}
		return false;
	}

}
