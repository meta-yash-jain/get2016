package Assignment2;

public class Rating {
	private static int[] count;

	public void rating(String[][] ans){
		String[][] que = null;
		Questions question = new Questions();
		que = question.ques();
		for(int i = 0; i < que.length; i++){
			if(que[i][1].equalsIgnoreCase("single select")) {
				System.out.println(que[i][0] + " , " + que[i][1] + " , " + que[i][2]);
				int c = que[i][2].split("/").length;
				count = new int[c];
				for(int j = 0; j < ans.length; j++){
					int index = Integer.parseInt(ans[j][i]);
					count[index-1]++;
				}
			}
		}
		for(int i = 0; i < count.length; i++) {
			System.out.println((i+1) + ": " + (count[i] * 100 / ans.length));
		}
	}

}