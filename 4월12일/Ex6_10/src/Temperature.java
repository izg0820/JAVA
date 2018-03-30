
public class Temperature {
	private float degree;
	private String scale;

	public Temperature(){
		degree=0;
		scale ="C";
	}
	public Temperature(float degree){
		this();
		this.degree= degree;
	}
	public Temperature(String scale){
		this();
		this.scale = scale;
	}
	public Temperature(float degree,String scale){
		this.degree=degree;
		this.scale=scale;
	}

	public void setDegree(float degree){
		this.degree=degree;
	}
	public void setScale(String scale){
		this.scale= scale;
	}
	public void setDeSca(float degree,String scale){
		this.degree=degree;
		this.scale=scale;
	}
	public float getDegreeC(){
		return Math.round(5*(degree-32)/9);
	}
	public float getDegreeF(){
		return Math.round((9*degree/5)+32); 
	}
	public boolean comparion1(Temperature test){
		if(this.getDegreeC()==test.getDegreeF())
			return true;
		else 
			return false;
	}
	public float comparion2(Temperature test){
		if(this.getDegreeC()>test.getDegreeF())
			return this.getDegreeC();
		else 
			return test.getDegreeF();
	
		
	}
	public float comparion3(Temperature test){
		if(this.getDegreeC()<test.getDegreeF()){
			return this.getDegreeC();
		}
		else {
			return test.getDegreeF();
		}
	
	}
	public void print(){
		System.out.println(this.degree+" "+this.scale);
	}
}
