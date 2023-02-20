package spin_words;

public class SpinWords {

	/*
	 * Write a function that takes in a string of one or more words, and returns the
	 * same string, but with all five or more letter words reversed (Just like the
	 * name of this Kata). Strings passed in will consist of only letters and
	 * spaces. Spaces will be included only when more than one word is present.
	 */
	public String spinWords(String sentence) {

		String[] arr = sentence.split(" ");

		String ns = "";

		for (int j = 0; j < arr.length; j++) {
			String ss = arr[j];
			if (ss.length() >= 5) {
				ns = "";
				char aux;
				for (int i = 0; i < ss.length(); i++) {
					aux = ss.charAt(i);
					ns = aux + ns;
				}
				arr[j] = ns;
			}
		}
		String result = arr[0];

		if (arr.length > 1) {
			for (int i = 1; i < arr.length; i++) {
				result = result + " " + arr[i];
			}
		}

		return result;
	}

	// mejor solución, usando split-join, StringBuilder y reverse()
	public String spinWordsBuilder(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= 5) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		return String.join(" ", words);
	}

	// otra solución sencilla, usando StringBuffer
	public String spinWordsBuffer(String sentence) {

		for (String a : sentence.split(" ")) {
			if (a.length() > 4) {
				sentence = sentence.replace(a, new StringBuffer(a).reverse());
			}

		}
		return sentence;
	}
}
