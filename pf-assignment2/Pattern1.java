/*
 * The logic is the program is divided into 3 parts 
 * 1. spaces: to calculate space
 * 2. numbers: to calculate numbers
 * 3. print: to concatenate the above two functions result
 */
package assignment2;

public class Pattern1 {

	// to generate the whole row and stored in the array
	public String[] print(int n){
		int i, index = 0;		
		String result[] = new String[(2*n)-1];
		
		for(i = 1; i < 2*n; i++, index++){
		//calling of the two functions spaces and numbers and concatenate the result
		 result[index] = spaces(i, n) + numbers(i, n);	
		}
		return result;
	}

	//to generate the numbers in each row
	public String numbers(int row, int n){
		int a, j, k;
		String num = "";
		if(row <= n)
		{	
			a = row;
		}
		else
		{
			a = row-(row-n)*2;
		}

		for(j = 1; j <= a; j++)
		{
			num = num+j;
			if(j==a)
			{
				for(k = j-1; k > 0; k--)
				{
					num=num+k;
				}
			}
		}
		return num;
	}
	
	//to generate spaces in each row
	public String spaces(int row, int n)
	{
		int j;
		String space = "";
			if(row <= n)
			{
				j = n-row;
			}
			else
			{
				j = row-n;
			}
			for(;j!=0;j--)
			{
				space+= " ";
			}
			return space;
	}
}
