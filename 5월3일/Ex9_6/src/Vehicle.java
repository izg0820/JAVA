
public class Vehicle {
	
	private int cylinder;
	private String name;
	Person owner;
	
	public Vehicle()
	{
		owner = new Person();
		name="No name yet";
		cylinder= 0;
	}
	public Vehicle(String name,String manufacturName,int cylinder)
	{
		owner =new Person(name);
		this.name=manufacturName;
		this.cylinder=cylinder;
	}
	public boolean equalsVehicle(Vehicle other)
	{
		return this.name.equals(other.name)&&this.cylinder==other.cylinder&&this.owner.hasSameName(other.owner);
	}
	public String getManufacturName()
	{
		return name;
	}
	public int getCylinder()
	{
		return cylinder;
	}
	public String toString()
	{
		return "name: "+owner.getName()+" manufacturer name: "+getManufacturName()+" The number of cylinder: "+getCylinder();
	}
}

