// Kevin Lin 110277459
import java.util.*;
public class Lab18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String arr1[] = {"Austin", "Dallas", "San Francisco"};
		String arr2[] = {"Boston", "Chicago", "Denver", "Seattle"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		System.out.print(mergeList(list1,list2));
		stdin.close();

	}
	public static ArrayList<String> mergeList(ArrayList<String> list1, ArrayList<String> list2){
		int pointer1 = 0, pointer2 = 0;
		ArrayList<String> merged = new ArrayList<String>();
		while(pointer1 + pointer2 < list1.size() + list2.size()) {
			if(pointer1 > list1.size() - 1) {
				merged.add(list2.get(pointer2));
				pointer2++;
			}else if (pointer2 > list2.size() - 1) {
				merged.add(list1.get(pointer1));
				pointer1++;
			}else {
				if(list1.get(pointer1).compareTo(list2.get(pointer2)) < 0) {
					merged.add(list1.get(pointer1));
					pointer1++;
				}else {
					merged.add(list2.get(pointer2));
					pointer2++;
				}
			}
		}
		return merged;
	}

}
