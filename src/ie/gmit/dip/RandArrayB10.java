package ie.gmit.dip;

public class RandArrayB10 {

	/*
	public int[] TenArrMaker() {
		for (int i = 0; i < 10; i++) {
			
		}
	}
	*/
	public void ArrGenerator(int[] arrRange) { //goes the the 100, 250 etc. ranges
		for (int i = 0; i <= arrRange.length - 1; i++) {
			int n = arrRange[i];
			// i is 100 in the first index so we need to make 10 of these
			int[] k = randomArray(n);
				
			
			
			System.out.print("{");
			for (int m = 0; m < k.length; m++) {
				System.out.print(k[m]);
				if (m < k.length - 1)
					System.out.print(", ");
			}
			System.out.println("}");
			System.out.println(k.length);
		}
	}

	public int[] randomArray(int n) { // Makes a random array
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static void main(String[] args) {
		
		RandArrayB10 g = new RandArrayB10();
		int[] arrRange = { 100, 250, 500 };
		g.ArrGenerator(arrRange);
		
		
		
		
	}

}
