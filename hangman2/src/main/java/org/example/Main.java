package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/* hangman
   	------
	|    |
	O
   \ /
    |
   / \

6 parts to body - hangman can only guess up to 5 wrong letters(answers)
because the 6th means you lose! Full body == Hangman (lose).
O = head-1
\ = left arm-2
/ = right arm-3
| = body-4
/ = right leg-5
\ = left leg-6
(all = full body)
*

* */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("            THE JAVA CONSOLE HANGMAN GAME                 ");
        System.out.println("***********************[HANGM_N]**************************");
        System.out.println("** Hangman is a word game in which one player has to    **");
        System.out.println("** guess a word that the other player has thought of    **");
        System.out.println("** by guessing a letter in it and guess the word. Every **");
        System.out.println("** time they guess a wrong word, part of a picture of a **");
        System.out.println("** person being hanged is drawn, and if the picture is  **");
        System.out.println("** completed the person guessing has lost.              **");
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Person being hanged-picture when complete = You Lose ");
        System.out.println(" ----------");
        System.out.println("  |       |");
        System.out.println("  |       ");
        System.out.println("  O");
        System.out.print(" \\");
        System.out.println(" /");
        System.out.println("  | ");
        System.out.print(" /");
        System.out.print(" \\");

        System.out.println("\n\n\n\n");

        System.out.println("_____________________________________________________________");
        System.out.println("1 Player = If 1 Player a word is chosen from a saved list by ");
        System.out.println("           random a file that Player 1 has to guess.         ");
        System.out.println("_____________________________________________________________");
        System.out.println("2 Player = If 2 Players a word is chosen & entered           ");
        System.out.println("           Player 1 that Player 2 has to guess.              ");
        System.out.println("_____________________________________________________________");
        System.out.println("If you fail to guess the WORD 6 times YOU LOSE!");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many 1 or 2 players? ");
        String players = keyboard.nextLine();
        String word;
        if (players.equals("1")) {
            Scanner scanner = new Scanner(new File("C://Bobdocs/words_alpha.txt"));

            List<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                //System.out.println(scanner.nextLine());
                words.add(scanner.nextLine());
            }
            Random rand = new Random();

            word = words.get(rand.nextInt(words.size()));
        } else {
            System.out.println("Player 1, please enter a WORD for Player 2 to guess: ");
            word = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready for Player 2 Good luck! Word has ("+word.length()+") letters. ");
        }
        List<Character> playerGuesses = new ArrayList<>();

        int wrongCount = 0;
        while (true) {
            printHangedMan(wrongCount);

            if (wrongCount >= 6) {
                System.out.println("You lose ! GAME OVER");
                System.out.println("The word was: " + word+(" Word contains ("+word.length()+")letters. "));
                break;

            }
            printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
            }
            if (printWordState(word, playerGuesses)) {
                System.out.println("You Win1! You guessed this whole word correctly:" + word);
                break;
            }
            System.out.println("Please enter your guess for the whole word: ");
            System.out.println("Word contains ("+word.length()+") letters. ");
            if (keyboard.nextLine().equals(word)) {
                System.out.println("You wIn2! You guessed this whole word correctly: " + word);
                break;
            } else {
                System.out.println("Nope! Try again. # of wrong guesses[" + wrongCount + "]");
                System.out.println("Word contains ("+word.length()+") letters. ");
            }
        }
    }
    private static void printHangedMan(int wrongCount) {
        System.out.println(" ----------");
        System.out.println("  |       |");
        System.out.println("  |       ");
        if (wrongCount >= 1)
        {
            System.out.println("  O");
        }
        if (wrongCount >= 2)
        {
            System.out.print(" \\");
        }
        if (wrongCount >= 3)
        {
            System.out.println(" /");
        } else {
            System.out.println("");
        }

        if(wrongCount >= 4)
        {
            System.out.println("  | ");
        }
        if(wrongCount >= 5)
        {
            System.out.print(" /");
        }
        if(wrongCount >= 6)
            {
                System.out.print(" \\");
            }
            else {
                System.out.println("");
            }
        System.out.println("");
        System.out.println("");
    }
    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses)
    {
        System.out.println("Please enter one letter ");
        System.out.print(" Word has ("+word.length()+") letters. Secret Word to guess is: "+word);
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }

    private static boolean printWordState(String word, List<Character> playerGuesses)
    {
        int correctCount = 0;
        for(int i = 0; i < word.length(); i++){
            if(playerGuesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else {
                System.out.print("_");


            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }
}