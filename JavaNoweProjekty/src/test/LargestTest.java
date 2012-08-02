package test;

import JunitTestBook.Largest;
import junit.framework.TestCase;

public class LargestTest extends TestCase {

	public LargestTest(String name) {
		super(name);
	}

	public void testSimple() {

		assertEquals(9, Largest.largest(new int[] { 7, 8, 9 }));
	}

	public void testOrder() {

		assertEquals(9, Largest.largest(new int[] { 9, 8, 7 }));
		assertEquals(9, Largest.largest(new int[] { 7, 9, 8 }));
		assertEquals(9, Largest.largest(new int[] { 7, 8, 9 }));
	}

	public void testDups() {

		assertEquals(9, Largest.largest(new int[] { 7, 9, 8, 9 }));
	}

	public void testOne() {
		assertEquals(1, Largest.largest(new int[] { 1 }));
	}

	public void testNeg() {

		assertEquals(-7, Largest.largest(new int[] { -7, -8, -9 }));
	}
	public void testVoid() {

		try{
			Largest.largest(new int[] {});
			fail("Should have trrown a exception");
		}catch(RuntimeException e){
			assertTrue(true);
		}
	}

}
