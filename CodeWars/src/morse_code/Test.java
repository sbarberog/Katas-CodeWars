package morse_code;

public class Test {

	public static void main(String[] args) {
		 String str = "  Geeks for Geeks  s";
	        String[] arrOfStr = str.split(" ");
	  
	        for (String a : arrOfStr)
	        	if(!a.isBlank())
	        		System.out.println(a);

	}

}
