import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
/**
 * 
 */

/**
 * @author DIANA
 *
 */
public class BufferTest {
	Buffer buffer;
	/**
	 * @throws java.lang.Exception
	 * 
	 */
	
	@Before
	public void setUp() throws Exception {
		buffer = new Buffer();
	}
	
	/**
	 * Test method for {@link receiver.Buffer#Buffer()}.
	 */
	@Test
	public void testBuffer() {
		assertNotNull("L'objet n'a pas été instancié", buffer);		
	}
}
