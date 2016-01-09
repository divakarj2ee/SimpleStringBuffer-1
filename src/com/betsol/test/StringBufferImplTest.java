/**
 * 
 */
package com.betsol.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Kasturi Hatti
 *
 * Test StringBuffer Implementation
 */
public class StringBufferImplTest {

	StringBufferImpl bufferImpl = new StringBufferImpl();
	
	/**
	 * check string appending
	 */
	@Test
	public void testBuffer(){		
		assertEquals("HelloWorld", bufferImpl.append("Hello").append("World").toString());
	}
	
	/**
	 * check for numerics
	 */
	@Test
	public void testNumericBuffering(){
		assertEquals("Hello0.3", bufferImpl.append("Hello").append(.3).toString());
	}
	 
}
