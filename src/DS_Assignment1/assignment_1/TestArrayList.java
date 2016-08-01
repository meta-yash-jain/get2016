package DS_Assignment1.assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {
	ArrayList<String> arrayList , reverseArraylist;
	@Before
	public void setUp() throws Exception {
		arrayList = new ArrayList<String>();
	}
	@Test
	public void testAddE() {	
		assertEquals("Success", true, arrayList.add("hello"));
		assertEquals("Success", true, arrayList.add("my"));
		assertEquals("Success", true, arrayList.add("name"));
		assertEquals("Success", true, arrayList.add("is"));
		assertEquals("Success", true, arrayList.add("yash"));
		assertEquals("Success", true, arrayList.add("welcome"));
		assertEquals("Success", true, arrayList.add("to"));
		assertEquals("Success", true, arrayList.add("my"));
		assertEquals("Success", true, arrayList.add("arrayList"));
		assertEquals("Success", true, arrayList.add("end"));
		assertEquals("Success", true, arrayList.add("of"));
		assertEquals("Success", true, arrayList.add("program"));
		
	}
	@Test
	public void testAddIntE() {
		assertEquals("Success", true, arrayList.add(0,"hello"));
		assertEquals("Success", true, arrayList.add(1,"my"));
		assertEquals("Success", true, arrayList.add(2,"name"));
		assertEquals("Success", true, arrayList.add(3,"is"));
		assertEquals("Success", true, arrayList.add(4,"yash"));
		assertEquals("Success", true, arrayList.add(5,"welcome"));
		assertEquals("Success", true, arrayList.add(6,"to"));
		assertEquals("Success", true, arrayList.add(7,"my"));
		assertEquals("Success", true, arrayList.add(8,"arrayList"));
		assertEquals("Success", true, arrayList.add(9,"end"));	 	
	}
	@Test
	public void testRemoveInt() {	
		assertEquals("Success", true, arrayList.remove(6));
		assertEquals("Success", true, arrayList.remove(7));
		assertEquals("Success", true, arrayList.remove(8));
		assertEquals("Success", true, arrayList.remove(9));		
	}
	@Test
	public void testRemoveE() {	
		assertEquals("Success", true, arrayList.remove("yash"));
		assertEquals("Success", true, arrayList.remove("hello"));
		assertEquals("Success", true, arrayList.remove("is"));
		assertEquals("Success", true, arrayList.remove("my"));		
	}
	@Test
	public void testGetIndex() {		
		assertEquals("Success", true, arrayList.add("people"));
		assertEquals("Success", true, arrayList.add("hello"));
		assertEquals("Success", 0, arrayList.getIndex("people"));
		assertEquals("Success", 1, arrayList.getIndex("hello"));		
	}
	@Test
	public void testGetElement() {		
		assertEquals("Success", true,arrayList.add("hello"));
		assertEquals("Success", true,arrayList.add("yash"));
		assertEquals("hello", arrayList.getElement(0));
		assertEquals("yash", arrayList.getElement(1));
	}	
	@Test
	public void testReverseList(){		
		assertEquals("Success", true, arrayList.add("hello"));
		assertEquals("Success", true, arrayList.add("yash"));
		assertEquals("Success", true, arrayList.add("welcome"));		
		arrayList.reverseList();		
		assertEquals("welcome", arrayList.getElement(0));
		assertEquals("yash", arrayList.getElement(1));
		assertEquals("hello", arrayList.getElement(2));		
	}
	@Test
	public void testClearList() {		
		assertEquals("Success", true, arrayList.clearList());
	}
}
