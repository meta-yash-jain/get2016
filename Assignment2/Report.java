package Assignment2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Report {

	public void report(String participant[][]){
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("F:\\Metacube\\Answer.txt"));
			String temp = "";
			for(int i = 0; i < participant.length; i++){
				for(int j = 0; j < participant[i].length; j++){
					temp = temp + "," + participant[i][j];   
				}
				temp = "Participant" + (i + 1) + temp;
				out.write(temp);
				out.newLine();
				temp="";
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
