// Kevin Lin 110277459
import java.util.*;
public class Lab18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>(5);
		ArrayList<Integer> list2 = new ArrayList<Integer>(5);
		System.out.print("Enter five integers for list1: ");
		String str1 = stdin.nextLine();
		for(int i = 0; i< 5; i++) {
			list1.add(Integer.parseInt(str1.split(" ")[i]));
		}
		System.out.print("Enter five integers for list2: ");
		String str2 = stdin.nextLine();
		for(int i = 0; i< 5; i++) {
				list2.add(Integer.parseInt(str2.split(" ")[i]));
		}
		System.out.print(union(list1,list2));
		stdin.close();
		
		
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> merged = new ArrayList<Integer>(list1.size() + list2.size());
		for(int i = 0; i< list1.size(); i++) {
			merged.add(list1.get(i));
		}
		for(int i = 0; i< list2.size(); i++) {
			merged.add(list2.get(i));
		}
		return merged;
	}

}
