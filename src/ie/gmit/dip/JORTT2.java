package ie.gmit.dip;

//Next on from JustOneRanTenTimes 
//This tries to do each 10 times and MEASURE
//Removed the unsroted parts from previous

public class JORTT2 {

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
			
			
		} System.out.print(Totaltime/10d + " ");
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
		JORTT2 g = new JORTT2();
		//int[] arrRange = { 5, 10, 15 };
		int[] arrRange = {100, 200, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000 };
		g.ArrGenerator(arrRange);
	}
	
}
