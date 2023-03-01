package two_sum;

public class TwoSum {

	/*
	 * Write a function that takes an array of numbers (integers for the tests) and a target number. 
	 * It should find two different items in the array that, when added together, give the target value. 
	 * The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).
	 */
	public static int[] twoSum(int[] numbers, int target) {
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==target) {
	                   return new int[]{i, j};
				}
			}
		}
		
        return null;
    }
}
