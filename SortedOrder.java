/*
 * The logic is i have check cases in the array
 * 1. increasing to decreasing
 * 2. decreasing to increasing
 * 3. increasing
 * 4. decreasing 
 * There are 4 flag values
 * "0"= Array is not in any order
 * "1"= Array is in increasing order
 * "2"= Array is in decreasing order
 * "-1"= None of the case
 */
package assignment1;

public class SortedOrder {

	public int checksort(int a[]) {

		int flag=0,i;
		
		for(i=0;i<a.length-1;i++)
		{
			//checking increasing order
			if(a[i]<a[i+1])
			{
				flag=1;
			}
			else
			{
				flag=2;
				break;
			}
		}
		if(flag==2)
		{
			for(i=0;i<a.length-1;i++)
			{
				//checking decreasing order
				if(a[i]>a[i+1])
				{
					flag=2;
				}
				else
				{
					flag=0;
					
					 // Array is not in any order
					return flag;					
				}
				
			}
			if(flag==2)
			{
				 // Array is in decreasing order
				return flag;
			}
		}
		else
		{
			 // Array is in increasing order
			return flag;
		}
		
		 // None of the case		
		return -1;
	}

}
