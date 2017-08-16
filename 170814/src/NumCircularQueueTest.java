import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
 *  
 */

/**
 * @author 123
 *
 */
public class NumCircularQueueTest extends TestCase {

	/**
	 * @param name
	 */
	public NumCircularQueueTest(String name) {
		super(name);
	}

	/**
	 * @throws java.lang.Exception
	 */
	protected static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	protected static void tearDownAfterClass() throws Exception {
	}

	/* （非 Javadoc）
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* （非 Javadoc）
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * {@link NumCircularQueue#NumCircularQueue(int)} 的測試方法。
	 */
	public void testNumCircularQueue() {
		
	}

	/**
	 * {@link NumCircularQueue#Enqueue(int)} 的測試方法。
	 */
	public void testEnqueueInt() {
		NumCircularQueue numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueInt(0);
		numCircularQueue.EnqueueInt(1);
		numCircularQueue.EnqueueInt(2);
		numCircularQueue.EnqueueInt(3);
		assertArrayEquals(new int[] {1,2,3}, numCircularQueue.Requeue() ); 
		numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueInt(0);
		numCircularQueue.EnqueueInt(1);
		numCircularQueue.EnqueueInt(2);
		assertArrayEquals(new int[] {0,1,2}, numCircularQueue.Requeue() );
		numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueInt(0);
		numCircularQueue.EnqueueInt(1);
		assertArrayEquals(new int[] {0,1}, numCircularQueue.Requeue() ); 
		numCircularQueue = null;
		
	}
	public void testEnqueueIntArray() {
		NumCircularQueue numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueIntArray(new int[] {0,1,2,3});
		assertArrayEquals(new int[] {1,2,3}, numCircularQueue.Requeue() ); 
		numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueIntArray(new int[] {1,2,3});
		assertArrayEquals(new int[] {1,2,3}, numCircularQueue.Requeue() ); 
		numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueIntArray(new int[] {1,2});
		assertArrayEquals(new int[] {1,2}, numCircularQueue.Requeue() ); 
		numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueIntArray(new int[] {1});
		assertArrayEquals(new int[] {1}, numCircularQueue.Requeue() );
		numCircularQueue = new NumCircularQueue(4);
		numCircularQueue.EnqueueIntArray(new int[] {1,2,3,4,5});
		assertArrayEquals(new int[] {2,3,4,5}, numCircularQueue.Requeue() );
		numCircularQueue = null;
	}
	public void testRequeue(){
		NumCircularQueue numCircularQueue = new NumCircularQueue(3);
		numCircularQueue.EnqueueIntArray(new int[] {0,1,2,3});
		assertArrayEquals(new int[] {1,2,3}, numCircularQueue.Requeue() );
		numCircularQueue = null;
		
		
	}

}
