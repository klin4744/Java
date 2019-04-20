import java.util.*;
public class Lab20_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		System.out.print("Enter grades separated by a space: ");
		String str = stdin.nextLine();
		for(int i = 0; i< str.split(" ").length; i++) {
			list.add(Integer.parseInt(str.split(" ")[i]));
		}
		System.out.print("The grades are: " + score(list));
		stdin.close();
		
		
	}
	public static ArrayList<Character> score(ArrayList<Integer> list){
		ArrayList<Character> grade = new ArrayList<Character>();
		for(int i = 0; i<list.size(); i++) {
			int score = list.get(i);
			if(score >= 90) {
				grade.add('A');
			}else if(score <= 89 && score >= 80) {
				grade.add('B');
			}else if(score <= 79 && score >= 70) {
				grade.add('C');
			}else if(score <= 69 && score >= 60) {
				grade.add('D');
			}else {
				grade.add('F');
			}
		}
		return grade;
	}

}
