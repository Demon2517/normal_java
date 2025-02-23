package recursion_In_Java;

import java.util.*;

public class recursion_1To5 {
    public static void print(int n,int i) {
        if (n == i){
            System.out.println(n);
        return;
        }

        System.out.println(n);
        print(n+1,i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter i number: ");
        int i = sc.nextInt();
        int n = 1;
        print(n,i);
    }
}
