import java.util.*;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddeven = sc.nextInt();

        if (oddeven % 2 == 0)
            System.out.println("Number Is Even.");
        else
            System.out.println("Number IS Odd.");
    }
}
