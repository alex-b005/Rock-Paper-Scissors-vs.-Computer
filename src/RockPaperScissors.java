import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};
        int userScore = 0;
        int computerScore = 0;
        int ties = 0;

        System.out.println(" / Are you ready for, ROCK, PAPER, SCISSORS? \\ ");

        while (true) {
            System.out.print("\nChoose between 3 options rock, paper, or scissors or type 'quit' to quit");
            String userChoice = scanner.nextLine().trim().toLowerCase();


            if (userChoice.equals("quit")) {
                System.out.println("Thank you for playing!!");
                System.out.println("Final Score:");
                System.out.println("You: " + userScore);
                System.out.println("Computer: " + computerScore);
                System.out.println("Ties: " + ties);
                break;
            }
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice.");
                continue;
            }
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex];
            System.out.println("\nComputer: " + computerChoice);


            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
                ties++;
            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                            System.out.println("You win!");
                            userScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            System.out.println("\nScore:");
            System.out.println("You: " + userScore + " | Computer: " + computerScore + " | Ties: " + ties);
        }
        scanner.close();
    }
}