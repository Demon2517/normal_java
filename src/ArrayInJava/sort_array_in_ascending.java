package ArrayInJava;

import java.util.*;

public class sort_array_in_ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        System.out.println("Enter Element In Array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j+1]){
                  numbers[j+1] += numbers[j];
                  numbers[j] = numbers[j+1] - numbers[j];
                  numbers[j+1] -= numbers[j];
                }
            }
        }

        System.out.println("Array Element Is :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] +" ");
        }
    }
}
