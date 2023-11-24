import java.util.Random;
import java.util.Scanner;

public class PaperRockScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Choose your move: 1 - Paper, 2 - Rock, 3 - Scissors, 0 - Exit");

            try {
                int userChoice = scanner.nextInt();

                if (userChoice == 0) {
                    System.out.println("Thank you for the game!");
                    break;
                }
                else if (userChoice < 1 || userChoice > 3) {

                  System.out.println("Incorrect selection. Select again.");
                   continue;
                }

                int computerChoice = random.nextInt(3) + 1;
                String userChoiceName = "";
                String computerChoiceName = "";

                switch (userChoice) {
                    case 1:
                        userChoiceName = "Paper";
                        break;
                    case 2:
                        userChoiceName = "Rock";
                        break;
                    case 3:
                        userChoiceName = "Scissors";
                        break;
                }

                switch (computerChoice) {
                    case 1:
                        computerChoiceName = "Paper";
                        break;
                    case 2:
                        computerChoiceName = "Rock";
                        break;
                    case 3:
                        computerChoiceName = "Scissors";
                        break;
                }

                System.out.println("Choice of user: " + userChoiceName);
                System.out.println("Choice of computer: " + computerChoiceName);

                if (userChoice == computerChoice) {
                    System.out.println("It's a tie!");
                } else if ((userChoice == 3 && computerChoice == 1) ||
                        (userChoice == 1 && computerChoice == 2) ||
                        (userChoice == 2 && computerChoice == 3)) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number (1-3) or 0 to exit.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
