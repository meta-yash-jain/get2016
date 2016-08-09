package DS_Assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortingSystem {
	@Test
	public void testSorting() {
		SortingSystem sortingSystem= new SortingSystem();
		assertArrayEquals(new int[] {1,6,9},sortingSystem.sorting(new int[] {6,1,9}, 1 ));
	}
	
	@Test
	public void testSortName(){
		SortingSystem sortingSystem= new SortingSystem();
		//Bubble Sort
		assertArrayEquals(new int[] {1,6,9},sortingSystem.sorting(new int[] {6,1,9}, 1 ));
		assertEquals("Bubble Sort", sortingSystem.getSortName());
		//Quick Sort
		assertArrayEquals(new int[] {1,2,3,5,6,7,8,9,11,23,24,65},sortingSystem.sorting(new int[] {6,1,9,3,2,5,65,24,11,23,8,7}, 1 ));
		assertEquals("Quick Sort", sortingSystem.getSortName());
		//Counting Sort
		assertArrayEquals(new int[] {21,26,29},sortingSystem.sorting(new int[] {26,21,29}, 2 ));
		assertEquals("Counting Sort", sortingSystem.getSortName());
		//Radix Sort
		assertArrayEquals(new int[] {1,6,129},sortingSystem.sorting(new int[] {6,1,129}, 2 ));
		assertEquals("Radix Sort", sortingSystem.getSortName());
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testException(){
		SortingSystem sortingSystem= new SortingSystem();
		assertArrayEquals(new int[] {1,6,129},sortingSystem.sorting(new int[] {6,1,-129}, 2 ));
		assertEquals("Radix Sort", sortingSystem.getSortName());
	}
}