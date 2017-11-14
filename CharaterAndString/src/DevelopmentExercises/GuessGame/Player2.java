package DevelopmentExercises.GuessGame;
import javax.swing.*;
public class Player2 {
	private static final String VALID = "[a-zA-Z]";
	private char getChar;
	public Player2(){
		setChar();
	}
	private void setChar(){
		String input = JOptionPane.showInputDialog("Enter a guess character: ");
		boolean keepgoing = true;
		while(keepgoing){
			if(input.matches(VALID)){
				keepgoing = false;
				getChar = input.charAt(0);
				
			}else{
				JOptionPane.showConfirmDialog(null, "The input must be a lette, try again");
				input = JOptionPane.showInputDialog("Enter a guess character: ");
			}
		}
	}
	public char getCharacter(){
		return getChar;
	}
}
