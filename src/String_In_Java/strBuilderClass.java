package String_In_Java;

import java.util.*;

public class strBuilderClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Solanki");
        sb.insert(1,'R');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
