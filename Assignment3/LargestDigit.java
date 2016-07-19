/*
 * The logic is take the last digit and if greater than temporary value
 * Than return greater value until all the digits are traversed
 */
package Assignment3;

public class LargestDigit {
	 int findLargeDigit(int number)
	{
	    int temp1, temp2;
	    if(number == 0)
	        return 0;
	    else{
	    	//Taking the last digit
	    	temp1 = number % 10;
	    	temp2 = findLargeDigit(number / 10);
	        if(temp1 > temp2)
	            return temp1;
	        else
	            return temp2;
	    }
	}
}
