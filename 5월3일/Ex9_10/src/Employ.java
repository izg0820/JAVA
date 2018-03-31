
public class Employ {
	private int employeeID;
	private String employeedepartment;
	public Employ(String department,int id){
		this.employeeID=id;
		this.employeedepartment=department;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeedepartment() {
		return employeedepartment;
	}
	public void setEmployeedepartment(String employeedeparyment) {
		this.employeedepartment = employeedeparyment;
	}
	public void writeOutput(){
		System.out.println("employee ID: "+ employeeID);
		System.out.println("employee department: "+ employeedepartment);
	}

}
