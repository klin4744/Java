// Kevin Lin 110277459
import java.util.Arrays;
import java.util.Scanner;
public class Lab11_2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str = "";
		System.out.println("Please enter 10 digits separated by a space: ");
		str = stdin.nextLine();
		String strList[] = str.split(" ");
		int list[] = new int[10];
		for(int i = 0 ; i<10 ; i++) {
			list[i] = Integer.parseInt(strList[i]);
		}
		System.out.println("The reversed array is " + Arrays.toString(reverse(list)));
		stdin.close();
	}
	public static int[] reverse(int[] list) {
		int temp;
		for(int i = 0; i< Math.floor(list.length/2); i++) {
			temp = list[i];
			list[i] = list[list.length - i - 1];
			list[list.length - i - 1] = temp;
		}
		return list;
	}

}
