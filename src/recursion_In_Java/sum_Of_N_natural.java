package recursion_In_Java;

import java.util.*;

public class sum_Of_N_natural {
    public static void sumNatural(int n,int sum){
        if (n == 0){
            System.out.print("Sum Is: "+ (sum += n));
            return;
        }

        sum += n;
        sumNatural(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Number: ");
        int n = sc.nextInt();
        int sum = 0;
        sumNatural(n, sum);
    }
}
