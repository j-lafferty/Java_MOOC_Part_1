
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        while (words.contains(word) == false) {
            words.add(word);

            System.out.println("Type a word: ");
            word = reader.nextLine();

        }

        System.out.println("You gave the word " + word + " twice");
        
    }
}
