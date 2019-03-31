
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        boolean number = false;
        int i = 0;
        
        while (number == false) {
            System.out.print("Guess a number: ");
            int userNumber = Integer.parseInt(reader.nextLine());
            i++;
            
            if (userNumber > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + i);
            } else if (userNumber < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            } else {
                number = true;
            }
        }
        System.out.println("Congratulations, your number is correct! Guesses made: " + i);
    }


    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
