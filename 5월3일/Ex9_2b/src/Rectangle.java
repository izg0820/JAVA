
public class Rectangle extends Shape{
	
	private double width, height;
	
	public Rectangle(double width,double height){
		this.height=height;
		this.width=width;
	}
	public double getArea(){
		return height*width;
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
