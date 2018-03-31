
public class Dog extends Pet{

	private String breed;
	private boolean boosterShot;

	
	public Dog()
	{
		super();
		breed="no breed yet";
		boosterShot=false;
	}
	public Dog(String initialName,int initialAge,double initialWeight,String initialBreed,boolean boosterShot)
	{
		super(initialName,initialAge,initialWeight);
		this.breed=initialBreed;
		this.boosterShot=boosterShot;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setBoostshot(boolean boostshot) {
		this.boosterShot = boostshot;
	}
	public String getBreed()
	{
		return breed;
	}
	public boolean getBoosterShot()
	{
		return boosterShot;
	}
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("breed: "+breed);
		if(boosterShot)
			System.out.println("already had booster shoot");
		else
			System.out.println("not boostershot yet");
	}
}

