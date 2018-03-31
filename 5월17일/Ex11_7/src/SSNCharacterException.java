
public class SSNCharacterException extends Exception{

	public SSNCharacterException() {
		super("Invalid data!!");
	}

	public SSNCharacterException(String message) {
		super(message);
	}

	public static boolean checkCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= '0' || s.charAt(i) <= '9'))
				return false;
		}

		return true;
	}
}
