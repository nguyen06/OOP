package AgeInput;

public class myException extends Exception {
	private static final String DEFAULT_MESSAGE = "Input out of bound";
	
	private int lowerBound;
	private int upperBound;
	private int value;
	
	public myException(int low, int up, int input){
		this(DEFAULT_MESSAGE, low, up, input);
	}
	public myException(String msg, int low, int up, int input){
		super(msg);
		if(low >up){
			throw new IllegalArgumentException();
		}
		lowerBound = low;
		upperBound = up;
		value = input;
	}
	public int lowerBound(){
		return lowerBound;
	}
	public int upperBound(){
		return upperBound;
	}
	public int value(){
		return value;
	}
}
