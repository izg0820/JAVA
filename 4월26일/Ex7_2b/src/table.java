import java.util.Scanner;
public class table {

	public static int getSum(double[][]arr,int row)
	{
		int sum=0;
		for(int k=0;k<arr[row].length;k++){
			sum+=arr[row][k];
		}
		return sum;
	}

	public static double getAverage(double[][]arr,int column){
		double average;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i][column];
		}
		average=sum/arr.length;
		return average;
	}
}

