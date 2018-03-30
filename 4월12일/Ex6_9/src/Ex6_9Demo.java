import java.util.Scanner;
public class Ex6_9Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Insert name: ");
		name = keyboard.nextLine();
		System.out.print("Insert age: ");
		age = keyboard.nextInt();
		Ex6_9 test = new Ex6_9();
		Ex6_9 test2 = new Ex6_9(name,age);
		System.out.println();
		test2.setAge(age);
		test2.setName(name);
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(Ex6_9.createAdolescent().getName());
		System.out.println(Ex6_9.createAdolescent().getAge());
		System.out.println(Ex6_9.createAdult().getName());
		System.out.println(Ex6_9.createAdult().getAge());
		System.out.println(Ex6_9.createPreschooler().getName());
		System.out.println(Ex6_9.createPreschooler().getAge());
		System.out.println(Ex6_9.createTeenager().getName());
		System.out.println(Ex6_9.createTeenager().getAge());
		System.out.println(Ex6_9.createToddler().getName());
		System.out.println(Ex6_9.createToddler().getAge());
				
	}

}
