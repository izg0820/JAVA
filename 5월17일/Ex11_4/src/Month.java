
public class Month {

	private String date = "";
	private int month = 0;
	private int day = 0;

	public void setMonthDay(String d) {
		this.date= d;
		int i = 0;
		for (i = 0; i < date.length(); i++) {
			if (!((date.charAt(i)) >= '0' && (date.charAt(i)) <= '9'))
				break;
		}

		this.month = Integer.parseInt(date.substring(0, i));
		this.day = Integer.parseInt(date.substring(i+1));
	}

	public String getMonthDay() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String convert() {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "";
	}
}
