import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class Binary {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{
		String fileName = "num.dat";
		
		try{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			for(int count=1; count<=10;count++){
				int num = (int)(Math.random()*10)+1;
				outputStream.writeInt(num);
				
			}outputStream.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Success!!");	

	}

}
