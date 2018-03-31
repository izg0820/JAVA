import java.util.Scanner;
public class Staff extends Employ{
	private  int paygrade;
	Scanner keyboard = new Scanner(System.in);
	public Staff(int paygrade,int depart,String id){
		
		super(id,depart);
		this.paygrade=paygrade;
	}
	public int getPaygrade() {
		return paygrade;
	}

	public void setPaygrade(int paygrade) {
		if(paygrade<=20 &&paygrade>=1)
			this.paygrade = paygrade;
		else{			
			
			int number=keyboard.nextInt();
			setPaygrade(number);
			}
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("paygrade: "+ paygrade);
	}
	

}
