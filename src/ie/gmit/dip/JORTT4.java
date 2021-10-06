package ie.gmit.dip;


//maybe going to try and nest the for loop in the Arr generator into a swtich case thing of 1-5 where each value of i represents a different algo to call in a different class maybe?
//Also might move the print Insertions sort part to be in teach case of the switch statement

//Ive also removed the test printo out of the algo arrays part. might come and review this later.
//maybe ill reverese the x loop to be nest in an array loop??
//going to just make a nested attempt in another class now
public class JORTT4 {


		public void ArrGenerator(int[] arrRange) {
		
			double Totaltime = 0;
			
			for (int i = 0; i <= arrRange.length - 1; i++) {
				//x being the loop of ten times for each set (100,250 etc.)
				for(int x = 0; x <= 9; x++) {
				
				int n = arrRange[i];
				int[] k = randomArray(n);
				
				//Measure Start time
				long startTime = System.nanoTime();
				
				//Insertion Sort
				InsertionSort.Sort(k, k.length);
				
				//Measure end time
				long endTime = System.nanoTime();
				
			
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				
				 Totaltime = Totaltime + elapsedMillis;
				
				
			} 
				System.out.format("%-11.3f", Totaltime/10d);
				
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
			
			System.out.printf("%-20s", "Insertion sort");
			JORTT4 g = new JORTT4();
			//int[] arrRange = { 5, 10, 15 };
			int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
			g.ArrGenerator(arrRange);
		}
		
	}
