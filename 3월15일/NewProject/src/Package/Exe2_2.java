package Package;
import java.util.Scanner;

public class Exe2_2 {

	public static void main(String[] args) {
		
		String sen;
		String subSen,upper1,upper2;
		int space,len;
		System.out.print("Enter sentence:");
		Scanner keyboard = new Scanner(System.in);
		sen = keyboard.nextLine();
		space = sen.indexOf(" ");
		subSen = sen.substring(0,space+1);
		len = sen.length();
		sen = sen.substring(space+1,len);
		sen = sen.concat(" ");
		sen= sen.concat(subSen);
		upper1 = sen.substring(0,1);
		upper2 = upper1.toUpperCase();
		sen = sen.replace(upper1, upper2);
		System.out.println(sen);
		
		
		
		
	}

}
