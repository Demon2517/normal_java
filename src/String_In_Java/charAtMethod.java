package String_In_Java;

import java.util.*;

public class charAtMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }
    }
}
