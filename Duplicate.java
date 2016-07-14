/*
 * The logic is I am checking the no comes before in the array if so then shift all the no of array to left
 */
package assignment1;

public class Duplicate {
	
	 int[] removeDuplicate(int input[])	{
		int i,a,j,k,l;
		//calculating the length
		l=input.length;
		
		for(i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
				//if no comes before in the array
				if(input[i]==input[j])
				{
					a=j;
					//shift the remaining no to the left
					for(k=j+1;k<l;k++,a++)
					{
						input[a]=input[k];
					}
					//as the no is shifted reduce the length of array
					l--;
					j--;
				}
			}
		}
		
		//creating another array of the reduced length and copy all the elements to this array
		int result[]=new int[l];
		
		for(i=0;i<l;i++)
		{
			result[i]=input[i];
		}
		
	return result;		
	
	}
}
