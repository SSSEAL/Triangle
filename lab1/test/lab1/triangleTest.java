package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class triangleTest {

	public triangle tr = null;
	@Before
	public void setUp() throws Exception {
		tr = new triangle();
		System.out.println("begin");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End");
	}

	@Test
	public void testCal() {
		assertEquals("equilateral",tr.cal(1,1,1));
		assertEquals("isosceles",tr.cal(3,2,2));
		assertEquals("isosceles",tr.cal(2,3,2));
		assertEquals("isosceles",tr.cal(2,2,3));
		assertEquals("scalene",tr.cal(3,4,5));
		assertEquals("Not a triangle",tr.cal(1,1,3));
		assertEquals("Not a triangle",tr.cal(3,1,1));
		assertEquals("Not a triangle",tr.cal(1,3,1));
		//fail("Not yet implemented");
	}

}
