import java.util.*;

public class factorialN {
    public static void FactoriaN(int f){
        if (f<0){
            System.out.println("Invalid Number!");
            return;
        }
        int fact=1;
        for (int i=f; i>=1; i--){
            fact *= i;
        }
        System.out.println("Factorial IS : "+ fact);
        //return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value For Factorial : ");
        int fact = sc.nextInt();
        FactoriaN(fact);
    }
}
