public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        while (i < size) {
            printWhitespaces((size - 1) - i);
            printStars(i + 1);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int j = 1;
        while (i < height) {
            printWhitespaces((height - 1) - i);
            printStars(j);
            i++;
            j+=2;
        }
        int k = 0;
        while (k < 2) {
            printWhitespaces((height - 2));
            printStars(3);
            k++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
