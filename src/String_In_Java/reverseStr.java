package String_In_Java;

import java.util.*;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println(str);
        for (int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char f = str.charAt(front);
            char b = str.charAt(back);

            str.setCharAt(front,b);
            str.setCharAt(back,f);
        }
        System.out.println(str);
    }
}
