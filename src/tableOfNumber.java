import java.util.*;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value For The Table : ");
        int table = sc.nextInt();

        for (int i = 0; i < 10; i++){
            System.out.println(table +" x "+ (i+1) + " = "+ table*(i+1));
        }
    }
}
