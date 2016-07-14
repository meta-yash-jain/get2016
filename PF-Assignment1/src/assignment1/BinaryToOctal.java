package assignment1;


public class BinaryToOctal {

	int convertBinaryToOctal(int n)	{
		int rem,octnum=0,i=1,j=0;
		int arr[]=new int[5];

		while(n!=0)
		{
			rem=n%10;
			octnum=octnum+rem*i;
			i*=2;
			n=n/10;
			if(i==8){ i=1; arr[j]=octnum; j++; octnum=0; }
		}
		arr[j]=octnum;
		i=1;
		octnum=0;
		int a=j;
		j=0;
		while(j<=a){
			octnum=octnum+arr[j]*i;
			i*=10;
			j++;
		}
		
		return octnum;
	}
	
}


