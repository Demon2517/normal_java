package ArrayInJava;

import java.util.*;

public class find_X_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        int [] number = new int[size];

        System.out.println("Enter Array Element : ");
        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.print("Enter X value : ");
        int x = sc.nextInt();

        System.out.println("Output : ");
        for (int i=0; i<size; i++){
            if (number[i] == x){
                System.out.print("X Found In Index Is : "+ i +" ");
            }
        }

    }
}
