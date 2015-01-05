package Exercise2;

import static org.junit.Assert.*;
import org.junit.*;

public class HashUtilitiesTest {

	@Test
	public void testRandomNumbers() {
		boolean allInRange = true;
		for (int i = 0; i < 2000; i++){
			int rand = (int) (Math.random() * 40000.0);			
			if (!isInRange(HashUtilities.shortHash(rand))) allInRange = false;
		}
		assertEquals(true, allInRange);
	}
	
	@Test
	public void testZero() {
		assertEquals(true, isInRange(HashUtilities.shortHash(0)));
	}
	
	@Test
	public void test1001() {
		assertEquals(true, isInRange(HashUtilities.shortHash(1001)));
	}
	
	@Test
	public void testNegative() {
		assertEquals(true, isInRange(HashUtilities.shortHash(-3003)));
	}

	private boolean isInRange(int num){
		return !(num < 0 || num > 1000);
	}
}
