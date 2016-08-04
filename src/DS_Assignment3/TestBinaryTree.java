package DS_Assignment3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void testPreOrder(){
		BinaryTree<Integer> binaryTree= new BinaryTree<Integer>();
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
		
		assertEquals(expected, binaryTree.preOrder(binaryTree.root));
	}
	
	
	@Test
	public void testPostOrder(){
		BinaryTree<Integer> binaryTree= new BinaryTree<Integer>();
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
		
		assertEquals(expected, binaryTree.postOrder(binaryTree.root));
	}

	
	@Test
	public void testMirror(){
		BinaryTree<Integer> binaryTree= new BinaryTree<Integer>();
		binaryTree.insert(20, binaryTree.root);
		binaryTree.insert(15, binaryTree.root);
		binaryTree.insert(29, binaryTree.root);
		binaryTree.insert(13, binaryTree.root);
		binaryTree.insert(16, binaryTree.root);
		binaryTree.insert(21, binaryTree.root);
		binaryTree.insert(33, binaryTree.root);
	
		
		binaryTree.insertMirror(20, binaryTree.rootMirror);
		binaryTree.insertMirror(15, binaryTree.rootMirror);
		binaryTree.insertMirror(29, binaryTree.rootMirror);
		binaryTree.insertMirror(13, binaryTree.rootMirror);
		binaryTree.insertMirror(16, binaryTree.rootMirror);
		binaryTree.insertMirror(21, binaryTree.rootMirror);
		binaryTree.insertMirror(33, binaryTree.rootMirror);

		assertEquals(true, binaryTree.mirrorEquals(binaryTree.root,binaryTree.rootMirror));
	}
}
