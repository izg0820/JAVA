
public class Phone {
	public static int countDigits(String s) {
		
		if (Character.isDigit(s.charAt(0)) && s.length() > 1)
			return countDigits(s.substring(1)) + 1;
		else if ((!Character.isDigit(s.charAt(0))) && s.length() > 1)
			return countDigits(s.substring(1));
		else if (Character.isDigit(s.charAt(0)))
			return 1;
		else
			return 0;
	}
}
