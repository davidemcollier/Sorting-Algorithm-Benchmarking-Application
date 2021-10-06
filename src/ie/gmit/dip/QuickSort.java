package ie.gmit.dip;

// Java implementation of QuickSort
import java.io.*;
	 
public	class QuickSort{
	     
	// A utility function to swap two elements
	static void swap(int[] array, int i, int j)
	{
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
	 
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	static int partition(int[] array, int low, int high)
	{
	     
	    // pivot
	    int pivot = array[high];
	    System.out.println("pivot: " + pivot);
	     
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	    	printArray(array, array.length);
	        // If current element is smaller
	        // than the pivot
	        if (array[j] < pivot)
	        {
	             
	            // Increment index of
	            // smaller element
	            i++;
	            swap(array, i, j);
	        }
	        printArray(array, array.length);
	    }
	    swap(array, i + 1, high);
	    printArray(array, array.length);
	    System.out.println("i + 1: " + i + 1);
	    return (i + 1);
	}
	 
	/* The main function that implements QuickSort
	          array[] --> Array to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	static void quickSort(int[] array, int low, int high)
	{
	    if (low < high)
	    {
	         
	        // pi is partitioning index, array[p]
	        // is now at right place
	        int pi = partition(array, low, high);
	 
	        // Recursively
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(array, low, pi - 1);
	        quickSort(array, pi + 1, high);
	    }
	}
	 
	// Function to print an array
	static void printArray(int[] array, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(array[i] + " ");
	         
	    System.out.println();
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int[] array = { 1,5,4,6,2,3 };
	    int n = array.length;
	     
	    quickSort(array, 0, n - 1);
	    System.out.println("Sorted array: ");
	    printArray(array, n);
	}
	}
	 
	// This code is contributed by Ayush Choudhary