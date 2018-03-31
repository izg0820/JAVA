import java.util.Scanner;
public class DogDemo {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		Dog [] d=new Dog[5];
		for(int i=0;i<5;i++){
			d[i]=new Dog();
		}
		for(int i=0;i<2;i++){
			String name=keyboard.next();
			String breed=keyboard.next();
			int age=keyboard.nextInt();
			boolean t=keyboard.nextBoolean();
			double weight=keyboard.nextDouble();
			d[i].setName(name);
			d[i].setAge(age);
			d[i].setWeight(weight);
			d[i].setBreed(breed);
			d[i].setBoostshot(t);
		}
		for(int i=0;i<2;i++){
			d[i].writeOutput();
		}
		
	}

	}

