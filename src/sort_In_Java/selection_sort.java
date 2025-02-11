package sort_In_Java;

public class selection_sort {
    public static void selSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {6,3,7,8,5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]){
                        arr[j] += arr[i];
                        arr[i] = arr[j] - arr[i];
                        arr[j] -= arr[i];
                    }
            }
        }
        selSort(arr);
    }
}
