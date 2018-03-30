import java.util.Scanner;

public class Ex5_12 {

	private String name;
	private String MPAA;
	private int rate;
	private int sum=0;

	Scanner keyboard = new Scanner(System.in);

	public void setName(String name) {
		this.name= name;
	}
	public void setMPAA(String MPAA) {
		this.MPAA= MPAA;
	}
	public void setRate(int rate) {
		if(rate<1) {
			System.out.println("Rate is non-negative!!");
			System.exit(0);
		}
		if(rate>6){
			System.out.println("Maximum rate is 5!!");
			System.exit(0);
		}
		this.rate= rate;
	}
	public void readInput(){
		System.out.print("Insert the movie name: ");
		name = keyboard.nextLine();
		this.setName(name);
		System.out.print("Insert the MPAA: ");
		MPAA = keyboard.nextLine();
		this.setMPAA(MPAA);
		for(int i=0;i<5;i++) {
			System.out.print("How many points would you rate this movie: ");
			rate = keyboard.nextInt();
			this.setRate(rate);
			this.addRating(rate);
		}
	}
	public void addRating(int rate) {
		sum+=rate;
	}
	public double getAverage(){
		return sum/(double)5;
	}
	public boolean doequal(Ex5_12 demo){
		return (this.name.equals(demo.name))&&(this.MPAA.equals(demo.MPAA))&&(this.getAverage()==demo.getAverage());
	}
	public void printOut() {
		System.out.println("Movie name is " + this.name);
		System.out.println("Movie MPAA is " + this.MPAA);
		System.out.println("Movie rate average is "+ this.getAverage());
		System.out.println("");
	}

}
