
public class Change {
	public static void displayAsWords(int n) {
		String num = Integer.toString(n);
		int length = num.length();

		if (n >= 10) {

			for (int i = 0; i < num.length(); i++) {
				System.out.print(getWordFromDigit((int) (n / Math.pow(10, length - 1))) + " ");
				n -= ((int) (n / Math.pow(10, length - 1))) * Math.pow(10, length - 1);
				length--;
			}
		}

		else
			System.out.println(getWordFromDigit(n));
	}

	public static String getWordFromDigit(int digit) {
		String[] word = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		return word[digit];
	}
}
