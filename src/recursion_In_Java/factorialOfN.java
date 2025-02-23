package recursion_In_Java;

import java.util.*;

public class factorialOfN {
    public static void printFactorial(int n, int fact){
        if (n == 0){
            System.out.print("Factorial Is: "+ fact);
            return;
        }

        fact *= n;
        printFactorial(n-1,fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Number: ");
        int n = sc.nextInt();
        printFactorial(n,1);
    }
}
