package String_In_Java;

import java.util.Scanner;

public class concatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();
        //  '+' symbol To use concatenation
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
    }
}
