import java.util.HashSet;
public class HashSetDemo {
	static HashSet<String> strSet = new HashSet<String>();
	public static void main(String[] args) {
		String[] s = new String[5];

		s[0]="SCV";
		s[1]="Marine";
		s[2]="Firebat";
		s[3]="SCV";
		s[4]="Ghost";

		arrayToHashSet(s);
		removeFromHashSet("Firebat");
	}
	public static void arrayToHashSet(String[] s)
	{
		for(int i=0;i<5;i++){
			strSet.add(s[i]);
		}
		System.out.println(strSet);
	}
	public static void removeFromHashSet(String s)
	{
		for(int i=0;i<strSet.size();i++){
			strSet.remove(s);
		}
		System.out.println(strSet);
	}
}
