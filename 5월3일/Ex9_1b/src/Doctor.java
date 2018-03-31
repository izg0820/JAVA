
public class Doctor extends Person{
	
	
	private String specialty;
	private double visit_fee;
	
	public Doctor(){
		super();
		specialty="Not yet";
		visit_fee =0;
	}
	public Doctor(String initialName,String initialSpecialty, double fee)
	{
		super(initialName);
		specialty=initialSpecialty;
		visit_fee=fee;
	}
	public void setSpecialty(String initialSpecialty)
	{
		specialty = initialSpecialty;
	}
	public void setVisit_fee(double fee)
	{
		visit_fee =fee;
	}
	public String getSpecialty()
	{
		return specialty;
	}
	public double getVisit_fee()
	{
		return visit_fee;
	}
	public String toString(){
		return  "Name: "+ getName() + " Specialty: " + getSpecialty()+ " Visit fee "+ getVisit_fee();
		
	}
	public boolean same(Doctor a){
		return (super.hasSameName(a))&&(this.specialty.equals(a.specialty))&&(this.visit_fee==a.visit_fee);
	}
}
