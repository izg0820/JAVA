
public class Demo {

	public static void main(String[] args) {
		Person[] people = new Person[4]; 
		Employ[] em= new Employ[4];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1); 
		people[1] = new Undergraduate("Kick, Anita", 9931, 2); 
		people[2] = new Student("DeBanque, Robin", 8812); 
		people[3] = new Undergraduate("Bugg, June", 9901, 4); 
		em[0] = new Staff(15,1,"FBI");
		em[1] = new Faculty("Professor of Computer Science",5,"SEC");
		em[2] = new Staff(12,2,"CIS");
		em[3] = new Faculty("Professor of Biology Science",3,"ESC");
		for(int i=0;i<4;i++){
			people[i].writeOutput();
			em[i].writeOutput();
			System.out.println();
		}
	}
}


