// Kevin Lin 110277459
import java.util.*;
public class Lab24_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter a binary string: ");
		String bin = stdin.nextLine();
		do {
			try {
				int dec = bin2Dec(bin);
			}catch(NumberFormatException e) {
				System.out.println("The string is not binary, enter a new string: ");
				bin = stdin.nextLine();
			}
		}while(!check(bin));
		int dec = bin2Dec(bin);
		System.out.print("The decimal number is " + dec);
		stdin.close();
	}
	public static int bin2Dec(String bin) {
		int total = 0;
		int currentExp = 0;
		if(check(bin)) {
			for(int i = bin.length() - 1; i >= 0; i--) {
					total += Character.getNumericValue(bin.charAt(i)) * (int) Math.pow(2, currentExp);
					currentExp++;
			}
		}else {
			throw new NumberFormatException("The string is not binary");
		}
		return total;
	}
	public static boolean check(String bin) {
		for(int i = 0; i<bin.length(); i++) {
			if(bin.charAt(i) < '0' || bin.charAt(i) > '1' ){
				return false;
			}
		}
		return true;
	}
	

}
