import java.util.Scanner;

public class SecondLargestNumbers {

    public static void main(String[] args) {
        int num[] = {1, 5, 8, 6, 7, 3, 9};

        int max = Integer.MIN_VALUE; // Initialize max to negative infinity
        int max2 = Integer.MIN_VALUE; // Initialize max2 to negative infinity
        int min = Integer.MAX_VALUE; // Initialize min to positive infinity
        int min2 = Integer.MAX_VALUE; // Initialize min2 to positive infinity

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max2 = max;
                max = num[i];
            } else if (num[i] > max2 && num[i] != max) {
                max2 = num[i];
            }

            if (num[i] < min) {
                min2 = min;
                min = num[i];
            } else if (num[i] < min2 && num[i] != min) {
                min2 = num[i];
            }
        }

        System.out.println("THE LARGEST ELEMENT IN THE ARRAY IS: " + max);
        System.out.println("THE SECOND LARGEST ELEMENT IN THE ARRAY IS: " + max2);
        System.out.println("THE SMALLEST ELEMENT IN THE ARRAY IS: " + min);
        System.out.println("THE SECOND SMALLEST ELEMENT IN THE ARRAY IS: " + min2);
    }
}
