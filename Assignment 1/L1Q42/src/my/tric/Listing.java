package my.tric;

import java.util.Arrays;
import java.util.Scanner;

public class Listing {

	public static void main(String[] args) 
	{
	    Listing.arrayReversal();
	}
	
    public static void arrayReversal() {
        
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter 3 values");
	int arrayListing[] = new int[3];
	for (int i = 0; i < arrayListing.length; i++ ) {
	    arrayListing[i] = Scanner.nextInt();
	}
	
	System.out.print("\nCurrent Array is: ");
	System.out.println(Arrays.toString(arrayListing));
	
	 for (int i = 0; i < arrayListing.length / 2; i++) {
	     int temp = arrayListing[i];
	     arrayListing[i] = arrayListing[arrayListing.length - 1 - i];
	     arrayListing[arrayListing.length - 1 - i] = temp;
	  }
	
	System.out.print("\nReversed Array is: ");
	System.out.println(Arrays.toString(arrayListing));
	
	} 
	
}
