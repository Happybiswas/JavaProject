package Pakage1;

public class Happy3 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("your final scorewas" + highScore);
        score = 10000;
        levelComplete = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("your final scorewas" + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("kim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("happy", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("tapan", highScorePosition);





    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position " + highScorePosition +
                " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            System.out.println("the final score is:" + " " + finalScore);
            return finalScore;
        }
        return -1;

    }
}