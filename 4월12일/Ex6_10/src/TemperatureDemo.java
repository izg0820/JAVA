import java.util.Scanner;
public class TemperatureDemo {

	public static void main(String[] args) {
		float celsius = 0,fahrenheit;
		String scale = null,garbage;
		int count=0;


		Scanner keyboard = new Scanner(System.in);
		Temperature test1 = new Temperature();
		Temperature test2 = new Temperature(celsius);
		Temperature test3 = new Temperature(scale); 
		Temperature test4 = new Temperature(celsius,scale);

		System.out.print("test1  ");test1.print();
		System.out.print("test2  ");test2.print();
		System.out.print("test3  ");test3.print();
		System.out.print("test4  ");test4.print();
		System.out.println("-------------------------------");

		while(count!=3){
			for(int i=0;i<2;i++){
				System.out.print("CELSIUS: 'C' FAHRENHEIT: 'F'");
				scale=keyboard.nextLine();
				
				if(scale.equals("C")){
					System.out.print("insert degree ");
					
					celsius=keyboard.nextFloat();
					test1.setDeSca(celsius, scale);
				}
				
				else {
					System.out.print("Insert degree ");

					fahrenheit= keyboard.nextFloat();
					test2.setDeSca(fahrenheit, scale);
			
				}
				garbage=keyboard.nextLine();

			}
			System.out.println("IS two temperature equal? "+test1.comparion1(test2));
			System.out.println("Higher temperature is "+ test1.comparion2(test2));
			System.out.println("Lower temperature is "+ test1.comparion3(test2));
			count++;

		}
	}
}

