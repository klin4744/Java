// Kevin Lin   -  110277459    - HW 1 Question 3
import java.util.Scanner;
public class Homework1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str; 
		int vowels = 0;
		int consonants = 0;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		str = stdin.nextLine();
		for(int i = 0; i< str.length(); i++) {
			if(str.substring(i , i+1).matches("[aeiouAEIOU]")) {
				vowels++;
			}else if(str.substring(i, i+1).matches("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]")) {
				consonants++;
			}
		}
		System.out.println("The string " + str + " has " + vowels + " vowels and " + consonants + " consonants");
		stdin.close();
		

	}

}
