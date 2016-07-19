/*
 * The logic is that if the smaller disc is under the larger disc then we cannot pop the disc or move it. 
 */
package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {

	public List<String> towerOfHanoi(int noOfDiscs, String start, String temp, String end, List<String> array) {
		//base condition
		if(noOfDiscs == 1){
			array.add("Move Disk " + noOfDiscs + " from " + start + " to " + end);
			return array;
		} else {
			towerOfHanoi(noOfDiscs-1, start, end, temp, array);
			array.add("Move Disk " + noOfDiscs + " from " + start + " to " + end);
			towerOfHanoi(noOfDiscs-1, temp, start, end, array);
			return array;
		}
	}
	// This function is only used to initialize inputs and return output
	public List<String> tower(int noOfDiscs, String start, String temp, String end) {
		List<String> output = new ArrayList<String>();
		towerOfHanoi(noOfDiscs, start, temp, end, output);
		for (String string : output) {
			System.out.println(string);
		}
		return output;
	}
}