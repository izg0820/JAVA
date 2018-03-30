import java.util.Scanner;

public class ArraySorter {
	private int size;
	private int[] arr;
	private int value;

	Scanner keyboard = new Scanner(System.in);

	public void readInput(){
		System.out.println("Insert the size of array");
		size = keyboard.nextInt();
		arr = new int[size];
		System.out.println("Inser the value of array");
		for(int i=0;i<arr.length;i++)
		{
			value=keyboard.nextInt();
			arr[i]=value;
		}
	}

	public void BubbleSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			int temp;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void printOut(){
		System.out.print("Before: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		BubbleSort(arr);
		System.out.println(" ");
		System.out.print("After: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
	}
}



