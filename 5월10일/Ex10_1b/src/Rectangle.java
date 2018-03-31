
public class Rectangle implements Shape {
	private double width, height;
	
	public Rectangle(double width,double height){
		this.width= width;
		this.height=height;
	}
	public double getArea(){
		return width*height;
	}
	
	public String toString(){
		return "Width: "+this.width+ "Height: "+this.height+ "Area: "+this.getArea();
	}
	public boolean equals(Rectangle other){
		if((this.height==other.height)&&(this.width==other.width))
			return true;
		else
			return false;
	}

}
