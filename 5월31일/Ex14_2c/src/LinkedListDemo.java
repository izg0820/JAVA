import java.util.LinkedList;
public class LinkedListDemo {
static LinkedList<String> str = new LinkedList<String>();
	public static void main(String[] args) {
		String[] s = new String[5];

		s[0]="SCV";
		s[1]="Marine";
		s[2]="Firebat";
		s[3]="SCV";
		s[4]="Ghost";
		arrayToLinkedList(s);
		removeFromLinkedList("Firebat");

	}
	public static void arrayToLinkedList(String[] s)
	{
		for(int i=0;i<5;i++){
			str.add(s[i]);
		}
		System.out.println(str);
	}
	public static void removeFromLinkedList(String s)
	{
		for(int i=0;i<str.size();i++){
			str.remove(s);
		}
		System.out.println(str);
	}

}
