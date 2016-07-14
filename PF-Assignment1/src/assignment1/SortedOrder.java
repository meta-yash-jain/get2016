package assignment1;

public class SortedOrder {

	public int checksort(int a[]) {

		int flag=0,i;
		
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
				flag=1;
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
				if(a[i]>a[i+1])
				{
					flag=2;
				}
				else
				{
					flag=0;
					return flag;					
				}
				
			}
			if(flag==2)
				return flag;
			
		}
		else
			return flag;
		
		
	}

}
