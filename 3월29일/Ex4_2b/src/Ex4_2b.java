
public class Ex4_2b {
	private int count=0;

	public void setCount(int num) {
		if(num==1)
			count++;
		else if(num==2){
			if(count<=0){
				System.out.println("Error!!");
				System.exit(0);
			}
			else
				count--;
		}
		else if(num==3)
			count=0;
		else if(num==4)
			System.out.println(count);
		else if(num==5)
			System.exit(0);
	}

	public int getIncrease() {
		return count;
	}
	public int getDecrease() {
		return count;
	}
	public int getCount() {
		return count;
	}
	public int getPrint() {
		return count;
	}

}
