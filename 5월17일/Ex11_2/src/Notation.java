
public class Notation {
	private  String time;

	public void setTime(String t){
		this.time=t;
	}

	public String getTime(){
		return this.time;
	}

	public  String change(String t){

		int hour=Integer.parseInt(t.substring(0,2));
		int minute = Integer.parseInt(t.substring(3, 5));
		if(hour>12 && hour <=24){
			hour=hour-12;
			return this.time = Integer.toString(hour)+":"+Integer.toString(minute)+" PM";
		}
		else
			return this.time = Integer.toString(hour)+":"+Integer.toString(minute)+" AM";
		
		 
	}
	
}
