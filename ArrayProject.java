import java.util.Scanner;
import java.util.Random;

public class ArrayProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] rightNumbers = new int[3];

        for (int i = 0; i < 3; i++) {
            rightNumbers[i] = random.nextInt(7) + 1;
        }
        while (rightNumbers[0] == rightNumbers[1] || rightNumbers[1] == rightNumbers[2] || rightNumbers[0] == rightNumbers[2]) {
            for (int i = 0; i < 3; i++) {
                rightNumbers[i] = random.nextInt(7) + 1;
            }
        }

        int numberAttempts = 5;

        displayWelcomeMessage();

        while (numberAttempts > 0) {
            int countRightAnswers = 0;

            int[] inputNumbers = new int[3];

            boolean[] checkedUniqueNumbers = new boolean[3];

            for (int i = 0; i < 3; i++) {
                inputNumbers[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!checkedUniqueNumbers[j] && inputNumbers[i] == rightNumbers[j]) {
                        countRightAnswers++;
                        checkedUniqueNumbers[j] = true;
                        break;
                    }
                }
            }

            if (countRightAnswers == 3) {
                System.out.println("All boxes are found");
                break;
            }
            else {
                showNumberCorrectAnswers(countRightAnswers, numberAttempts);
            }

            numberAttempts--;

            if (numberAttempts == 0) {
                System.out.println("5 attempts are over, boxes replaced");
                for (int i = 0; i < 3; i++) {
                    rightNumbers[i] = random.nextInt(7) + 1;
                }
                while (rightNumbers[0] == rightNumbers[1] || rightNumbers[1] == rightNumbers[2] || rightNumbers[0] == rightNumbers[2]) {
                    for (int i = 0; i < 3; i++) {
                        rightNumbers[i] = random.nextInt(7) + 1;
                    }
                }
                numberAttempts = 5;
            }
        }
    }



    static void displayWelcomeMessage() {
        System.out.println("-------------------------------------------------");
        System.out.println("Do not enter numbers bigger than 7 or less than 1");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter three numbers (1, 2, 3, 4, 5, 6, 7)");

    }
    static void showNumberCorrectAnswers(int countRightAnswers, int numberAttempts) {
        System.out.println(countRightAnswers + " out of 3 are correct. " + (numberAttempts - 1) + " attempts left");
    }
}