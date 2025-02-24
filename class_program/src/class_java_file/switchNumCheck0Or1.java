package class_java_file.class_java_file;

import java.util.Scanner;

public class switchNumCheck0Or1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        switch (num){
            case 0:
                System.out.println("Number Is Zero.");
                break;
            case 1:
                System.out.println("Number Is One.");
                break;
            default:
                System.out.println("Number Is "+num);
        }
    }
}
