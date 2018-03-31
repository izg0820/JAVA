
public class VehicleDemo {

	public static void main(String[] args) {
		Truck test1 =new Truck("a","b",1,2,3);
		Truck test2 =new Truck("a","b",1,2,3);
		Truck test3 =new Truck("vv","d",22,3,54);

		System.out.println(test1.getLoadCapacity());
		System.out.println(test1.equalsTruck(test2));
		System.out.println(test1.equalsVehicle(test3));


	}

}


