// Kevin Lin   -  110277459    - HW 1 Question 2
import java.util.Scanner;
public class Homework1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String character; 
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		character = stdin.next();
		if(character.length() != 1) {
			System.out.println("Please enter a single letter. Input must have a length of 1");
			stdin.close();
			return;
		}
		if(character.matches("^[aeiouAEIOU]")){
			System.out.println(character + " is a vowel");
		}else if (character.matches("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]")) {
			System.out.println(character + " is a consonant");
		}else {
			System.out.println(character + " is not a valid input");
		}
		stdin.close();
		
	}

}
