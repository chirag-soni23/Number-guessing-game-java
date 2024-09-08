import java.util.Random;
import java.util.Scanner;

public class Numbergueesing{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            int numbertoguess = random.nextInt(100) + 1;
            System.out.println(numbertoguess);
            int userGuess = 0;
            int numberofAttempts = 0;
            System.out.println("Welcome to Number gueesing game.");
            System.out.println("Guess a number between 1 and 100:");
            while(userGuess != numbertoguess){
                userGuess = scanner.nextInt();
                numberofAttempts++;
                if(userGuess < numbertoguess){
                    System.out.println("Too Low! Try again!");
                }
                else if(userGuess > numbertoguess){
                    System.out.println("Too High! Try again");
                }else{
                    System.out.println("Congratulation! 🎉 You've guessed the correct number.");
                    System.out.println("It took you " + numberofAttempts + " attempts.");
                }
            }
        }


    }
}