/*
 * The logic is of the Merge sorting and return true or false if correctly inserted to another array
 */
package assignment1;

public class MergeSortedArray {

	//function to check insertion is proper or not and return true or false
	public boolean merging(int a[], int b[]){
		int asize=a.length;
		int bsize=b.length;
		boolean value=false;
		int c[] = new int[asize + bsize];

		//calling of the join function
		int result[]=join(a,asize,b,bsize,c);

		//check if it is successfully inserted in the third array
		for (int j=0; j<result.length-1;j++)
		{
			if(result[j] < result[j+1])
				value=true;
		}
		return value;
	}
	
	//function to join two sorted array in the third array
	int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int i=0, j = 0;
		
	for(int k = 0 ; k< (asize + bsize);k++)
	{
			if ( i >= asize ) 
			{
				c[k] = b[j];
				j ++;
			}
		else
		{	if ( j >= bsize) 
			{
				c[k] = a[i];
				i ++;
			}
			else
			{
				if ( a[i] < b[j]) 
				{
					c[k] = a[i];
					i ++;
				}
				else
				{
					c[k] = b[j];
					j ++;
				}
			}
		}
	}
		
		return c;
	}

}
