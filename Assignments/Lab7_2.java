public class Lab7_2 {

	public static void main(String[] args) {
		int randLetter;
		String plate = "";
		for(int i = 0; i<3 ; i++) {
			randLetter = (int) (Math.floor(Math.random() * (90-65) + 65));
			plate += (char) randLetter;
		}
		for(int j = 0; j<4; j++) {
			plate += (int) Math.floor(Math.random() *9) + 1;
		}
		System.out.println(plate);

	}

}
