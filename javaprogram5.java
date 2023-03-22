package file;

import java.util.Scanner;

public class javaprogram5 {
//Write a program to do bubble sort on an array in java.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter " + a + " number");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (arr[i] < (arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Bubble sort :");
		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
