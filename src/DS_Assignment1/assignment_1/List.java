package DS_Assignment1.assignment_1;

public class List {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("welcome");
		arrayList.add("vaibhav");
		arrayList.sort();
		for(int i = 0 ;i < arrayList.size(); ++i){			
			System.out.println(arrayList.getElement(i));
		}
	}
}
