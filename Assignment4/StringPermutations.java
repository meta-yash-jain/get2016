/*
 * The logic is taking the last element of string and shift to left side
 * and check if the combination is already in the list or not
 * if element exists in list then skip else insert the combination
 */
package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	
	public List<String> generatePermutations(String str) {
		List<String> outputList = new ArrayList<String>();
		return getPermutations(str, outputList);
	}
	public  List<String> getPermutations(String input, List<String> outputList) {
		if(outputList.contains(input)) {
			return outputList;
		} else {
			outputList.add(input);
		}
		String combination = "";
		int inputLength = input.length();
		String lastCharacter = "" + (input.charAt(inputLength - 1));
		for(int index = inputLength-2; index >= 0; index--) {
			String firstPart = input.substring(0, index);
			String lastPart = input.substring(index, inputLength - 1);
			combination = firstPart + lastCharacter + lastPart;
			new StringPermutations().getPermutations(combination, outputList);	
		}
		return outputList;
	}
}
