
public class Demo {

	public static void main(String[] args) {
		
		Shape[] test = new Shape[]
				{new Circle(3.2),new Circle(3.2),
						new RightTriangle(3.4,4.1),new RightTriangle(5.1,5.3),
						new Rectangle(5.7,2.1),new Rectangle(2.1,5.7)} ;
		System.out.println(test[0].toString());
		System.out.println(test[1].toString());
		System.out.println(test[0].equals(test[1]));
		System.out.println(test[2].toString());
		System.out.println(test[3].toString());
		System.out.println(test[2].equals(test[3]));
		System.out.println(test[4].toString());
		System.out.println(test[5].toString());
		System.out.println(test[4].equals(test[5]));

	}

}
