import java.util.Scanner;
import java.util.Random;

public class ArrayProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int [] rightNumbers = new int[3];

        for (int i = 0; i < 3; i++) {
                rightNumbers [i] = rand.nextInt(7)+1;
         }

        while (rightNumbers[0] == rightNumbers[1] || rightNumbers[1] == rightNumbers[2]) || rightNumbers[0] == rightNumbers[2] ) {

        }
         int attemptsNumber = 5;
         displayWelcomeMessage();



    }


    static void displayWelcomeMessage() {
        System.out.println("-------------------------------------------------");
        System.out.println("Do not enter numbers bigger than 7 or less than 1");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter three numbers (1, 2, 3, 4, 5, 6, 7)");
    }

}