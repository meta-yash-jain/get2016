package DS_Assignment2.assignment_1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestStack {
	Stack<String> stack ;
	@Before
	public void setUp() throws Exception {
		stack = new Stack<String>();
	}
	@Test
	public void testPush() {
		assertEquals("Success", true, stack.push("aaa"));
		assertEquals("Success", true, stack.push("bbb"));
		assertEquals("Success", true, stack.push("ccc"));
		assertEquals("Success", true, stack.push("ddd"));
		assertEquals("Success", true, stack.push("eee"));
		assertEquals("Success", true, stack.push("fff"));
		assertEquals("Success", true, stack.push("ggg"));
	}
	@Test
	public void testPop() {
		assertEquals("Success", true, stack.push("ccc"));
		assertEquals("Success", true, stack.push("ddd"));
		assertEquals("Success", true, stack.push("eee"));
		assertEquals("Success", true, stack.push("fff"));
		assertEquals("Success", true, stack.push("ggg"));
		assertEquals("ggg", stack.pop());
		assertEquals("fff", stack.pop());
		assertEquals("eee", stack.pop());
		assertEquals("ddd", stack.pop());
		assertEquals("ccc", stack.pop());
	}
	@Test
	public void testGetTop() {
		assertEquals("Success", true, stack.push("ccc"));
		assertEquals("Success", true, stack.push("ddd"));
		assertEquals("Success", true, stack.push("eee"));
		assertEquals("Success", true, stack.push("fff"));
		assertEquals("Success", true, stack.push("ggg"));
		assertEquals("ggg", stack.getTop());
	}
	@Test
	public void testIsEmpty() {
		assertEquals("Success", true, stack.push("ccc"));
		assertEquals("Success", false, stack.isEmpty());
		assertEquals("ccc", stack.pop());
		assertEquals("Success", true, stack.isEmpty());
	}
	@Test
	public void testgetSize() {
		assertEquals("Success", true, stack.push("ccc"));
		assertEquals("Success", true, stack.push("ddd"));
		assertEquals(2, stack.getSize());
	}
}