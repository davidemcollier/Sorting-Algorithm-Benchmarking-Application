package cta.proj.gmit;

// Source of code: https://www.geeksforgeeks.org/java-program-for-bubble-sort/

class BubbleSort {
	
	
 public static void Sort(int arr[])
 {
     for (int i = 0; i < arr.length-1; i++)
    	 
    	//Condition is iterating to the end of the array, as far as the previous index of the one previously deposited
         for (int j = 0; j < arr.length-i-1; j++)
            
        	 // If the current element arr[j] is greater than the one at the next higher index...
        	 if (arr[j] > arr[j+1])
             {
                 // ... we swap arr[j+1] and arr[j]
        		 //a temporary variable - temp - is used to store the current element as it is swapped
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
 }
}
