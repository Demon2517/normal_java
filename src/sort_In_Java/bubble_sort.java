package sort_In_Java;

public class bubble_sort {
    public static void toSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr ={9,5,6,2,3};
        //bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    arr[j+1] += arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] -= arr[j];
                }
            }
        }
        toSort(arr);
    }
}
