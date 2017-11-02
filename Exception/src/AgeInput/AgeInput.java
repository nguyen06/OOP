package AgeInput;
import javax.swing.*;
public class AgeInput {
	private static final String DEFAULT_MESSAGE = "Your age";
	private static final int DEFAULT_LOWER_BOUND = 0;
	private static final int DEFAULT_UPPER_BOUND = 99;
	private int lowerBound;
	private int upperBound;
	
	public AgeInput(){
		this(DEFAULT_LOWER_BOUND,DEFAULT_UPPER_BOUND);
	}
	public AgeInput(int low, int up) throws IllegalArgumentException{
		if(low > up){
			throw new IllegalArgumentException("Low (" + low + ") was " +"larger than high( " + up+  ")");
		}else{
			lowerBound = low;
			upperBound = up;
		}
	}

	public int getAge() throws Exception{
		return getAge(DEFAULT_MESSAGE);
	}
	//call throws myException because it is exception propagator for myException
	public int getAge(String promp) throws myException{
		
		int age=0;
		boolean keepGoing=true;
		while(keepGoing){
			String inputStr = JOptionPane.showInputDialog(null,promp);
			try{
				age = Integer.parseInt(inputStr);
				if(age < lowerBound || age > upperBound){
					throw new myException(lowerBound,upperBound,age);
				}
				//return age;
				keepGoing = false;
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "'"+inputStr+ "' is invalid\n"+"Please enter digits only");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return age;
	}
}
