package Assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SurveySorting {
	public static void main(String args[]) throws IOException{
		List<Questions> questions = new ArrayList<Questions>();
		String[][] que = new Questions().ques();
		for(int i = 0; i < que.length; i++){
			Questions question1 = new Questions();
			question1.setQuetext(que[i][0]);
			questions.add(question1);
		}
		 Collections.sort(questions);
		 for(Questions temp : questions){
				System.out.println(temp.getQuetext());	
			}
	}
}
