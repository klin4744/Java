
// Kevin Lin 110277459
import java.util.Scanner;

public class Homework2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "", str2 = "";
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter the first string: ");
		str1 = stdin.nextLine();
		System.out.print("Please enter the second string: ");
		str2 = stdin.nextLine();
		stdin.close();
		if (anagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT anagrams");
		}
	}

	public static boolean anagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int currentCharCount = 1, match = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.indexOf(str1.charAt(i)) != i) {
				continue;
			}
			for (int j = i + 1; j < str1.length(); j++) {
				if (str1.charAt(j) == str1.charAt(i)) {
					currentCharCount++;
				}
			}
			for (int k = 0; k < str2.length(); k++) {
				if (str2.charAt(k) == str1.charAt(i)) {
					match++;
				}
			}
			if (currentCharCount != match) {
				return false;
			}
			currentCharCount = 1;
			match = 0;

		}
		return true;
	}

}
