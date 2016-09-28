/**
 * Created by Culebra on 9/25/2016.
 */
// This is a guess a number program
    // It needs to be modified to ask after each round if they want to keep playing

    import java.util.Random;
    import java.util.Scanner;

    public class Guessing_Game {
        public static void main(String[] args) {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(20);
            int numberOfGamesPlayed = 0;
            Scanner input = new Scanner(System.in);
            int guess;
            int numberOfBadGuesses = 0;
            int numberOfGoodGuesses = 0;
            float number;

            boolean win = false;
            char answer;

            while (win == false) {

                System.out.println("Guess a number between 1 and 20: ");
                guess = input.nextInt();

                if (guess == numberToGuess) {
                    win = true;
                    numberOfGoodGuesses++;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low");
                    numberOfBadGuesses++;
                } else if (guess > numberToGuess) {
                    System.out.println("Your guess is too high");
                    numberOfBadGuesses++;
                }
            }
            System.out.println("You win!");
            numberOfGamesPlayed++;
            System.out.println("Would you like to keep playing? (Y/N)");
            answer = input.next().charAt(0);

            // Calculate guess percentage for each game
            // Calculate overall guess percentage
            if (answer == 'Y') {
                while (answer == 'Y') {
                    System.out.println("Guess a number between 1 and 20: ");
                    guess = input.nextInt();

                    if (guess == numberToGuess) {
                        win = true;
                        System.out.println("You win!");
                        numberOfGamesPlayed++;
                        numberOfGoodGuesses++;
                        System.out.println("Would you like to keep playing? (Y/N)");
                        answer = input.next().charAt(0);
                    }
                    else if (guess < numberToGuess) {
                        System.out.println("Your guess is too low");
                        numberOfBadGuesses++;
                    }
                    else if (guess > numberToGuess) {
                        System.out.println("Your guess is too high");
                        numberOfBadGuesses++;
                    }

                }
            }
            else {
                number = (numberOfBadGuesses + numberOfGoodGuesses);
                number = (number * 100 / numberOfGamesPlayed);


                System.out.println("The number was " + numberToGuess);
                System.out.println("Number of games you played was " + numberOfGamesPlayed);
                System.out.println("You guess bad " + numberOfBadGuesses + " times.");
                System.out.println("You guess right " + numberOfGoodGuesses + " times!");
                System.out.println("Overall guess percentage is " + number);
                System.exit(0);
            }

            number = (numberOfBadGuesses + numberOfGoodGuesses);
            number = (number * 100 / numberOfGamesPlayed);

            System.out.println("The number was " + numberToGuess);
            System.out.println("Number of games you played was " + numberOfGamesPlayed);
            System.out.println("You guess bad " + numberOfBadGuesses + " times.");
            System.out.println("You guess right " + numberOfGoodGuesses + " times!");
            System.out.println("Overall guess percentage is " + number);
        }
    }