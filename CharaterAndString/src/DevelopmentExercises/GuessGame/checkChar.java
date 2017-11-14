package DevelopmentExercises.GuessGame;

public class checkChar {
	private static char[] isAppear;
	public char[] check(Object player1, Object player2){
		guessGame player1Word = (guessGame) player1;
		Player2 player2Char = (Player2) player2;
		isAppear = new char[player1Word.getLength()];
		for(int i =0; i < player1Word.getLength(); i++){
			if(player2Char.getCharacter() == (player1Word.getWord().charAt(i))){
				isAppear[i] = player2Char.getCharacter();
			}

		}
		return isAppear;

	}
}
