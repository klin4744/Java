// Kevin Lin 110277459;
import java.io.*;
public class Problem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("integerFile.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		String str = "";
		for(int i = 0; i< 100; i++) {
			str += (int) Math.floor(Math.random()*101) + " ";
		}
		FileWriter fileWriter = new FileWriter("integerFile.txt");
		fileWriter.write(str);
		fileWriter.close();
		System.out.println("File created/written on in " + file.getAbsolutePath());
		
	
		
	}

}
