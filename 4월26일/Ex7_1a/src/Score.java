import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of scores: ");
		n= keyboard.nextInt();
		int[] score = new int[n];
		
		System.out.println("Enter "+score.length+" score:");
		int sum=0;
		for(int i=0;i<n;i++){
			score[i]=keyboard.nextInt();
			sum = sum +score[i];
		}
		
		double average;
		average = sum/score.length;
		System.out.println("Average of the scores is "+average);
		for(int i=0; i<n; i++){
			if(score[i]>average)
				System.out.println("Score above the average is "+score[i]);
		}
	}
}
