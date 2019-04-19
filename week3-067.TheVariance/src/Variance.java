import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int item : list) {
            sum += item;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);

        double average = (sum * 1.0) / list.size();

        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);

        double helper = 0.0;

        for (int item : list) {
            double square = (item - average) * (item - average);
            helper += square;
        }

        double variance = helper / (list.size() - 1);

        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
