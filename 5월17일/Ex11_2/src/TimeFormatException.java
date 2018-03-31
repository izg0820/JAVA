
public class TimeFormatException extends Exception{
	
	public TimeFormatException (){
		super("There is no such time as ");
	}
	public TimeFormatException(String message){
		super(message);
	}
	public static boolean checkTime(String t){
		for(int i=0;i<t.length();i++){
			if(!(t.charAt(i)>=48 && t.charAt(i)<=57))
				return false;
		}
		if(Integer.parseInt(t.substring(3, 5))<0 || Integer.parseInt(t.substring(3,5))>60)
			return false;
		else
			return true;
	}
	

}
