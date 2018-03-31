import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Ex13_11 {

	public static void main(String[] args) {
		String fileName ="words.txt";
		String result="result.txt";
		String str="";
		Scanner inputStream = null;
		PrintWriter outputStream =null;
		try
		{
			inputStream =new Scanner(new FileReader(fileName));
			outputStream =new PrintWriter(result);
			while(inputStream.hasNextLine())
			{
				str=inputStream.nextLine();
				if(str.length()>4)
				{
					if(str.charAt(str.length()-4)=='d'&&str.charAt(str.length()-3)=='o'&&str.charAt(str.length()-2)=='u'&&str.charAt(str.length()-1)=='s')
					{
						outputStream.println(str);
					}
				}
			} 
			System.out.println("Success!!");
			inputStream.close();
			outputStream.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
	}	

}


