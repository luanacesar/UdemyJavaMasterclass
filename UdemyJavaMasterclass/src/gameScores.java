public class gameScores {
    public static void main(String[] args) {
        int highScorePosition;

        highScorePosition=calculateHighScorePosition(1100);
        displayHighScorePosition("Fred",highScorePosition);
        highScorePosition=calculateHighScorePosition(500);
        displayHighScorePosition("Donald",highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus) {
        if (gameOver){
            int finalScore=score + (levelCompleted*bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName +
                ", you earned position " + highScorePosition +
                " on the High Scorers list!");

    }
    public static int calculateHighScorePosition(int highScore){
        if (highScore >= 1000){
            return 1;
        } else if ((highScore >= 500) && (highScore < 1000)){
            return 2;
        } else if ((highScore > 100) && (highScore < 500)){
            return 3;
        } else {
            return 4;
        }
    }
}
