
public class Ex4_6Demo {

	public static void main(String[] args) {

		Ex4_6 orangePrice = new Ex4_6();
		Ex4_6 eggsPrice = new Ex4_6();
		Ex4_6 applePrice = new Ex4_6();
		Ex4_6 watermelonPrice = new Ex4_6();
		Ex4_6 baglePrice = new Ex4_6();

		orangePrice.setName("Oranges");
		orangePrice .setPrice(10, 2.99);
		orangePrice .setNumberBought(24);

		eggsPrice.setName("Eggs");
		eggsPrice.setPrice(12, 1.69);
		eggsPrice.setNumberBought(36);

		applePrice.setName("Apples");
		applePrice.setPrice(3, 1.00);
		applePrice.setNumberBought(20);

		watermelonPrice.setName("Watermelons");
		watermelonPrice.setPrice(1, 4.39);
		watermelonPrice.setNumberBought(2);

		baglePrice.setName("Bagels");
		baglePrice.setPrice(6, 3.5);
		baglePrice.setNumberBought(12);

		System.out.print("Orange price is " ); orangePrice.writeOutput();
		System.out.print("Egg price is " ); eggsPrice.writeOutput();
		System.out.print("Apple price is " ); applePrice.writeOutput();
		System.out.print("Watermelon price is " ); watermelonPrice.writeOutput();
		System.out.print("Bagle price is " ); baglePrice.writeOutput();

		System.out.println("Total Price is " + (orangePrice.getTotalCost()+eggsPrice.getTotalCost()+
				applePrice.getTotalCost()+watermelonPrice.getTotalCost()+baglePrice.getTotalCost())); 


	}

}
