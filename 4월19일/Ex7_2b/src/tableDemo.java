import java.util.Scanner;

public class tableDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int row,column;
		System.out.print("Enter the number of row ");
		row= keyboard.nextInt();
		System.out.print("Enter the number of column ");
		column=keyboard.nextInt();
		double arr[][]= new double[5][5];

		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][j]= keyboard.nextDouble();
			}
		}
		System.out.println("Sum is "+ table.getSum(arr,row));
		System.out.println("Average is "+ table.getAverage(arr,column));

	}

}
