// Kevin Lin 110277459
import java.util.Scanner;
public class Homework2_3 {

	public static void main(String[] args) {
		String str = "";
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter 10 string values separated by a comma and a space: ");
		str = stdin.nextLine();
		String list[] = str.split(", ");
		System.out.println(str);
		sort(list);
		str = String.join(", ", list);
		System.out.println("Sorted strings: " + str);
		

	}
	public static void sort(String[] list) {
		String temp = "";
		for(int i = 0; i<list.length; i++) {
			for(int j = 0; j<list.length-i; j++) {
				if(j+1 >= list.length - i) {
					break;
				}
				if(compare(list[j],list[j+1])) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	// Compare returns true if str1 is larger, false if str2 is larger
	public static boolean compare(String str1, String str2) {
		int value1 = 1;
		String st1 = str1.toLowerCase(), st2 = str2.toLowerCase();
		if(st1.charAt(0) > st2.charAt(0)) {
			return true;
		}else if(st1.charAt(0) == st2.charAt(0) ) {
			while(true) {
				if(st1.charAt(value1) != st2.charAt(value1)) {
					break;
				}
				if(value1 >= Math.min(st1.length(),st2.length())) {
					break;
				}
				value1++;
			}
			if(st1.charAt(value1) > st2.charAt(value1)) {
				return true;
			}
		}
		return false;
		

	}

}
