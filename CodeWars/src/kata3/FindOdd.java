package kata3;

public class FindOdd {

	/*
	 * Given an array of integers, find the one that appears an odd number of times.
	 * There will always be only one integer that appears an odd number of times.
	 */
	public static int findIt(int[] a) {
		int odd=0;
		
		for (int i : a) {
			odd=i;
			int count=0;
			for (int j: a) {
				if(j==odd) {
					count++;
				}
			}
			if(count%2!=0) return odd;
		}
			
	  return odd;
	  }
	
	/*
	 * Operador XOR (magia?)
	 */
	public static int findItXor(int[] A) {
		int odd=0;
	    for (int item: A)
	      {
	        odd = odd ^ item;
	        // XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out 
	        //leaving the odd number out
	      }
	    
	    return odd;
	  }
}
