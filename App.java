import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);

        Scanner userInput = new Scanner(System.in);
        System.out.println("HEY WELCOME TO THE GUESSING GAME!!");

        do {
            System.out.println("Enter a guesss number between 0 and 100\n");
            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber) {
                    System.out.println("YOU WIN!!!!!!!!!!");
                    break;
                } else if (userGuessNumber < secretNumber)
                    System.out.println("Your guess number is smaller");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your guess number is greater");

                if (attempt == 5) {
                    System.out.println(" You have exceeded the limit!!!TRY AGAIN");
                    break;
                }
                attempt++;
            } else {
                System.out.println("Enter a valid number!!");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}
