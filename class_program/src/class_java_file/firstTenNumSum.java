package class_java_file.class_java_file;

import java.util.Scanner;

public class firstTenNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value For Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum Of First "+ num + " Number Is: "+ sum);
    }
}
