import java.util.*;
//create bubble sort class
public class bubbleSort {
	// create an arrayList
	private static ArrayList<String> myArray = new ArrayList<String>();
	//create sorting method
	public static ArrayList<String> bubbleSortArray(String [] ar) {
		// take input as a string array
		String temp;
		// create two for loops, that compares two elements of the array and swaps them accordingly
		for (int i= (ar.length-1); i>=0; i--) {
			for (int j=1; j<=i;j++) {
				//compare the first letter of each word
				char first = ar[i].charAt(0);
				char second = ar[j-1].charAt(0);
				if (first>second) {
					temp = ar[j-1];
					ar[j-1] = ar[i];
					ar[i] = temp;
				    }
		     	}
			// add to the ArrayList
			myArray.add(ar[i]);
		    }
		//return the ArrayList
		return myArray;
		
	    }
	public static void main(String[] args) {
		String string[] = {"right","subdued","trick","crayon","punishment","silk","describe","royal","prevent","slope"};
	    // print out results
		System.out.println(bubbleSortArray(string));
		
	}

}
