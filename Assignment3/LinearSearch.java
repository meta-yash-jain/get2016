/*
 * The logic is if element is found than the index + 1 value is returned else -1
 */
package Assignment3;

public class LinearSearch {
	public int linearSearch(int[] array, int start, int search) 
	{	 
	if(start==array.length)	{
			return -1;
	}
	else{
		if(array[start] == search) {
			return start + 1; 
		}
		else{
			return linearSearch(array, start+1, search);
			}	
		}
	 }
}
