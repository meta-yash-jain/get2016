package DS_Assignment8;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestTreeSort {
	@Test
	public void testInOrder(){
		TreeSort<Integer> treeSort= new TreeSort<Integer>();
		List<Integer> expected= new ArrayList<Integer>();

		treeSort.insert(20, treeSort.root);
		treeSort.insert(15, treeSort.root);
		treeSort.insert(29, treeSort.root);
		treeSort.insert(13, treeSort.root);
		treeSort.insert(16, treeSort.root);
		treeSort.insert(21, treeSort.root);
		treeSort.insert(33, treeSort.root);

		expected.add(13);
		expected.add(15);
		expected.add(16);
		expected.add(20);
		expected.add(21);
		expected.add(29);
		expected.add(33);
		
		assertEquals(expected, treeSort.sort());
	}
}