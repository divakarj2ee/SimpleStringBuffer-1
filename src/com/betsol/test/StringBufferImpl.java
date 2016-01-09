/**
 * 
 */
package com.betsol.test;

import java.util.Arrays;

/**
 * @author Kasturi Hatti
 *
 * String Buffer Implementation
 */
public class StringBufferImpl {
	private int length;
	private char[] buffer;

	/**
	 * constructor for the user to define desired size
	 */
	public StringBufferImpl() {
		buffer = new char[5];
		length = 0;
	}

	/**
	 * append method implementation
	 * 
	 * @param str String
	 * @return buffer StringBufferImpl 
	 */
	public synchronized StringBufferImpl append(Object str){
		String string = str.toString();
		if(string != null){
			char[] charArray = string.toCharArray();
			int charArrayLength = charArray.length;
			// resize the char array and copy the original array elements into array with new length
			if(overFlow(charArrayLength)){
				buffer = Arrays.copyOf(buffer, newLength(charArrayLength));
			}
			// copy the characters to buffer
			for(int i=0; i<charArrayLength;i++){
				buffer[length++] = charArray[i];
			}
		}
		return this;

	}


	/**
	 * resizing the array 
	 * 
	 * @param charArrayLength int 
	 * @return buffer.length+charArrayLength+10 int 
	 */
	private int newLength(int charArrayLength) {
		return buffer.length+charArrayLength+10;
	}

	/**
	 * check if the length of the incoming string is more than array length
	 * 
	 * @param charArrayLength int 
	 * @return true/false boolean
	 */
	private boolean overFlow(int charArrayLength) {
		return (length+charArrayLength) > buffer.length;
	}
	
	/**
	 * toString method to return the string format
	 */
	public String toString() {
		return new String(buffer, 0, length);
	}
}
