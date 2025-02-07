package String_In_Java;

import java.util.*;

public class compareToMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String secondName = sc.next();
        //compareTo check Three condition
        /*
        string1 > string2
        string1 == string2
        string1 < string2
        A is Lesser than a and a is Lesser than z
        also check Upper and Lower case
         */
        if (firstName.compareTo(secondName) == 0){
            System.out.println("Both Are Same.");
        } else if (firstName.compareTo(secondName) > 0) {
            System.out.println("First Strin Is Greter Than Second String.");
        }else
            System.out.println("Second Strin Is Greter Than First String.");
    }
}
