import java.util.Scanner;
public class Ex6_1a {
	private int hour;
	private int minute;
	private boolean isPM;

	Scanner keyboard =new Scanner(System.in);

	public Ex6_1a() {
		hour=0;
		minute=0;
	}

	public static boolean isVaild(int hour,int min){

		if((hour>=0&&hour<24)&&(min>=0&&min<60)) {
			return true;
		}
		else 
			return false;
	}
	public void setTime(int hour,int min){
		if(Ex6_1a.isVaild(hour, min)==true){
			this.hour=hour;
			this.minute=min;
		}
		else {
			System.out.println("Wrong valuable!");
			System.exit(0);
		}
	}
	public void setTime2(int hour,int min,boolean isPM){
		if(isPM==true){
			this.setTime(hour+12, min);
		}
		else
			this.setTime(hour, min);

	}
	public void readInput() {
		int a,b;
		boolean c;
		System.out.print("Insert the hour: "); 
		a=keyboard.nextInt();
		System.out.print("Insert the minute: ");
		b=keyboard.nextInt();
		System.out.print("IF hour is PM, input true and If hour is AM, input false: ");
		c=keyboard.nextBoolean();
		this.setTime2(a, b,c);		
	}
	public void readOutput() {
		System.out.println(this.hour+"h "+this.minute+"m");
	}
}
