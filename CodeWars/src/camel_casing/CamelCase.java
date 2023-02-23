package camel_casing;

public class CamelCase {

	/*
	 * Complete the solution so that the function will break up camel casing, using a space between words.
	 */
	public static String camelCase(String input) {
		
		if(input.length()==0) return "";
		
		String result=""+input.charAt(0);
		
		for (int i=1; i<input.length(); i++) {
			char c1=input.charAt(i-1);
			char c2=input.charAt(i);
			if(Character.isLowerCase(c1) && Character.isUpperCase(c2)) {
				result+=" ";
			} 
			result+=input.charAt(i);
		}
		
	    return result;
	  }
	
	/*
	 * Usando .replaceAll y expresiones regulares
	 */
	public static String camelCaseFlexeo(String input) {
        return input.replaceAll("([A-Z])", " $1");
  }
}
