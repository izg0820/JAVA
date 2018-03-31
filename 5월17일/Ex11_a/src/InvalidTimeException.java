
public class InvalidTimeException extends Exception{

	public InvalidTimeException(){
		super("Invalid Data!!");

	}
	public InvalidTimeException(String message){
		super(message);
	}

	public static boolean checkTime(String t)
	{

		String hour=t.substring(0, 2);
		String minute=t.substring(3, 5);
		String isPM=t.substring(5, 7);
		if( (Integer.parseInt(hour)>0 && Integer.parseInt(hour)<12 ) && 
				(Integer.parseInt(minute)>0 && Integer.parseInt(minute)<60 )&&
				(isPM.equals("PM")==true || isPM.equals("AM")==true)){
				return true;
		}
		else 
			return false;

	}

}
