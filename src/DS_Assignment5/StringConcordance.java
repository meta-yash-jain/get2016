package DS_Assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class StringConcordance {
	HashMap<Character, List<Integer>> concordanceTabel;
	public StringConcordance() {
		concordanceTabel = new HashMap<Character, List<Integer>>();
	}
	/**
	 * Checking where key is already present or not
	 * @param key is unique value
	 * @return true if it contains that key else false
	 */
	public boolean checkKeySet(char key) {
		Set<Character> keys = concordanceTabel.keySet();
		return keys.contains(key);
	}
	/**
	 * It check occurrence of the character at which position and add to hash map
	 */
	public void concordanceString(String string) {
		for (int index = 0; index < string.length(); index++) {
			char key = string.charAt(index);
			List<Integer> valueList = new ArrayList<Integer>();
			if (!checkKeySet(key)) {
				valueList.add(index);
				// Checking occurrence of the character
				for (int j = index + 1; j < string.length(); j++) {
					if (key == string.charAt(j)) {
						valueList.add(j);
					}
				}
				// Adding that list to hash map
				concordanceTabel.put(key, valueList);
			}
		}
	}
	/**
	 * It prints the character and its positions
	 */
	public void printIndex() {
		Set<Character> keys = concordanceTabel.keySet();
		for (Character character : keys) {
			List<Integer> Values = concordanceTabel.get(character);
			System.out.print(character + "=[ ");
			for (Integer integer : Values) {
				System.out.print(integer + " ");
			}
			System.out.println("]");
		}
	}
}