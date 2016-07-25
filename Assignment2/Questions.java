package Assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questions implements Comparable<Questions> {
	private String questionString = null;
	public String getQuetext() {
		return questionString;
	}
	public void setQuetext(String quetext) {
		this.questionString = quetext;
	}
	@Override
	public int compareTo(Questions o) {
	 // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
        int last = this.questionString.toUpperCase().compareTo(o.questionString.toUpperCase());
        return last == 0 ? this.questionString.compareTo(o.questionString) : last;
	}
	public String[][] ques() throws IOException {
		BufferedReader in = null;
		String[][] ques = null;
		int counter = 0;
		try {
			in = new BufferedReader(new FileReader("Questions.txt"));
			String c;
			int i = 0;
	        while (in.readLine() != null) {
	        	counter++;
	        }
	        in.close();
	        in = new BufferedReader(new FileReader("Questions.txt"));
	        ques = new String[counter][];
	        while((c = in.readLine()) != null){
	        	ques[i++] = c.split(",");
	        }
	        in.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		return ques;
	}
}
