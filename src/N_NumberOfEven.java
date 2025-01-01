import java.util.*;

public class N_NumberOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value For N : ");
        int n = sc.nextInt();
        System.out.print("Even Is : ");
        for (int i=0; i<=n; i++){
            if(i%2 == 0)
                System.out.print(i +" ");
        }
    }
}
