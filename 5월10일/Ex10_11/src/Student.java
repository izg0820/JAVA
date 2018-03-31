
public class Student extends Person implements Comparable{

	private String name;
	private int studentNumber;
	private int quantity;

	public Student () 
	{ 
		super (); 
		studentNumber = 0; 
	} 

	public Student (String initialName, int initialStudentNumber,int quantity) 
	{ 
		super (initialName); 
		studentNumber = initialStudentNumber; 
		this.quantity=quantity;
	} 

	public void reset (String newName, int newStudentNumber) 
	{ 
		setName (newName); 
		studentNumber = newStudentNumber; 
	} 

	public int getStudentNumber () 
	{ 
		return studentNumber; 
	} 

	public void setStudentNumber (int newStudentNumber) 
	{ 
		studentNumber = newStudentNumber; 
	} 

	public void writeOutput () 
	{ 
		super.writeOutput();
		System.out.println ("Student Number: " + studentNumber); 
	} 
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int  compareTo(Student object) {
		int compareQuantity = ((Student) object).getQuantity();

		return this.quantity-compareQuantity;

	}

	public static Comparable NAME= new Comparable(){
		public int compare(Student s1,Student s2){
			String studentName1 = s1.getName().toUpperCase();
			String studentName2 = s2.getName().toUpperCase();

			return studentName1.compareTo(studentName2);
		}

		@Override
		public int compareTo(Student object) {
			// TODO Auto-generated method stub
			return 0;
		}


	};
}
