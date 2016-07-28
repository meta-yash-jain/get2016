package DS_Assignment1.assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSinglyLinkedList {	
	SinglyLinkedList<String> singlyLinkedList;
	@Before
	public void setUp() throws Exception {
		singlyLinkedList = new SinglyLinkedList<String>();
	}
	@Test
	public void testAdd() {	
		assertEquals("Success", true, singlyLinkedList.add(0, "welcome"));
		assertEquals("Success", true, singlyLinkedList.add(1, "yash"));
		assertEquals("Success", true, singlyLinkedList.add(2, "to"));
		assertEquals("Success", true, singlyLinkedList.add(3, "Linked List"));		
	}
	@Test
	public void testRemoveE() {		
		assertEquals("Success", true, singlyLinkedList.add(0, "welcome"));
		assertEquals("Success", true, singlyLinkedList.add(1, "yash"));
		assertEquals("Success", true, singlyLinkedList.add(2, "to"));
		assertEquals("Success", true, singlyLinkedList.remove("welcome"));
		assertEquals("Success", true, singlyLinkedList.remove("yash"));
		assertEquals("Success", true, singlyLinkedList.remove("to"));
	}
	@Test
	public void testRemoveInt() {	
		assertEquals("Success", true, singlyLinkedList.add(0, "welcome"));
		assertEquals("Success", true, singlyLinkedList.add(1, "yash"));
		assertEquals("Success", true, singlyLinkedList.add(2, "to"));
		assertEquals("Success", true, singlyLinkedList.add(3, "Linked List"));
		assertEquals("Success",true,singlyLinkedList.remove(3));
	}
	@Test
	public void testGet() {	
		assertEquals("Success", true,singlyLinkedList.add(0, "this"));
		assertEquals("Success", true,singlyLinkedList.add(1, "is"));
		assertEquals("Success", true,singlyLinkedList.add(2, "Linked List"));		
		assertEquals("this", singlyLinkedList.get(0));
		assertEquals("is", singlyLinkedList.get(1));
	}
}