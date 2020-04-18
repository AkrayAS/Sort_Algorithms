import java.util.Random;

public class BubbleSort { 
	void bubbleSort(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) {  
					int temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
	} 
	void printArray(int arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}  
	public static void main(String args[]) { 
        BubbleSort ob = new BubbleSort();
        Random rd = new Random(); 
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Unsorted array");
        ob.printArray(arr);
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 