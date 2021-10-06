package proj.arrays.hi;

// code from : https://www.programiz.com/dsa/counting-sort

//Counting sort in Java programming

import java.util.Arrays;

class CountingSort {
static void countSort(int array[], int size) {
 int[] output = new int[size + 1];

 // Find the largest element of the array
 int max = array[0];
 for (int i = 1; i < size; i++) {
   if (array[i] > max)
     max = array[i];
 }
 int[] count = new int[max + 1];
 System.out.println(Arrays.toString(count));

 // Initialize count array with all zeros.
 for (int i = 0; i < max; ++i) {
   count[i] = 0;
 }
 System.out.print("arr is: ");
 System.out.println(Arrays.toString(array));
 // Store the count of each element
 for (int i = 0; i < size; i++) {
   count[array[i]]++;
 }
 System.out.println("Store the count of each element ");
 System.out.println(Arrays.toString(count));

 // Store the cumulative count of each array
 for (int i = 1; i <= max; i++) {
   count[i] += count[i - 1];
 }
 System.out.println("Store the cumulative count of each array");
 System.out.print("count");
 System.out.println(Arrays.toString(count));
 
 
 // Find the index of each element of the original array in count array, and
 // place the elements in output array
 for (int i = size - 1; i >= 0; i--) {
	 System.out.println("i: " + i);
	   System.out.println("array[i]: " + array[i]);
	   System.out.println("count[array[i]]: " + count[array[i]]);
	   System.out.println("count[array[i]] -1: " + (count[array[i]] - 1));
	   
   output[count[array[i]] - 1] = array[i];
   System.out.println(count[array[i]]);
   
   count[array[i]]--;
   
   
   System.out.println(count[array[i]]);
  
   
 }
 System.out.println("Find the index of each element of the original array in count array, and");
 System.out.println("place the elements in output array");
 System.out.print("output");
 System.out.println(Arrays.toString(output));
 
 System.out.print("count");
 System.out.println(Arrays.toString(count));
 // Copy the sorted elements into original array
 for (int i = 0; i < size; i++) {
   array[i] = output[i];
 }
}

// Driver code
public static void main(String args[]) {
 int[] arr = { 5, 3, 3, 6, 4, 1 };
 int size = arr.length;
 CountingSort cs = new CountingSort();
 cs.countSort(arr, size);
 System.out.println("Sorted Array in Ascending Order: ");
 System.out.println(Arrays.toString(arr));
}
}