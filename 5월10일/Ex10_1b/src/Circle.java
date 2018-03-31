
public class Circle implements Shape{

private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius, radius);
	}
	
	public String toString(){
		return "Radius: "+ this.radius+"Area: "+this.getArea();
	}
	
	public boolean equlas(Circle other){
		if(this.getArea()==other.getArea())
			return true;
		else
			return false;
	}
}
