package reverside;

public class Alphabet {

	public static void main(String[] args) {
		System.out.println(findVowelConsent('E'));

	}
	
	public static String findVowelConsent(char ch) {
		String result = "";
		switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				result = "Vowel";
				break;
			default:
				result = "Consent";
		}
		return result;
	}

}
