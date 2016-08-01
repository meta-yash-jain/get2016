package DS_Assignment1.assignment_2;

import DS_Assignment1.assignment_1.ArrayList;

public class List {	
	public static void main(String[] args){
		List list = new List();		
		// creating arraylist1 by using the previous class made in assignment one
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();		
		for(int i = 0; i <= 20 ; ++i){			
			arrayList1.add(i);
		}		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();		
		for(int i = 21;i <= 40 ; ++i){
			arrayList2.add(i);
		}		
		arrayList1 = list.mergeList(arrayList1, arrayList2);
		System.out.println("Merged List: ");		
		for(int i = 0; i < arrayList1.size(); ++i){			
			System.out.println(arrayList1.getIndex(i));
		}		
	}	
	/**
	 * @param arrayList1
	 * @param arrayList2
	 * @return merged array list
	 * this method adds arraylist2 to arraylist1
	 */
	public ArrayList<Integer> mergeList(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){		
		for(int i = 0; i < arrayList2.size(); ++i){			
			arrayList1.add(arrayList2.getElement(i));
		}		
		return arrayList1;
	}
}
