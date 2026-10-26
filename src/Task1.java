
    import java.util.Scanner;
    import java.util.Random;

        public class Task1 {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                Random random = new Random();

                String playAgain = "yes";

                while (playAgain.equalsIgnoreCase("yes")) {

                    int die1 = random.nextInt(6) + 1;
                    int die2 = random.nextInt(6) + 1;
                    int sum = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == 2 || sum == 3 || sum == 12) {
                        System.out.println("Craps! You lose.");
                    }
                    else if (sum == 7 || sum == 11) {
                        System.out.println("Natural! You win.");
                    }
                    else {
                        int point = sum;

                        System.out.println("The point is " + point);

                        boolean gameOver = false;

                        while (gameOver == false) {

                            die1 = random.nextInt(6) + 1;
                            die2 = random.nextInt(6) + 1;
                            sum = die1 + die2;

                            System.out.println();
                            System.out.println("Die 1: " + die1);
                            System.out.println("Die 2: " + die2);
                            System.out.println("Sum: " + sum);

                            if (sum == point) {
                                System.out.println("Made the point! You win.");
                                gameOver = true;
                            }
                            else if (sum == 7) {
                                System.out.println("Got a seven! You lose.");
                                gameOver = true;
                            }
                            else {
                                System.out.println("Trying for point.");
                            }
                        }
                    }

                    System.out.println();
                    System.out.print("Do you want to play again? (yes/no): ");
                    playAgain = input.nextLine();
                    System.out.println();
                }

                System.out.println("Thanks for playing!");
                input.close();
            }
        }


