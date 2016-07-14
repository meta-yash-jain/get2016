package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFCFS {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	int at[] ={1,5,9,25} ;
	int et[] ={12,7,2,5} ;
	
	int expected[][] ={{0,1,12},{8,13,19},{11,20,21},{0,25,29}} ;

	@Test
	public void test() {
		FCFS conversion= new FCFS();
		assertArrayEquals(expected,conversion.FirstComeFirstServe(at, et));
			
	}

}
