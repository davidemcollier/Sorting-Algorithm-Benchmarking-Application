package ie.gmit.dip;
//This is the nested attempt of the array loop
//to  reverse the x loop to be nested in an array loop??

//maybe going to try and nest the for loop in the Arr generator into a swtich case thing of 1-5 where each value of i represents a different algo to call in a different class maybe?
//Also might move the print Insertions sort part to be in teach case of the switch statement

//Ive also removed the test print out of the algo arrays part. might come and review this later.


public class JORTT5 {


		public void ArrGenerator(int[] arrRange) {
		
			double Totaltime = 0;
			
			//loop going through the array (100,200 etc.)
			
			for(int a = 0; a < 3; a++) {
				
				if (a==0) {
					System.out.printf("%-20s", "Insertion sort");
					
				} else if (a==1) {System.out.println();
					System.out.printf("%-20s", "Insertion sort1");
					
				}
				else {System.out.println();
					System.out.printf("%-20s", "Insertion2 sort");
				}
			
			for (int i = 0; i <= arrRange.length - 1; i++) {
				//x being the loop of 10 times for each set (for which we will get the average)
				
				
					
				for(int x = 0; x < 10; x++) {
				
				int n = arrRange[i];
				int[] k = randomArray(n);
				
				//Measure Start time
				long startTime = System.nanoTime();
				
				//Insertion Sort
				if (a==0) {
				InsertionSort.Sort(k, k.length);}
				
				//Measure end time
				long endTime = System.nanoTime();
				
			
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				
				 Totaltime = Totaltime + elapsedMillis;
				
				
			} 
				System.out.format("%-11.3f", Totaltime/10d);}
				
			}
		}

		
		
		
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
			JORTT5 g = new JORTT5();
			//int[] arrRange = { 5, 10, 15 };
			int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
			g.ArrGenerator(arrRange);
		}
		
	}
