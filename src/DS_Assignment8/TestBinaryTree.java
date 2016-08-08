package DS_Assignment8;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestBinaryTree {
	@Test
	public void testPreOrder(){
		TreeSort<Integer> binaryTree= new TreeSort<Integer>();
		List<Integer> expected= new ArrayList<Integer>();

		binaryTree.insert(20, binaryTree.root);
		binaryTree.insert(15, binaryTree.root);
		binaryTree.insert(29, binaryTree.root);
		binaryTree.insert(13, binaryTree.root);
		binaryTree.insert(16, binaryTree.root);
		binaryTree.insert(21, binaryTree.root);
		binaryTree.insert(33, binaryTree.root);

		expected.add(20);
		expected.add(15);
		expected.add(13);
		expected.add(16);
		expected.add(29);
		expected.add(21);
		expected.add(33);
		
		assertEquals(expected, binaryTree.inOrder(binaryTree.root));
	}
	@Test
	public void testInOrder(){
		TreeSort<Integer> binaryTree= new TreeSort<Integer>();
		List<Integer> expected= new ArrayList<Integer>();

		binaryTree.insert(20, binaryTree.root);
		binaryTree.insert(15, binaryTree.root);
		binaryTree.insert(29, binaryTree.root);
		binaryTree.insert(13, binaryTree.root);
		binaryTree.insert(16, binaryTree.root);
		binaryTree.insert(21, binaryTree.root);
		binaryTree.insert(33, binaryTree.root);
		
		expected.add(13);
		expected.add(16);
		expected.add(15);
		expected.add(21);
		expected.add(33);
		expected.add(29);
		expected.add(20);
		
		assertEquals(expected, binaryTree.inOrder(binaryTree.root));
	}
}
