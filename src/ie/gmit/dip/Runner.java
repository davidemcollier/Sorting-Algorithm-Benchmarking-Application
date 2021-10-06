package ie.gmit.dip;

public class Runner {
	
	public static void main(String[] args) {
		
		int n = 10;
		RandomNumbers a = new RandomNumbers();			
		int[] arr = a.randomArray(n);
		
		//Print Array
		System.out.print("{");
		for (int i= 0; i< arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length -1) System.out.print(", ");
		}
		System.out.println("}");
		
		
		//Measure Start time
		long startTime = System.nanoTime();
		
		//Insertion Sort
		InsertionSort g = new InsertionSort();
		int [] k = g.Sort(arr);
		
		//Measure end time
		long endTime = System.nanoTime();
		
		//Print Sorted Array
		System.out.print("{");
		for (int i= 0; i< arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length -1) System.out.print(", ");
		}
		System.out.println("}");
		
		//Difference of times
		double timeElapsed = endTime - startTime;
		double elapsedMillis = timeElapsed/1000000;
		System.out.println(timeElapsed);
		System.out.println(elapsedMillis);
	}
		
	

	
	
	
	
	}
	

