package assignment1;

public class FCFS {

	int [][]FirstComeFirstServe( int at [], int et[] ){

		int n,i,j;
		int[][] result = new int[et.length][3];

		n=et.length;
		
	    // Sort by arrival Times
	    for ( i = 0; i <= n; i++) {
	        for ( j = i + 1; j < n; j++)
	        {
	        	if (at[i] > at[j]) {
	      
	                // swap in arrival times
	                int tempA = at[i];
	                at[i] = at[j];
	                at[j] = tempA;

	                //swap in execution times too
	                int tempB = et[i];
	                et[i] = et[j];
	                et[j] = tempB;
	            }
	        }
	    }
	    
	    result[0][0]=0;
	    result[0][1]=1;
	    result[0][2]=et[0];

	    for ( i = 1; i < n; i++) {
	    	if(at[i]<result[i-1][2])
	    	{
	    		result[i][0]=result[i-1][2]-at[i];
	    		result[i][0]++;
	    		result[i][1]=result[i][0]+at[i];
	    		result[i][2]=result[i-1][2]+et[i];
	    	}
	    	else
	    	{
	    		result[i][0]=0;
	    		result[i][1]=result[i][0]+at[i];
	    		result[i][2]=at[i]+et[i];
	    		result[i][2]--;
	    	}
	    }

	    return result;
	}

}
