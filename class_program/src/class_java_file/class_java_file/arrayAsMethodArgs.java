package class_java_file.class_java_file;

public class arrayAsMethodArgs {
    public static void main(String[] args) {
        int [] arr = {9,3,5,6,8};
        print(arr);
        sort(arr);
    }
    public static void print(int []arr){
        System.out.println("Array Element Is: ");
        for (int i : arr)
            System.out.println(i);
    }
    public static void sort(int []arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("\nMinimum Element in Array Is: "+ min);
    }
}
