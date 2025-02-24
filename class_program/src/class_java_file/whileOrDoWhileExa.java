package class_java_file.class_java_file;

public class whileOrDoWhileExa {
    public static void main(String[] args) {
        int i = 0,j = 0;
        System.out.println("\nPrinting the list of first 10 even numbers \n");
        while(i<=10) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("\nPrinting the list of first 10 even numbers \n");
        do {
            System.out.println(j);
            j = j + 2;
        }while(j<=10);
    }
}
