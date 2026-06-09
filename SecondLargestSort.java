import java.util.*;

public class SecondLargestSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the index from 0 to " + (n-1));
		int index = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("The Sorted Order :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		if (index-1 >= 0 && index-1 < n) {
			System.out.println(arr[index]);
		} else {
			System.out.println("Index out of bounds");
		}

		sc.close();
	}
}