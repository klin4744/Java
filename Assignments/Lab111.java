import java.util.Scanner;
import java.util.Arrays;
public class Lab111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter the first list of integers separated by a space: ");
		String str = stdin.nextLine();
		String list1[] = str.split(" ");
		System.out.println("Please enter the second list of integers separated by a space: ");
		String str2 = stdin.nextLine();
		String list2[] = str2.split(" ");
		int merged[] = new int[list1.length + list2.length - 2];
		for(int i = 1 ; i< list1.length; i++) {
			merged[i-1] = Integer.parseInt(list1[i]);
		}
		for(int j=1; j<list2.length; j++) {
			merged[j+list1.length-2] = Integer.parseInt(list2[j]);
		}
		sort(merged);
		System.out.println("The merged list is " + Arrays.toString(merged).substring(1,Arrays.toString(merged).length()-1));
	}
	public static void sort(int list[]) {
		int placeholder;
		for(int i = 0; i< list.length; i++) {
			for(int j=0; j<list.length - i; j++) {
				if(j+1 > list.length-1) {
					break;
				}
				if(list[j] > list[j+1]) {
					placeholder = list[j];
					list[j] = list[j+1];
					list[j+1] = placeholder; 
				}
				}
			}
	}

}
