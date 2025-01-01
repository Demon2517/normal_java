import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\nPattern 1");
        /*
        *
        * *
        * * *
        * * * *
         */
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println("\nPattern 2");
        /*
        * * * *
        * * *
        * *
        *
         */
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println("\nPattern 3");
        /*
               *
             * *
           * * *
         * * * *
         */
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j<=n-i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
