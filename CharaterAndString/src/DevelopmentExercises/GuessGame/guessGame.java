package DevelopmentExercises.GuessGame;
import javax.swing.*;
public class guessGame {
	private String originWord;
	public guessGame(){
		setWord();
	}
	private void setWord(){
		String input = JOptionPane.showInputDialog(null, "Enter a word to play: ");
		boolean keepgoing = true;
		while(keepgoing){
			if(input.equalsIgnoreCase("")){
				JOptionPane.showConfirmDialog(null, "The message is empty, please try again");
				input = JOptionPane.showInputDialog(null, "Enter a word to play: ");
			}else{
				originWord = input;
				keepgoing = false;
			}
		}
	}
	public String getWord(){
		return originWord;
	}
	public int getLength(){
		return originWord.length();
	}
	public int getPosition(char a){
		return originWord.indexOf(a);
	}
	public char getChar(int index){
		return originWord.charAt(index);
	}
}
