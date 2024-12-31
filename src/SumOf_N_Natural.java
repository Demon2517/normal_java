import java.util.*;

public class SumOf_N_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int natural = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < natural; i++){
            sum = sum + (i+1);
        }
        System.out.println("Sum Of Natural Number Is : "+ sum);
    }
}
