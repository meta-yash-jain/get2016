package DS_Assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concordance {
	public static void main(String[] inputString) {
		if (!(inputString.length > 0)) {
			System.out.println("no data input");
			return;
		}
		String completeString = "";
		// remove spaces and generate a signal string
		for (String string : inputString) {
			completeString = completeString + string;
		}
		char[] charOfString = completeString.toCharArray();
		Map<Character, ArrayList<Integer>> dataMap = new HashMap<Character, ArrayList<Integer>>();
		for (int i = 0; i < charOfString.length; i++) {
			char c = charOfString[i];
			// if no key, add key
			if (!dataMap.containsKey(c)) {
				dataMap.put(c, new ArrayList<Integer>());
			}
			// add index in list
			dataMap.get(c).add(i);
		}
		System.out.println(dataMap);
	}
}