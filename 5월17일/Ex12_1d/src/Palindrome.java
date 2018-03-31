
public class Palindrome {
	public static boolean checkPalindrome(String s) {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				temp += s.charAt(i);
		}

		temp = temp.toUpperCase();

		if (temp.charAt(0) == temp.charAt(temp.length() - 1) && temp.length() > 2)
			return checkPalindrome(temp.substring(1, temp.length() - 1));
		else if (temp.charAt(0) != temp.charAt(temp.length() - 1))
			return false;
		else if (temp.charAt(0) == temp.charAt(temp.length() - 1) && temp.length() == 2)
			return true;
		else if (temp.length() == 1)
			return true;
		else
			return false;
	}

}
