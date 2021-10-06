package cta.proj.gmit;

// Source of code: https://www.programiz.com/dsa/counting-sort


class CountingSort {

	public static void Sort(int array[], int size) {
		int[] output = new int[size + 1];

		// We determine the largest value element of the array
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}

		// Creation of the count array. 
		int[] count = new int[max + 1];
		// Populate all indexes of count array with zeros.
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// This loop then 'counts' each instance of a number in the input array.
		// In this, it increments the value of i for each instance at the respective
		// index value. 
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}

		// Store the cumulative count of each array. 
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		// Finally, we copy the sorted elements from output array into the original array
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}
}