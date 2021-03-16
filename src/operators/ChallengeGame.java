package operators;

public class ChallengeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a method called displayHighScorePosition
		// it should a players name as parameter, and a 2nd parameter as a position in the high score 
		//table
		//you should display the players name along with a message like "managed to get position" and the
		// position they got and a further message "on the high score table"
		
		// Create a 2nd method called calculateHighScorePosition
		//it should be sent one argument only, the player score
		// it should return a int
		// the return data should be
		// 1 if the score  is > 1000
		// 2 if the score is > 500 and < 1000
		// 3 if the score is >100 and <500
		// 4 in all other cases
		// call both methods and display the results of the following
		// a score of 1500, 900, 400 and 50.	
		

		int highScore = calculateHighScorePosition(1500);
		displayHighScorePosition("John", highScore);
		
		highScore = calculateHighScorePosition(900);
		displayHighScorePosition("Laura", highScore);
		
		highScore =calculateHighScorePosition(400);
		displayHighScorePosition("Peter",highScore);
		
		highScore = calculateHighScorePosition(50);
		displayHighScorePosition("Mary",highScore);
	}
	
	public static void displayHighScorePosition(String playersName, int highScore) {
		System.out.println(playersName + " managed to get position "
				+ highScore + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
		if(playerScore > 1000) {
			return 1;
		}
		else if(playerScore > 500 && playerScore < 1000) {
			return 2;
		}
		else if(playerScore > 100 && playerScore < 500) {
			return 3;
		}
		else if(playerScore > 100 && playerScore < 500) {
			return 3;
		}
		else {
			return 4;
		}
	}
}  
