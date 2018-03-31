import java.util.ArrayList;

public class Ex14_1a {

	static ArrayList<String> t = new ArrayList<String>();
	public static void main(String[] args) {
		String[] s = new String[3];

		s[0]="SCV";
		s[1]="Marine";
		s[2]="Fierbat";
		arrayToArrayList(s);
		removeFromArrayList(t,"SCV");
	}

	public static ArrayList arrayToArrayList(String[] s){
		for(int i=0;i<3;i++){
			t.add(s[i]);
		}
		System.out.println(t);
		return t;
	}

	public static void removeFromArrayList(ArrayList<String> list, String s)
	{
		list.remove(s);
		System.out.println(list);

	}
}


