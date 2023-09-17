package ua.hillel.dolhykh.homeworks.homework5;

import java.util.Scanner;
import java.util.Random;

public class StringUtil {
    public static int findSymbolOccurance(String inputStr, char symbol) {
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        return index != -1 ? index : -1;
    }

    public static String stringReverse(String inputStr) {
        StringBuilder reversedStr = new StringBuilder(inputStr);
        return reversedStr.reverse().toString();
    }

    public static boolean isPalindrome(String inputStr) {
        inputStr = inputStr.toLowerCase();
        int left = 0;
        int right = inputStr.length() - 1;
        while (left < right) {
            if (inputStr.charAt(left) != inputStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("hello", 'l'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Guessing Game!");
        System.out.println("Try to guess the word. Enter your answer:");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String secretWord = words[randomIndex];
        int wordLength = secretWord.length();

        char[] guessedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guessedWord[i] = '#';
        }

        boolean wordGuessed = false;
        int attempts = 0;

        while (!wordGuessed) {
            System.out.println(new String(guessedWord));
            if (scanner.hasNextLine()) {
                String playerGuess = scanner.nextLine().toLowerCase();

                if (playerGuess.equals(secretWord)) {
                    wordGuessed = true;
                    System.out.println("Congratulations, you've guessed the word: " + secretWord);
                } else {
                    if (playerGuess.matches("[a-zA-Z]+")) {
                        for (int i = 0; i < wordLength; i++) {
                            if (i < playerGuess.length() && playerGuess.charAt(i) == secretWord.charAt(i)) {
                                guessedWord[i] = secretWord.charAt(i);
                            } else {
                                guessedWord[i] = '#';
                            }
                        }
                        attempts++;
                        System.out.println("Try again. Number of attempts: " + attempts);
                    } else {
                        System.out.println("Please enter english letters only.");
                    }
                }
            }
        }

        scanner.close();
    }
}
