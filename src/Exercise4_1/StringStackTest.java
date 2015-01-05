package Exercise4_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringStackTest {
	
	@Test
	public void testEmptyArrayStack() {		
		StringStack arrayStack = new ArrayStringStack();
		assertEquals(true, arrayStack.isEmpty());
	}
	
	@Test
	public void testEmptyPointerStack() {
		StringStack pointerStack = new PointerStringStack();
		assertEquals(true, pointerStack.isEmpty());
	}
	
	@Test
	public void testPushValuesArrayStack() {
		StringStack arrayStack = loadArray(new ArrayStringStack());		
		assertEquals(false, arrayStack.isEmpty());
	}
	
	@Test
	public void testPushValuesPointerStack() {
		StringStack pointerStack = loadArray(new PointerStringStack());	
		assertEquals(false, pointerStack.isEmpty());
	}
	
	@Test
	public void testPeekValueArrayStack() {
		StringStack arrayStack = loadArray(new ArrayStringStack());
		assertEquals("9", arrayStack.peek());
	}
	
	@Test
	public void testPeakValuePointerStack() {
		StringStack pointerStack = loadArray(new PointerStringStack());
		assertEquals("9", pointerStack.peek());
	}
	
	@Test
	public void testPopValueArrayStack() {
		StringStack arrayStack = loadArray(new ArrayStringStack());
		assertEquals("9", arrayStack.pop());
	}
	
	@Test
	public void testPopValuePointerStack() {
		StringStack pointerStack = loadArray(new PointerStringStack());
		assertEquals("9", pointerStack.pop());
	}
	
	@Test
	public void testPopAllArrayStack() {
		StringStack arrayStack = loadArray(new ArrayStringStack());
		arrayStack = emptyArray(arrayStack);
		assertEquals(true, arrayStack.isEmpty());
	}
	
	@Test
	public void testPopAllPointerStack() {
		StringStack pointerStack = loadArray(new PointerStringStack());
		pointerStack = emptyArray(pointerStack);
		assertEquals(true, pointerStack.isEmpty());
	}
	
	private StringStack loadArray(StringStack stack){
		for (int i = 0; i < 10; i++){
			stack.push(String.valueOf(i));
		}
		return stack;
	}
	
	private StringStack emptyArray(StringStack stack){
		for (int i = 0; i < 10; i++){
			stack.pop();
		}
		return stack;
	}

}