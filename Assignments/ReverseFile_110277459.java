//Kevin LIn 110277459
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ReverseFile_110277459 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("randString.txt");
		if(!file.exists()) {
			file.createNewFile();
			String str = "";
			for(int i = 0; i< 100; i++) {
				str += createRandomString() + " ";
			}
			System.out.println(str);
			FileWriter fileWriter = new FileWriter("randString.txt");
			fileWriter.write(str);
			fileWriter.close();
			System.out.println("File created/written on in " + file.getAbsolutePath());
		}
		FileReader fr = new FileReader(file);
		Scanner scanner = new Scanner(fr);
		ArrayList<String> arr = new ArrayList<String>();
		while(scanner.hasNext()) {
			arr.add(scanner.next());
		}
		fr.close();
		scanner.close();
		Collections.sort(arr);
		String sortedStr = "";
		for(int i = 0; i<arr.size(); i++) {
			sortedStr += arr.get(i) + " ";
		}
		System.out.print(sortedStr);
	}
	public static String createRandomString() {
		String str = "";
		char character;
		int strLength = (int) (Math.floor(Math.random() * ((10 - 3) + 3)));
		for(int i = 0; i<strLength+1; i++) {
			character = (char) (Math.floor(Math.random() * ((122 - 48) + 48)));
			while ((character >= ':' && character <= '@') || (character >= '[' && character <= '`')) {
				character = (char) (int) (Math.random() * ((122 - 48) + 48));
			}
			str += character;
		}
		return str;
	}

}
