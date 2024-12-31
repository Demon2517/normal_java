import java.util.*;

public class AdualtOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adult = sc.nextInt();

        if (adult => 18)
            System.out.print("Person Is Adult!");
        else
            System.out.println("Person Is Not Adult!");
    }
}
