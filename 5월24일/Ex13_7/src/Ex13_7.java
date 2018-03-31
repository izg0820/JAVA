import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex13_7 {

	public static void main(String[] args) {
		String fileName = "abb.txt";
		String text = "example.txt";
		Scanner inputStream = null;
		Scanner inputStream1 = null;
		String[] str = new String[6];
		for(int i=0;i<6;i++){
			str[i]="";
		}
		try{
			inputStream = new Scanner (new FileReader(fileName));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}
		int k=0;
		while(inputStream.hasNextLine()){
			str[k] = inputStream.nextLine();
			k++;
		}
		inputStream.close();
		String[] temp = new String[100];
		for(int j=0;j<100;j++){
			temp[j]="";
		}
		try{
			inputStream1 = new Scanner (new FileReader(text));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		int a=0;
		while(inputStream1.hasNextLine()){
			if(str[a]==temp[a].toLowerCase())
				str[a] = "<"+str[a]+">";	
			
		}
		
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
	
		
		
		

	}

}
