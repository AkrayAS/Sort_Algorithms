import java.util.Random;

public class SelectionSort {
    void selectionSort(int arr[]) { 
        int n = arr.length;  
        for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }  

    void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    public static void main(String args[]) { 
        SelectionSort ob = new SelectionSort(); 
        Random rd = new Random(); 
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Unsorted array");
        ob.printArray(arr);
        ob.selectionSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}