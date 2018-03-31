import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		String fileName ="number.txt";
		Scanner inputStream =null;
		int[] arrInt = new int[10];
		try{
			inputStream = new Scanner(new FileReader(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=0;
		while(inputStream.hasNextInt()){
			arrInt[i]=inputStream.nextInt();
			i++;
		}
		for(int k=1; k<10;k++){
			arrInt[k]=arrInt[k]-arrInt[0];
		}inputStream.close();
		String result = "result.dat";
		try{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(result));
		for(int k=0;k<10;k++)
			outputStream.writeByte(arrInt[k]);
		outputStream.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		int[] arr = new int[10];
		try{
			ObjectInputStream outputStream1 = new ObjectInputStream(new FileInputStream(result));
			
			for(int k=0;k<10;k++){
				arr[k]= outputStream1.readByte();
			}
				for(int j=0;j<10;j++){
					System.out.println(arr[j]);
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file" + fileName);
			System.exit(0);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		


	}

}
