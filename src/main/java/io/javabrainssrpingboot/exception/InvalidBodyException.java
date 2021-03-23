package io.javabrainssrpingboot.exception;


public class InvalidBodyException extends RuntimeException{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
     
	

	public InvalidBodyException(String message) {
		this.message=message;
			}
	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
