package Pakage1;

public class Happy1 {

    public static void main(String[]args){
        boolean gameOver = true;
        int score = 5050;
        int levelComplete = 5;
        int bonus = 100;

        if( score> 1000 && score<5000){
            System.out.println("your score is greater than 1000 and less than 5000");
        }
        else if (score> 5000){
            System.out.println(" your score is more than 5000");

        }
        else{
            System.out.println(" got here");
        }
        if (gameOver){
            int finalScore = score+ (levelComplete * bonus);
            System.out.println( "the final score is:"+" "+ finalScore  );
        }
        // print out the new score
        boolean newgameOver = true;
        int newscore = 10000;
        int newlevelComplete = 8;
        int newbonus = 1000;
        if (gameOver){
            int finalScore = newscore+ (newlevelComplete * newbonus);
            System.out.println( "the final score is:"+" "+ finalScore  );
        }


    }

}
