package ie.gmit.dip;

//this is an attempt to combine JORTT3 with the formatter!

//Formatter works  - well formatted.
//Though maybe check the times - they seem to have gone up perhaps from my original excel thing 
//(ie first few numbers were 1.0~s etc with highest being 40. no they go up quite a bit)

public class JORTT3 {


		public void ArrGenerator(int[] arrRange) {
		
			double Totaltime = 0;
			
			for (int i = 0; i <= arrRange.length - 1; i++) {
				//x being the loop of ten times for each set (100,250 etc.)
				for(int x = 0; x <= 9; x++) {
				
				int n = arrRange[i];
				int[] k = randomArray(n);
				
			// just canceling out to see:	System.out.println(k.length);
				
				//Measure Start time
				long startTime = System.nanoTime();
				
				//Insertion Sort
				InsertionSort.Sort(k);
				
				//Measure end time
				long endTime = System.nanoTime();
				
				
			/*	
				//sorted print
				System.out.println("sorted");
				System.out.print("{");
				for (int m= 0; m< t.length; m++) {
					System.out.print(t[m]);
					if (m < t.length -1) System.out.print(", ");
			}
				System.out.println("}");
			*/	
				double timeElapsed = endTime - startTime;
				double elapsedMillis = timeElapsed/1000000;
				
				 Totaltime = Totaltime + elapsedMillis;
				
				
			} 
				System.out.format("%-11.3f", Totaltime/10d);
				
			}
		}

		
		
		
		
		public int[] randomArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = (int) (Math.random() * 100);
			}
			return array;
		}

		
		public static void main(String[] args) {
			//Formatting part
			String formatting = "%-20s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n";
			//13 x %-11.3s put in here
			System.out.printf(formatting, "Size", "100", "200", "500", "750", "1000", "1250", "2500", "3750", "5000", "6250", "7500", "8750", "10000" );
			
			//Algo part
			
			System.out.printf("%-20s", "Insertion sort");
			JORTT3 g = new JORTT3();
			//int[] arrRange = { 5, 10, 15 };
			int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
			g.ArrGenerator(arrRange);
		}
		
	}
