
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int characters = calculateCharacters(name);

        System.out.println("Number of characters: " + characters);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        return text.length();
    }
    
}
