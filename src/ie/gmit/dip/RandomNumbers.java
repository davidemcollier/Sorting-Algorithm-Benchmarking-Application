// Array to generate random numbers below

package ie.gmit.dip;

public class RandomNumbers {
	
	public int [] randomArray (int n){
		int [] array = new int [n];
		for ( int i = 0; i < n ; i ++) {
		array [i] = ( int ) ( Math . random () * 100) ;
		}
		return array ;
		}	
	
/*	public static void main(String[] args) {
		int n = 10000000;
		RandomNumbers g = new RandomNumbers();
		
		
		int[] arr = g.randomArray(n);
		//Printing out the array
		System.out.print("{");
		for (int i= 0; i< arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length -1) System.out.print(", ");
		}
		System.out.println("}");
	}
	*/
}
