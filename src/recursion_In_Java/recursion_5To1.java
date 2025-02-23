package recursion_In_Java;

import java.util.*;

public class recursion_5To1 {
    public static void print(int n){
        if (n == 0)
            return;

        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int n = sc.nextInt();
        print(n);
    }
}
