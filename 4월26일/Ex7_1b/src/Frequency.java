import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] frequency = new int[10] ;
		for(int i =0; i<10;i++){
			frequency[i] =0;
		}
		String phoneNumber;
		int[] digit = new int[10];

		char temp;

		System.out.println("Enter the phone number with '-'");
		phoneNumber= keyboard.nextLine();
		int len = phoneNumber.length();
		for(int j=0;j<len;j++){
			temp = phoneNumber.charAt(j);
			if(Character.isDigit(temp)==true){
				for(int k=0;k<10;k++)
				{
					if(temp-'0'==k)
						frequency[k]++;
				}
			}
		}
		for(int i =0;i<10;i++){
			System.out.println(i+" = "+frequency[i]);
		}
	}
}





