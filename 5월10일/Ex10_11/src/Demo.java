import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Student[] s =new Student[5];
		s[0]=new Student("Leejaehyubn",201433703,0);
		s[1]=new Student("Honggabi",201433333, 0);
		s[2]=new Student("Son minuk",201422222,0);
		s[3]=new Student("Kendrick Lamar",201444444,0);
		s[4]=new Student("Lee hyunguk",201455555,0);
		
		
		Arrays.sort(s);
		for(Student temp:s)
			System.out.println("name: "+ temp.getName()+"grade: "+temp.getStudentNumber());
		
	
		

	}

}
