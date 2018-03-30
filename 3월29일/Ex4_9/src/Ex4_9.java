
public class Ex4_9 {
	private char team;
	private String setTeam1;
	private String setTeam2;
	private int addScore;
	private int currentaScore=0;
	private int currentbScore=0;

	public void setScore(int new_score) {
		if(new_score<0) {
			System.out.println("Entered score is negative!!");
			System.exit(0);
		}
		else if(new_score>3){
			System.out.println("Entered score is bigger than Maximun point(3)");
			System.exit(0);
		}
		else
			this.addScore=new_score;
	}

	public void setTeam1(String new_team1){
		this.setTeam1= new_team1;
	}

	public void setTeam2(String new_team2){
		this.setTeam2= new_team2;
	}

	public void setTeam(char new_team) {
		if((new_team=='a')||(new_team=='b')){
			this.team=new_team;			
		}
		else
			System.out.println("Team name is wrong!!");
	}

	public int getaScore() {
		return this.currentaScore+=this.addScore;
	}

	public int getbScore() { 
		return this.currentbScore+=this.addScore;
	}
	public String getTeam1() {
		return this.setTeam1;
	}
	public String getTeam2() {
		return this.setTeam2;
	}

	public void compare(){
		if(this.currentaScore>this.currentbScore) {
			System.out.print(this.setTeam1+" "+this.currentaScore+", "+this.setTeam2+ " "+this.currentbScore+";  ");
			System.out.println(this.setTeam1 + " are winning.\n");
		}
		else if(this.currentaScore<this.currentbScore) {
			System.out.print(this.setTeam1+" "+this.currentaScore+", "+this.setTeam2+ " "+this.currentbScore+";  ");
			System.out.println(this.setTeam2 + " are winning.\n");
		}
		else{ 
			System.out.print(this.setTeam1+" "+this.currentaScore+", "+this.setTeam2+ " "+this.currentbScore+";  ");
			System.out.println("Draw.\n");	
		}
	}
}

