
public class HazardPay extends PayCalculator{
	
	public HazardPay(){
		super();
	}
	
	public double computePay(double hours){
		return 1.5*super.computePay(hours);
	}
	

}
