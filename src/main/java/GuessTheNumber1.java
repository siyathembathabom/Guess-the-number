import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber1 {

    public static void main(String[] args) {

        welcome();
        answerCompare();
    }

    public static void welcome() {
        System.out.println("Greetings! You are required to guess a number from 0 to 100.");
    }

    public static int levels() {
        Scanner input = new Scanner(System.in);
        Boolean condition = false;

        System.out.print("Choose the level of difficulty (easy, medium, hard): ");

        while (true) {

            String chosenDifficulty = input.nextLine().toLowerCase();
            String[] difficultyArray = new String[]{"easy", "medium", "hard"};

            for (int i = 0; i < 3; i++) {
                if (chosenDifficulty.equals(difficultyArray[i])) {
                    return levelValueAssignment(chosenDifficulty);
                }
            }
            System.out.println("Incorrect input. Try again: ");
        }

    }

    public static int levelValueAssignment(String difficulty) {
        
        if (difficulty.equals("easy")) {
            System.out.println("You are given 10 tries.");
            return 10;
        } else if (difficulty.equals("medium")) {
            System.out.println("You are given 5 tries.");
            return 50;
        } else {
            System.out.println("You are given 3 tries.");
            return 3;
        }
    }

    public static int number() {

        boolean isInteger = false;


        if (isInteger == true) {
            Random random = new Random();

            return random.nextInt(100);
        }
        return 0;
    }

    public static int userInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Guess the number: ");
        return Integer.valueOf(input.nextLine());
    }

    public static void answerCompare() {

        Scanner input = new Scanner(System.in);
        int number = number();
        int end = levels();

        int count = 0;
        while (count < end) {

            int userAnswer = userInput();

            if (number > userAnswer) {
                System.out.print("Go higher!\nGuess again: ");
            } else if (number < userAnswer) {
                System.out.print("Go lower!\nGuess again: ");
            }
            if (number == userAnswer) {
                System.out.println("You guessed it the number is " + number);
                break;
            }
            count++;
        }
    }

}