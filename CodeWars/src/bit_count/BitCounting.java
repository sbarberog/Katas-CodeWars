package bit_count;

public class BitCounting {

	/*
	 * Write a function that takes an integer as input, and returns the number of bits that are equal to one in the 
	 * binary representation of that number. You can guarantee that input is non-negative.
	 */
	public static int countBits(int n){
		
		String num= Integer.toBinaryString(n);
		int count=0;
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i)=='1') {
				count++;
			}
		}
		
		return count;
	}
	
	// función .bitCount()
	public static int countBits2(int n){
		 return Integer.bitCount(n);
	}
	
	// forma matemática
	public static int countBits3(int n){
		int ret = n % 2;
		while ((n /= 2) > 0) ret += n % 2;
		return ret;
	}
}
