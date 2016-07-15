/*
 * The logic is the program is divided into 3 parts 
 * 1. spaces: to calculate space
 * 2. numbers: to calculate numbers
 * 3. print: to concatenate the above two functions result
 */
package assignment2;

public class Pattern2 {
	
	// to generate the whole row and stored in the array
	public String[] print(int n){
		
		int i, index = 0;		
		String result[] = new String[n];
		
		for(i = 1; i <=n; i++, index++) {
		//calling of the two functions spaces and numbers and concatenate the result
		 result[index] = spaces(i, n) + numbers(i, n);	
		}
		return result;
	}
	
	//to generate the numbers in each row
	public String numbers(int row, int n)
	{
		int count = 1;
		String num = "";
		while(row <= n)
		{
			num = num + count;
			row++;
			count++;
		}
		return num;
	}
	
	//to generate spaces in each row	
	public String spaces(int row, int n)
	{
		row--;
		String space = "";
			while(row != 0)
			{
				space+= " ";
				row--;
			}
			return space;
	}
}
