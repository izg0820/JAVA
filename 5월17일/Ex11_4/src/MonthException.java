
public class MonthException extends Exception{
	public MonthException() {
		super("Invalid month!!");
	}

	public MonthException(String message) {
		super(message);
	}

	public static boolean checkMonth(String m) {
		int i;
		for (i = 0; i < m.length(); i++) {
			if (!((m.charAt(i)) >= '0' && (m.charAt(i)) <= '9'))
				break;
		}

		if (Integer.parseInt(m.substring(0, i)) > 0 && Integer.parseInt(m.substring(0, i)) <= 12)
			return true;
		else
			return false;
	}

}
