import java.util.Scanner;

public class Ex4_9Demo {

	public static void main(String[] args) {
		String team1,team2;
		int score,choice;
		char choiceTeam;

		Scanner keyboard = new Scanner(System.in);
		Ex4_9 test= new Ex4_9();
		System.out.print("Insert the team1 name ");
		team1 = keyboard.nextLine();
		test.setTeam1(team1);
		System.out.print("Insert the team2 name ");
		team2 = keyboard.nextLine();
		test.setTeam2(team2);
		while(true){
			System.out.print("1.Countinue 2.Finish ");
			choice=keyboard.nextInt();
			if(choice==1){
				System.out.print("What team get point?"+"("+ test.getTeam1()+" = a) ("+test.getTeam2()+" = b) ");
				choiceTeam = keyboard.next().charAt(0);
				System.out.print("How many point did get? ");
				score=keyboard.nextInt();
				if(choiceTeam=='a'){
					test.setScore(score);
					test.getaScore();
				}
				else{
					test.setScore(score);
					test.getbScore();
				}
				test.compare();
			}
			else
				break;
		}
	}
}
