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
                System.out.print("* ");
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
                System.out.print("* ");
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
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 4");
        /*
         1
         1 3
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                    System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 5");
        /*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 6");
        /*
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */
        int number = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("\nPattern 7");
        /*
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1
         */
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i + j) % 2 == 0)
                    System.out.print(1 +" ");
                else
                    System.out.print(0 +" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 8");
        /*
             *****
            *****
           *****
          *****
         *****
         */
        for (int i=n; i>=1; i--){
            for (int j=n*2-1; j>=1; j--){
                if (j>i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        /*System.out.println("\nPattern 9");

             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5

        for (int i=1; i<=n; i++){
            for (int j=1; j<=9; j++){
                if ((i + j) % 2 == 0)
                    System.out.print(1 +" ");
                else
                    System.out.print(0 +" ");
            }
            System.out.println();
        }
*/
    }
}
