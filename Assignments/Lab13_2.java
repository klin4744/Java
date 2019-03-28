//Kevin Lin 110277459
public class Lab13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {0,0,0,0,0,0,0,0,0,0};
		int rand;
		for(int i = 0; i<100; i++) {
			rand = (int) Math.floor(Math.random() * 10);
			count[rand]++;
		}
		System.out.println("0: " + count[0]);
		System.out.println("1: " + count[1]);
		System.out.println("2: " + count[2]);
		System.out.println("3: " + count[3]);
		System.out.println("4: " + count[4]);
		System.out.println("5: " + count[5]);
		System.out.println("6: " + count[6]);
		System.out.println("7: " + count[7]);
		System.out.println("8: " + count[8]);
		System.out.println("9: " + count[9]);
	}

}
