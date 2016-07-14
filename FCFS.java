/*
 * The logic is that i first sort the array by arrival time
 * I have taken a 2D array and calculating 
 * wt= waiting Time
 * et= execution Time
 * at= arrival Time 
 */
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
	        	if (at[i] > at[j]) 
	        	{
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
	    
	    //values for the first process
	    result[0][0]=0;
	    result[0][1]=1;
	    result[0][2]=et[0];

	    for ( i = 1; i < n; i++) {
	    	//if the process has to wait for the execution
	    	if(at[i]<result[i-1][2])
	    	{
	    		//waiting time calculation
	    		result[i][0]=result[i-1][2]-at[i];
	    		
	    		//increment in waiting time as the CPU start from 1
	    		result[i][0]++;
	    		
	    		//calculating starting time 
	    		result[i][1]=result[i][0]+at[i];
	    		
	    		//calculating Finished time
	    		result[i][2]=result[i-1][2]+et[i];
	    	}
	    	
	    	//if process does not have to wait for the execution
	    	else
	    	{
	    		//initialise as the waiting time as 0 as process does not have to wait
	    		result[i][0]=0;
	    		
	    		//calculating starting time 
	    		result[i][1]=result[i][0]+at[i];

	    		//calculating Finished time
	    		result[i][2]=at[i]+et[i];
	    		
	    		//decrement in finished time as the CPU start from 1
	    		result[i][2]--;
	    	}
	    }
	    return result;
	}
}
