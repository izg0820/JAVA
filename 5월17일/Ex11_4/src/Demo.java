import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String Date = "";
		Month test = new Month();
		System.out.println("Input the month and day");
		test.setMonthDay(keyboard.nextLine());

		try {
			Date = test.getMonthDay();
			if (MonthException.checkMonth(Date) == true) {
				if (DayException.checkDay(Date) == true)
					System.out.println(test.convert() + " " + test.getDay());

				else
					throw new DayException();
			}

			else
				throw new MonthException();

		} catch (MonthException e) {
			System.out.println(e.getMessage());
		}

		catch (DayException e) {
			System.out.println(e.getMessage());
		}
	}

}


