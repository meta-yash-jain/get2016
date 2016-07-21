package Assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questions {

	private static BufferedReader in;

	public  String[][] ques() {
		String[][] results = null;
		try {
			in = new BufferedReader (new FileReader("F:\\Metacube\\Questions.txt"));
			String str;
			int i = 0,count = 0;
			while ((str = in.readLine()) != null) {
				count++;
			}
			in.close();
			in = new BufferedReader (new FileReader("F:\\Metacube\\Questions.txt"));
			results = new String[count][];
			while ((str = in.readLine()) != null) {
				results[i++] = str.split(",");
 			}
		}
		catch (IOException e) {
		}
		return results;		
	}
}
