import java.util.Arrays;
import java.util.Scanner;
public class Lab10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int[] list = new int[10];
		for(int i = 0; i<list.length; i++) {
			System.out.println("Please enter an integer: ");
			list[i] = stdin.nextInt();
		}
		System.out.println("The original numbers are: " + Arrays.toString(list));
		System.out.println("The distince numbers are: " +  Arrays.toString(eliminateDuplicate(list)));
		stdin.close();
	}
	public static int findLength(int[] list) {
		int length = 0;
		int test[] = new int[10];
		int index = 0;
		for(int i = 1; i<list.length; i++) {
			if(contains(test,list[i])) {
				continue;
			}else {
				test[index] = list[i];
				length++;
				index++;
		}
		}
		return length;
	}
	public static boolean contains(int[] list, int num) {
		for(int i = 0; i<list.length; i++) {
			if(list[i] == num) {
				return true;
			}
		}
		return false;
	}
	public static int[] eliminateDuplicate(int[] list) {
		int length = 0;
		int index = 1;
		// Find length
		length = findLength(list);
		System.out.println(length);
		int[] filtered = new int[length];
		System.out.println(length);
		filtered[0] = list[0];
		for(int i = 1; i<list.length; i++) {
			if(contains(filtered,list[i])) {
				continue;
			}else {
				filtered[index] = list[i];
				index++;
		}
		}
		return filtered;
	}
}
