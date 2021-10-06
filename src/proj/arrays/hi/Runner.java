package proj.arrays.hi;

import java.util.Arrays;

//NB Eclsipse suggested changing the mehtods in MerSort a(ie sort and merge) and selectionsort  to 'static'. Need to look into this and add to report. JOhn cover 'static' meaning in the circle seminar.


//OK this seems to work. I worry about the duplicaiton of the time things. I haven't figured out how to execute this with less code though.
public class Runner {


		public void ArrGenerator(int[] arrRange) {
		
			
			
			//loop going through the array (100,200 etc.)
			
			for(int a = 0; a < 11; a++) {
				//for(int a = 7; a >=0 ; a--) {
				
				//Declaration of time variable to store duration of execution of each algorithm
				double Totaltime = 0;
				
				//Range of if statements, each called, with appropriate name and formatting printed, for each value of a
			/*	if (a==0) {
					System.out.printf("%-20s", "Insertionsort");	
				} else if (a==1) {System.out.println();
					System.out.printf("%-20s", "Timsort");	
				} else if (a==2) {System.out.println();
				System.out.printf("%-20s", "Mergesort");	
			} else if (a==3) {System.out.println();
			System.out.printf("%-20s", "Radixsort");	
		} else if (a==4) {System.out.println();
		System.out.printf("%-20s", "Selectionsort");	
	} else if (a==5) {System.out.println();
	System.out.printf("%-20s", "Bubblesort");	
}else if (a==6) {System.out.println();
System.out.printf("%-20s", "Quicksort");	
}else if (a==7) {System.out.println();
System.out.printf("%-20s", "Arraysort");	
}else if (a==8) {System.out.println();
System.out.printf("%-20s", "MergeSort2");	
}else if (a==9) {System.out.println();
System.out.printf("%-20s", "CountingSort2");	
}else if (a==10) {System.out.println();
System.out.printf("%-20s", "ShellSort");	
}
	*/		
			for (int i = 0; i < arrRange.length; i++) {
				//x being the loop of 10 times for each set (for which we will get the average)
							
				for(int x = 0; x < 10; x++) {

				int n = arrRange[i];
				//Calling method to create a random array 
				int[] k = randomArray(n);
				
				
				
				//Insertion Sort
				if (a==0) {
				//Measure Start time
				long startTime = System.nanoTime();
				InsertionSort.Sort(k, k.length);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				
				 Totaltime = Totaltime + elapsedMillis;	
				 
				 
				} 
				
				//Timsort
				else if (a==1) {	
				//Measure Start time
				long startTime = System.nanoTime();
				Timsort.Sort(k, k.length);
			
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
				
				} else if (a==2) {
				//Measure Start time
				long startTime = System.nanoTime();
				MergeSort.sort(k, 0, k.length - 1);
				//Measure end time
				long endTime = System.nanoTime();
				System.out.println(Arrays.toString(k));
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			} else if (a==3) {
				//Measure Start time
				long startTime = System.nanoTime();
				RadixSort.sort(k, k.length);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			} else if (a==4) {
				//Measure Start time
				long startTime = System.nanoTime();
				SelectionSort.sort(k);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			} else if (a==5) {
				//Measure Start time
				long startTime = System.nanoTime();
				BubbleSort.sort(k);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			} else if (a==6) {
				//Measure Start time
				long startTime = System.nanoTime();
				QuickSort.quickSort(k, 0, k.length-1);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}else if (a==7) {
				//Measure Start time
				long startTime = System.nanoTime();
				Arrays.sort(k);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}	else if (a==8) {
				//Measure Start time
				long startTime = System.nanoTime();
				MergeSort2.mergeSort(k,0, k.length-1);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}	else if (a==9) {
				//Measure Start time
				long startTime = System.nanoTime();
				CountingSort2.countSort(k,k.length);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}	else if (a==10) {
				//Measure Start time
				long startTime = System.nanoTime();
				ShellSort.sort(k);
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}	
				
				}
				// Calculation of the average of 10 cycles of random arrays and formatting for inclusion in table output
				//System.out.format("%-11.3f", Totaltime/10d);}
			}
			}
		}
				
		//Generates a random array - code provided by lecturer
		public int[] randomArray(int n) {
			//Declaration of a new random array
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				
				array[i] = (int) (Math.random() * 100);
			}
			return array;
		}
		
		
		
		public static void main(String[] args) {
			
			//Formatting for table output with inclusion of array sizes for input
			//String formatting = "%-20s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n";
		//	System.out.printf(formatting, "Size", "100", "200", "500", "750", "1000", "1250", "2500", "3750", "5000", "6250", "7500", "8750", "10000");
			
			//Declaration of array for which each value represents an array size to be input through each sorting algorithm
			//int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
			int[] arrRange = {10};
			
			Runner g = new Runner();
			g.ArrGenerator(arrRange);
		}
		
	}
