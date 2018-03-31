
public class Employee extends Person{
	private int ID;
	private String department;
	private int salary;
	private String SSN;

	public Employee() {
		super();
		ID = 0;
		salary = 0;
		department = "no department yet";
		SSN = "no SSN yet";
	}

	public Employee(String initialName, int initialID, int initialsalary, String initialDepartment, String initialSSN) {
		super(initialName);
		ID = initialID;
		salary = initialsalary;
		department = initialDepartment;
		SSN = initialSSN;
	}

	public int getID() {
		return ID;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public String getSSN() {
		return SSN;
	}

	public void setID(int newID) {
		ID = newID;
	}

	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}

	public void setSalary(int newSalary) {
		salary = newSalary;
	}

	public void setSSN(String newSSN) {
		SSN = newSSN;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("ID : " + ID);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
		System.out.println("Social Security Number : " + SSN);
	}

	public boolean equals(Employee otherEmployee) {
		return this.hasSameName(otherEmployee) && (this.ID == otherEmployee.ID)
				&& (this.department.equals(otherEmployee.department) && (this.salary == otherEmployee.salary)
						&& (this.SSN.equals(otherEmployee.SSN)));
	}

}
