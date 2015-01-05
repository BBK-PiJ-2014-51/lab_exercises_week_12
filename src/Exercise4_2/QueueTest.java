package Exercise4_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {
	Queue queue = new Queue();
	@Test
	public void testSize() {
		Queue queue = new Queue();
		assertEquals(0, queue.size());
	}

	@Test
	public void testInsert() {
		Queue queue = new Queue();
		for (int i = 0; i < 10; i++){
			queue.insert(new Queue(i));
		}
		queue.listObjectsFromHead();
		System.out.println("" + queue.size());
		assertEquals(10, queue.size());
	}
	
	@Test
	public void testRetrieve() {
		assertEquals(0, queue.retrieve());
	}
	
	
}
