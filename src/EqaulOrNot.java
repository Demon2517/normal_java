import java.util.*;

public class EqaulOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b)
            System.out.println("Both Numbers Are Equal.");
        else if (a > b)
            System.out.println("A Is Greter Than B");
        else
            System.out.println("A Is Lesser Than B");
    }
}
