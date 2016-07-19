/*
 * The logic is Dividend = Divisor * Quotient + Remainder
 */
package Assignment3;

public class Remainder {

	public int remainder(int numerator, int denominator)
	{   //If denominator is zero then return Illegal Exception
		if (numerator < 0 || denominator <= 0)
			throw new IllegalArgumentException();
	    //Subtract the numerator from denominator until it is greater than denominator
		if(numerator >= denominator)
	    {    numerator = numerator - denominator;
	         remainder(numerator, denominator);
	    }
	    return numerator;
	}
}
