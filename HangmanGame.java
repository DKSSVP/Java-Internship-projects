import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    public static void main(String[] args) {
        String[] words = {"java", "program", "keyboard", "internship", "object"};
        Random rand = new Random();
        String wordToGuess = words[rand.nextInt(words.length)];
        StringBuilder guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));
        int attempts = 6;

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0 && guessedWord.toString().contains("_")) {
            System.out.println("Word: " + guessedWord);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            boolean found = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Wrong guess. Attempts left: " + attempts);
            }
        }

        if (guessedWord.toString().equals(wordToGuess)) {
            System.out.println("You win! The word was: " + wordToGuess);
        } else {
            System.out.println("You lost! The word was: " + wordToGuess);
        }
    }
}
