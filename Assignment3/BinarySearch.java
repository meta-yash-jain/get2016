/*
 * The logic is break the array into 2 parts then again break into 2 parts so on
 * Until the array is divided into single parts
 */
package Assignment3;

public class BinarySearch {

	public int binarySearch(int array[], int target) {
		return binarySearch(array, 0, array.length-1, target);
	}
	public int binarySearch(int[] array, int start, int end, int target) {
	    int middle = (start + end) / 2;	    
	    //base condition if starting index crosses the ending index 
	    if(end < start) {
	        return -1;
	    } 
	    //condition if target is found
	    if(target == array[middle]) {
	        return middle + 1;
	    } 
	    else
	    {	//break into left parts
	    	if(target < array[middle]) {
	        return binarySearch(array, start, middle - 1, target);
	    	}
	    	//break into right parts
	    	else {
	        return binarySearch(array, middle + 1, end, target);
	    	}
	    }
	}
}
