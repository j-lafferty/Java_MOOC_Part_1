import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            System.out.println(number);
            
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
        }
        
        

    }
}
