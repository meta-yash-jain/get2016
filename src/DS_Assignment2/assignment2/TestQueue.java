package assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQueue {
	
	Queue<String> queue = new Queue<String>();
	@Test
	public void testEnqueue() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(true,queue.enqueue("bbb"));
		assertEquals(true,queue.enqueue("ccc"));
		assertEquals(true,queue.enqueue("ddd"));
		assertEquals(true,queue.enqueue("eee"));
		
	}
	@Test
	public void testDequeue() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(true,queue.enqueue("bbb"));
		assertEquals(true,queue.enqueue("ccc"));
		assertEquals("aaa",queue.dequeue());
		assertEquals("bbb",queue.dequeue());
		assertEquals("ccc",queue.dequeue());
	}
	@Test
	public void testMakeEmpty() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(true,queue.enqueue("bbb"));
		assertEquals(true,queue.enqueue("ccc"));
		assertEquals(true,queue.makeEmpty());
		
	}
	@Test
	public void testGetFront() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(true,queue.enqueue("bbb"));
		assertEquals(true,queue.enqueue("ccc"));
		assertEquals("aaa",queue.getFront());
	}
	@Test
	public void testIsEmpty() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(false,queue.isEmpty());
		assertEquals("aaa",queue.dequeue());
		assertEquals(true,queue.isEmpty());
	}
	@Test
	public void testgetSize() {
		
		assertEquals(true,queue.enqueue("aaa"));
		assertEquals(true,queue.enqueue("bbb"));
		assertEquals(true,queue.enqueue("ccc"));
		assertEquals(3,queue.getSize());
		assertEquals(true,queue.makeEmpty());
		assertEquals(0,queue.getSize());
		
	}
}