package cta.proj.gmit;

//Source of code: https://java2blog.com/implement-insertion-sort-in-java/

public class InsertionSort {

	public static int[] Sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			//valueToSort variable stores the value of the current element to be sorted
			int valueToSort = arr[i];
			int j;
			// If we get a smaller value than valueToSort then, we stop at that index.
			for (j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
				//preceding element value is copied over the successive element value
				// the preceding element is now a 'gap' to be overridden
				arr[j] = arr[j - 1];
			}

			// valueToSort is inserted to the 'gap' index
			arr[j] = valueToSort;

		}

		return arr;
	}

}
