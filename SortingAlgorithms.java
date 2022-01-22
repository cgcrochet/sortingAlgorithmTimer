package project8;


public class SortingAlgorithms {
    
    public static void BubbleSort(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void BubbleSortSC(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swap = true;
                }
            }
            
            if (!swap)
                break;
        }
    }
    
    public static void SelectionSort(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
            
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    
    }
    
    public static void InsertionSort(int[] array) {
        int i, key, j;
        
        for(i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        }
    
    }
    
    public static void GnomeSort(int[] arr) {
        int n = arr.length;
        
        int index = 0;
 
        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }
    
    public static void mergeSort(int[] a, int n) {
    if (n < 2) {
        return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
    }
    
    
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
    }
    
    
    /* Quick Sort Methods *****************************************************/
    static int partition(int[] arr, int low, int high) {
      
    int pivot = arr[high]; 
      
    int i = (low - 1); 
  
    for(int j = low; j < high; j++)
    {
        if (arr[j] < pivot) 
        {
            i++; 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    
    return (i + 1);
    }
    
    static void quickSort(int[] arr, int low, int high) {
    if (low < high) 
    {

        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
    }
    
}
