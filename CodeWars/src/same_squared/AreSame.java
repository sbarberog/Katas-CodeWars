package same_squared;

import java.util.ArrayList;

public class AreSame {

	/*
	 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, 
	 * with the same multiplicities (the multiplicity of a member is the number of times it appears). 
	 * "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
	 */
	public static boolean comp(int[] a, int[] b) {
		
		ArrayList<Integer> copy= new ArrayList<>();
		for (int i : b) {
			copy.add(i);
		}
		
		for (int i = 0; i < a.length; i++) {
			Integer square=(int) Math.pow(a[i], 2);
			if(copy.contains(square)) {
				copy.remove(square);
			} else
				return false;
		}
		
	    return true;
	  }
}
