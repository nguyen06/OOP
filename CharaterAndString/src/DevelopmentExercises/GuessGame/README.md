
 ## Problem description:
 Write a word guessing game. The game is played by two players, each player take a turn in guessing the secret word entered by the other player. Ask the first player to enter a secret word. After a secret word is entered, display a hint that consists of a row of dashes, one for each letter in the secret word. Then ask the second player to guess a letter in the secret word. if the leter is in the secret word, replace the dashes in the hint with the letter at all positions where this letter occurs in the word. if the letter does not appear in the word, the number of incorrect guesses is incremented by 1. The second player keeps 
guessing letters until either:
	+ the player guesses all the letters in the word
	+ the player makes 10 incorrect guess.  
### Support the following features:
- Accept an input in either lower case or upper case.
- If the player enters something other than a single letter ̣( digit, special character, multiple letters, etc.),display an error message. The number of incorrect guess is not incremented.
- If the player enters the same letter more than once, reply with the previous hind.
- Entering an incorrect letter the second time is counted as another wrong another wrong guess, For example, suppose the letter W is not in the secret word. Every time the player enters W as a guess, the number of incorrect guesses is increment by 1.

After a game is over, switch the role of players and continue with another game. When it is the first player's turn to enter a secret word, give an option to the players to stop playing. keep the tall_y and announce the winner at the end of the program, The tall-y will include for each player the number of wins and the total number of incorrect guesses made for all games. The player with more wins is the winner. In the case where both players have the same number of wins, the one with lower number of total incorrect guesses is the winner. If the total numbers of incorrect guesses for both players are then same also, then it is a draw


