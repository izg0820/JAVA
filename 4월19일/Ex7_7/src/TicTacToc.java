import java.util.Scanner;
public class TicTacToc {

	private String[][] tictactoc = new String[3][3];
	private String value,garbage;
	private int pointX;
	private int pointY;
	public int countO;
	public int countX;
	public int countD;

	Scanner keyboard = new Scanner(System.in);

	public void Initialize(){

		for(int i=0;i<3;i++){
			for(int k=0;k<3;k++){
				tictactoc[i][k]=" ";
			}
		}
	}

	public void Insertpoint(){

		do{
			System.out.println("It's O's turn");
			System.out.println("Insert the x point");
			pointX=keyboard.nextInt();
			System.out.println("Insert the y point");
			pointY=keyboard.nextInt();
			garbage=keyboard.nextLine();
			System.out.println("Insert the value");
			value = keyboard.nextLine();
			if(tictactoc[pointX][pointY]==" "){
				tictactoc[pointX][pointY]=value;
			}
			printOut();

			System.out.println("It's X's turn");
			System.out.println("Insert the x point");
			pointX=keyboard.nextInt();
			System.out.println("Insert the y point");
			pointY=keyboard.nextInt();
			garbage=keyboard.nextLine();
			System.out.println("Insert the value");
			value = keyboard.nextLine();
			if(tictactoc[pointX][pointY]==" "){
				tictactoc[pointX][pointY]=value;
			}
			printOut();
		}
		while(check(pointX,pointY,tictactoc)==true);
	}
	public boolean check(int pointX,int pointY, String[][] tictactoc){
		if(tictactoc[pointX][pointY].equals(" "))
			return false;
		else
			return true;
	}



	public boolean checkO(String[][] arr){
		countO = 0;
		for (int i = 0; i < 3; i++) {
			if (arr[0][i].equals("o"))
				countO++;
		}
		if (countO == 3)
			return true;
		countO = 0;

		for (int i = 0; i < 3; i++) {
			if (arr[2][i].equals("o"))
				countO++;
		}
		if (countO == 3)
			return true;
		countO = 0;

		for (int i = 0; i < 3; i++) {
			if (arr[i][0].equals("o"))
				countO++;
		}
		if (countO == 3)
			return true;
		countO = 0;

		for (int i = 0; i < 3; i++) {
			if (arr[i][2].equals("o"))
				countO++;
		}
		if (countO == 3)
			return true;
		countO = 0;

		if (arr[0][0].equals("o") && arr[1][1].equals("o") && arr[2][2].equals("o"))
			return true;
		if (arr[0][2].equals("o") && arr[1][1].equals("o") && arr[2][0].equals("o"))
			return true;

		else
			return false;
	}

	public boolean checkX(String[][] arr){
		countX = 0;
		for (int i = 0; i < 3; i++) {
			if (arr[0][i].equals("x"))
				countX++;
		}
		if (countX == 3)
			return true;
		countX= 0;

		for (int i = 0; i < 3; i++) {
			if (arr[2][i].equals("x"))
				countX++;
		}
		if (countX == 3)
			return true;
		countX = 0;

		for (int i = 0; i < 3; i++) {
			if (arr[i][0].equals("x"))
				countX++;
		}
		if (countX == 3)
			return true;
		countX = 0;

		for (int i = 0; i < 3; i++) {
			if (arr[i][2].equals("x"))
				countX++;
		}
		if (countX == 3)
			return true;
		countX = 0;

		if (arr[0][0].equals("x") && arr[1][1].equals("x") && arr[2][2].equals("x"))
			return true;
		if (arr[0][2].equals("x") && arr[1][1].equals("x") && arr[2][0].equals("x"))
			return true;

		else
			return false;

	}

	public boolean checkD(String[][] arr){
		countD = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j].equals("O") || arr[i][j].equals("X"))
					countD++;
			}
		}
		if (countD == 9)
			return true;
		else
			return false;
	}

	public void printOut(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(tictactoc[i][j]);
			System.out.println();
		}

		if(checkO(tictactoc)==true){
			System.out.println("O is winner");
			System.exit(0);
		}
		else if(checkX(tictactoc)==true){
			System.out.println("X is winner");
			System.exit(0);
		}
		else if(checkD(tictactoc)==true){
			System.out.println("Draw!!");
			System.exit(0);
		}
	}
}



