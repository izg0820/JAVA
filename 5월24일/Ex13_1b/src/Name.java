import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStream;

public class Name {

	public static void main(String[] args) throws FileNotFoundException{
		String fileName = "test.txt";
		Scanner inputStream = null;
		try{
			inputStream = new Scanner(new FileReader(fileName));
		} catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		PrintWriter outputStream = null;
		String[] first= new String[4];
		String[] last= new String[4];
		while(inputStream.hasNext())
		{
			for(int i=0;i<4;i++)
			{
				first[i]="";last[i]="";
				first[i] =  inputStream.next();
				last[i] = inputStream.next();
			}
		}
		try{
			String newFile = "result.txt";
			outputStream = new PrintWriter(newFile);
		} catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		for(int i=0;i<4;i++){
		outputStream.print(first[i] +" ");
		outputStream.print(last[i]);
		outputStream.println();
		}
		outputStream.close();
	}

}
