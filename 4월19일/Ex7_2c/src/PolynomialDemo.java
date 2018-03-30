import java.util.Scanner;
public class PolynomialDemo {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		int x1,x2,n1,n2,value;	
		
		System.out.print("Insert the degree ");
		n1=keyboard.nextInt();
		Polynomial test1 = new Polynomial(n1);
		System.out.println("Insert the coefficients");
		for(int i=0;i<n1+1;i++)
		{
			value=keyboard.nextInt();
			test1.setConstant(i, value);
			value=0;
		}
		System.out.print("Insert the x ");
		x1=keyboard.nextInt();
		System.out.println("Result "+test1.evaluate(x1));
		System.out.println("");
		
		System.out.print("Insert the degree ");
		n2=keyboard.nextInt();
		Polynomial test2 = new Polynomial(n2);
		System.out.println("Insert the coefficients");
		for(int i=0;i<n2+1;i++)
		{
			value=keyboard.nextInt();
			test2.setConstant(i, value);
		}
		System.out.print("Insert the x ");
		x2=keyboard.nextInt();
		System.out.println("Result "+test2.evaluate(x2));
	}

}
