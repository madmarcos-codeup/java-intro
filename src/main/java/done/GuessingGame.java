package done;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1.
        Random rnd = new Random();
        // nextInt(bound) returns 0 to (bound - 1)
        int answer = rnd.nextInt(10) + 1;

        // 2.
        for (int i = 0; i < 5; i++) {
            // 3.
            int guess = getGuessFromUser();

            // 4.
            if(guess < answer) {
                System.out.println("Too low");
                continue;
            } else if(guess > answer) {
                System.out.println("Too high");
                continue;
            } else {
                // 5. got it!
                System.out.println("Correct!");
                System.exit(0);
            }
        }

        // 6.
        System.out.println("You lose!");
    }

    private static int getGuessFromUser() {
        System.out.println("Enter a number from 1 to 10");
        int aNum = scanner.nextInt();
        scanner.nextLine();
        return aNum;
    }
}
