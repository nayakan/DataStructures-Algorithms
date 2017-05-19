
public class SelectionSort {
    public static void sort(int[] arr) {
       for(int i = 0; i < arr.length - 1; i++) {
           int minIndex = i;
           for(int j = i + 1; j < arr.length; j++) {
               if(arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
    }
    
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3};
        sort(arr);
        printArray(arr);
    }
}
