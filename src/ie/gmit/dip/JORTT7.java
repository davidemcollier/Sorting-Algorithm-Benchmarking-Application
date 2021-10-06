package ie.gmit.dip;
//OK this seems to work. I worry about the duplicaiton of the time things. I haven't figured out how to execute this with less code though.
public class JORTT7 {


		public void ArrGenerator(int[] arrRange) {
		
			
			
			//loop going through the array (100,200 etc.)
			
			for(int a = 0; a < 2; a++) {
				double Totaltime = 0;
				if (a==0) {
					System.out.printf("%-20s", "Insertion sort");	
				} else if (a==1) {System.out.println();
					System.out.printf("%-20s", "Timsort");	
				}
			
			for (int i = 0; i < arrRange.length; i++) {
				//x being the loop of 10 times for each set (for which we will get the average)
							
				for(int x = 0; x < 10; x++) {

				int n = arrRange[i];
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
			} else if (a==1) {
				//Measure Start time
				long startTime = System.nanoTime();
				Timsort.Sort(k, k.length);
			
				//Measure end time
				long endTime = System.nanoTime();
				
				//Calculating time elapsed in Milliseconds
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				Totaltime = Totaltime + elapsedMillis;	
			}
				}
				System.out.format("%-11.3f", Totaltime/10d);}
				
			}
		}

		//Method for calculating the time elapsed
		
		
		//Generates a random array - code provided by lecturer
		public int[] randomArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = (int) (Math.random() * 100);
			}
			return array;
		}
		
		
		public static void main(String[] args) {
			//Formatting part of attributes in the table
			String formatting = "%-20s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n";
			//String formatting = "%-20s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s\n";
			//13 x %-11.3s put in here
			System.out.printf(formatting, "Size", "100", "200", "500", "750", "1000", "1250", "2500", "3750", "5000", "6250", "7500", "8750", "10000" );
			
			//Algo part
			
			//System.out.printf("%-20s", "Insertion sort");
			JORTT7 g = new JORTT7();
			//int[] arrRange = { 5, 10, 15 };
			int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
			g.ArrGenerator(arrRange);
		}
		
	}
