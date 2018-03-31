
public class RightTriangle extends Shape{
	private double width,height;
	
	public RightTriangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	public double getArea(){
		return width*height/2;
	}
	
	public String toString(){
		return "Width: "+this.width+ "Height: "+this.height+ "Area: "+this.getArea();
	}
	
	public boolean equlas(RightTriangle other){
		if(this.getArea()==other.getArea())
			return true;
		else
			return false;
	}

}
