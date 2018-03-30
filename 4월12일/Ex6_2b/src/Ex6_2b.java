import java.util.Scanner;
public class Ex6_2b {
	private int hour;
	private int min;


	Scanner keyboard = new Scanner(System.in);

	public Ex6_2b(){
		hour=0;
		min=0;
	}
	public Ex6_2b(int h,int m){
		this.setTime(h,m);	
	}
	public Ex6_2b(int h,int m, String isPM){
		this.setTime2(h, m,isPM);
	}

	public void setTime(int h,int m){

		if(h<0){
			System.out.println("Error!!");
			System.exit(0);
		}
		else
			this.hour = h;
		if(m<0){
			System.out.println("Error!!");
			System.exit(0);
		}
		else
			this.min=m;
	}
	public void setTime2(int h,int m,String isPM){
		if(h<0){
			System.out.println("Error!!");
			System.exit(0);
		}
		else
			this.hour = h;
		if(m<0){
			System.out.println("Error!!");
			System.exit(0);
		}
		else
			this.min=m;
	}
	public String getTime24(){
		return String.format("%d%d",this.hour,this.min);
	}
	public String getTime12(){
		if(this.hour>12){
			return String.format("%d:%d PM", this.hour-12,this.min);
		}
		else
			return String.format("%d:%d AM", this.hour,this.min);
			
	}


}
