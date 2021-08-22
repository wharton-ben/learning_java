//Write a recursive function (use no while loops or for loops) that prints
//all the elements of an array of integers, one per line.
//The parameters to the function should be int a[], and int size.
//Belinda Copus 12/3/2014

//Add a second method that prints the contents of the array recursively
//from the end to the beginning.

public class RecursiveArray {
  /** Main method */
  public static void main(String[] args) {
	int[] a = {1,3,5};

    System.out.println("Array Forwards...");
	printArrayForward(a,0);
	System.out.println();
	System.out.println("Array Backwards...");
	printArrayBackward(a, a.length-1);
  }


  public static void printArrayForward(int[] a,int n) {
    if (n == a.length-1) // Base case
      System.out.println(a[n]);
    else{
	  System.out.println(a[n]);
      printArrayForward(a,n+1); // Recursive call
  	}
  }

  public static void printArrayBackward(int[] a,int n) {
    if (n == 0) // Base case
       System.out.println(a[n]);
    else{
  	   System.out.println(a[n]);
       printArrayBackward(a,n-1); // Recursive call
    }
  }
}//RecursiveArray
