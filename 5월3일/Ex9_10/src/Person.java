
public class Person {
	private String name; 
	public Person()   
	{       
		name = "No name yet";   
	}
	public Person(String initialName) 
	{       
		name = initialName; 
	} 
	public void setName(String newName)
	{       
		name = newName; 
	} 
	public String getName()    
	{ 
		return name;    
	} 
	public void writeOutput()    
	{      
		System.out.println("Name: " + name);   
	} 
	public boolean hasSameName(Person other)   
	{ 
		return this.name.equalsIgnoreCase(other.name); 
	} 

}
