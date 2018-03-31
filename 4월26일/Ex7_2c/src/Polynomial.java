
public class Polynomial {

	private int degree;
	private int[] coefficients ;



	Polynomial(int n){
		this.degree = n+1;
		coefficients=new int[degree];
		for(int i=0;i<degree;i++){
			coefficients[i]=0;
		}
	}
	public void setConstant(int i,int value){

		coefficients[i]=value;

	}
	public int evaluate(int x){
		int result=0;
		for(int i=0;i<this.degree;i++){
			result += coefficients[i]* Math.pow(x,i); 
		}
		return result;
	}


}
