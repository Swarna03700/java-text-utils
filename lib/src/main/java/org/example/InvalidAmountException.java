package org.example;

public class InvalidAmountException extends IllegalArgumentException {
	
	/**
	 * Constructor to create an InvalidAmountException with a specific 
	 * error message.
	 * 
	 * @param message The error message
	 * 
	 */
	public InvalidAmountException(String message) {
		// super(message) passes the message to the parent class IllegalArgumentException constructor
		super(message);
	}
}
