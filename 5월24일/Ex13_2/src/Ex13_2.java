import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Ex13_2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] arrInt =new int[10];
		String fileName="number.txt";
		int i=0;
		Scanner inputStream =null;
		try
		{
			inputStream = new Scanner (new FileReader(fileName));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		while(inputStream.hasNext()){
			arrInt[i]=inputStream.nextInt();
			i++;
		}
			for(int k=0;k<9;k++){
				if(arrInt[k]==arrInt[k+1])
					arrInt[k+1]=-1;

			}
		
		inputStream.close();
		String result="result.txt";
		PrintWriter outputStream=null;
		try
		{
			outputStream =new PrintWriter(result);
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		for(int k=0;k<10;k++){
			if(arrInt[k]==-1)
				continue;
			outputStream.println(arrInt[k]);
		}
		System.out.println("File was stored.");
		outputStream.close();
	}


}


