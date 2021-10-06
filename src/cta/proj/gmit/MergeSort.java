package cta.proj.gmit;

// Source of code: https://www.mygreatlearning.com/blog/merge-sort/#t8

public class MergeSort {

		/* The Sort method splits the array in half using its midpoint
		 and recursively feeds these back through Sort, creating smaller arrays*/
	  static void Sort(int arr[], int start, int right) {
		    if (start < right) {
		    	
		    //establishing midpoint for splitting array in half
		      int mid = (start + right) / 2;
		      
		      //recursive call for each half of the array 
		      
		      //first half
		      Sort(arr, start, mid);
		      //second half
		      Sort(arr, mid + 1, right);
		      
		      //call of merge method to reassemble the arrays
		      merge(arr, start, mid, right);
		    }
		  }
			
			//Method for remerging the arrays and ordering them
		  static void merge(int arr[], int left, int mid, int right) {

		    int length1 = mid - left + 1;
		    int length2 = right - mid;

		    int leftArr[] = new int[length1];
		    int rightArr[] = new int[length2];

		    for (int i = 0; i < length1; i++)
		      leftArr[i] = arr[left + i];
		    for (int j = 0; j < length2; j++)
		      rightArr[j] = arr[mid + 1 + j];

		    int i, j, k;
		    i = 0;
		    j = 0;
		    k = left;

		    // reinserting values in order into original array
		    while (i < length1 && j < length2) {
		      if (leftArr[i] <= rightArr[j]) {
		        arr[k] = leftArr[i];
		        i++;
		      } else {
		        arr[k] = rightArr[j];
		        j++;
		      }
		      k++;
		    }

		    while (i < length1) {
		      arr[k] = leftArr[i];
		      i++;
		      k++;
		    }

		    while (j < length2) {
		      arr[k] = rightArr[j];
		      j++;
		      k++;
		    }
		  }
}
