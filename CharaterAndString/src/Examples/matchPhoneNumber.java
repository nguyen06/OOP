package Examples;

import javax.swing.JOptionPane;

public class matchPhoneNumber {
	private static final String STOP = "STOP";
	private static final String VALID = "VALID";
	private static final String NOTVALID = "NOT VALID";
	private static final String VALID_IDENTIFIER = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reply;
		while(true){
			str = JOptionPane.showInputDialog(null,"Phone #: ");
			if(str.equals(STOP)) break;
			if(str.matches(VALID_IDENTIFIER)) reply = VALID;
			else reply =NOTVALID;
			JOptionPane.showMessageDialog(null, str + ":\n" + reply);
		}
	}

}
