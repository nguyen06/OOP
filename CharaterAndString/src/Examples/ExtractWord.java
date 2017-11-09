package Examples;

import javax.swing.JOptionPane;

/*
 * 
 * Extract word in the given sentence and print
 * them using one line per word
 */
public class ExtractWord {
	
	private static final char BLANK = ' ';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index, numberOfCharacters, beginIndex, endIndex;
		String word, sentence = JOptionPane.showInputDialog(null,"Input: ");
		
		numberOfCharacters = sentence.length();
		index = 0;
		
		while(index < numberOfCharacters){
			while(index < numberOfCharacters && sentence.charAt(index) == BLANK){
				index++;
			}
			beginIndex = index;
			System.out.println(index);
			while(index < numberOfCharacters && sentence.charAt(index) != BLANK){
				index++;
			}
		
		endIndex = index;
		if(beginIndex != endIndex){
			word = sentence.substring(beginIndex, endIndex);
			System.out.println(word);
		}
		
	  }
	}
}
