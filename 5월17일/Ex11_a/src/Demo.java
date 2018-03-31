
public class Demo {

	public static void main(String[] args) throws InvalidTimeException {

		String str1= "11:25PM";
		String str2 ="14:88AM";


		try{
			if(InvalidTimeException.checkTime(str1)==true)
				System.out.println(str1);
			else
				throw new InvalidTimeException();
			
			if(InvalidTimeException.checkTime(str2)==true)
				System.out.println(str2);
			else
				throw new InvalidTimeException();
			}
		catch(InvalidTimeException e){
			System.out.println(e.getMessage());
			
		}


	}

}
