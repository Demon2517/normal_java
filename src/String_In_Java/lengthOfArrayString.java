package String_In_Java;

import java.util.*;

public class lengthOfArrayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String []array = new String[size];
        int totalLenth = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLine();
            totalLenth += array[i].length();
        }
        System.out.println("Total Length Is: "+ totalLenth);
    }
}
