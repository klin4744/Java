// Kevin Lin 110277459 
import java.io.*;
public class Lab24_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		BufferedReader r1 = new BufferedReader(new FileReader(file1));
		BufferedReader r2 = new BufferedReader(new FileReader(file2));
		int numOfDifferentLines = 0;
		String line1 = r1.readLine();
		String line2 = r2.readLine();
		while(line1 != null || line2 != null) {
			if(line1 == null && line2 == null) break;
			if(line1 == null && line2 != null) {
				numOfDifferentLines++ ;
			}else if(line2 == null && line1 != null) {
				 numOfDifferentLines++ ;
			}else if(line1 != null && line2 != null) {
				if(!line1.equals(line2)){
					numOfDifferentLines++;
				}
			}
			line1 = r1.readLine();
			line2 = r2.readLine();
		}
		r1.close();
		r2.close();
		if(numOfDifferentLines > 0 ) {
			System.out.println("The files are different by " + numOfDifferentLines + " lines");
		}else {
			System.out.println("The files are identical");
		}
	}


}
