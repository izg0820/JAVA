import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Ex13_12 {

	public static void main(String[] args) {
		String fileName="haberman.txt";
		Scanner inputStream =null;
		String arr[]=null,str="",temp;
		int sum=0,sum1=0,count=0,count1=0;
		double average1,average2;
		try
		{
			inputStream = new Scanner(new FileReader(fileName));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}	
		while(inputStream.hasNextLine())
		{
			temp=inputStream.nextLine();
			str=str+temp+" ";
		}
		arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String[] arrNew=arr[i].split(",");

			if(arrNew[3].equals("1"))
			{
				sum+=Integer.parseInt(arrNew[2]);
				count++;
			}
			else
			{
				sum1+=Integer.parseInt(arrNew[2]);
				count1++;
			}
		}
		average1=(float)sum/count;
		average2=(float)sum1/count1;
		System.out.println(average1);
		System.out.println(average2);

	}


}

