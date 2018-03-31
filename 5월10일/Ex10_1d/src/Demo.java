
public class Demo {

	public static void main(String[] args) {
		
		SubstitutionCipher test1 =new SubstitutionCipher(3);
		ShuffleCipher test2 = new ShuffleCipher(1);
		
		System.out.println(test1.encode("abc"));
		System.out.println(test2.encode("abcde"));

	}

}
