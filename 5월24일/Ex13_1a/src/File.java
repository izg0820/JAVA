import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;
public class File {
	
	public static void main(String[] args) throws FileNotFoundException{
		String fileName ="text.txt"; 
		int[] arrNum = new int[10];
		PrintWriter outputStream = null;
		try{
			outputStream = new PrintWriter(fileName);
		} catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		for(int count=1; count<=10;count++){
			int num = (int)(Math.random()*10)+1;
			outputStream.println(num+" ");
		}
		System.out.println("Create integer!!");
		outputStream.close();
		Scanner inputStream =null;
		try{
			inputStream = new Scanner(new FileReader(fileName));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		int count=0;
		while(inputStream.hasNextInt()){
			arrNum[count]= inputStream.nextInt();
			count++;			
		}
		int min,max,sum=0,temp;
		min=max=arrNum[0];
		for(int i=0;i<10;i++ ){
			if(max<arrNum[i])
				max=arrNum[i];	
			if(min>arrNum[i])
				min=arrNum[i];
			sum+=arrNum[i];
		}
		System.out.println("Max is "+max);
		System.out.println("Min is "+min);
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+(float)sum/10);
	}

}
