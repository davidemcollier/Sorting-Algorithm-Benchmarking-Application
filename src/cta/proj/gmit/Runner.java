package cta.proj.gmit;

public class Runner {
	public void benchMarker(int[] arrRange) {

		// Loop with each value relating to the calling and output for each sorting algorithm
	for (int algo = 0; algo < 5; algo++) {
			// Declaration of time variable to store duration of execution of each algorithm
			double TotalTime = 0;

			// Range of if statements, each called, with appropriate name and formatting
			// printed, for each value of algo
			if (algo == 0) {
				System.out.printf("%-16s", "Insertion Sort");
			} else if (algo == 1) {
				System.out.println();
				System.out.printf("%-16s", "Merge Sort");
			} else if (algo == 2) {
				System.out.println();
				System.out.printf("%-16s", "Bubble Sort");
			} else if (algo == 3) {
				System.out.println();
				System.out.printf("%-16s", "Quick Sort");
			} else if (algo == 4) {
				System.out.println();
				System.out.printf("%-16s", "Counting Sort");
			}

			
			//Loop passing over each of the size inputs {100, 200, 500 ...}
			for (int i = 0; i < arrRange.length; i++) {
				
				
				// Loop generating a new random array of size arrRange.length 
				// Generates 10 runs, for which we will get an average
				for (int run = 0; run < 10; run++) {

					int n = arrRange[i];
					// Calling method to create a random array
					int[] k = randomArray(n);

					
					/*Series of if statements calling each of the algorithms accordingly.
					 * Each fitted between time recording functions 
					 * TotalTime variable increments with each iteration for which we get an average
					 * on completion of the loop. 
					 */ 
					
					
					// Insertion Sort
					if (algo == 0) {
						// Measure Start time
						long startTime = System.nanoTime();
						InsertionSort.Sort(k);
						// Measure end time
						long endTime = System.nanoTime();

						// Calculating time elapsed in Milliseconds
						double timeElapsed = endTime - startTime;
						double elapsedMillis = timeElapsed / 1000000;

						TotalTime = TotalTime + elapsedMillis;

					}
					//Merge Sort
					else if (algo == 1) {
						// Measure Start time
						long startTime = System.nanoTime();
						MergeSort.Sort(k, 0, k.length - 1);

						// Measure end time
						long endTime = System.nanoTime();

						// Calculating time elapsed in Milliseconds
						double timeElapsed = endTime - startTime;
						double elapsedMillis = timeElapsed / 1000000;
						TotalTime = TotalTime + elapsedMillis;
					} 
					//Bubble Sort
					else if (algo == 2) {
						// Measure Start time
						long startTime = System.nanoTime();
						BubbleSort.Sort(k);
						// Measure end time
						long endTime = System.nanoTime();

						// Calculating time elapsed in Milliseconds
						double timeElapsed = endTime - startTime;
						double elapsedMillis = timeElapsed / 1000000;
						TotalTime = TotalTime + elapsedMillis;
					} 
					//Quick Sort
					else if (algo == 3) {
						// Measure Start time
						long startTime = System.nanoTime();
						QuickSort.Sort(k, 0, k.length - 1);
						// Measure end time
						long endTime = System.nanoTime();

						// Calculating time elapsed in Milliseconds
						double timeElapsed = endTime - startTime;
						double elapsedMillis = timeElapsed / 1000000;
						TotalTime = TotalTime + elapsedMillis;
					} 
					//Counting Sort
					else if (algo == 4) {
						// Measure Start time
						long startTime = System.nanoTime();
						CountingSort.Sort(k, k.length);
						// Measure end time
						long endTime = System.nanoTime();

						// Calculating time elapsed in Milliseconds
						double timeElapsed = endTime - startTime;
						double elapsedMillis = timeElapsed / 1000000;
						TotalTime = TotalTime + elapsedMillis;
					}

				}
				// Calculation of the average of 10 cycles of random arrays and formatting for
				// inclusion in table output. Formatting to three decimal places
				System.out.format("%-9.3f", TotalTime / 10d);
			}

		}
	}

	// Generates a random array of size of each element in input array 
	// Random array is of range 1-99 inclusive
	public int[] randomArray(int n) {
		// Declaration of a new random array
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	
	
	public static void main(String[] args) {

		// Formatting for table output columns and headings labeled according to chosen input sizes.
		String formatting = "%-16s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s%-9s\n";
		System.out.printf(formatting, "Size", "100", "200", "500", "750", "1000", "1250", "2500", "3750", "5000",
				"6250", "7500", "8750", "10000", "20000");

		// Declaration of array for which each value represents an array size to be
		// input through each sorting algorithm
		int[] arrRange = { 100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000, 20000 };

		Runner g = new Runner();
		g.benchMarker(arrRange);
	}

}
