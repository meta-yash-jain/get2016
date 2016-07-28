package DS_Assignment1.assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import DS_Assignment1.assignment_1.ArrayList;

public class TestList {	
	List list ;
	ArrayList<Integer> arrayList1, arrayList2, expectedMergedList;
	@Before
	public void setUp() throws Exception {
		list = new List();
		arrayList1 = new ArrayList<Integer>();
		arrayList2 = new ArrayList<Integer>();
		expectedMergedList = new ArrayList<Integer>();
		for(int i = 2; i <= 10; ++i){			
			arrayList1.add(i);
		}
		for(int i = 11; i <= 20; ++i){			
			arrayList2.add(i);
		}		
		for(int i = 2; i <= 20; ++i){			
			expectedMergedList.add(i);
		}
	}
	@Test
	public void testMergeList() {		
		assertEquals(expectedMergedList, list.mergeList(arrayList1, arrayList2));
	}
}