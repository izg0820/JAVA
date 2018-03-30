
public class Ex6_9 {

	private String name;
	private int age;

	public Ex6_9(){
		name ="no name yet";
		age=0;
	}
	public Ex6_9(String name,int age){
		this.name= name;
		this.age= age;
	}
	public void setName(String first, String last){
		name =first+""+last;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			System.exit(0);
		}
		else
			this.age= age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public static Ex6_9 createAdult(){	
		return  new Ex6_9("Anadult",21);
	}
	public static Ex6_9 createToddler(){
		return new Ex6_9("A toddler",2);		
	}
	public static Ex6_9 createPreschooler(){
		return new Ex6_9("A preschooler",5);
	}
	public static Ex6_9 createAdolescent(){
		return new Ex6_9("An adolescent",9);
	}
	public static Ex6_9 createTeenager(){
		return new Ex6_9("A teenager",15);
	}
	
}
