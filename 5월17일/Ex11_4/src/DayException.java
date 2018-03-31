
public class DayException extends Exception{
	public DayException() {
		super("Invalid data!!");
	}

	public DayException(String message) {
		super(message);
	}

	public static boolean checkDay(String m) {
		int i;
		for (i = 0; i < m.length(); i++) {
			if (!((m.charAt(i)) >= '0' && (m.charAt(i)) <= '9'))
				break;
		}
		int month = Integer.parseInt(m.substring(0, i));
		int day = Integer.parseInt(m.substring(i + 1));

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 0 && day <= 31)
				return true;
			else
				return false;
		}

		else if (month == 2) {
			if (day > 0 && day <= 28)
				return true;
			else
				return false;
		}

		else {
			if (day > 0 && day <= 30)
				return true;
			else
				return false;
		}
	}
}



