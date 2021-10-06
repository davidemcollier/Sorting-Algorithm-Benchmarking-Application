//This generates Unsorted arrays and then prints the sorted arrays, runnign through each instance (100,250, 500)
package ie.gmit.dip;

public class JustOneRanTenTimes {

	public void ArrGenerator(int[] arrRange) {
	
		for (int i = 0; i <= arrRange.length - 1; i++) {
			//x being the loop of ten times for each set (100,250 etc.)
			for(int x = 0; x <= 9; x++) {
			int n = arrRange[i];
			int[] k = randomArray(n);
			
			
			//unsorted print
			System.out.println("unsorted");
			System.out.print("{");
			for (int m= 0; m< k.length; m++) {
				System.out.print(k[m]);
				if (m < k.length -1) System.out.print(", ");
			}
			System.out.println("}");
			
			System.out.println(k.length);
			
			int[] t = InsertionSort.Sort(k);
			
			//sorted print
			System.out.println("sorted");
			System.out.print("{");
			for (int m= 0; m< t.length; m++) {
				System.out.print(t[m]);
				if (m < t.length -1) System.out.print(", ");
		}
			System.out.println("}");
		}
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
		JustOneRanTenTimes g = new JustOneRanTenTimes();
		int[] arrRange = { 5, 10, 15 };
		g.ArrGenerator(arrRange);
	}
	
}
