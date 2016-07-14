package assignment1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestFCFS {

	//arrival time
	int at[] ={1,5,9,25} ;
	
	//Execution time
	int et[] ={12,7,2,5} ;
	
	//expected result
	int expected[][] ={{0,1,12},{8,13,19},{11,20,21},{0,25,29}} ;

	@Test
	public void test() {
		
		FCFS conversion= new FCFS();
		assertArrayEquals(expected,conversion.FirstComeFirstServe(at, et));
	}

}
