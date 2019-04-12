import java.util.*;
public class Lab181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[] = {"Austin", "Dallas", "San Francisco"};
		String arr2[] = {"Boston","Brook Stony","Chicago","Denver","Seattle" };
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println("List1 has its elements: " + list1);
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		System.out.println("List2 has its elements: " + list2);
		System.out.println("The merged list is " + mergeList(list1,list2));
	}
	public static ArrayList<String> mergeList(ArrayList<String> list1, ArrayList<String> list2){
		int length = list1.size()+list2.size();
		ArrayList<String> merged = new ArrayList<String>(length);
		int pointer1 = 0, pointer2 = 0;
		while(pointer1 + pointer2 < length) {
			if(pointer1 > list1.size() - 1) {
				merged.add(list2.get(pointer2));
				pointer2++;
			}else if(pointer2 > list2.size() -1) {
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
