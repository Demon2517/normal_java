package ArrayInJava;

import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array And Columns: ");
        int size = sc.nextInt();
        int columns = sc.nextInt();

        int [][] numbers = new int[size][columns];

        System.out.println("Enter Element: ");
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array Element Is: ");
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }
    }
}
