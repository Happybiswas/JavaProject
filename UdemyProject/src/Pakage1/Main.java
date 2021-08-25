package Pakage1;
//
public class Main {
    public static void main(String[]args){

       System.out.println(getDurationString(60,50));

        //         int newScore = calculateScore("Happy", 500);
        //         System.out.println("New score is "+" " +newScore);

    }
   /* //Method overloading
    public static int calculateScore(String playerName, int score){

       System .out.println("player" + " "  +playerName+" "+  "score"+" " +score+ " "+ "points");
       return score *1000;
    }
    public static int calculateScore(int score){

        System .out.println("unnamed playerName" +score + "points");
        return score *1000;
    }*/
    public static String getDurationString (long minutes,long seconds){
        if ((minutes < 0) || (seconds <0) ||(seconds>59)){
            return "invalid value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes % 60;
        return hours +  " " +"h" + remainingMinutes + "  " +  "m" + seconds + "s";

    }


}



