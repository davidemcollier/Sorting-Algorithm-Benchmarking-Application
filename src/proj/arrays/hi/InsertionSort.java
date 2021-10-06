package proj.arrays.hi;

public class InsertionSort {
	    /*
	     * @author: Arpit Mandliya
	     */
	 //Edit: let int n= arr.length (to allow for same inputs for all algos)
	    public static int[] Sort(int arr[], int n)
	    {
	        for (int i = 1; i < n; i++) 
	        { 
	            int valueToSort = arr[i];
	            int j; 
	            // If we get smaller value than valueToSort then, we stop at that index. 
	            for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
	                arr[j] = arr[j - 1];
	            }
	 
	            // We will put valueToSort at that index
	            arr[j] = valueToSort;

	        }
	 
	        return arr;
	    }

	}
