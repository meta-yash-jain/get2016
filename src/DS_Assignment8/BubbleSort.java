package DS_Assignment8;

public class BubbleSort {
	/**
	 * 
	 * @param array
	 * @return sorted array
	 */
	public int[] bubbleSort(int[] array) {
		int j;
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false; 
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) 
				{
					temp = array[j]; 
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;
				}
			}
		}
		return array;
	}
}
