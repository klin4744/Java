// Kevin Lin 110277459
import java.util.Scanner;
import java.util.Arrays;
public class Lab11_1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		System.out.println("Enter list1 size and contents");
		str1 = stdin.nextLine();
		String list1[] = str1.split(" ");
		System.out.println("Enter list2 size and contents");
		str2 = stdin.nextLine();
		String list2[] = str2.split(" ");
		System.out.println("The merged list is " + Arrays.toString(merge(list1,list2)));
		stdin.close();

	}
	public static int[] merge(String[] list1, String[] list2) {
		int mergedList[] = new int[list1.length + list2.length -2];
		for(int i = 1 ; i < list1.length; i++) {
			mergedList[i-1] = Integer.parseInt(list1[i]);
		}
		for(int i =  1; i<list2.length; i++) {
			mergedList[i + list1.length - 2] = Integer.parseInt(list2[i]);
		}
		sort(mergedList);
		return(mergedList);
	}
	public static void sort(int[] list) {
		int temp; 
		for(int i = 0 ; i < list.length; i++) {
			for(int j = 0; j < list.length; j++) {
				if(j + 1 == list.length) {
					break;
				}
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}

}
