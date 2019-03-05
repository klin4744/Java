// Kevin Lin 110277459
public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = 0;
		for(int i = 0; i < 10; i++) {
			int rand = (int) (Math.random()*100 + 1);
			System.out.println(rand);
			avg += rand;
		}
		System.out.println("The average is " + avg/10);
		
	}

}
