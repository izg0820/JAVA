
public class SSNLengthException extends Exception {
	public SSNLengthException() {
		super("Invalid data!!");
	}

	public SSNLengthException(String message) {
		super(message);
	}

	public static boolean checkLength(String s) {
		if (s.length() == 9)
			return true;
		else
			return false;
	}
}
