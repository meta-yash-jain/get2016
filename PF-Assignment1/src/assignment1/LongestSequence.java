package assignment1;

public class LongestSequence {

	public static void main(String args[])
	{
		int arr[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9},i,j,prevcount=0,l,count=0;
		l=arr.length;
		for(i=0;i<l;i++)
		{
			if(arr[i]<arr[i+1])
				count++;
			else
			{
				if(prevcount<count)
				{
					int brr[]=new int[count];
					for(j=0;i<l;i++)
					{
						
					}
					
					prevcount=count;
				}
				count=0;
			}
		}
		
	}
}
