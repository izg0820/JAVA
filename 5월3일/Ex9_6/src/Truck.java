
public class Truck extends Vehicle{
	
	private double loadCapacity;
	private double towingCapacity;
	
	public Truck(){
		super();
		loadCapacity=0;
		towingCapacity=0;
	}
	public Truck(double loadCapacity,double towingCapacity)
	{
		super();
		if(loadCapacity>0)
			this.loadCapacity=loadCapacity;
		else{
			System.exit(0);
		}
		if(towingCapacity>0)
			this.towingCapacity=towingCapacity;
		else
		{
			System.exit(0);
		}
	}
	public Truck(String name,String manufacturerName,int cylinder,double loadCapacity,double towingCapacity)
	{
		super(name,manufacturerName,cylinder);
		if(loadCapacity>0)
			this.loadCapacity=loadCapacity;
		else{
			System.exit(0);
		}
		if(towingCapacity>0)
			this.towingCapacity=towingCapacity;
		else
		{
			System.exit(0);
		}
	}
	public double getLoadCapacity()
	{
		return loadCapacity;
	}
	public double getTowingCapacity()
	{
		return towingCapacity;
	}
	public boolean equalsTruck(Truck otherTruck)
	{
		return (this.equals(otherTruck)&&this.loadCapacity==otherTruck.loadCapacity&&this.towingCapacity==otherTruck.towingCapacity);
	}
	public String toString()
	{
		return "name: "+owner.getName()+" manufacturer name: "+getManufacturName()+" The number of cylinder"+getCylinder()+" load capacity: "+getLoadCapacity()+" towing capacity: "+getTowingCapacity();	
		}
	

}
