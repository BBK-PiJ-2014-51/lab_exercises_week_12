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
		assertEquals(allInRange, true);
	}
	
	@Test
	public void testZero() {
		assertEquals(isInRange(HashUtilities.shortHash(0)), true);
	}
	
	@Test
	public void test1001() {
		assertEquals(isInRange(HashUtilities.shortHash(1001)), true);
	}
	
	@Test
	public void testNegative() {
		assertEquals(isInRange(HashUtilities.shortHash(-3003)), true);
	}

	private boolean isInRange(int num){
		return !(num < 0 || num > 1000);
	}
}
