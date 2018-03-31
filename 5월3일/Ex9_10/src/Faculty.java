
public class Faculty extends Employ {

	private String facultytitle;
	public Faculty(String title,int id, String department) {
		super(department,id);
		this.facultytitle=title;
	}
	public String getFacultytitle() {
		return facultytitle;
	}
	public void setFacultytitle(String facultytitle) {
		this.facultytitle = facultytitle;
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("facultytitle is: "+ facultytitle);
	}
}
