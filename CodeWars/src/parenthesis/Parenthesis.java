package parenthesis;

public class Parenthesis {

	/*
	 * Write a function that takes a string of parentheses, and determines if the
	 * order of the parentheses is valid. The function should return true if the
	 * string is valid, and false if it's invalid.
	 */
	public static boolean validParentheses(String parens) {
		char[] frase = parens.toCharArray();
		int cont=0;
		
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == '(') {
				cont++;
			}
			if (frase[i] == ')') {
				cont--;
			}
			if(cont<0) return false;
		}
		return cont==0;
	}
}
