package ArrayInJava;

import java.util.*;

public class min_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        int []number = new int[size];
        System.out.println("Enter Element In Array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("First Way :");
        int min = number[0], max = number[1];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Max Number In Array Is : "+ max);
        System.out.println("Min Number In Array Is : "+ min);

        System.out.println("Second Way :");
        int m = Integer.MIN_VALUE;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > m) {
                m = number[i];
            }
            if (number[i] < n) {
                n = number[i];
            }
        }
        System.out.println("Max Number In Array Is : "+ m);
        System.out.println("Min Number In Array Is : "+ n);
    }
}
