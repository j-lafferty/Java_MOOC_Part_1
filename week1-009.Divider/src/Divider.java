
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int firstNumb = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int secondNumb = Integer.parseInt(reader.nextLine());
        
        double division = (1.0 * firstNumb) / secondNumb;
        
        System.out.println("Division: " + firstNumb + " / " + secondNumb + 
                " = " + division);
    }
}
