package DS_Assignment7;

public class BinarySearch {
	/**
	 * 
	 * @param array
	 * @param target
	 * @return position of the target
	 */
	public int binarySearch(int array[], int target) {
		return leftmostOccurence(array, 0, array.length - 1, target);
	}
	/**
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @param target
	 * @return position of the target
	 */
	public int leftmostOccurence(int[] array, int start, int end, int target) {
		int middle = (start + end) / 2;
		int temp;
		if (end < start) {
			return -1;
		}

		if (target == array[middle]) {
			temp = leftmostOccurence(array, start, middle - 1, target);
			if (temp == -1) {
				return middle + 1;
			} else {
				return temp;
			}
		} else {
			if (target < array[middle]) {
				return leftmostOccurence(array, start, middle - 1, target);
			} else {
				return leftmostOccurence(array, middle + 1, end, target);
			}
		}
	}
}
