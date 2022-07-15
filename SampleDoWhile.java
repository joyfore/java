
import java.util.Scanner;

class SampleDoWhile {
    public static void main(String[] args) {

        Boolean isPlaying = true;
        Scanner scanner = new Scanner(System.in);

        while (isPlaying) {

            System.out.println("Hello. Would like to talk? Then type the number 1."); // Ask question
            int userInput = scanner.nextInt(); // Get input

            if (userInput == 1) {
                isPlaying = false; // Game over
            }
        }

        scanner.close();
    }
}