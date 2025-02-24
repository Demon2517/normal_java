package class_java_file.class_java_file;

public class continueExa {
    public static void main(String[] args) {
        for(int i = 0; i<= 2; i++) {
            for (int j = i; j<=5; j++) {
                if(j == 4) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
