import java.util.ArrayList;
import java.util.Scanner;
public class PetArraylist {
	public static void sort(ArrayList<Pet> test)
	{
		Pet temp;
		for(int i = 0; i < test.size(); i++)
		{
			for(int j = 0; j < test.size(); j++)
			{
				if(i>=j)
					continue;
				if(test.get(i).getName().compareTo(test.get(j).getName()) > 0)
				{
					temp = test.get(i);
					test.set(i, test.get(j));
					test.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		ArrayList<Pet> test = new ArrayList<Pet>();
		char choice='y';
		String garbage;
		while(choice=='y'){
			System.out.println("Enter the name, age and  weight: ");
			String temp_name;
			temp_name = kb.nextLine();	
			int temp_age;
			temp_age = kb.nextInt();	
			double temp_weight;
			temp_weight = kb.nextDouble();
			Pet temp_obj = new Pet();
			temp_obj.setPet(temp_name, temp_age, temp_weight);
			test.add(temp_obj);
			System.out.println("Continue? (y/n) ");
			choice=kb.next().charAt(0);
			garbage = kb.nextLine();
		}

		System.out.println("--------Before sorting----------");
		for(int i=0; i<test.size();i++){
			test.get(i).writeOutput();
		}
		sort(test);
		System.out.println("--------After sorting----------");
		for(int i=0; i<test.size();i++){
			test.get(i).writeOutput();
		}
	}
}
