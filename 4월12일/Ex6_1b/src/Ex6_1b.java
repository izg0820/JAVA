
public class Ex6_1b {
	
	private int roomNumber;
	private int peopleinRoom;
	static int totalNumber=0;
	
	public Ex6_1b (int rN,int npR){
		this.roomNumber = rN;
		this.peopleinRoom=npR;
		Ex6_1b.totalNumber+=npR;
	}
	public void addOneToRoom(int rN,int npR ){
		if(this.roomNumber==rN){
			this.peopleinRoom+=npR;
			Ex6_1b.totalNumber+=npR;
			System.out.println(this.roomNumber + " " + this.peopleinRoom);
			System.out.println(Ex6_1b.totalNumber);
		}
	}
	public void removeOneFromRoom(int rN,int npR) {
		if(this.peopleinRoom>0){
			this.peopleinRoom-=npR;
			Ex6_1b.totalNumber-=npR;
			System.out.println(this.roomNumber + " " + this.peopleinRoom);
			System.out.println(Ex6_1b.totalNumber);
		}
	}
	public int getNumber() {
		return this.roomNumber;
	}
	public static int getTotal(){
		return Ex6_1b.totalNumber;
	}

}
