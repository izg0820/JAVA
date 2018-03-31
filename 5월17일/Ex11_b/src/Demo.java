
public class Demo {

	public static void main(String[] args) throws InvalidTimeException{
		String str1 = "3:00PM";
		String str2 = "17:32PM";
		String str3 = "11:65PM";


		try{
			if(InvalidHourException.checkHour(str2)==true)
				System.out.println(str2);
			else
				throw new InvalidHourException();
			
			if(InvalidMinuteException.checkMinute(str3)==true)
				System.out.println(str3);
			else 
				throw new InvalidMinuteException();
			
			if(InvalidTimeException.checkTime(str1)==true)
				System.out.println(str1);
			else 
				throw new InvalidTimeException();
		}
		catch(InvalidHourException e){
			System.out.println(e.getMessage());
		}
		catch(InvalidMinuteException e){
			System.out.println(e.getMessage());
		}
		catch(InvalidTimeException e){
			System.out.println(e.getMessage());
		}
	}

}
