
public class Ex5_1Demo {

	public static void main(String[] args) {
		Ex5_1 test1  = new Ex5_1();
		Ex5_1 test2 = new Ex5_1();
		test1.readInput();
		test2.readInput();
		
		if(test1.equals(test2))
		{
			System.out.println("TRUE");
		}
		else 
		{
			System.out.println("FALSE");
		}
	}
}
