package com.company;


    import java.util.Random;
import java.util.Scanner;

    public class fjc_20_ps5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] choices = {"stone", "paper", "scissors"};

            while (true) {
                System.out.println("Enter your choice (stone, paper, or scissors):");
                String playerChoice = scanner.nextLine().toLowerCase();

                if (!isValidChoice(playerChoice)) {
                    System.out.println("Invalid choice. Please choose stone, paper, or scissors.");
                    continue;
                }

                int computerIndex = random.nextInt(3);
                String computerChoice = choices[computerIndex];

                System.out.println("Computer chose: " + computerChoice);

                String result = determineWinner(playerChoice, computerChoice);
                System.out.println(result);

                System.out.println("Do you want to play again? (yes/no):");
                String playAgain = scanner.nextLine().toLowerCase();
                if (!playAgain.equals("yes")) {
                    break;
                }
            }

            scanner.close();
        }

        public static boolean isValidChoice(String choice) {
            return choice.equals("stone") || choice.equals("paper") || choice.equals("scissors");
        }

        public static String determineWinner(String playerChoice, String computerChoice) {
            if (playerChoice.equals(computerChoice)) {
                return "It's a tie!";
            } else if ((playerChoice.equals("stone") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("stone")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                return "You win!";
            } else {
                return "Computer wins!";
            }
        }
    }

