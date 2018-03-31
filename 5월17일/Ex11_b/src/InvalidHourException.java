
public class InvalidHourException extends InvalidTimeException{

	public InvalidHourException() {
		super("Invalid hour!!");
	}

	public InvalidHourException(String message) {
		super(message);
	}
	
	public static boolean checkHour(String h){
		String hour = h.substring(0,2);
		if(Integer.parseInt(hour)<0 && Integer.parseInt(hour)>12)
			return true;
		else
			return false;
	}
}
