
public class BubbleSort {
    
    public void sort(int[] arr) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < lastUnsorted; i++) {
                if(arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3};
        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        
        printArray(arr);
    }
}
