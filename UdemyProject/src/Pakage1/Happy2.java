package Pakage1;
// this project is written for to understand the how to declear static, non static and the other method inside the main method or driver

public class Happy2 {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5050;
        int levelComplete = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelComplete, bonus);
        calculateScore1(gameOver, score, levelComplete, bonus);
        Happy2 hb = new Happy2();
        hb.calculateScore2(gameOver, 2000, 8, 200);


    }

    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            System.out.println("the final score is:" + " " + finalScore);

        }

    }

    public int calculateScore2(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            System.out.println("the final score is:" + " " + finalScore);

        }

        return score;
    }

    public static int calculateScore1(boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            System.out.println("the final score is:" + " " + finalScore);
            return finalScore;
        }
        return -1;
    }
}