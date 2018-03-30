
public class Ex4_5 {
	private int aStudent;
	private int bStudent;
	private int cStudent;
	private int dStudent;
	private int fStudent;
	public int total;

	public void setGrade(int a,int b,int c,int d, int f){

		if(a<0){
			System.out.println("The number of 'A' grade student is error!!");
			System.exit(0);
		}
		else
			aStudent=a;
		if(b<0){
			System.out.println("The number of 'B' grade student is error!!");
			System.exit(0);
		}
		else
			bStudent = b;

		if(c<0){
			System.out.println("The number of 'C' grade student is error!!");
			System.exit(0);
		}
		else
			cStudent = c;
		if(d<0){
			System.out.println("The number of 'D' grade student is error!!");
			System.exit(0);
		}
		else 
			dStudent =d;
		if(f<0){
			System.out.println("The number of 'F' grade student is error!!");
			System.exit(0);
		}
		else
			fStudent=f;
	}
	
	public int totalnum()
	{
		total= aStudent+bStudent+cStudent+dStudent+fStudent;
		return total;
	}

	public int getaCount(){
		return aStudent*100/this.totalnum();
		}
	public int getbCount(){
		return bStudent*100/this.totalnum();
	}
	public int getcCount(){
		return cStudent*100/this.totalnum();
	}
	public int getdCount(){
		return dStudent*100/this.totalnum();
	}
	public int getfCount(){
		return fStudent*100/this.totalnum();
	}

	public void graph()
	{
		System.out.println("0    10   20   30   40   50   60  70   80   90  100%");
		System.out.println("|    |    |    |    |    |    |   |    |    |    |");
		System.out.println("**************************************************");
		for(int i=0;i<getaCount()/2+getaCount()%2;i++)
		{
			System.out.print("*");
		}
		System.out.println(" A");
		for(int i=0;i<getbCount()/2+getbCount()%2;i++)
		{
			System.out.print("*");
		}
		System.out.println(" B");
		for(int i=0;i<getcCount()/2+getcCount()%2;i++)
		{
			System.out.print("*");
		}
		System.out.println(" C");
		for(int i=0;i<getdCount()/2+getdCount()%2;i++)
		{
			System.out.print("*");
		}
		System.out.println(" D");
		for(int i=0;i<getfCount()/2+getfCount()%2;i++)
		{
			System.out.print("*");
		}
		System.out.println(" F");
	}	
}
