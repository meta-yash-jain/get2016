/*
 *The Logic behind this program is that i am taking the last digit of binary no and get multiply the no in order of 1,2,4.
 *This will done for every 3 bit from right to left
 *Then the sum of the multiplication of 3 digit of binary no is stored in another array(arr)
 *Then the no is formed from the arr and return
 */

package assignment1;

public class BinaryToOctal {

	int convertBinaryToOctal(int n)	{
		int rem,octnum=0,i=1,j=0;
		int arr[]=new int[5];

		while(n!=0)
		{
			//taking last digit from right to left
			rem=n%10;
			octnum=octnum+rem*i;
			i*=2;
			n=n/10;
			//it means the 3 digit has taken so i==8
			if(i==8)
			{ 
				i=1; 
				arr[j]=octnum;
				j++;
				octnum=0;
			}
		}
		//the last no stored in array
		arr[j]=octnum;
		//reset i and octnum 
		i=1;
		octnum=0;
		int a=j;
		j=0;
		//generating the no from the array
		while(j<=a){
			octnum=octnum+arr[j]*i;
			i*=10;
			j++;
		}
		
		return octnum;
	}
	
}


