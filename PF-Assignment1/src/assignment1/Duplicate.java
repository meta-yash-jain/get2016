package assignment1;

public class Duplicate {
	
	 int[] removeDuplicate(int input[])	{
		int i,a,j,k,l;
		l=input.length;
		for(i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
				if(input[i]==input[j])
				{
					a=j;
					for(k=j+1;k<l;k++,a++)
					{
						input[a]=input[k];
					}
					l--;j--;
				}
			}
		}
		int brr[]=new int[l];
		for(i=0;i<l;i++)
			{
			brr[i]=input[i];
			System.out.println(brr[i]);
			}
	return brr;		
	}
}
