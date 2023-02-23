package morse_code;

public class MorseCodeDecoder {

	/*
	 * Decodificador de código morse (malditos espacios en blanco...).
	 * 
	 * The Morse code encodes every character as a sequence of "dots" and "dashes". 
	 * For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. 
	 * The Morse code is case-insensitive, traditionally capital letters are used. 
	 * When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. 
	 * For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
	 */
	public static String decode(String morseCode) {
		String result="";
		
		String[] palabras=morseCode.split("   ");
		
		for (int i=0; i<palabras.length; i++) {
			String palabra=palabras[i];
			if(!palabra.isBlank()) {
				String[] letras=palabra.split(" ");
				for (String letra : letras) {
					if(!letra.isBlank())
						result=result + MorseCode.get(letra);
				}
				if((i+1)<palabras.length && !palabras[i+1].isBlank())
					result=result + " ";
			}
		}
		
		return result;
    }
	
	/*
	 * Mejor solución usando .trim() y \s+
	 */
	public static String decodeTrim(String morseCode) {
	      String result = "";
	      for(String word : morseCode.trim().split("   ")) {
	        for(String letter : word.split("\\s+")) {		// \s+ is a regular expression for one or more spaces. is a regular expression for one or more spaces.
	          result += MorseCode.get(letter);
	        }
	        result += ' ';
	      }
	      return result.trim();
	    }
}
