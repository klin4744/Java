public class lab72 {
	public static void main(String[] args) {
		int rand1, rand2;
		String str = "";
		for(int i = 0; i<3; i++ ) {
			rand1 = (int) (Math.floor(Math.random() * (90-65) + 65));
			str += (char) rand1;
		}
		for(int j = 0; j<4; j++) {
			rand2 = (int) (Math.floor(Math.random() * 9 + 1));
			str +=  rand2;
		}
		System.out.println(str);
	}
}
