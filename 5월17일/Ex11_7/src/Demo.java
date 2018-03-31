import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String SSN = "";
		System.out.println("how many the number of employees?");
		Employee[] employee = new Employee[keyboard.nextInt()];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			System.out.println("employee " + (i + 1) + "'s name : ");
			keyboard.nextLine();
			employee[i].setName(keyboard.nextLine());
			System.out.println("employee " + (i + 1) + "'s ID : ");
			employee[i].setID(keyboard.nextInt());
			System.out.println("employee " + (i + 1) + "'s salary : ");
			employee[i].setSalary(keyboard.nextInt());
			System.out.println("employee " + (i + 1) + "'s department : ");
			keyboard.nextLine();
			employee[i].setDepartment(keyboard.nextLine());
			while (employee[i].getSSN() == "no SSN yet") {
				try {
					System.out.println("don't input dash(-)");
					System.out.println("employee " + (i + 1) + "'s Sosical Securiy Number : ");
					SSN = keyboard.next();					
					if (SSNLengthException.checkLength(SSN) == false) {
						System.out.print("Input error message : ");
						keyboard.nextLine();
						throw new SSNLengthException(keyboard.nextLine());
					}

					else {
						if (SSNCharacterException.checkCharacter(SSN) == false) {
							System.out.println("Input error message : ");
							throw new SSNCharacterException(keyboard.nextLine());
						} else
							employee[i].setSSN(SSN);
					}
				} catch (SSNLengthException e) {
					System.out.println(e.getMessage());
					System.out.println();
				} catch (SSNCharacterException e) {
					System.out.println(e.getMessage());
					System.out.println();
				}
			}
		}

		for (int i = 0; i < employee.length; i++) {
			System.out.println();
			System.out.println("employee " + (i + 1) + "");
			employee[i].writeOutput();
			System.out.println();
		}
	}

}


