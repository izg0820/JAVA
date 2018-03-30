package myPackage;

public class MotorBoat {
	public double C;
	public double f;
	public double M;
	public double s;
	public double e;

	public void writeOutPut(int t) {
		System.out.println("Travel distance: "+ distance1(t));
		System.out.println("Amount of fuel used(max): "+ max(t));
		System.out.println("Amount of fule used(curret): "+ current(t));
		System.out.println("Travel distance: "+ distance2());
	}
	
	public double max(int t){
		double fused1;
		fused1 = e*M*M*t;		
		return fused1;
	}
	
	public double current(int t){
		double fused2;
		fused2 = e*s*s*t;
		return fused2;
	}
	
	public double distance1(int t){
		double dis1=0;
		dis1 = s*t;
		return dis1;
	}
	
	public double distance2(){
		double dis2=0;
		dis2 = f/(s*e);
		return dis2;

	}
}

