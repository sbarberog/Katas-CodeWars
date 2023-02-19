package kata2;

public class Square {

	/*
	 * Comprobar si un número es cuadrado
	 */
	public static boolean isSquare(int n) {

		int root=(int) Math.sqrt(n);
		
		return Math.pow(root,2)==n;
			
		
	}
	
	/* En una sola línea:
	return Math.sqrt(n) % 1 == 0;
	*/
}
