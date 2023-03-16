package permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	/*
	 * Other solutions: https://www.codewars.com/kata/5254ca2719453dcc0b00027d/solutions/java
	 */
	public static List<String> singlePermutations(String s) {

		int k=s.length();
		char[] p=s.toCharArray();
		
		List<String> permutations=new ArrayList<String>();
		
		generate(permutations, k, p);
		
		return permutations;
    }
	
	// Heap's recursive algorithm
	public static void generate(List<String> permutations, int k, char[] p) {
		if(k==1) {
			String perm= new String(p);
			if(!permutations.contains(perm))
				permutations.add(perm);
		} else {
			for(int i=0; i<k; i++) {
				generate(permutations, k-1, p);
				if(k%2==0) {
					char aux=p[i];
					p[i]=p[k-1];
					p[k-1]=aux;
				} else {
					char aux=p[0];
					p[0]=p[k-1];
					p[k-1]=aux;
				}
			}
		}
	}
}
