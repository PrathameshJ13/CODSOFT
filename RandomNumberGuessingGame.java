import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        int bestScore = Integer.MAX_VALUE;
        
        System.out.println("Welcome to the Random Number Guessing Game!");
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            
            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + lowerBound + " and " + upperBound);
            
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please enter a valid guess within the specified range.");
                } else if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number (" + targetNumber + ") in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Try higher.");
                } else {
                    System.out.println("Try lower.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("You've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }
            
            totalAttempts += attempts;
            rounds++;

            if (attempts < bestScore) {
                bestScore = attempts;
            }
            
            System.out.println("\nCurrent Best Score: " + bestScore);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        
        System.out.println("Thanks for playing! Your total score is based on attempts: " + totalAttempts);
        scanner.close();
    }
}
