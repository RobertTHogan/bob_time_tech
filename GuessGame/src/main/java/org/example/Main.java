package org.example;

import javax.swing.text.StyledEditorKit;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
                int secretNum;
                int guess;
                int random = (int )(Math.random() * 50 +1);
                boolean correct = false;

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

      final String ANSI_RESET = "\u001B[0m";
      final String ANSI_BLACK = "\u001B[30m";
      final String ANSI_RED = "\u001B[31m"; final String ANSI_RED_UNDERLINED = "\033[4;31m";
      final String ANSI_RED_BOLD_BRIGHT = "\033[1;91m";
      final String ANSI_GREEN = "\u001B[32m"; final String ANSI_GREEN_UNDERLINED= "\033[4;32m";
      final String ANSI_GREEN_BOLD_BRIGHT = "\033[1;92m";
      final String ANSI_YELLOW = "\u001B[33m";
      final String ANSI_BLUE = "\u001B[34m";
      final String ANSI_PURPLE = "\u001B[35m";
      final String ANSI_CYAN_BOLD = "\033[1;36m";
      final String ANSI_WHITE = "\u001B[37m";



        Scanner keyboard = new Scanner(System.in); // to get input from user
        System.out.println(ANSI_BLUE +
                           "                                        ||||||||||||||||||||||||||||||||||||||||||||||||||||| ");
        System.out.println("                                        ||| J              A            V               A |||");
        System.out.println("                                        ||| WELCOME TO BOB'S RANDOM NUMBER GUESSING GAME. |||");
        System.out.println("                                        ||| 7    20    5    49   32   1    12    50     1 |||");
        System.out.println("                                        |||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(""+ANSI_RESET);
        System.out.println(ANSI_PURPLE +"Objective:"
                + " This Java Math program will randomly pick a number between 1 - 50. "
                        + " Your goal is to guess what the secret number is.");
       System.out.println(" If you get it right you're a Winner and GAME OVER. If you guess wrong the GAME "
               + "will let you know if 'THE SECRET NUMBER' is higher or lower");
       System.out.println(" to try again to guess the number until the correct number is entered.");
       System.out.println("");
       System.out.println("Game Play: Pick a number between 1 - 50 then type your guess and depress enter key."+ANSI_RESET);

        secretNum = random;

        System.out.println(ANSI_YELLOW_BACKGROUND+"(TESTING PURPOSES: 'Secret Number' equals: "+(secretNum)+")"+ANSI_RESET);

        while (!correct) {  ///not false means TRUE which stops the loop END of GAME = WINNER!
            System.out.println("                              ");
            System.out.print(ANSI_CYAN_BOLD+" WHAT IS YOUR GUESS?  ");
            guess = keyboard.nextInt();

            System.out.println(ANSI_RESET+"                              ");
            if (guess == secretNum) {
                correct = true;
            System.out.println(ANSI_GREEN_BOLD_BRIGHT+" YOU WON! The number you entered"+ANSI_GREEN_UNDERLINED+guess+ANSI_RESET+ANSI_GREEN+" "
                        + "is the correct random secret number.");
                    try{
                        Thread.sleep(1500);
                        System.out.println(ANSI_RED_BOLD_BRIGHT+"");
                        System.out.println("          *************");
                        System.out.println("          * GAME OVER *");
                        System.out.println("          *************"+ANSI_RESET);
                        System.out.println("");
                        System.out.println("To play again please re-run program.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
            }}
            else if (guess < secretNum) {
            System.out.println(ANSI_RED+  " Sorry "+ANSI_RED_UNDERLINED+guess+ANSI_RESET+ANSI_RED+" is incorrect.TRY "
                    + "AGAIN (Hint: number is higher)");
            System.out.println(""+ANSI_RESET);

            }
            else if (guess > secretNum){
            System.out.println(ANSI_RED+  " Sorry "+ANSI_RED_UNDERLINED+guess+ANSI_RESET+ANSI_RED+" is incorrect. TRY"
                    + " AGAIN (Hint: number is lower)");
            System.out.println(""+ANSI_RESET);
            }
        }
    }
}