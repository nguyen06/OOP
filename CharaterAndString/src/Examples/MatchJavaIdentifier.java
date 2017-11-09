package Examples;
import javax.swing.*;
public class MatchJavaIdentifier {
	private static final String STOP = "STOP";
	private static final String VALID = "VALID";
	private static final String NOTVALID = "NOT VALID";
	private static final String VALID_IDENTIFIER = "[a-zA-Z][a-zA-Z0-9_$]*";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reply;
		while(true){
			str = JOptionPane.showInputDialog(null,"Identifier: ");
			if(str.equals(STOP)) break;
			if(str.matches(VALID_IDENTIFIER)) reply = VALID;
			else reply =NOTVALID;
			JOptionPane.showMessageDialog(null, str + ":\n" + reply);
		}

	}

}
