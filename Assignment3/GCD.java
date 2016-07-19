/*
 * The logic is find the remainder between two number if it is zero then terminate 
 */
package Assignment3;

public class GCD {
	  int findGCD(int num1, int num2) { 
		//base case 
		if(num2 == 0){ 
			return num1;
		} 
		return findGCD(num2, num1 % num2); 
		}
}
