package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBinarytoOctal {

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

	@Test
	public void test() {
		BinaryToOctal conversion= new BinaryToOctal();
		assertEquals(15,conversion.convertBinaryToOctal(1101));
		assertEquals(165,conversion.convertBinaryToOctal(1110101));
		assertEquals(65,conversion.convertBinaryToOctal(110101));
		assertEquals(5,conversion.convertBinaryToOctal(101));
		
	}

}
