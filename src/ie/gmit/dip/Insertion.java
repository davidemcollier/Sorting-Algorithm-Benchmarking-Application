package ie.gmit.dip;

public class Insertion {
    /*
     * @author: Arpit Mandliya
     */ from: https://java2blog.com/implement-insertion-sort-in-java/
 
    public static void main(String args[])
    {
        int  arr[]={5,7,3,6,4,1};
        insertionSort(arr);
 
    }
 
    public static int[] insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {   System.out.println("i: "+ i);
            int valueToSort = arr[i];
            int j; 
            System.out.println("valueToSort =" + arr[i] );
            // If we get smaller value than valueToSort then , we stop at that index. 
            for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
            	
            	System.out.println("arr [j]:" + arr[j]) ;
            	System.out.println("arr[j-1]: " + arr[j-1]);
                arr[j] = arr[j - 1];
                System.out.println("Then - arr [j]:" + arr[j]) ;
         
            }
 
            // We will put valueToSort at that index
            
            arr[j] = valueToSort;
            System.out.println("[j]:" + j) ;
            System.out.println("arr [j]:" + arr[j]) ;
            System.out.print("Iteration "+(i)+": ");
            printArray(arr);
        }
 
        return arr;
    }
    public static void printArray(int arr[])
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}