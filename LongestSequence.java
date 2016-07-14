/*
 * The logic is i count the longest increasing sequence and check with the previous count 
 * If it is greater than previous count then copy the whole sequence to another array
 */
package assignment1;

public class LongestSequence {

	int[] longestSequence(int input[]){
		int k,i,j,prevcount=0,l,count=0;
		
		//calculating the length and create another array of that length(brr)
		l=input.length;
		int brr[]=new int[l];
		
		for(i=0;i<l-1;i++)
		{
			if(input[i]<input[i+1])
			{
				count++;
			}
			else
			{
				if(prevcount<count)
				{
					for(j=i-count,k=0;j<=i;j++,k++)
					{
						brr[k]=input[j];
					}
					
					prevcount=count;
				}
				//reset the count to 0
				count=0;
			}
		}
		
		//if there is longest sequence at the end of the loop
		if(prevcount<count)
		{
			for(j=i-count,k=0;j<=i;j++,k++)
			{
				brr[k]=input[j];
			}
			prevcount=count;
		}
		
		//calculating the non zero element and store in the final array(result)
		count=0;
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]!=0)
			{
				count++;
			}
		}
		
		int result[]=new int[count];
	
		for(i=0;i<count;i++)
		{
			result[i]=brr[i];
		}
		
		return result;		
	}
}
