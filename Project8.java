package project8;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Project8 {


    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        
        Scanner scanin = new Scanner(System.in);
        
        int n = scanin.nextInt();
        
        Random rand = new Random();
        
        int[] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1001);
        }
        
        long start = System.currentTimeMillis();
        SortingAlgorithms.BubbleSort(array.clone());
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Bubble Sort: " + elapsed + "(ms.)");
        
        long start1 = System.currentTimeMillis();
        SortingAlgorithms.BubbleSortSC(array.clone());
        long elapsed1 = System.currentTimeMillis() - start1;
        System.out.println("Bubble Sort (SC): " + elapsed1 + "(ms.)");
        
        long start4 = System.currentTimeMillis();
        SortingAlgorithms.GnomeSort(array.clone());
        long elapsed4 = System.currentTimeMillis() - start4;
        System.out.println("Gnome Sort: " + elapsed4 + "(ms.)");
        
        long start2 = System.currentTimeMillis();
        SortingAlgorithms.SelectionSort(array.clone());
        long elapsed2 = System.currentTimeMillis() - start2;
        System.out.println("Selection Sort: " + elapsed2 + "(ms.)");
        
        long start3 = System.currentTimeMillis();
        SortingAlgorithms.InsertionSort(array.clone());
        long elapsed3 = System.currentTimeMillis() - start3;
        System.out.println("Insertion Sort: " + elapsed3 + "(ms.)");
        
        long start5 = System.currentTimeMillis();
        SortingAlgorithms.mergeSort(array.clone(), array.length);
        long elapsed5 = System.currentTimeMillis() - start5;
        System.out.println("Merge Sort: " + elapsed5 + "(ms.)");
        
        long start6 = System.currentTimeMillis();
        Arrays.sort(array);
        long elapsed6 = System.currentTimeMillis() - start6;
        System.out.println("Java Sort: " + elapsed6 + "(ms.)");
        
        long start7 = System.currentTimeMillis();
        SortingAlgorithms.quickSort(array, 0, array.length - 1);
        long elapsed7 = System.currentTimeMillis() - start7;
        System.out.println("Quick Sort: " + elapsed7 + "(ms.)");
        
        
        
    }
    
}
