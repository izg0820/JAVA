import java.util.Scanner;
import java.util.ArrayList;
public class Ex14_1b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		int num=0,sum=0,count=0;
		ArrayList<Integer> scores = new ArrayList<Integer>();
		while(true){
			System.out.print("Enter the number: ");
			num = keyboard.nextInt();
			if(num<0)
				break;
			else{
				scores.add(num);
				sum+=num;
				count++;
			}				
		}
		System.out.println("Average is "+ (double) sum/count);
		for(int i=0;i<scores.size();i++){
			if(scores.get(i)>sum/count)
				System.out.print(scores.get(i)+" ");
		}
		System.out.println();
	}
}
