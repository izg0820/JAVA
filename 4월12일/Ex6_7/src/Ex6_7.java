
public class Ex6_7 {

	private String description;
	private int rating;
	public double m;

	public Ex6_7(String character ) {
		description=character;
		rating=0;
	}
	public boolean isValid(int rate){
		if(rate>=1&&rate<=10){
			return true;
		}
		else 
			return false;
	}
	public void setRating(int rate){
		if(isValid(rate)==true)
			this.rating=rate;
		else 
			System.exit(0);
	}
	public double getCompatability(String character,int otherRating){
		if(this.isMatch(character, otherRating)==true){
			this.getCompatibilityMeasure(character, otherRating);
			return m;
		}
		else 
			return 0;
	}
	private double getCompatibilityMeasure(String character,int otherRating){
		m=1-(Math.pow(this.rating-otherRating,2)/81);
		if(this.rating!=0)
			return m;
		else {
			System.out.println("Rating hasn't been determined yet");
			return 0;
		}
	}
	private boolean isMatch(String character,int otherRating){
		if(this.description.equals(character)==true)
			return true;
		else 
			return false;
	}

}

