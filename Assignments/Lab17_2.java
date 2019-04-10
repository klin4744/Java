// Kevin Lin 110277459
import java.util.*;
public class Lab17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String s = stdin.nextLine();
		ArrayList<Character> list = toCharacterArray(s);
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		stdin.close();
	}
	public static ArrayList<Character> toCharacterArray(String s){
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i<s.length(); i++) {
			list.add(s.charAt(i));
		}
		return list;
		
	}

}
