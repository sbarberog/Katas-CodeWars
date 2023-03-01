package sort_odds;

import java.util.ArrayList;
import java.util.Arrays;

public class SortOdds {

	/*
	 * You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
	 */
	public static int[] sortArray(int[] array) {
		
		ArrayList<Integer> odds=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2!=0) {
				odds.add(array[i]);
			}
		}
		odds.sort(null);
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2!=0) {
				array[i]=odds.get(0);
				odds.remove(0);
			}
		}
		
	    return array;
	  }
	
	/*
	 * Usando Arrays.stream
	 */
	 public static int[] sortArray2(final int[] array) {

		    // Sort the odd numbers only
		    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
		    
		    // Then merge them back into original array
		    for (int j = 0, s = 0; j < array.length; j++) {
		      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
		    }
		    
		    return array;
		  }
}
