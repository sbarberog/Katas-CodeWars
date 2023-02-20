package digital_root;

import java.util.ArrayList;

public class DRoot {

	/*
	 * Given n, take the sum of the digits of n. If that value has more than one
	 * digit, continue reducing in this way until a single-digit number is produced.
	 * The input will be a non-negative integer.
	 */
	public static int digital_root(int n) {

		int num = n;
		ArrayList<Integer> digitos = new ArrayList<Integer>();
		do {
			digitos.add(num % 10);
			num = num / 10;
		} while (num > 0);

		int root = 0;
		for (Integer i : digitos) {
			root += i;
		}
		if (root > 9) {
			root = digital_root(root);
		}

		return root;
	}

	public static int digital_root_good(int n) {
		while (n > 9) {
			n = n / 10 + n % 10;
		}
		return (n);
	}

	public static int digital_root_clever(int n) {
		return n < 10 ? n : digital_root(digital_root(n / 10) + n % 10);
	}
}
