
public class InvalidMinuteException extends InvalidTimeException{
	
	public InvalidMinuteException() {
		super("Invalid minute!!");
	}

	public InvalidMinuteException(String message) {
		super(message);
	}
	
	public static boolean checkMinute(String m){
		String minute = m.substring(3,5);
		if(Integer.parseInt(minute)<0 && Integer.parseInt(minute)>60)
			return true;
		else
			return false;
	}

}
