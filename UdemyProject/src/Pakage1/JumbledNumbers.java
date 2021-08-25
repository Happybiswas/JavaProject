package Pakage1;

import java.util.Scanner;

public class JumbledNumbers {
    //main method
    public static void main (String[] args)
    {
        //declare array of strings contains numerals
        String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        //create an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        //prompt to enter a string
        System.out.print("Enter a string formed jumbled letters of numerals: ");
        //read the string
        String word = sc.next();

        //processing for all the numerals
        for(int i=0; i<numbers.length; i++)
        {
            //get a string of numeral
            String s = numbers[i];
            boolean fg = true;
            //processing for a numeral
            for(int j=0; j<s.length(); j++)
            {
                //extract a character from the numeral
                char c = s.charAt(j);
                //check whether the character not present in the input string
                if(word.indexOf(c)==-1)
                {
                    fg = false;
                    break;
                }
            }
            //display the integers in sorted order
            if(fg) System.out.print (i);
        }
        System.out.println();
    }
}
