import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        while (word.isEmpty() == false) {
            words.add(word);

            System.out.println("Type a word: ");
            word = reader.nextLine();

        }

        Collections.reverse(words);

        System.out.println("You typed the following words: ");
        for (String item : words) {
            System.out.println(item);
        }


    }
}
