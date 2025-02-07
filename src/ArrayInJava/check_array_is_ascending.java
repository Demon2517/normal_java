package ArrayInJava;

import java.util.*;

public class check_array_is_ascending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        System.out.println("Enter Element In Array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for(int i = 0; i< numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
        System.out.println("Array Element Is :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] +" ");
        }
    }
}
