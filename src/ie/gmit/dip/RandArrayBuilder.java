package ie.gmit.dip;

public class RandArrayBuilder {

	public void ArrGenerator(int[] arrRange) {
		for (int i = 0; i <= arrRange.length - 1; i++) {
			int n = arrRange[i];
			int[] k = randomArray(n);
			
			
			System.out.print("{");
			for (int m= 0; m< k.length; m++) {
				System.out.print(k[m]);
				if (m < k.length -1) System.out.print(", ");
			}
			System.out.println("}");
			System.out.println(k.length);
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
		RandArrayBuilder g = new RandArrayBuilder();
		int[] arrRange = { 100, 250, 500 };
		g.ArrGenerator(arrRange);
	}
	
}
