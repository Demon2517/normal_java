package recursion_In_Java;

import java.util.Scanner;

public class fibonacci_sequence {
    public static void printfibonacci(int a, int b, int n){
        if (n == 0){
            return;
        }

        System.out.print(b+" ");
        printfibonacci(b,a+b,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Number: ");
        int n = sc.nextInt();
        System.out.print(0 +" "+ 1 +" ");
        printfibonacci(0,1,n-2);
    }
}
